package Day_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private ArrayList<String> names = new ArrayList();
	Scanner sc=new Scanner(System.in);
	public void setNames() {
		System.out.println("enter name");
		String n=sc.next();
		names.add(n);
		System.out.println("inserted");
	}
	public void searchName(String name) {
		if(names.contains(name)) {
			System.out.println("we have "+name);
		} else {
			System.out.println("we dont have "+name);
		}
	}
	public void searchName(int index) {
		if(names.get(index) != null) {
			System.out.println(names.get(index));
		}
	}
	public void printName() {
		System.out.println("list: " +names);
	}
	public void removeName(String stuName) {
		if(names.contains(stuName)) {
			names.remove(stuName);
			System.out.println("deleted");
		}else {
			System.out.println("we dont have student");
		}
	}
	
}
