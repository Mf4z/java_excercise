/*
 * Exercise : 2.2
 * Written by : Marwan Mustapha 
 * Program : Date formats
 * Date: 20/01/2018
 * */


package chapter2;

public class Date {

	public static void main(String[] args) {


		System.out.println("\n>> Date formats <<\n");
		
		int date= 20;
		String day = "Saturday";
		String month ="January";
		int year=2018;
		
		String americanStd = day+", "+month+" "+date+" , "+year; //Format for American Standard.
		
		String europeanStd = day+" "+date+" "+month+" "+year; //Format for European Standard.
		
		/*
		 * Statements below were used to test for validity of codes and check for bugs.
		 * 
		System.out.println("Date : "+date);
		System.out.println("Day : "+day);
		System.out.println("Month : "+month);
		System.out.println("Year : "+year);
		*/
		
		System.out.println("American Standard : ");
		System.out.println(americanStd);
		
		System.out.println();
		
		System.out.println("European Standard : ");
		System.out.println(europeanStd);
	}

}
