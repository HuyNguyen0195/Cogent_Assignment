package Day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main_Q5 {
	public static void main(String[] args) {
		String students[]= {"huy","philip","henry","robert","john"};
		Arrays.sort(students,new Student_Q5());
		for(String s:students) {
			System.out.println(s);
		}
	}
}
