package com.example.noah.dinobot;


import java.text.SimpleDateFormat;
import java.util.Date;

public class me{

    public String main(String meinput) {

        //main string arrays
        String[] who = { "I am a dinosaur.", "I am Tee-Tee.", "I am a T-rex. You can call me Tee-Tee.","I am an ancient giant chicken.", "You are my lunch.", "You are a human and also my lunch.",
                "You are " /* user name */ };
        String[] what = { "I am a dinosaur.", "I am Tee-Tee.", "I am a T-rex. You can call me Tee-Tee.",
                "I am a ancient giant chicken.", "I can eat, eat, and talk to you.", "I like food and other things.",
                "It's 69,000,000 years before ", "It's " /* today's day */, "You are " /* user name */, "I like stones.", "I like gems.", "I like rocks.", "I like bones", "I like bubble tea", "I like milk tea", "I love Lord of the Rings"};
        String[] when = { "During luchtime.", "During dinner time.", "Perhaps during breakfast time.", "Two days ago.",
                "It's the Triassic Period.", "It's 69,000,000 years before. ", "250 million years later." };
        String[] where = { "You are at my place.", "You are in my stomach.", "You are in the middle of a big continent." };
        String[] how = { "I am starving.", "I am good.", "How rude! I am 35 years old!", "My age is a secret.",
                "I am 40 ft tall.", "I am 12.3 meters tall.", "He died from a fireball from the sky." };
        String[] why = { "I have no idea.", "Because I am hungry.", "Because you look delicious and juicy.",
                "Because I am adorable.", "Because I am a hardworking, and talented T-rex.", "Because you are here.",
                "Because... Because... Because... What did you ask me again?", "Because I am a dinosaur." };
        String[] hello = {"Hi", "Hey", "Hello", "Yo", "Greetings"};
        String[] howyou = {"I am good", "I am great", "I am excellent", "I am always good", "I always feel great"};
        //main what area
        if (meinput.contains("what") && meinput.contains("can") || meinput.contains("capable")) {
            return(what[4]);
        }else if(meinput.contains("hello") && meinput.contains("how")){
            int x = (int)(Math.random()*5);
            return(howyou[x]);

        }else if(meinput.contains("hello")){
            int t = (int)(Math.random()*5);
            return(hello[t]);
        }
        else if (meinput.contains("what") && meinput.contains("like")) { // this part list one of the things that Tee-Tee likes
            int i;
            int a = (int)(Math.random()*((8-1)+1))+1;
            if ( a == 1) i = 5;
            else if ( a == 2 ) i = 9;
            else if ( a == 3 ) i = 10;
            else if ( a == 4 ) i = 11;      // Generate a random num. and print respond accordingly
            else if ( a == 5 ) i = 12;
            else if ( a == 6 ) i = 13;
            else if ( a == 7 ) i = 14;
            else  i = 15;
            return(what[i]); //Possible position:5,9,10,11,12,13,14,15  //print
        } else if (meinput.contains("what") && meinput.contains("date")) { // print out the date of today
            SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy");
            Date date = new Date();
            return(what[6] + dayFormat.format(date) + ".");
        } else if (meinput.contains("what") && meinput.contains("day")) { // print out the day of the week of today
            // week day code
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            Date date = new Date();
            return(what[7] + dayFormat.format(date)+".");
        } else if (meinput.contains("what") && meinput.contains("name") && meinput.contains("my")) {  // print out user's name
            return(what[8] + " A human!");

        } else if ((meinput.contains("what") && meinput.contains("you") || meinput.contains("your"))&& meinput.contains("name")) {
            return(what[1]);	// print out Tee-Tee's name
        }else if (meinput.contains("what") && meinput.contains("you")) {	// define what is Tee-Teee (i.e. what are you)
            int i;
            double a = Math.random() * 10;
            if (a <= 3 ) i = 0;					// Generate a random num. and print respond accordingly
            else if (a > 3 && a <= 6)i = 2;
            else i = 3;

            return(what[i]);// 0,2,3
        } else if (meinput.contains("what") && meinput.contains("i")) { // the the user what the user is (i.e. what am i )
            int i;
            double a = Math.random() * 10;
            if (a <= 3)
                i = 4;
            else if (a > 3 && a <= 6)			// Generate a random num. and print respond accordingly
                i = 5;
            else
                i = 6;
            return(who[i]);// 4,5,6
        }

        //where area
        else if (meinput.contains("where") && meinput.contains("i")) {		// tell the user where the user is located
            int i;
            double a = Math.random() * 10;
            if (a <= 3)
                i = 0;
            else if (a > 3 && a <= 6)		// Generate a random num. and print respond accordingly
                i = 1;
            else
                i = 2;
            return(where[i]);// 0,1,2
        }
        else if (meinput.contains("where") && meinput.contains("we")) {	// tell the user where are they
            int i;
            double a = Math.random() * 10;
            if (a >= 5)
                i = 0;						// Generate a random num. and print respond accordingly
            else
                i = 2;
            return(where[i]);// 0,2
        }

        //the when area
        else if (meinput.contains("when") && meinput.contains("eat") && meinput.contains("me")) {		// tell the user when will he or she going to be eaten by Tee-Tee
            int i;
            double a = Math.random() * 10;
            if (a <= 3)
                i = 0;
            else if (a > 3 && a <= 6)			// Generate a random num. and print respond accordingly
                i = 1;
            else
                i = 2;
            return(when[i]);// 0,1,2
        } else if (meinput.contains("when") && meinput.contains("did") || meinput.contains("was") || meinput.contains("were")) { // ask about past
            return(when[3]);
        } else if (meinput.contains("when") && meinput.contains("are") || meinput.contains("is") || meinput.contains("does")) { // ask about present
            SimpleDateFormat dayFormat = new SimpleDateFormat("MMM, dd yyyy");
            Date date = new Date();			// print out today's date
            System.out.println(when[5] + dayFormat.format(date) + ".");
        } else if (meinput.contains("when") && meinput.contains("will") || meinput.contains("2019")) { // ask about future
            return(when[7]);
        }

        //why area starts
        else if ((meinput.contains("why") && meinput.contains("eat") || meinput.contains("food")) && (meinput.contains("i") && meinput.contains("me"))) { // why eat me ? & why i am your food?
            int i;
            double a = Math.random() * 100;
            if (a <= 25)
                i = 1;
            else if (a > 25 && a <= 50)		// Generate a random num. and print respond accordingly
                i = 2;
            else if (a > 50 && a <= 75)
                i = 5;
            else
                i = 7;
            return(why[i]);// 1,2,5,7

        }
        else if ((meinput.contains("why") && meinput.contains("good") || meinput.contains("excellent")) && meinput.contains("you")) { // why you are so good? & why you are excellent?
            int i;
            double a = Math.random() * 10;
            if (a >= 5)
                i = 3;						// Generate a random num. and print respond accordingly
            else
                i = 4;
            return(why[i]);// 3,4
        }

        //how area
        else if (meinput.contains("how") && meinput.contains("age") || meinput.contains("old")) { // ask about age
            int i;
            int a = (int) Math.random() * 2;
            if (a == 0)									// Generate a random num. and print respond accordingly
                i = 2;
            else
                i = 3;
            return(how[i]);// 2,3
        } else if (meinput.contains("how") && meinput.contains("tall") || meinput.contains("long") || meinput.contains("big") || meinput.contains("size")) {	// ask about hight
            int i;
            double a = Math.random() * 10;
            if (a >= 5)
                i = 4;								// Generate a random num. and print respond accordingly
            else
                i = 5;
            return(how[i]);// 4,5
        } else if (meinput.contains("how") && meinput.contains("die") || meinput.contains("dead") || meinput.contains("died")) { // ask about death
            return(how[6]);
        } else if (meinput.contains("how") && meinput.contains("you") && (meinput.contains("are") || meinput.contains("do"))) {  // how are you? or how do you do?
            int i;
            double a = Math.random() * 100;
            if (a >= 50)
                i = 0;
            else								// Generate a random num. and print respond accordingly
                i = 1;
            return(how[i]);// 0,1
        }
        else if(meinput.contains("who") && meinput.contains("you")){
            return who[2];
        }

        return "Sorry I don't understand";

    }

}
