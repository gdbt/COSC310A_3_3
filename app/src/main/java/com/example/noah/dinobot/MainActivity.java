package com.example.noah.dinobot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;



public class MainActivity extends AppCompatActivity {

    static EditText input;
    static TextView output;
    String name;
    String newtext;
    static String currenttext;
    public static IrrelavantTopic irrTopic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        irrTopic = new IrrelavantTopic();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.mainin);
        output = findViewById(R.id.mainout);

        currenttext = ("ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr");
        newtext = ("Welcome to the Dino-Bot, Please Enter the name you would like to be called by and press the enter button.");
        currenttext += "\n" + newtext;
        output.setText(currenttext);



        Button enter = findViewById(R.id.button);
        enter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                EditText mainin = findViewById(R.id.mainin);
                name = mainin.getText().toString(); //making name the variable
                newtext = ("Greetings " + name + ". My name is Tee-Tee the T-Rex!!"); //printing name out along with rest of text
                currenttext += "\n" + newtext;
                output.setText(currenttext);
                //next line
                newtext = ("If you are curious type \"help\" to get a list of topics I will talk to you about!");
                currenttext += "\n" + newtext;
                output.setText(currenttext);

                appin();
            }
        });
    }
    public void appin(){
        EditText mainin = findViewById(R.id.mainin);
        mainin.setText("");
        System.out.println("appin");
        Button enter = findViewById(R.id.button);
        enter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                EditText mainin = findViewById(R.id.mainin);
                String startoption;

                boolean continueConv;
                do {
                    startoption = mainin.getText().toString(); //scanning an input
                    continueConv = appconversation(startoption);
                }while(continueConv!=false);
                if (continueConv == false) {
                    appin();
                }
            }
        });
    }
    public boolean appconversation(String userIn){
        checktopic(userIn); // - keep checktopic for roar contest
        try {
            System.out.println("goes here");
            return irrTopic.checkRelavancy(userIn);

        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException | InstantiationException e) {
            // TODO Auto-generated catch block
            currenttext += "\n" + ("Sorry! There seems to be an issue.");
            currenttext += "\n" + ("Please restart the program.");
            output.setText(currenttext);
            return false;
        }
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
    public void checktopic(String top) { //grabs the topic, to save space this is used fo most topics
        Scanner topche = new Scanner(System.in);
        if(top.contains("roar")) {
            System.out.println("Sorry! My dino-speech is better than my english, did you want to have a roaring contest?"); //maybe you didn't mean to go here
            String topicyesno = (topche.nextLine()).toLowerCase();
            String[] topicsentence = topicyesno.split(" "); //splitting it up
            for(int i = 0; i < topicsentence.length; i++){ //
                String topgrabbed = topicsentence[i];
                switch(topgrabbed){ //switch parsing string to see what happens

                    case "yes": case "yup": case "okay": case "sure": case "ok": case "ye": case "yeah":
                        RawrXD.main(null); // plays roaring contest
                    case "no": case "nope": case "nah": case "never":
                        System.out.println("No? Okay then.");
                        appin(); //returns false to where it was called.

                    default:
                        System.out.println("I still don't understand."); //default incase you spam the keyboard

                }
                topche.close();
                appin();
            }
        }
        else if(top.equals("help")) {
            helpMe();
            System.out.println("finished help");
            System.out.println(currenttext);
            appin();
        }
        else if(top.equals("about")) {
            aboutMe();
            appin();
        }
        //swear filter
        else if(top.contains("fuck") || top.contains("bitch") || top.contains("shit") || top.contains("ass") || top.contains("fucking") || top.contains("motherfucker") || top.contains("damn")){
            System.out.println("Please do not swear at me!");
            thinking();
            thinking(); //just giving spacing
            System.out.println("If you are going to be rude this conversation is over!");
            thinking();
            thinking();//more spacing
            thinking();
            System.exit(0); //closing the program forcibly
        }
    }

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
}
