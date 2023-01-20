package CoreJava_Day_1;

import java.util.Scanner;

public class Test_Q1{
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Q1 test_Q1 = new Test_Q1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		test_Q1.setN(sc.nextInt());
		test_Q1.printResult();
	}

}
