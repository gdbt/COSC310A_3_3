package com.example.noah.dinobot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class mainbrain {

    //declaring  in and out

    //declaring string variables


    //declaring boolean
    boolean nick;
    //declaring classes

    public static collection col;
    public static travel trav;
    public static shmeegulXD shmee;
    public static food foo;
    public static me mez;
    //declaring Arraylists
    static ArrayList<String> foodRelateds = new ArrayList<String>(){{add("food");add("eat");add("drink");add("tea");add("bubble");add("cook");add("drinks");}};
    static ArrayList<String> mes = new ArrayList<String>(){{add("me");add("i");add("we");add("name");add("date");add("age");add("day");add("old");add("die");add("excellent");add("good");add("tall");add("long");add("size");add("big");add("can");add("capable");}};
    static ArrayList<String> hobbiess = new ArrayList<String>(){{add("shmeegulXD");add("reading");add("books");add("hobbies");add("shmeegul");add("hobbits");add("wizards");add("lotr");add("lord");add("movies");add("wormtongue");}};
    static ArrayList<String> collections = new ArrayList<String>(){{add("collection");add("rock");add("rocks");add("bone");add("bones");add("gem");add("gems");add("plant");add("plants");add("collect");add("dangerous");}};
    static ArrayList<String> travels = new ArrayList<String>() {{add("travel");add("kelowna");add("vancouver");add("london");add("cuba");add("places");add("live");add("traveling");}};
    static ArrayList<String> roars = new ArrayList<String>() {{add("roar");add("rawr");}};

    public static String appin(String startoption){
        //grabbing intents


        col = new collection();
        trav = new travel();
        shmee = new shmeegulXD();
        foo = new food();
        mez = new me();








                    for (int i = 0; i < collections.size(); i++) {
                        if (startoption.contains(collections.get(i))) {
                            String tocol = col.main(startoption);
                            return tocol;


                        }
                    }


                    for (int i = 0; i < travels.size(); i++) {
                        if (startoption.contains(travels.get(i))) {
                            String totrav = trav.main(startoption);
                            return totrav;


                        }

                    }


                    for (int i = 0; i < hobbiess.size(); i++) {
                        if (startoption.contains(hobbiess.get(i))) {
                            String toshmee = shmee.main(startoption);
                            return toshmee;



                        }
                    }


                    for (int i = 0; i < foodRelateds.size(); i++) {
                        if (startoption.contains(foodRelateds.get(i))) {
                            String tofood = foo.main(startoption);
                            return tofood;



                        }
                    }


                    for (int i = 0; i < mes.size(); i++) {
                        if (startoption.contains(mes.get(i))) {
                            String tome = mez.main(startoption);
                            return tome;
                        }
                    }

                if(startoption.equals("help")) {
                    String tohelp = helpMe();
                    return tohelp;
                }
                if(startoption.equals("about")) {
                    String toabout = aboutMe();
                    return toabout;

                }
                else {
                    return("Sorry, I don't understand");
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


    //helpMe prompts user with list of topics the bot is able to talk about.
    public static String helpMe() {

        String next = ("Curious to know what I can talk about? Have a list"); //prints list of topics


        //make thinking if it works
        next += "\n" + ("..........."); //spacer
        next += "\n" + ("We can test how well your roar is!");			 	//Prompts roar contest
        next += "\n" + ("Or we can talk about food");						//Prompts food topic
        next += "\n" + ("We can discuss my rock collection!");				//Prompts collection topic
        next += "\n" + ("How about talking about Lord of The Rings?");		//Prompts Lord of The Rings topic
        next += "\n" + ("Or if you want to get to know me thats fine too!");	//Prompts general qna
        next += "\n" + ("I also happen to know about traveling!");
        next += "\n" + (thinking());
        return next;
    }

    public static String aboutMe() {
        String next = ("My name is Tee-Tee and I am a Java jar program,");
        next += "\n" + next;
        next += "\n" + ("Coded by Eric, Noah, Yue, Aidan and Kathryn - for their COSC 310 Assignment. This Version is tweaked by Noah");
        next += "\n" + ("They hope you'll get the full experience of talking to an old dinosaur like me!");
        return next;
    }

}
