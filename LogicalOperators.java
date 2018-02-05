package chapter5;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int x = scan.nextInt();
		if(x > 0 && x < 10)
		{
			System.out.println("Positive Single Digit Number");
		}

	}

}
