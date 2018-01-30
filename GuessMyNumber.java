package chapter5;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
	
	
	//guessGame method allows the user to guess and gets a responses relative to the user's entry 
	public static void guessGame() 
	{
		Random random = new Random();
		int rNum = random.nextInt(100)+1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("I'm thinking of a number between 1 and 100 (including both)");
		System.out.print("Can you guess what it is?  ");
		int myNum = in.nextInt();
		System.out.println();
		
		System.out.println("Your guess is : "+myNum);
		System.out.println("My Guess was : "+rNum);
		
		int diff = myNum - rNum;
		System.out.println("You were off by : "+diff);
		System.out.println();
		
		checkGuess(rNum, diff);

	}
	
	
	//checkGuess method checks how LOW or how HIGH a guess is
	public static void checkGuess(int guessNum,int diff) 
	{
		if(diff > guessNum) //Checks if HIGH
		{
			System.out.println("Your Guess it too HIGH!");
			System.out.println("You can do it!");
			System.out.println("Try agin ;D");
			System.out.println();
			guessGame();
		}
		
		else if (diff < guessNum) //Checks if LOW
		{
			System.out.println("Your Guess it too LOW!");
			System.out.println("You can do it!");
			System.out.println("Try agin ;D");
			System.out.println();
			guessGame();
		}
		
		else 
		{
			System.out.println("Spot on! You got it right!!!");
		}
	}
	
		

	public static void main(String[] args) {
		
	guessGame(); // Method call for guessGame

	}	

}
