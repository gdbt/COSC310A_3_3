package com.example.noah.dinobot;

import java.util.Scanner;

public class travel extends chatBot{
	public void runTopic(String input) {
		String userinput = input;
		Scanner scan = new Scanner(System.in);
		//whats asking about tourism spots
		if (userinput.contains("what") && userinput.contains("cuba")) {
			System.out.println("I heard cuba is a great vacation spot!");
		}
		else if (userinput.contains("what") && userinput.contains("london")) {
			System.out.println("Isn't London the capital of the Island nation England? It sounds very lush and green in the country side around it");
		}
		else if (userinput.contains("what") && userinput.contains("kelowna")) {
			System.out.println("That sounds like the best place ever! i bet it is a real tourism spot");
		}
		else if (userinput.contains("what")) {
			System.out.println("I have heard about Cuba, London and Kelowna!");
		}
		//where asking where they live.
		else if (userinput.contains("where") && userinput.contains("live")) {
			System.out.println("I live in Pangea! It is massive");
			System.out.println("Where do you live?");
			String home = (scan.nextLine()).toLowerCase(); //grab where the user says they live and makes it lowercase
			
			switch(home){ //switch case for responses
			case "kelowna":
				System.out.println("WOW you live there! I heard it is so beautiful");
				break;
			case "vancouver":
				System.out.println("Woah I heard that is a huge city and that it rains a lot!");
				break;
			case "vostok station":
				System.out.println("That place is horribly cold! I can't imagine it being so cold.");
				break;
			default:
				System.out.println("I don't know that one, I don't know many places.");
				break;
				
			}
			
		}
		else if(userinput.contains("how") && userinput.contains("quantum")) {
			System.out.println("The same way I learnt about the places. Many books.");
		}
		else if (userinput.contains("how") && userinput.contains("find")) {
			System.out.println("I found postcards aomngst my travels. I am not really sure how they got here though. Maybe the same way you did?");
		}
		else if(userinput.contains("how") && userinput.contains("travel")) {
			System.out.println("I would use a teleporter and time machine to traverse 4th dimensional barriers to access the current time.");
		}
		else if(userinput.contains("quantum") && userinput.contains("travel")) {
			System.out.println("That is for me to know.");
		}

		
	}

}
