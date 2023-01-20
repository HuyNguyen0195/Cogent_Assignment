package Question_1;
import java.util.Scanner;
public class TodoManager{ 
	// --3-- Please use arrays to store the task object
	//--1--Please use simple system.out.println to print the name
	 static void printName() {
		System.out.println("My Name is: Huy Nguyen");
	}
		//--2-- Please create a menu driven application to do all the task

	 static void menu() {
		System.out.println("*****Menu******");
		System.out.println("[1] Adding a new task");
		System.out.println("[2] Updating a new task");
		System.out.println("[3] Deleting a new Task");
		System.out.println("[4] Searching a new task");	
		System.out.println("[0] to exit ");
	}
	//-- selection for menu
	 static void selection(Task[] task) {
		 //-----menu
		while(true) {
			TodoManager.menu();
			System.out.println("Enter your selection");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			while(select > 4) {
				System.out.println("Enter new choice");
				select = sc.nextInt();
			}
			switch(select) {
			case 1: adding(task);
			break;
			case 2: updating(task);
			break;
			case 3: deleting(task);
			break;
			case 4: searching(task);
			break;
			//----exit when press 0
			case 0: System.out.println("Good Bye");System.exit(0);
			break;
			}
		}
		
		
	}
	
	//----------print task
	 static void printTask(Task task) {
		System.out.println("This is Task");
		System.out.println("--------------------------------------");
		System.out.print("TaskId :" + task.getTaskId() );
		System.out.println(" | TaskName :" + task.getTaskName() );
		System.out.println("--------------------------------------");
			
	}
	//----------print task list
	 static void printTaskList(Task[] task) {
		System.out.println("This is Task List");
		System.out.println("--------------------------------------");

		if(task[0] == null ) System.out.println("Task List is Empty");
		for(int i=0; i< task.length; i++) {
			if(task[i] != null) {
				System.out.print("TaskId :" + task[i].getTaskId() );
				System.out.println(" | TaskName :" + task[i].getTaskName() );
				System.out.println("--------------------------------------");
			}
			

		}
	}
	// ----------findTask in the list
	 static int findTask(Task[] task,int taskId) {
		for(int i=0; i < task.length; i++) {
			if(task[i].getTaskId() == taskId) {
				return i;
			}
		}
		return -1;
	}
	// ---adding
	 static void adding(Task[] task) {
		//-- user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter task name to Add : ");
		String data = sc.nextLine();
		
		Task t = new Task();
		//t.setTaskId(id);
		t.setTaskName(data);
		for(int i=0; i < task.length; i++) {
			if(task[i] == null) {
				t.setTaskId(i+1);
				task[i]= t;
				break;
			}
		}
		printTaskList(task);
		
	}
	//---updating
	 static void updating(Task[] task) {
		//-- user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to Update :");
		int idUpdate = sc.nextInt();
		
		System.out.println("Enter new Task Name");
		String newName = sc.nextLine();
		/*
		 * while (findTask(task,id) && id <= 0) {
		 * System.out.println("ID is not correct"); System.out.println("Enter id:"); }
		 */
		for(int i=0; i < task.length; i++) {
			if(task[i] != null && task[i].getTaskId() == idUpdate) {
				
				task[i].setTaskName(newName);
				break;
			}
		}
		printTaskList(task);
	}
	//---deleting
	 static void deleting(Task[] task) {
		//-- user input
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter id to Delete :");
		int id = sc1.nextInt();
		//System.out.println("Enter task name: ");
		//String data = sc.nextLine();
		/*
		 * while (findTask(task,id) && id <= 0) {
		 * System.out.println("ID is not correct"); System.out.println("Enter id:"); }
		 */
		for(int i=0; i < task.length; i++) {
			if(task[i] != null && task[i].getTaskId() == id) {
				task[i] = null;
				break;
			}
		}
		printTaskList(task);

	}
	 // ---------searching
	 static void searching(Task[] task) {
			//-- user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to Search :");
		int id = sc.nextInt();
		while(findTask(task,id) == -1) {
			System.out.println("Can not find id.");
			System.out.println("Enter Another Id:");
			id = sc.nextInt();
		}
		System.out.println("This is your seach: ");
		printTask(task[findTask(task,id)]);
			
	}
}