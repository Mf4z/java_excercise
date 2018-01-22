package chapter3;

import java.util.Scanner;

public class Celsius_Fahrenheit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter temperature in Celsius : ");
		
		double cel  = scanner.nextDouble();
		double fah = (cel * 9/5.0)+32;
		
		System.out.println(cel+" Celsius = "+fah+" Fahrenheit");
		

	}

}
