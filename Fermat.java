package chapter5;

import java.util.Scanner;

public class Fermat {
	
	
	//Method that Check's Fermat's Theorem
	
	public static void checkFermat(int a,int b,int c,int n)
	{
		boolean  chkExpr = Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) ;
		boolean  chkN = n <= 2;
		
		if(!chkN && chkExpr)	
		{
			System.out.println("Holy smokes,Fermat was wrong!");
		}
		
		else 
		{
		    System.out.println("No that doesn't work!");
		}
	}
	
	

	public static void main(String[] args) {

			int a,b,c,n;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter Value of variable --> a: ");
			a=scan.nextInt();
			System.out.println();
			
			System.out.print("Enter Value of variable --> b: ");
			b=scan.nextInt();
			System.out.println();
			
			System.out.print("Enter Value of variable --> c: ");
			c=scan.nextInt();
			System.out.println();
			
			System.out.print("Enter Value of variable --> n: ");
			n=scan.nextInt();
			System.out.println();
			
			
			checkFermat(a, b, c, n);
			
			

	}

}
