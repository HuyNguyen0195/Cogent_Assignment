package Day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentSortDemo_Q4 {
	public static void main(String[] args) {
		List<Student_Q4> students=new ArrayList<>();
		students.add(new Student_Q4(05, "huy"));
		students.add(new Student_Q4(03, "philip"));
		students.add(new Student_Q4(01, "henry"));
		students.add(new Student_Q4(04, "john"));
		students.add(new Student_Q4(02, "victor"));
		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
	}
}
