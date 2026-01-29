package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		List<String>list1=new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Banana");

		System.out.println(list1);
		System.out.println(list1.get(2));
		list1.set(1,"Red");
System.out.println(list1);
System.out.println(list1.indexOf("Banana"));
list1.add("Red");
System.out.println(list1);
System.out.println(list1.lastIndexOf("Red"));
list1.remove(2);
System.out.println(list1);
System.out.println(list1.contains("Pink"));
System.out.println(list1.isEmpty());
System.out.println(list1.size());
	}

}
