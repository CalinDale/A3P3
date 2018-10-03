package Calin.A3P3;

import java.util.Random;
import java.util.Scanner;

public class StoneOfWisdom {
	
	private Random rand = new Random();
	private Scanner reader = new Scanner(System.in);
	
	public String name;
	public String word;
	public String[] answers = {
		"The stone is silent, like ",
        "The stone whispers to you, but too quitely to hear. It is mysterious, much like ",
        "You hear a voice in your head that sounds like your own, it is reading out this sentence. That's the stone's voice. It knows you, just like ",
        "The stone speaks through the wind around you, it says: 'woosh'. It is truely connected with all things, much like "
    };
	public String answer; 
	
	public void askTheStone() {
		System.out.println("Greetings Traveler. I present to you, the Stone of Wisdom!");
		System.out.println("It can answer any question you have.");
		System.out.println("First, your name... ");
		this.setName(reader.nextLine());
		System.out.println("Greetings " + this.name + ". Now, tell the stone the subject which you wish to learn of.");
		System.out.println("Just one word is best, or the answer becomes too wise for mortals to understand.");
		this.setWord(reader.nextLine());
		this.selectAnswer();
		System.out.println("Ah yes, the stone is answering!");
		System.out.println(this.reply());
		System.out.println("That will be $20.");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setWord(String word){
		this.word = word;
	}
	
	public String selectAnswer() {
		int n = rand.nextInt(answers.length) + 1;
		this.answer = answers[n-1];
		return this.answer;
	}
	
	public String reply() {
		return this.answer + this.word + ".";
	}
}
