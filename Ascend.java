// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// write three integer random numbers that greater than 0 
		int a = Integer.parseInt(args [0]);
		int b = Integer.parseInt(args [1]);
		int c = Integer.parseInt(args [2]);

        // find the min and max value among a/b/c  
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
        
		// find the middle value among a/b/c
		int mid = (a + b + c) - (min + max);

		// print the three numbers in increasing order: 
		System.out.println( min + " " + mid + " " + max );
		
	}
}
