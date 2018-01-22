package chapter2;

public class Time {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int SECS_MINS = 60;
		final int MINS_HRS = 60;
		final int HRS_DAY = 24;
		
		int hour,minute,second;
		
		int secsNhr = SECS_MINS * MINS_HRS;
		
		hour = 22;
		minute = 24;
	    second = 16;
	    
		 int secSinceMid = (hour * secsNhr) + (SECS_MINS * minute ) + second;
		 
		 int secsRem = (HRS_DAY * secsNhr) - secSinceMid;
		 
		 double percentOfDayLeft = hour * 100.0/HRS_DAY;
		
	System.out.println("Number of Seconds since midnight :" +secSinceMid );
	
	System.out.println("Number of Seconds remaining in the day :"+secsRem);
	
	System.out.println("Percentage od Day passed : " +percentOfDayLeft);
	
	int curHr = 23;
	int curMin = 50;
	int curSec = 51;
	
	int elapsedHr = curHr - hour;
	int elapsedMin = curMin - minute;
	int elapsedSec = curSec - second;
	
	System.out.println("Elapsed time since codeing started : "+elapsedHr+":"+elapsedMin+":"+elapsedSec);
	
		
		
	}

}
