package CoreJavaAssignment;
import java.util.Scanner;

class Q1{
	private int n;
	public int getN() {
		return n;
	}
	public void setN(int input) {
		this.n = input;
	}
	public void printResult() {
		for(int i = 0; i <= getN(); i++) {
			if(i%2 == 0 ) {
				System.out.println(i);
			}
		}
	}
}
class Q2{
	//lenght encapsulate
	private int lenght;
	
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	//breadth encapsulate
	private int breadth;
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	// constructor
	public Q2() {
		this.lenght = 0;
		this.breadth = 0;
	}
	public Q2(int lenght, int breadth) {
		this.lenght=lenght;
		this.breadth=breadth;
	}
	//method calculate and shows
	public void printResult() {
		System.out.println("Lenght :");
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 q1 = new Q1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		q1.setN(sc.nextInt());
		q1.printResult();
	}

}
