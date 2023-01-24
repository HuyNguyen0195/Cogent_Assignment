package Day_7;

import java.util.Comparator;

public class Student_Q4 implements Comparable<Student_Q4> {
	private int rollNo;
	private String name;
	public Student_Q4(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student_Q4 o) {
		// TODO Auto-generated method stub
		if(this.rollNo < o.getRollNo()) {
			return -1;
		}else if (this.rollNo == o.getRollNo()) {
			return 0;
		} else {
			return 1;
		}
	}
	
}
