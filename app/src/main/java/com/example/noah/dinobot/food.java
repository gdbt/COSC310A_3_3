package com.example.noah.dinobot;


public class food {
    public String main(String cookinput) {

        //main string answer arrays
        String[] what = {"> Meat, like human", "> Human, just like you", "> Bubble Tea", "> It's delicious"};
        String[] where = {"> In my cave", "> In Taiwan"};
        String[] who = {"> Sometimes with myself", "> Sometimes with other dinosaurs", "> by myself", "> The owner."};
        String[] how = {"> Four times a day", "> It's so delicious", "> By my hand", "> It's a combination of tea and milk and tapioca balls.", "> I like it half sweet."};
        String[] why = {"> I need to eat.", "> Because you look delicious."};
        String[] when = {"> During lunchtime", "> During dinner time.", "> Perhaps during breakfast time.", "> Two days ago.", "> When I am hungry."};

        //the who section
        if(cookinput.contains("who") && cookinput.contains("with")) {
            int mathtest = (int)(Math.random()*2);
            if(mathtest == 1)
                return(who[0]);
            else
                return(who[1]);
        }
        else if(cookinput.contains("cook") && cookinput.contains("who")){
            return(who[2]);
        }
        else if(cookinput.contains("make") && cookinput.contains("make")){
            return(who[3]);

        }

        //the what section
        else if (cookinput.contains("what") && cookinput.contains("eat")){
            int mathtest = (int)(Math.random()*2);
            if(mathtest == 1)
                return(what[0]);
            else
                return(what[1]);
        }
        else if(cookinput.contains("what") && cookinput.contains("drink")){
            return(what[2]);
        }
        else if(cookinput.contains("what") && cookinput.contains("about")){
            return(what[3]);
        }

        //the where section
        else if (cookinput.contains("where") && cookinput.contains("eat")){
            return(where[0]);
        }
        else if (cookinput.contains("where") && cookinput.contains("bubble tea") && cookinput.contains("invented")){
            return(where[1]);
        }

        //the when section
        else if (cookinput.contains("when") && cookinput.contains("eat") && cookinput.contains("lunch")){
            return(when[0]);
        }
        else if (cookinput.contains("when") && cookinput.contains("eat") && cookinput.contains("dinner")){
            return(when[1]);
        }
        else if (cookinput.contains("when") && cookinput.contains("eat") && cookinput.contains("breakfast")){
            return(when[2]);
        }

        else if (cookinput.contains("when") && cookinput.contains("last") && cookinput.contains("meal")){
            return(when[3]);
        }
        else if (cookinput.contains("when") && cookinput.contains("eat")){
            return(when[4]);
        }

        //the why section
        else if (cookinput.contains("why") && cookinput.contains("eat") && (cookinput.contains("me")|| cookinput.contains("human"))){
            return(why[1]);
        }
        else if (cookinput.contains("why") && cookinput.contains("eat")){

            return(why[0]);
        }

        //the how section
        else if (cookinput.contains("how") && cookinput.contains("about")){
            return(how[1]);
        }
        else if (cookinput.contains("how") && cookinput.contains("many") && cookinput.contains("meals") && (cookinput.contains("eat"))){
            return(how[0]);
        }
        else if (cookinput.contains("how") && cookinput.contains("do") && cookinput.contains("eat")){
            return(how[2]);
        }
        else if (cookinput.contains("how") && cookinput.contains("bubble tea") && cookinput.contains("made")){
            return(how[3]);
        }
        else if (cookinput.contains("how") && cookinput.contains("do") && cookinput.contains("like") && cookinput.contains("bubble tea")){
            return(how[4]);
        }
        return("Sorry I don't understand");
    }

}


