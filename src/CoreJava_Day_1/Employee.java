package CoreJava_Day_1;

public class Employee {
	private int employeeNumber;
	private String employeeName;
	private Date joiningDate;
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Employee(int employeeNumber, String employeeName, Date joiningDate) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.joiningDate = joiningDate;
	}
	public void show() {
		System.out.printf("%d - %s -",employeeNumber,employeeName);joiningDate.show();
	}
	
}
