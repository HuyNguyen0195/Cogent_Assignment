package CoreJava_Day_1;

public class Term {
	int coefficient;
	int exponent;
	
	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	public int getExponent() {
		return exponent;
	}

	public void setExponent(int exponent) {
		this.exponent = exponent;
	}

	public Term(int coefficient, int exponent) {
		super();
		this.coefficient = coefficient;
		this.exponent = exponent;
	}
	
}
