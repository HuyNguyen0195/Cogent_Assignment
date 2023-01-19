package Question_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User huy = new User();
		huy.setName("Huy Nguyen");
		huy.printName();
		Task[] task = new Task[10];
		Task t1 = new Task();
		t1.setTaskId(1);t1.setTaskName("do home work");
		task[0]=t1;
		Task t2 = new Task();
		t2.setTaskId(2);t2.setTaskName("complete Bootcamp");
		task[1]=t2;
		Task t3 = new Task();
		t3.setTaskId(3);t3.setTaskName("get a job");
		task[2]=t3;
		TodoManager.printTaskList(task);
		TodoManager.selection(task);
	}

}
