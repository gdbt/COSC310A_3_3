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
    static ArrayList<String> mes = new ArrayList<String>(){{add("me");add("i");add("we");add("name");add("date");add("age");add("day");add("old");add("die");add("excellent");add("good");add("tall");add("long");add("size");add("big");add("can");add("capable");add("today");add("hello");add("you");}};
    static ArrayList<String> hobbiess = new ArrayList<String>(){{add("shmeegulXD");add("reading");add("books");add("hobbies");add("shmeegul");add("hobbits");add("wizards");add("lotr");add("lord");add("movies");add("wormtongue");}};
    static ArrayList<String> collections = new ArrayList<String>(){{add("collection");add("rock");add("rocks");add("bone");add("bones");add("gem");add("gems");add("plant");add("plants");add("collect");add("dangerous");}};
    static ArrayList<String> travels = new ArrayList<String>() {{add("travel");add("kelowna");add("vancouver");add("london");add("cuba");add("places");add("live");add("traveling");}};
    static ArrayList<String> roars = new ArrayList<String>() {{add("roar");add("rawr");}};
    //declaring the how are you string array
    static String[] howyou = {"I am good", "I am great", "I am excellent", "I am always good", "I always feel great"};

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
        if(startoption.equals("how are you")){
            int t = (int)(Math.random()*5);
            return(howyou[t]);
        }
        switch(startoption){ //case incase person says just an gem name
            case "emerald":
                return("> That's the May gemstone");
            case "ruby":
                return("> That's the July gemstone");

            case "diamond":
                return("> That's the April gemstone");

            case "opal":
                return("> That's the October gemstone");
            case "garnet":
                return("> That's the January gemstone");
            case "topaz":
                return("> That's the November gemstone");
            case "sapphire":
                return("> That's the September gemstone");
            case "pearl":
                return("> That's the June gemstone");
            case "geode":
                return("> That sounds like a good one!");
            case "amythest":
                return("> That's the February gemstone");
            case "aquamarine":
                return("> That's the March gemstone");
            case "turquoise":
                return("> That's the December gemstone");
            case "onyx":
                return("> That sounds like a good one!");
            case "carnelian":
                return("> That sounds like a good one!");
            case "peridot":
                return("> That's the August gemstone");
            case "beryl":
                return("> That sounds like a good one!");
            case "tanzanite":
                return("> That sounds like a good one!");
            default:

        }
                    for (int i = 0; i < collections.size(); i++) {          //checking if it matches collection, if so return response
                        if (startoption.contains(collections.get(i))) {
                            String tocol = col.main(startoption);
                            return tocol;


                        }
                    }
                    //throwing travel class and grabbing response
                    for (int i = 0; i < travels.size(); i++) {              //checking if it matches travel class, if so returns response
                        if (startoption.contains(travels.get(i))) {
                            String totrav = trav.main(startoption);
                            return totrav;


                        }

                    }
                    //throwing shmeegul class and getting response
                    for (int i = 0; i < hobbiess.size(); i++) {             //checking if it matches hobbies (LOTR)  class, if so returns response
                        if (startoption.contains(hobbiess.get(i))) {
                            String toshmee = shmee.main(startoption);
                            return toshmee;



                        }
                    }
                    //throwing food class and grabbing response
                    for (int i = 0; i < foodRelateds.size(); i++) {         //checking if it matches food class, if so returns response
                        if (startoption.contains(foodRelateds.get(i))) {
                            String tofood = foo.main(startoption);
                            return tofood;



                        }
                    }
                    //throwing me class and grabbing response
                    for (int i = 0; i < mes.size(); i++) {                  //checking if it matches me class, if so returns response
                        if (startoption.contains(mes.get(i))) {
                            String tome = mez.main(startoption);
                            return tome;
                        }
                    }
                if(startoption.equals("help")) { //checking if someone says help
                    String tohelp = helpMe();
                    return tohelp;
                }
                if(startoption.equals("about")) { //checking if you say about
                    String toabout = aboutMe();
                    return toabout;

                }
                if(startoption.equals("/clear")) { //checking if you use the clear command
                        return"> Clear";
                }
                if(startoption.equals("/commands")){ //checking if you use the commands command
                        return "command";
                }

                else { //giving several random responses in the event that you enter something that doesn't match up
                    int varied = (int) (Math.random()*7);
                    switch(varied) {
                        case 0:
                            return("> My English is still not the best, hard to learn here. Can you maybe reword that?");
                        case 1:
                            return("> Roar Roar Roar Roar Roar. That's all I got from that sentence.");
                        case 2:
                            return("> Maybe we should talk about one of my topics?");
                        case 3:
                            return("> As interesting as that may seem, I just don't know how to respond.");
                        case 4:
                            return("> Sorry, I don't understand that.");
                        case 5:
                            return("> Please try and reword that.");
                        case 6:
                            return("> Dinosaur language barrier has been met");
                    }
                    return"> I don't understand";
                }
    }

    //helpMe prompts user with list of topics the bot is able to talk about.
    public static String helpMe() {

        String next = ("> Curious to know what I can talk about? Have a list"); //prints list of topics
        next += "\n" + ("> We can test how well your roar is!");			 	//Prompts roar contest
        next += "\n" + ("> Or we can talk about food");						//Prompts food topic
        next += "\n" + ("> We can discuss my rock collection!");				//Prompts collection topic
        next += "\n" + ("> How about talking about Lord of The Rings?");		//Prompts Lord of The Rings topic
        next += "\n" + ("> Or if you want to get to know me thats fine too!");	//Prompts general qna
        next += "\n" + ("> I also happen to know about traveling!");
        return next;
    }

    public static String aboutMe() { //the about me page
        String next = ("> My name is Tee-Tee and I am a Java jar program,");
        next += "\n" + ("> Coded by Eric, Noah, Yue, Aidan and Kathryn - for their COSC 310 Assignment.");
        next += "\n" + ("> They hope you'll get the full experience of talking to an old dinosaur like me!");
        next += "\n" + (">  This Version/App is tweaked/created by Noah. See the Credits page for more info!");
        return next;
    }

}
