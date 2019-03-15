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

    ListView listview;
    Button enterbut;
    EditText editter;
    UsersAdapter adapter;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //grabbing intents
        Intent mainpage = getIntent();
        Bundle mainname = mainpage.getExtras();
        name = mainname.getString("names");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testmessage);


        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        listview = (ListView) findViewById(R.id.mainlist);
        enterbut = (Button)findViewById(R.id.enterbut);
        editter = (EditText)findViewById(R.id.testedit);


        adapter = new UsersAdapter(this,arrayOfUsers);
        listview.setAdapter(adapter);

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
                String typegrab = (editter.getText().toString()).toLowerCase();
                String x = mainbrain.appin(typegrab);

                //taking user response and printing it
                User newUser = new User(typegrab,"user");
                adapter.add(newUser);
                adapter.notifyDataSetChanged();

                if (x.equals("clear")){
                    adapter.clear();
                    adapter.notifyDataSetChanged();
                }
                //printing commands
                if(x.equals("command")){
                    String com = commander();
                    User commanbot = new User(com,"bot");
                    adapter.add(commanbot);
                    adapter.notifyDataSetChanged();
                }
                //grabbing response and printing it
                else {
                    User nextbot = new User(x, "bot");
                    adapter.add(nextbot);
                    adapter.notifyDataSetChanged();
                }
                editter.setText("");
            }
        });

    }
    //command list
    public String commander(){
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
                + "> What can you do" + "\n"
        );
        return s;
    }
}
