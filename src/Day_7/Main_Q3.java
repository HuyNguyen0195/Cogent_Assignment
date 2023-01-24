package Day_7;

import java.util.Iterator;
import java.util.TreeSet;

public class Main_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> products=new TreeSet<String>();
		products.add("apple");
		products.add("orange");
		products.add("watermelon");
		products.add("kiwi");
		products.add("apple");
		Iterator it = products.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(products.first());
		System.out.println(products.last());
		
		System.out.println(products.size());
		products.remove("orange");
		System.out.println(products.size());
	}

}
