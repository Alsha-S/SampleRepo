package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
Set<String>a=new HashSet<String>();
a.add("Car");
a.add("Auto");
a.add("Scooty");
a.add("Lorry");
System.out.println(a);

Set<String>b=new HashSet<String>();
b.add("Plane");
b.add("Cycle");
a.addAll(b);
System.out.println(a);
System.out.println(a.contains("Car"));
System.out.println(a.containsAll(b));
System.out.println(a.isEmpty());
a.remove("Lorry");
System.out.println(a);
a.removeAll(b);
System.out.println(a);
System.out.println(a.size());
a.clear();
System.out.println(a);

	}

}
