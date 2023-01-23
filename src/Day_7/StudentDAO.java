package Day_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.event.ListDataEvent;

public class StudentDAO {
	ArrayList<Student> stArray = new ArrayList<Student>();
	Scanner sc=new Scanner(System.in);
	
	public void setNames() {
		System.out.println("enter name");
		String name=sc.next();
		Student st=new Student(1, name, 10);
		stArray.add(st);
		System.out.println("inserted");
	}
	public void searchName(String name) {
		for(Student s : stArray) {
			if(s.getStudentName().compareTo(name) == 0) {
				System.out.println("founded string"+name );
				break;
			}
		}
	}
	public void searchName(int index) {
		if(stArray.get(index) != null) {
			System.out.println("index found: "+stArray.get(index).getStudentName());
		}else {
			System.out.println("index not found");
		}
	}         
	public void printName() {
		for(Student s : stArray) {
			System.out.println(s.getStudentID()+" "+s.getStudentName()+" "+s.getStudentAge() );
		}
	}
	public void removeName(String stuName) {
		Iterator<Student> itRemove=stArray.iterator();
		while(itRemove.hasNext()) {
			if(itRemove.next().getStudentName().compareTo(stuName)==0) {
				itRemove.remove();
				System.out.println("deleted");
				break;
			}
		}
	}
	
}
