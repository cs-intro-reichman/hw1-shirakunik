// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// write a time in "hh:mm" format: 
	     String time = (args [0]);

		// take the hour and minute from the time: 
		int hour = Integer.parseInt (time.substring (0,2));
		int minute = Integer.parseInt (time.substring (3,5));

         if (hour == 00) {
         System.out.println (hour + ":" + minute + " AM ");		
		}
		if (hour == 24) {
		System.out.println (00 + ":" + minute + " AM ");
		}
		else if (hour < 12) {
			 System.out.println (hour + ":" + minute + " AM ");
		 }
	     else if (hour == 12) {
				System.out.println (hour + ":" + minute + " PM ");
		 }	
		 else if (hour > 12) {
				System.out.println (hour - 12 + ":" + minute + " PM ");
	        }
		}
	}

		