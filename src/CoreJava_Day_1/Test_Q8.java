package CoreJava_Day_1;

import java.util.Scanner;

public class Test_Q8 {

	static boolean find(int[] arr,int num) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	static void show(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] bingo= {1,5,6,23,43};
		int n=0;
		String[] time= {"first","second","third",
				"forth","fifth","sixth","seventh",
				"eighth","ninth","tenth"};
		int count=0;
		while(find(bingo, n) == false) {
			System.out.println("enter "+time[count]+" number 1-40: ");
			n=sc.nextInt();
			if(find(bingo, n)) {
				System.out.println("It is bingo!");
				show(bingo);
				break;
			}
			count++;
		}
	}

}
