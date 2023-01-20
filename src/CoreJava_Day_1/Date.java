package CoreJava_Day_1;

public class Date {
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date(int month, int day, int year) {
		super();
		if(day<0 ||day>31) {
			throw new IllegalArgumentException("day invalid");
		}else {
			this.day = day;
		}
		if(month<0 ||month>12) {
			throw new IllegalArgumentException("month invalid");
		}else {
			this.month = month;
		}
		if(year<1900 ||year>2023) {
			throw new IllegalArgumentException("year invalid");
		}else {
			this.year = year;
		}
	}
	public void show() {
		System.out.println(month+"-"+day+"-"+year);
	}
	
}
