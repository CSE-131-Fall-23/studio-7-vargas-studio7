package studio7;

public class Fraction {
	
	private double numerator;
	private double denominator;
	
	public Fraction(double instNumerator, double instDenominator) {
		this.numerator = instNumerator;
		this.denominator = instDenominator;
	}
	
	public String getString() {
		return (this.numerator + "/" + this.denominator);
	}
	
	public double getNumerator() {
		return this.numerator;
	}
	
	public double getDenominator() {
		return this.denominator;
	}
	
	public Fraction fractionReciprocal() {
		return new Fraction(this.denominator, this.numerator);
	}
	
	/*
	public Fraction fractionSimple() {
		return new Fraction(0,0);
	}*/
	
	public Fraction fractionSum(Fraction otherFraction) {
		if(this.denominator == otherFraction.getDenominator()) {
			return new Fraction((this.numerator + otherFraction.getNumerator()), this.denominator);
		} else {
			return new Fraction((this.numerator*otherFraction.getDenominator() + otherFraction.getNumerator()*this.denominator), (this.denominator*otherFraction.getDenominator()));
		}
	}
	
	public Fraction fractionProduct(Fraction otherFraction) {
		return new Fraction((this.numerator*otherFraction.getNumerator()), (this.denominator*otherFraction.getDenominator()));
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(4, 5);
		System.out.println((f1.fractionSum(new Fraction(2, 3)).getString()));
	}

}
