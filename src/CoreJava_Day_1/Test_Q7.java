package CoreJava_Day_1;

import java.util.Scanner;

public class Test_Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number ");
		int f=sc.nextInt();
		System.out.println("enter second number ");
		int s=sc.nextInt();
		int count=0;
		int temp=0;
		System.out.print(f +" "+ s +" ");
		while (count<11) {
			System.out.print((f+s)+" ");
			temp=f;
			f=s;
			s=f+temp;
			count++;
		}
	}
}
