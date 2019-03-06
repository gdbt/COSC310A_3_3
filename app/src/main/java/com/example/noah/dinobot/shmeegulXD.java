package com.example.noah.dinobot;

import java.util.Scanner;

public class shmeegulXD extends chatBot{
static int shmeegultest;
	public void runTopic(String input)  {
		Scanner mainshmeegul = new Scanner(System.in);
		String usershmeegul = input;
		
		//saying lotr is good
		if(usershmeegul.contains("why") && ((usershmeegul.contains("like")) || usershmeegul.contains("love")) && usershmeegul.contains("lotr")) {
			shmeegultest = (int)(Math.random()*2);
			if(shmeegultest == 1)
				System.out.println("Because tolkien is a master mind!");
			else
				System.out.println("Because everyone is so tough");
		}
		else if(usershmeegul.contains("like") || usershmeegul.contains("love") && usershmeegul.contains("lotr") || usershmeegul.contains("lord") && usershmeegul.contains("of") && usershmeegul.contains("the") && usershmeegul.contains("rings") || usershmeegul.contains("shmeegul")){
			System.out.println("Lord of the Rings is great! Who is your favorite character?");
			String charfav = (mainshmeegul.nextLine()).toLowerCase();
			favoritechar(charfav);
		}
		//asking why he likes lotr

		//ask how he started lotr
		else if(usershmeegul.contains("how")) {
			shmeegultest = 2;
			if(shmeegultest == 0)
				System.out.println("I found the audio books in a pterodactyl nest");
			else if(shmeegultest == 1)
				System.out.println("Hunting Birds!");
			else if(shmeegultest == 2)
				System.out.println("I climbed a tree and found them all.");
			else 
				System.out.println("I dont know. HMMMMM!");
		}
		//checking when he began
		else if(usershmeegul.contains("when")) {
			shmeegultest = (int)(Math.random()*3);
			if(shmeegultest == 0)
				System.out.println("Musta been about a decade now. time flies");
			else
				System.out.println("Wow its been ten years");
		}
		//checking least favorite character
		else if((usershmeegul.contains("what")) && (usershmeegul.contains("least")) && usershmeegul.contains("favorite") && (usershmeegul.contains("character") || usershmeegul.contains("characters"))){
			shmeegultest = (int)(Math.random()*2);
			if(shmeegultest == 0)
				System.out.println("Definately wormtongue. Hes the worst roar!");
			else
				System.out.println("Cant think of any. Wait! I HATE wormtongue");
		}
		//checking favorite COUNTRY
		else if((usershmeegul.contains("what")) && usershmeegul.contains("favorite") && (usershmeegul.contains("location") || usershmeegul.contains("country"))){
			System.out.println("Definately Mordor! Sauron lives their!");
		}
		//favorite character
		else if((usershmeegul.contains("what")) && usershmeegul.contains("favorite") && (usershmeegul.contains("character") || usershmeegul.contains("characters"))){
			System.out.println("Sauron because hes tougher than a t-rex");
		} 
		//asking what he would do with the ring
		else if(usershmeegul.contains("you") && ((usershmeegul.contains("do") && (usershmeegul.contains("ring"))))){
			shmeegultest = (int)(Math.random()*2);
			if(shmeegultest == 0)
				System.out.println("Use it to collect more stuff of course");
			else
				System.out.println("be the toughest dino!");
		}
				
		//asking if he likes the movies
		else if(usershmeegul.contains("movies")) {
			shmeegultest = (int) (Math.random()*4);
			if(shmeegultest == 0) {
				System.out.println("UGH!");
			}
			else if(shmeegultest == 1) {
				System.out.println("HATE those. read the books");
			}
			else if(shmeegultest == 2) {
				System.out.println("those are the worst");
			}
			else {
				System.out.println("NO I WONT HEAR IT");
			}

		  }
		
		//saying wormtongue
		else if(usershmeegul.contains("wormtongue")) {
			shmeegultest = (int) (Math.random()*5);
			if(shmeegultest == 0) {
				System.out.println("what a bad dude. rawrXD");
			}
			else {
				System.out.println("Dont like that one. hes a bad egg");
			}
		}
		
		//asking what
		else if(usershmeegul.contains("what")) {
			shmeegultest = (int) (Math.random()*3);
			if(shmeegultest == 0) { //multiple random for different responses for generic what
				System.out.println("Shelob is scary");
			}
			else if (shmeegultest == 1){
				System.out.println("I bet orcs are tasty");	
			}
			else {
				System.out.println("I could beat the balrog in an arm wrestle");
			}
		}


		return;
	  }
	
	
	
	public static void favoritechar(String fav) { //checks to see if the chatbot knows your character
		Scanner secondshmeegul = new Scanner(System.in);
		
		switch (fav) {
		case "aragorn":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about gondor?");
			String useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("Gondor is the home of man. Its a good place to get a bite to eat. RAWR!");
			}
			else
				System.out.println("ok");
			break;
		case "gimli":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about moria?");
			useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("Moria is a dwarven mining city destroyed by the balrog");
			}
			else
				System.out.println("ok");
			break;
		case "legolas":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about rivendell?");
			useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("Rivendell is that place with the guy from the matrix");
			}
			else
				System.out.println("ok");
			break;
		case "frodo":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			else
				System.out.println("ok");
			break;
		case "bilbo":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			else
				System.out.println("ok");
			break;
		case "sam":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			else
				System.out.println("ok");
			break;
		case "merry":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			else
				System.out.println("ok");
			break;
		case "pippin":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			else
				System.out.println("ok");
			break;
		case "gandalf":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			else
				System.out.println("ok");
			break;
		case "sauroman":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about isengard");
			useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("Isengard is sauromans home but he wrecked the place");
			}
			else
				System.out.println("ok");
			break;
		case "sauron":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about mordor?");
			useryshmeegul = secondshmeegul.nextLine();
			if(useryshmeegul.contains("yes")) {
				System.out.println("Mordor is saurons home. great place");
			}
			else
				System.out.println("ok");
			break;
		case "smeagul":
			System.out.println("Your favorite character is " + fav + " ? I dont like him");
			break;
		case "wormtongue":
			System.out.println("Your favorite character is " + fav + " ? I dont like him");
			break;
		case "shmeegul":
			System.out.println("Your favorite character is " + fav + " ? REEEEEEEEEEEEEEEE!");
			break;
		default:
			System.out.println("I don't think I know who that is.");
		}
		return;
	}
}


