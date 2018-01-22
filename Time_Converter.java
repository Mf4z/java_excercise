package chapter3;

import java.util.Scanner;

public class Time_Converter {

	public static void main(String[] args) {

		final int  SECS_IN_MIN = 60;
		
		final int MINS_IN_HR = 60;
		
		final int  SECS_IN_HR = SECS_IN_MIN * MINS_IN_HR;
		
		int hour,min,sec,entered_secs;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the time in seconds : ");
		entered_secs = in.nextInt();
		
		hour = entered_secs/SECS_IN_HR ;
		
		min = (entered_secs % SECS_IN_HR)/ SECS_IN_MIN;
		
		sec = (entered_secs % SECS_IN_HR)% SECS_IN_MIN;
		

		System.out.println("The time is -  "+hour+" hour(s), "+min+" minute(s), "+sec+" second(s)");

	}

}
