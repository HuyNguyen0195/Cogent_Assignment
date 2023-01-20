package CoreJava_Day_1;

import java.util.Scanner;

public class Test_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter content:");
		String s=sc.nextLine();
		System.out.println("upercase: "+s.toUpperCase());
		System.out.println("palindrome check: ");
		String r=new StringBuilder(s).reverse().toString();
		if(s.equals(r)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

}
