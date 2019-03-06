package com.example.noah.dinobot;

import java.util.Scanner;

public class food extends chatBot implements TopicQuestions {
	
	IrrelavantTopic irrTopic;
	
	public food(){
		 irrTopic = chatBot.irrTopic;
		}
	
	Scanner in = new Scanner(System.in);
	
	
	String[] what = {"Meat, like human", "Human, just like you", "Bubble Tea", "It's delisious"};
	String[] where = {"In my cave", "In Taiwan"};
	String[] who = {"Sometimes with myself", "Sometimes with other dinosaurs", "by myself", "The owner."};
	String[] how = {"four times", "It's so delicious", "By my hand", "It's a combination of tea and milk and tapioca balls.", "I like it half sweet."};
	String[] why = {"I need to eat.", "Because you look delicious."};
	String[] when = {"During luchtime", "During dinner time.", "Perhaps during breakfest time.", "Two days ago.", "When I am hungry."};		

	
	@Override
	public void runTopic(String input) {
		// TODO Auto-generated method stub
		String wHquestion = irrTopic.getwHquestion();
		switch (wHquestion) {
		case "what": 
			whatQuestion(input);
			break;
		case "where":
			whereQuestion(input);
			break;
		case "when":
			whenQuestion(input);
			break;
		case "why":
			whyQuestion(input);
			break;
		case "how":
			howQuestion(input);
			break;
		case "who":
			whoQuestion(input);
			break;
		}
		
	}
	


	@Override
	public void whoQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("with")){
		int mathtest = (int)(Math.random()*2);
			if(mathtest == 1)
				System.out.println(who[0]);
			else
				System.out.println(who[1]);
		}
			else if(input.contains("cook")){
				System.out.println(who[2]);
			}else if(input.contains("make")){
				System.out.println(who[3]);
			}
		
		
		
	}



	@Override
	public void whatQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat")){
			int mathtest = (int)(Math.random()*2);
				if(mathtest == 1)
					System.out.println(what[0]);
				else
					System.out.println(what[1]);
			}
		else if(input.contains("drink")){
			System.out.println(what[2]);
		}
		else if(input.contains("about")){
			System.out.println(what[3]);
		}
		
	}



	@Override
	public void whereQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat")){
			System.out.println(where[0]);		
		}
		else if (input.contains("bubble tea") && input.contains("invent")){
			System.out.println(where[1]);
		}

	}



	@Override
	public void whenQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat") && input.contains("lunch")){
			System.out.println(when[0]);
		}
		else if (input.contains("eat") && input.contains("dinner")){
			System.out.println(when[1]);
		}
		else if (input.contains("eat") && input.contains("breakfast")){
			System.out.println(when[2]);
		}
		
		else if (input.contains("last") && input.contains("meal")){
			System.out.println(when[3]);
		}
		else if (input.contains("eat")){
			System.out.println(when[4]);
		}
	}



	@Override
	public void whyQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat") && (input.contains("me")|| input.contains("human"))){
			System.out.println(why[1]);
		}
		else if (input.contains("eat")){
			
			System.out.println(why[0]);
		}
	}



	@Override
	public void howQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("about")){
			System.out.println(how[1]);
		} else if (input.contains("many") && input.contains("meals") && (input.contains("eat"))){
			System.out.println(how[0]);
		} else if (input.contains("do") && input.contains("eat")){
			System.out.println(how[2]);
		} else if (input.contains("bubble tea") && input.contains("made")){
			System.out.println(how[3]);
		} else if (input.contains("do") && input.contains("like") && input.contains("bubble tea")){
			System.out.println(how[4]);
			
		}
	}
}
