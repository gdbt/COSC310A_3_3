package com.example.noah.dinobot;

public interface TopicQuestions {
	public abstract void runTopic(String input);
	/***
	runTopic should will take in the String input,
	which will be the words /who / what/ where / when / why / how
	and run the respective question method
	**/
	public abstract void whoQuestion(String input);
	public abstract void whatQuestion(String input);
	public abstract void whereQuestion(String input);
	public abstract void whenQuestion(String input);
	public abstract void whyQuestion(String input);
	public abstract void howQuestion(String input);
	
}
