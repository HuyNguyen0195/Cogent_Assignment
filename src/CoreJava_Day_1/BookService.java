package CoreJava_Day_1;
import java.util.Iterator;
import java.util.Scanner;
public class BookService {
	Book book[] ;
	public void createBook() {
		book=new Book[2];
		String name="Java Programming";
		String pr="Rs.350.50";
		Book b=new Book();b.setBook_title(name);b.setBook_price(pr);
		book[0]=b;
		name="let Us C";
		pr="Rs.200.50";
		Book b2=new Book() ;b2.setBook_title(name);b2.setBook_price(pr);
		book[1]=b2;
	}
	public void showBook() {
		// %-20s to align content
		System.out.printf("%-20s %-20s%n","Book title","book name");
		for(int i =0; i<book.length;i++) {
			System.out.printf("%-20s %-20s%n",book[i].getBook_title(),book[i].getBook_price());
			
		}
	}
}
