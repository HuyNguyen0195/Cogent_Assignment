package Day_7;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Employee {
	private HashMap<String, String> empNames;
	Scanner sc=new Scanner(System.in);

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		empNames=new HashMap<>();
	}


	public void setName() {
		System.out.println("enter roll number");
		String key=sc.next();
		System.out.println("enter name");
		String value=sc.next();
		empNames.put(key, value);
	}
	
	
	public void printName() {
		if(empNames.isEmpty()) {
			System.out.println("empty");
		}else {
			Set<String> keySet=empNames.keySet();
			for(String key : keySet) {
				System.out.println("Key: "+ key +"| Value: "+empNames.get(key));
			}
		}
		
	}
	
	public void getName(String key) {
		if(empNames.get(key) == null) {
			System.out.println("cant find");
		}else {
			System.out.println("founded");
			System.out.println("Key: "+ key +"| Value: "+empNames.get(key));
		}
	}
	
	public void printNamesKeySet() {
		Set<String> keySet=empNames.keySet();
		for(String key : keySet) {
			System.out.println("Key: "+ key +"| Value: "+empNames.get(key));
		}
	}
	
	public void printSize() {
		System.err.println(empNames.size());
	}
	
	public void remove(String key) {
		if(empNames.get(key)==null) {
			System.out.println("not found");
		}else {
			empNames.remove(key);
			System.out.println("deleted");
		}
	}
	
	
}
