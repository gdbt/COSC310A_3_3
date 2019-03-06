package com.example.noah.dinobot;

import java.util.Scanner;

@SuppressWarnings("resource")
public class collection {
static int mathtest;
	public void runTopic(String input)  {
		// TODO Auto-generated method stub
		Scanner maininput = new Scanner(System.in);
		String userinput = input;
		
		//asking what favorite type of rocks
		if((userinput.contains("what")) && userinput.contains("favorite") && (userinput.contains("rock") || userinput.contains("rocks"))){
			System.out.println("I don't have a favorite rock. What is your favorite?");
			String userfav = (maininput.nextLine()).toLowerCase();
			favoritecheck(userfav);
		}
		//asking why no plants
		else if(userinput.contains("why") && ((userinput.contains("plant")) || userinput.contains("plants"))) {
			mathtest = (int)(Math.random()*2);
			if(mathtest == 1)
				System.out.println("Plants are too soft and break easily");
			else
				System.out.println("Plants get nasty really fast after picking them up");
		}
		//if you ask why he collects
		else if(userinput.contains("why")) {
			mathtest = (int)(Math.random()*5);
			if(mathtest == 0)
				System.out.println("I think the rocks are pretty");
			else if(mathtest == 1)
				System.out.println("I like how the bones look");
			else if(mathtest == 2)
				System.out.println("The bones make me seem way more intimidating, almost like I killed them myself");
			else if(mathtest == 3)
				System.out.println("It shows how far I have traveled");
			else 
				System.out.println("Sometimes I want a reminder of what I have done.");
		}
		//checking when they collection items
		else if(userinput.contains("when")) {
			mathtest = (int)(Math.random()*3);
			if(mathtest == 0)
				System.out.println("After eating I might collect the bones");
			else if(mathtest == 1)
				System.out.println("I wonder around during the day to find things");
			else
				System.out.println("Definitely not at night, too hard to see things");
		}
		//asking who helps
		else if(userinput.contains("who")) {
			System.out.println("Just me, this is just my collection");
		}
		//checking least favorite bone
		else if((userinput.contains("what")) && (userinput.contains("least")) && userinput.contains("favorite") && (userinput.contains("bone") || userinput.contains("bones"))){
			mathtest = (int)(Math.random()*2);
			if(mathtest == 0)
				System.out.println("The raptor Bones, because they are brittle and hard to bring home.");
			else
				System.out.println("The raptor Bones, because they are hard to find and raptors can be mean.");
		}
		//checking favorite bone
		else if((userinput.contains("what")) && userinput.contains("favorite") && (userinput.contains("bone") || userinput.contains("bones"))){
			System.out.println("The Argentinosaurus, Because It is one of the biggest Dinosaur's I've seen");
		}
		//asking what kind of bones
		else if(userinput.contains("what") && ((userinput.contains("bones")) || userinput.contains("bone"))){
			mathtest = (int)(Math.random()*4);
			if(mathtest == 0)
				System.out.println("I have some raptor bones");
			else if (mathtest == 1)
				System.out.println("I have some Spinosaurus bones");
			else if (mathtest == 2)
				System.out.println("I have a few Argentinosaurus bones. It's HUGE!");
			else
				System.out.println("I have various random bones");
		}
		//asking what kind of rocks
		else if(userinput.contains("what") && (userinput.contains("rocks") || userinput.contains("rock"))) {
			mathtest = (int) (Math.random()*3);
			if (mathtest == 0) 
				System.out.println("I have some Volcanic rocks");
			else if (mathtest == 1)
				System.out.println("I have a few Geode and crystal rocks");
			else
				System.out.println("I have a few gem rocks.");  
		}
		//asking what kind of gems
		else if(userinput.contains("what") && ((userinput.contains("gem") || (userinput.contains("gems"))))){
			mathtest = (int)(Math.random()*2);
			if(mathtest == 0)
				System.out.println("I have emeralds!");
			else
				System.out.println("I have rubies!");
		}
				
		//asking what you have in general
		else if(userinput.contains("what")) {
			mathtest = (int) (Math.random()*3);
			if(mathtest == 0) { //multiple random for different responses for generic what
				System.out.println("I have rocks");
			}
			else if (mathtest == 1){
				System.out.println("I have bones");	
			}
			else {
				System.out.println("I do not have plants");
			}
		}
		//if they ask about how you got the rocks
		else if((userinput.contains("how")) && ((userinput.contains("rocks")) || userinput.contains("rock"))) {
			mathtest = (int) (Math.random()*2);
			if(mathtest == 0) {
				System.out.println("I just wander around and kick the rocks home or grab them with my teeth");
			}
			else if(mathtest == 1) {
				System.out.println("Sometimes I drop bigger rocks on smaller rocks to see what happens");
			}
		}
		//if they just ask a random general how
		else if(userinput.contains("how")) {
			mathtest = (int) (Math.random()*5);
			if(mathtest == 0) {
				System.out.println("I just wander around and kick the rocks home or grab them with my teeth");
			}
			else if(mathtest == 1) {
				System.out.println("Sometimes I drop bigger rocks on smaller rocks to see what happens");
			}
			else if (mathtest == 2) {
				System.out.println("I kill things for dinner and save the body for later");
			}
			else if(mathtest == 3) {
				System.out.println("I kill things and wait for others to eat it and collect the bones");
			}
			else {
				System.out.println("I wait for for other things to kill stuff and then grab the bones");
			}
		}
		//asking if it is dangerous
		else if(userinput.contains("dangerous")) {
			mathtest = (int) (Math.random()*4);
			if(mathtest == 0) {
				System.out.println("Rocks aren't really dangerous to grab and carry");
			}
			else if(mathtest == 1) {
				System.out.println("Bones can be dangerous, especially if I take them from someone else");
			}
			else if(mathtest == 2) {
				System.out.println("Yes Sometimes other dinosaurs chase after me thinking I have food");
			}
			else {
				System.out.println("Yes sometimes other dinosaurs think I am stealing their food");
			}
		}
		return;
	}
	
	
	
	public static void favoritecheck(String fav) { //checks to see if the chatbot knows your stone, and if it does and its a birthstone will declare the month of it.
		switch (fav) {
		case "emerald":
			System.out.println("Your favorite is " + fav + " ? That's the May gemstone");
			break;
		case "ruby":
			System.out.println("Your favorite is " + fav + " ? That's the July gemstone");
			break;
		case "diamond":
			System.out.println("Your favorite is " + fav + " ? That's the April gemstone");
			break;
		case "opal":
			System.out.println("Your favorite is " + fav + " ? That's the October gemstone");
			break;
		case "garnet":
			System.out.println("Your favorite is " + fav + " ? That's the January gemstone");
			break;
		case "topaz":
			System.out.println("Your favorite is " + fav + " ? That's the November gemstone");
			break;
		case "sapphire":
			System.out.println("Your favorite is " + fav + " ? That's the September gemstone");
			break;
		case "pearl":
			System.out.println("Your favorite is " + fav + " ? That's the June gemstone");
			break;
		case "geode":
			System.out.println("Your favorite is " + fav + " ? That sounds like a good one!");
			break;
		case "amythest":
			System.out.println("Your favorite is " + fav + " ? That's the February gemstone");
			break;
		case "aquamarine":
			System.out.println("Your favorite is " + fav + " ? That's the March gemstone");
			break;
		case "turquoise":
			System.out.println("Your favorite is " + fav + " ? That's the December gemstone");
			break;
		case "onyx":
			System.out.println("Your favorite is " + fav + " ? That sounds like a good one!");
			break;
		case "carnelian":
			System.out.println("Your favorite is " + fav + " ? That sounds like a good one!");
			break;
		case "peridot":
			System.out.println("Your favorite is " + fav + " ? That's the August gemstone");
			break;
		case "beryl":
			System.out.println("Your favorite is " + fav + " ? That sounds like a good one!");
			break;
		case "tanzanite":
			System.out.println("Your favorite is " + fav + " ? That sounds like a good one!");
			break;
		default:
			System.out.println("Hmmmm I'm sorry I don't think I know what " + fav + " is. Sorry!");
		}
	}

}