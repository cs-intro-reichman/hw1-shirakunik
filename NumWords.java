// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
    
	//write a number  	
	int number = Integer.parseInt(args [0]);

	// extract number - hundreds, tens, units 
    int hundreds = number / 100;
	int tens = number / 10 % 10;
	int units = number % 10;


	// print the number in words 
	System.out.println(hundreds + " hundreds," + " " + tens + " tens," + " and " + units + " ones.");
	

}
}
