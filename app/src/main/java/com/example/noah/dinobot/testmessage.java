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
    Button creditbut;
    EditText editter;
    UsersAdapter adapter;
    String namer;
    String picdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testmessage);
        //grabbing frrom bundles
        Intent profilepic = getIntent(); //grabbing the name intent from the welcoming page
        Bundle maindata = profilepic.getExtras();
        namer = maindata.getString("name"); //assigning names
        picdata = maindata.getString("picdata");
        ArrayList<User> arrayOfUsers = new ArrayList<User>(); //creating the arraylist for the custom object users
        listview = (ListView) findViewById(R.id.mainlist); //initializing listview
        enterbut = (Button)findViewById(R.id.enterbut); //initializing enterbutton
        editter = (EditText)findViewById(R.id.testedit); //initializing edit text


        adapter = new UsersAdapter(this,arrayOfUsers); //creating the adapter
        listview.setAdapter(adapter); //setting the listview to the adapter

        //printing greeting message immediately
        String greet = "> Greetings " + namer + " My Name is Tee-Tee the T-Rex!!";
        greet += ("\n" + "> Type \"Help\" to get a list of things we can talk about!");
        greet += ("\n" + "> Want to see every possible command? type /commands ");
        greet += ("\n" + "> Want to clear the chat history? Type /clear ");
        User newUser = new User(greet,"bot"); //creating the user item
        adapter.add(newUser); //adding user message to adapter
        adapter.notifyDataSetChanged(); //update screen

        enterbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String originalmessage = (editter.getText().toString());
                String typegrab = (editter.getText().toString()).toLowerCase(); //this grabs what was put in the edit text and makes it lowercase
                String x = mainbrain.appin(typegrab); //this runs the mainbrain with the phrase so look for matches
                int qMark = typegrab.indexOf("?"); //this allows question marks to not interfere
                if(qMark>=0) {
                    String key=typegrab.substring(0,qMark);
                    typegrab = key;
                }

                //taking user response and printing it
                User newUser = new User(originalmessage,picdata); //this generates the users message sending the phrase
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
                else if(x.contains("nick")){ //this will print nick's description
                    String nickdisc = "Nick is a great friend of Noah, who has allowed him to use some of his artwork in the application!";
                    User nickbot = new User(nickdisc,"bot");
                    adapter.add(nickbot);
                    adapter.notifyDataSetChanged();
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

        creditbut = (Button)(findViewById(R.id.creditbutton)); //activating credit button
        creditbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creditstart = new Intent(testmessage.this, Credits.class); //intent to go to credits
                startActivity(creditstart); //starting activity
            }
        });
    }
    //command list
    public String commander(){ //massive string for the commands
        String s = ("Printing Command list" + "\n"
                + "> nick" + "\n"
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
                + "> What is the date" + "\n"
                + "> What day of the week is it" + "\n"
                + "> What is your name"
                + "> What are you" + "\n"
                + "> Who are you" + "\n"
                + "> Where am i" + "\n"
                + "> Why eat food" + "\n"
                + "> Why eat me" + "\n"
                + "> How old are you" + "\n"
                + "> how tall are you" + "\n"
                + "> How did you die" + "\n"
                + "> Do you like lotr" + "\n"
                + "> Why do you like lotr" + "\n"
                + "> How did you find lotr" + "\n"
                + "> When did you find lotr" + "\n"
                + "> What is your least favorite character is lotr" + "\n"
                + "> What is your favorite character in lotr" + "\n"
                + "> What is your favorite location in lotr" + "\n"
                + "> If you had the ring from lotr what what would you do with it" + "\n"
                + "> what else can you tell me about lotr" + "\n"
                + "> What do you think of the lotr movies" + "\n"
                + "> What do you think of wormtongue" + "\n"
                + "> What do you think of Kelowna" + "\n"
                + "> What do you think of London" + "\n"
                + "> What do you think of Cuba" + "\n"
                + "> Where do you live" + "\n"
                + "> Where did you learn about these places to travel" + "\n"
                + "> How would you travel" + "\n"
                + "> How do you know about quantum travel"
        );
        return s;
    }
}
