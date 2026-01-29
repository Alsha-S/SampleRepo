package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
List a=new ArrayList();
a.add(1);
a.add("Apple");
a.add(2.3f);
a.add('a');
System.out.println(a);
System.out.println(a.get(3));
a.set(2, "Pink");
System.out.println(a);
System.out.println(a.indexOf(1));
a.add("Pink");
System.out.println(a);
System.out.println(a.lastIndexOf("Pink"));
a.remove(2);
System.out.println(a);
System.out.println(a.contains(1));
System.out.println(a.isEmpty());
System.out.println(a.size());

	}

}
