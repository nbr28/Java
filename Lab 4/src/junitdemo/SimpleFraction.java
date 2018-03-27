package junitdemo;

public class SimpleFraction {

	private int numerator, denominator;

	public SimpleFraction(int num, int den) {
		numerator = num;
		denominator = den;
	}

	public void simplify() {
		long gcd = gcd(denominator, numerator);
		denominator /= gcd;
		numerator /= gcd;

		/*
		if(denominator < 0) {
			denominator = -denominator;
			numerator = -numerator;
		}
		*/
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setDenominator(int i) {
		denominator = i;
	}

	public void setNumerator(int i) {
		numerator = i;
	}

	/* for tracing purpose */
	public static void main( String args []) {
	
		SimpleFraction negv = new SimpleFraction( -27, 6);
		negv.simplify();
		System.out.println( negv.getNumerator() + "," +
		                    negv.getDenominator() );
	}
}
