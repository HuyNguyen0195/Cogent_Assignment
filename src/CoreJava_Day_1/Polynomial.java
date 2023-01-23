package CoreJava_Day_1;

public class Polynomial {
	Term term[] = new Term[5];
	public void setTerm(int co, int ex) {
		
	}
	public Polynomial() {
		super();
		for(int i=0; i<term.length;i++) {
			term[i].setCoefficient(0);
			term[i].setExponent(0);
		}
	}
	
}
