package com.example.noah.dinobot;

import java.util.Scanner;

public class shmeegulXD {
static int shmeegultest;
	public String main(String input)  {
		String usershmeegul = input;

		//saying lotr is good
		if(usershmeegul.contains("why") && ((usershmeegul.contains("like")) || usershmeegul.contains("love")) && usershmeegul.contains("lotr")) {
			shmeegultest = (int)(Math.random()*2);
			if(shmeegultest == 1)
				return("> Because tolkien is a master mind!");
			else
				return("> Because everyone is so tough");
		}
		else if(usershmeegul.contains("like") || usershmeegul.contains("love") && usershmeegul.contains("lotr") || usershmeegul.contains("lord") && usershmeegul.contains("of") && usershmeegul.contains("the") && usershmeegul.contains("rings") || usershmeegul.contains("shmeegul")){
			return("> Lord of the Rings is great!");

		}
		//asking why he likes lotr

		//ask how he started lotr
		else if(usershmeegul.contains("how")) {
			shmeegultest = 2;
			if(shmeegultest == 0)
				return("> I found the audio books in a pterodactyl nest");
			else if(shmeegultest == 1)
				return("> Hunting Birds!");
			else if(shmeegultest == 2)
				return("> I climbed a tree and found them all.");
			else
				return("> I don't know. HMMMMM!");
		}
		//checking when he began
		else if(usershmeegul.contains("when")) {
			shmeegultest = (int)(Math.random()*3);
			if(shmeegultest == 0)
				return("> Musta been about a decade now. time flies");
			else
				return("> Wow its been ten years");
		}
		//checking least favorite character
		else if((usershmeegul.contains("what")) && (usershmeegul.contains("least")) && usershmeegul.contains("favorite") && (usershmeegul.contains("character") || usershmeegul.contains("characters"))){
			shmeegultest = (int)(Math.random()*2);
			if(shmeegultest == 0)
				return("> Definitely Wormtongue. Hes the worst roar!");
			else
				return("> Cant think of any. Wait! I HATE wormtongue");
		}
		//checking favorite COUNTRY
		else if((usershmeegul.contains("what")) && usershmeegul.contains("favorite") && (usershmeegul.contains("location") || usershmeegul.contains("country"))){
			return("> Definitely Mordor! Sauron lives their!");
		}
		//favorite character
		else if((usershmeegul.contains("what")) && usershmeegul.contains("favorite") && (usershmeegul.contains("character") || usershmeegul.contains("characters"))){
			return("> Sauron because hes tougher than a t-rex");
		}
		//asking what he would do with the ring
		else if(usershmeegul.contains("you") && ((usershmeegul.contains("do") && (usershmeegul.contains("ring"))))){
			shmeegultest = (int)(Math.random()*2);
			if(shmeegultest == 0)
				return("> Use it to collect more stuff of course");
			else
				return("> be the toughest dino!");
		}

		//asking if he likes the movies
		else if(usershmeegul.contains("movies")) {
			shmeegultest = (int) (Math.random()*4);
			if(shmeegultest == 0) {
				return("> UGH!");
			}
			else if(shmeegultest == 1) {
				return("> HATE those. read the books");
			}
			else if(shmeegultest == 2) {
				return("> those are the worst");
			}
			else {
				return("> NO I WONT HEAR IT");
			}

		}

		//saying wormtongue
		else if(usershmeegul.contains("wormtongue")) {
			shmeegultest = (int) (Math.random()*5);
			if(shmeegultest == 0) {
				return("> What a bad dude. rawrXD");
			}
			else {
				return("> Don't like that one. hes a bad egg");
			}
		}

		//asking what
		else if(usershmeegul.contains("what")) {
			shmeegultest = (int) (Math.random()*3);
			if(shmeegultest == 0) { //multiple random for different responses for generic what
				return("> Shelob is scary");
			}
			else if (shmeegultest == 1){
				return("> I bet orcs are tasty");
			}
			else {
				return("> I could beat the balrog in an arm wrestle");
			}
		}


		return"> I don't understand";
	}
}


