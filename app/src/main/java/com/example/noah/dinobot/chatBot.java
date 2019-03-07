package com.example.noah.dinobot;
import java.lang.reflect.*;
import java.util.Scanner;
public class chatBot {

	static String name; 
	static String checkstring;
	public static IrrelavantTopic irrTopic;
	
	public static void main(String args[]) {

		irrTopic = new IrrelavantTopic();
		//Loadingscrean.main(args);  ****TEMPORARILY REMOVED FOR EASE OF TESTING

//		System.out.println("ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr");
//		System.out.println("Welcome to the Dino-Bot, Please Enter the name you would like to be called by.");
//		Scanner mainscan = new Scanner(System.in);
//		name = mainscan.nextLine();
//		System.out.println("Greetings " + name + ". My name is Tee-Tee the T-Rex!!");
//		System.out.println("If you are curious type \"help\" to get a list of topics I will talk to you about!");
		//feel free to change later, just did this so i could access code from main area
		inputfield();
//		mainscan.close(); ***** TEMPORARILY CLOSED FOR SPEED OF TESTING

		
	}
	
	public static void inputfield(){ //input method. Subject to change like crazy
		Scanner inscan = new Scanner(System.in);
		String startoption;
		System.out.println("inputfield");
		
		//checking what they are talking about.
		boolean continueConv;
		do {
			startoption = (inscan.nextLine()).toLowerCase(); //scanning an input
			continueConv = conversation(startoption);
		}while(continueConv!=false);
		if (continueConv == false) {
			System.exit(0);
		}
		//roar else
		
	}
	
	public static boolean conversation(String userIn) {
		checktopic(userIn); // - keep checktopic for roar contest

		try {
			return irrTopic.checkRelavancy(userIn);
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException | InstantiationException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry! There seems to be an issue.");
			System.out.println("Please restart the program.");
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
	public static void checktopic(String top) { //grabs the topic, to save space this is used fo most topics
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
					inputfield(); //returns false to where it was called.
					
				default:
					System.out.println("I still don't understand."); //default incase you spam the keyboard
					
				}
				topche.close();
				inputfield();
			}
		}
		else if(top.equals("help")) {
			//helpMe("FILLER");
			inputfield();
		}
		else if(top.equals("about")) {
			aboutMe("FILLER");
			inputfield();
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
			System.exit(0); //closing the program forcibl
		}
	}
	
	//helpMe prompts user with list of topics the bot is able to talk about.
//	public void helpMe() {
//	    String newtext;
//		newtext = ("Curious to know what I can talk about? Have a list"); //prints list of topics
//
//
//        //make thinking if it works
//		currenttext += "\n" + ("..........."); //spacer
//        currenttext += "\n" + ("We can test how well your roar is!");			 	//Prompts roar contest
//        currenttext += "\n" + ("Or we can talk about food");						//Prompts food topic
//        currenttext += "\n" + ("We can discuss my rock collection!");				//Prompts collection topic
//        currenttext += "\n" + ("How about talking about Lord of The Rings?");		//Prompts Lord of The Rings topic
//        currenttext += "\n" + ("Or if you want to get to know me thats fine too!");	//Prompts general qna
//        currenttext += "\n" + ("I also happen to know about traveling!");
//        currenttext += "\n" + (thinking());
//
//	}
	
	public static String aboutMe(String extra) {
		String newtext = ("My name is Tee-Tee and I am a Java jar program,");
        extra += "\n" + newtext;
		extra += "\n" + ("Coded by Eric, Noah, Yue, Aidan and Kathryn - for their COSC 310 Assignment. This Version is tweaked by Noah");
        extra += "\n" + ("They hope you'll get the full experience of talking to an old dinosaur like me!");
        return extra;
	}
	
}
