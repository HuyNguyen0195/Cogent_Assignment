package Day_7;

public class Main_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO std=new StudentDAO();
		std.setNames();
		std.printName();
		std.searchName("huy");
		std.searchName(0);
		std.removeName("huy");
		std.printName();
	}

}
