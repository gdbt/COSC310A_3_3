package com.example.noah.dinobot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;




public class MainActivity extends AppCompatActivity {
    //declaring  in and out
    static EditText input;
    static TextView output;
    //declaring string variables
    String name;
    String newtext;
    //declaring classes
    static String currenttext;
    public static collection col;
    public static travel trav;
    public static shmeegulXD shmee;
    public static food foo;
    public static me mez;
    //declaring Arraylists
    ArrayList<String> foodRelateds = new ArrayList<String>(){{add("food");add("eat");add("drink");add("tea");add("bubble");add("cook");add("drinks");}};
    ArrayList<String> mes = new ArrayList<String>(){{add("me");add("i");add("we");add("name");add("date");add("age");add("day");add("old");add("die");add("excellent");add("good");add("tall");add("long");add("size");add("big");add("can");add("capable");}};
    static ArrayList<String> hobbiess = new ArrayList<String>(){{add("shmeegulXD");add("reading");add("books");add("hobbies");add("shmeegul");add("hobbits");add("wizards");add("lotr");add("lord");add("movies");add("wormtongue");}};
    static ArrayList<String> collections = new ArrayList<String>(){{add("collection");add("rock");add("rocks");add("bone");add("bones");add("gem");add("gems");add("plant");add("plants");add("collect");add("dangerous");}};
    static ArrayList<String> travels = new ArrayList<String>() {{add("travel");add("kelowna");add("vancouver");add("london");add("cuba");add("places");add("live");add("traveling");}};
    static ArrayList<String> roars = new ArrayList<String>() {{add("roar");add("rawr");}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //grabbing intents
        Intent mainpage = getIntent();
        Bundle mainname = mainpage.getExtras();
        name = mainname.getString("names");

        input = findViewById(R.id.mainin);
        output = findViewById(R.id.mainout);

        col = new collection();
        trav = new travel();
        shmee = new shmeegulXD();
        foo = new food();
        mez = new me();




        newtext = ("Greetings " + name + ". My name is Tee-Tee the T-Rex!!"); //printing name out along with rest of text
        currenttext += "\n" + newtext;
        output.setText(currenttext);
        //next line
        newtext = ("If you are curious type \"help\" to get a list of topics I will talk to you about!");
        currenttext += "\n" + newtext;
        output.setText(currenttext);
        appin();

    }
    public void appin(){
        EditText mainin = findViewById(R.id.mainin);
        mainin.setText("");
        System.out.println("appin");
        Button enter = findViewById(R.id.button);
        enter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                EditText mainin = findViewById(R.id.mainin);
                String startoption = mainin.getText().toString();
                for(int i = 0; i < collections.size(); i++) {
                    if(startoption.contains(collections.get(i))) {
                        String tocol = col.main(startoption);
                        currenttext += "\n" + tocol;
                        output.setText(currenttext);
                        repeat();
                    }
                }
                for(int i = 0; i < travels.size(); i++) {
                    if(startoption.contains(travels.get(i))) {
                        String totrav = trav.main(startoption);
                        currenttext += "\n" + totrav;
                        output.setText(currenttext);
                        repeat();
                    }

                }
                for(int i = 0; i < hobbiess.size(); i++) {
                    if(startoption.contains(hobbiess.get(i))) {
                        String toshmee = shmee.main(startoption);
                        currenttext += "\n" + toshmee;
                        output.setText(currenttext);
                        repeat();
                    }
                }
                for(int i = 0; i < foodRelateds.size(); i++) {
                    if(startoption.contains(foodRelateds.get(i))) {
                        String toshmee = foo.main(startoption);
                        currenttext += "\n" + toshmee;
                        output.setText(currenttext);
                        repeat();
                    }
                }
                for(int i = 0; i < mes.size(); i++) {
                    if(startoption.contains(mes.get(i))) {
                        String toshmee = mez.main(startoption);
                        currenttext += "\n" + toshmee;
                        output.setText(currenttext);
                        repeat();
                    }
                }

                if(startoption.equals("help")) {
                    helpMe();
                    appin();
                }
                else if(startoption.equals("about")) {
                    aboutMe();
                    appin();
                }
                System.out.println("Sorry, I don't understand");



            }
        });
    }


public static String thinking(){ //prints a line of dots after 1.5 seconds to mimic thinking animation
    long curtime = System.currentTimeMillis();

    long waittime1 = curtime + 1000;
    while (curtime != waittime1){
        curtime = System.currentTimeMillis();
    }
    return "............";

}
    //CHECKING THE TOPIC


    //helpMe prompts user with list of topics the bot is able to talk about.
    public void helpMe() {
        String next = ("Curious to know what I can talk about? Have a list"); //prints list of topics
        currenttext += "\n" + next;

        //make thinking if it works
        currenttext += "\n" + ("..........."); //spacer
        currenttext += "\n" + ("We can test how well your roar is!");			 	//Prompts roar contest
        currenttext += "\n" + ("Or we can talk about food");						//Prompts food topic
        currenttext += "\n" + ("We can discuss my rock collection!");				//Prompts collection topic
        currenttext += "\n" + ("How about talking about Lord of The Rings?");		//Prompts Lord of The Rings topic
        currenttext += "\n" + ("Or if you want to get to know me thats fine too!");	//Prompts general qna
        currenttext += "\n" + ("I also happen to know about traveling!");
        currenttext += "\n" + (thinking());
        output.setText(currenttext);
    }

    public void aboutMe() {
        String next = ("My name is Tee-Tee and I am a Java jar program,");
        currenttext += "\n" + next;
        currenttext += "\n" + ("Coded by Eric, Noah, Yue, Aidan and Kathryn - for their COSC 310 Assignment. This Version is tweaked by Noah");
        currenttext += "\n" + ("They hope you'll get the full experience of talking to an old dinosaur like me!");
        output.setText(currenttext);
    }
    public void repeat(){
        System.out.println("hit repeat");
        appin();
    }
}
