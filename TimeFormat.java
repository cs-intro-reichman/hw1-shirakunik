// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// write a time in "hh:mm" format: 
	     String time = (args [0]);

		// take the hour and minute from the time: 
		int hour = Integer.parseInt (time.substring (0,2));
		int minute = Integer.parseInt (time.substring (3,5));

        // the minutes: 
        String mm;
		if (minute < 10) { 
			mm = "0" + minute;
		} else {
			mm = "" + minute;
		}

		 if (hour == 24) {
            hour = 0;
        }
 
        // the houres: 

		if (hour == 0) {
         System.out.println (0 + ":" + mm + " AM");		
		}
		 else if (hour < 12) {
			 System.out.println (hour + ":" + mm + " AM");
		 }
	     else if (hour == 12) {
				System.out.println (hour + ":" + mm + " PM");
		 }	
		  else if (hour > 12) {
				System.out.println ((hour - 12) + ":" + mm + " PM");
	        }
		}
	}

// great! good idea to separate the logic between minutes and hours.
// I would have given the string 'mm' a better name, maybe 'minutes'
// checking if hour == 0 is a great edge case notice also not really needed, since hour < 12 also includes 0 :) 

