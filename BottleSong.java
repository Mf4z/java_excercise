package chapter5;

import java.util.Scanner;

public class BottleSong {
	
	
		public static void bottleMethod(int n)
		{
			
			if(n == 0)
			{
				System.out.println("No bottles of Zobo on the wall,");
				System.out.println("no bottles of Zobo,");
				System.out.println("ya' can't take down, ya' can't pass it around,");
				System.out.println("'cause there are no bottles of Zobo on the wall!");
			}
			
			else{
				
				System.out.println(n+" bottles of Zobo on the wall,");
				System.out.println(n+" bottles of Zobo,");
				System.out.println("ya' take one down, ya' pass it around");
				n--;
				System.out.println(n +" bottles of Zobo on the wall,");
				System.out.println();
				bottleMethod(n);
				
			}
			
			
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of bottles you wish tomake the song on : ");
		int n =scan.nextInt();
		bottleMethod(n);

	}

}
