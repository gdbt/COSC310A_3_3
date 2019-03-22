package com.example.noah.dinobot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;


public class testmessage extends AppCompatActivity {
    //setting up variables
    ListView listview;
    Button enterbut;
    EditText editter;
    UsersAdapter adapter;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //grabbing intents
        Intent mainpage = getIntent(); //grabbing the name intent from the welcoming page
        Bundle mainname = mainpage.getExtras();
        name = mainname.getString("names"); //assigning names

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testmessage);


        ArrayList<User> arrayOfUsers = new ArrayList<User>(); //creating the arraylist for the custom object users
        listview = (ListView) findViewById(R.id.mainlist); //initializing listview
        enterbut = (Button)findViewById(R.id.enterbut); //initializing enterbutton
        editter = (EditText)findViewById(R.id.testedit); //initializing edit text


        adapter = new UsersAdapter(this,arrayOfUsers); //creating the adapter
        listview.setAdapter(adapter); //setting the listview to the adapter

        //printing greeting message immediately
        String greet = "> Greetings " + name + " My Name is Tee-Tee the T-Rex!!";
        greet += ("\n" + "> Type \"Help\" to get a list of things we can talk about!");
        greet += ("\n" + "> Want to see every possible command? type /commands ");
        greet += ("\n" + "> Want to clear the chat history? Type /clear ");
        User newUser = new User(greet,"bot"); //creating the user item
        adapter.add(newUser); //adding user message to adapter
        adapter.notifyDataSetChanged(); //update screen


        enterbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String typegrab = (editter.getText().toString()).toLowerCase(); //this grabs what was put in the edit text and makes it lowercase
                String x = mainbrain.appin(typegrab); //this runs the mainbrain with the phrase so look for matches
                int qMark = typegrab.indexOf("?"); //this allows question marks to not interfere
                if(qMark>=0) {
                    String key=typegrab.substring(0,qMark);
                    typegrab = key;
                }

                //taking user response and printing it
                User newUser = new User(typegrab,"user"); //this generates the users message sending the phrase
                adapter.add(newUser); //add it to the adapter
                adapter.notifyDataSetChanged(); //notify the system that the adapter has changed


                if (x.equals("> Clear")){ //check to see if the clear command was run
                    adapter.clear(); //emptying adapter
                    adapter.notifyDataSetChanged(); //changing
                }
                //printing commands
                if(x.equals("command")){ //checking to see if the command command was run
                    String com = commander(); // grabbing the list of commands
                    User commanbot = new User(com,"bot"); //generating the bots message and returning the string
                    adapter.add(commanbot); //adding to adapter
                    adapter.notifyDataSetChanged(); //updating field
                }
                //grabbing response and printing it
                else {
                    User nextbot = new User(x, "bot"); //this takes the bots response and puts it into the field
                    adapter.add(nextbot);
                    adapter.notifyDataSetChanged();
                }
                editter.setText(""); //clears the typing field
            }
        });

    }
    //command list
    public String commander(){ //massive string for the commands
        String s = ("Printing Command list" + "\n"
                + "> What do you collect" + "\n"
                + "> What kind of rocks" + "\n"
                + "> What bones do you have" + "\n"
                + "> What is your favorite bone" + "\n"
                + "> How do you collect things" + "\n"
                + "> Is collecting things dangerous" + "\n"
                + "> Why collect things" + "\n"
                + "> Why not plants" + "\n"
                + "> What is your least favorite bone" + "\n"
                + "> When do you collect things" + "\n"
                + "> Who helps you collect things" + "\n"
                + "> What kind of gems do you have" + "\n"
                + "> How do you collect rocks" + "\n"
                + "> who do you eat with" + "\n"
                + "> Who do you cook with" + "\n"
                + "> Who do you make food with" + "\n"
                + "> What do you eat" + "\n"
                + "> What do you drink" + "\n"
                + "> What do you like about food" + "\n"
                + "> Where do you eat" + "\n"
                + "> Where was bubble tea invented" + "\n"
                + "> When do you eat breakfast" + "\n"
                + "> When do you eat lunch" + "\n"
                + "> When do you eat dinner" + "\n"
                + "> When was your last meal" + "\n"
                + "> When do you eat" + "\n"
                + "> Why do you eat" + "\n"
                + "> Why would you eat me" + "\n"
                + "> How about food" + "\n"
                + "> How many meals do you eat" + "\n"
                + "> How do you eat" + "\n"
                + "> How is bubble tea made" + "\n"
                + "> How do you like your bubble tea" + "\n"
                + "> What can you do" + "\n"
        );
        return s;
    }
}
