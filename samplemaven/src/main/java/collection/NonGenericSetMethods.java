package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
Set a=new HashSet();
a.add(1);
a.add('p');
a.add("Boss");
a.add(2.1f);
System.out.println(a);
Set b=new HashSet();
b.add(2);
b.add("Pen");
a.addAll(b);
System.out.println(a);
System.out.println(a.contains("Boss"));
System.out.println(a.containsAll(b));
System.out.println(a.isEmpty());
a.remove("Boss");
System.out.println(a);
a.removeAll(b);
System.out.println(a);
System.out.println(a.size());
a.clear();
System.out.println(a);


	}

}
