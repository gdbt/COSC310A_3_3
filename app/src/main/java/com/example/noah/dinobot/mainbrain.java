package com.example.noah.dinobot;

import java.util.ArrayList;

public class mainbrain {

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
        //enabling classes
        col = new collection();
        trav = new travel();
        shmee = new shmeegulXD();
        foo = new food();
        mez = new me();
        //swear filter
        if(startoption.contains("fuck") || startoption.contains("bitch") || startoption.contains("shit") || startoption.contains("ass") || startoption.contains("fucking") || startoption.contains("motherfucker") || startoption.contains("damn")){
            return"Please don't swear me!";
        }
                    for (int i = 0; i < collections.size(); i++) {
                        if (startoption.contains(collections.get(i))) {
                            String tocol = col.main(startoption);
                            return tocol;


                        }
                    }
                    //throwing travel class and grabbing response
                    for (int i = 0; i < travels.size(); i++) {
                        if (startoption.contains(travels.get(i))) {
                            String totrav = trav.main(startoption);
                            return totrav;


                        }

                    }
                    //throwing shmeegul class and getting response
                    for (int i = 0; i < hobbiess.size(); i++) {
                        if (startoption.contains(hobbiess.get(i))) {
                            String toshmee = shmee.main(startoption);
                            return toshmee;



                        }
                    }
                    //throwing food class and grabbing response
                    for (int i = 0; i < foodRelateds.size(); i++) {
                        if (startoption.contains(foodRelateds.get(i))) {
                            String tofood = foo.main(startoption);
                            return tofood;



                        }
                    }
                    //throwing me class and grabbing response
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
                if(startoption.equals("/clear")) {
                        return"> Clear";
                }
                if(startoption.equals("/commands")){
                        return "command";
                }
                else {
                    int varied = (int) (Math.random()*7);
                    switch(varied) {
                        case 0:
                            return("My English is still not the best, hard to learn here. Can you maybe reword that?");
                        case 1:
                            return("Roar Roar Roar Roar Roar. That's all I got from that sentence.");
                        case 2:
                            return("Maybe we should talk about one of my topics?");
                        case 3:
                            return("As interesting as that may seem, I just don't know how to respond.");
                        case 4:
                            return("Sorry, I don't understand that.");
                        case 5:
                            return("Please try and reword that.");
                        case 6:
                            return("Dinosaur language barrier has been met");
                    }
                    return"I don't understand";
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
        String next = ("> My name is Tee-Tee and I am a Java jar program,");
        next += "\n" + ("> Coded by Eric, Noah, Yue, Aidan and Kathryn - for their COSC 310 Assignment.");
        next += "\n" + ("> They hope you'll get the full experience of talking to an old dinosaur like me!");
        next += "\n" + (">  This Version/App is tweaked/created by Noah. See the Credits page for more info!");
        return next;
    }

}
