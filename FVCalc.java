// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

	int currentValue = Integer.parseInt(args [0]);
	double ratePercent = Double.parseDouble(args[1]);
	int years = Integer.parseInt(args[2]);

	double rate = ratePercent / 100.0;
	double fvDouble = currentValue * Math.pow(1.0 + rate, years);

	int fv = (int) fvDouble;

	System.out.printf("After %d years, $%d saved at %.1f%% will yield $%d%n",
            years, currentValue, ratePercent, fv);
    }
}
