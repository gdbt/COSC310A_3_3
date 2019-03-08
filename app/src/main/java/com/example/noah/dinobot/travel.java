package com.example.noah.dinobot;


public class travel {
	public String main(String input) {
		String userinput = input;

		//whats asking about tourism spots
		if (userinput.contains("what") && userinput.contains("cuba")) {
			return("I heard cuba is a great vacation spot!");
		}
		else if (userinput.contains("what") && userinput.contains("london")) {
			return("Isn't London the capital of the Island nation England? It sounds very lush and green in the country side around it");
		}
		else if (userinput.contains("what") && userinput.contains("kelowna")) {
			return("That sounds like the best place ever! i bet it is a real tourism spot");
		}
		else if (userinput.contains("what")) {
			return("I have heard about Cuba, London and Kelowna!");
		}
		//where asking where they live.
		else if (userinput.contains("where") && userinput.contains("live")) {
			return("I live in Pangea! It is massive");
		}
		else if(userinput.contains("how") && userinput.contains("quantum")) {
			return("The same way I learnt about the places. Many books.");
		}
		else if (userinput.contains("how") && userinput.contains("find")) {
			return("I found postcards aomngst my travels. I am not really sure how they got here though. Maybe the same way you did?");
		}
		else if(userinput.contains("how") && userinput.contains("travel")) {
			return("I would use a teleporter and time machine to traverse 4th dimensional barriers to access the current time.");
		}
		else if(userinput.contains("quantum") && userinput.contains("travel")) {
			return("That is for me to know.");
		}
		return "I don't know.";


	}

}
