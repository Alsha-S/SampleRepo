package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Set<String>a=new HashSet<String>();
		a.add("Car");
		a.add("Auto");
		a.add("Scooty");
		a.add("Lorry");
		System.out.println(a);
Iterator obj=a.iterator();
while(obj.hasNext())
{
	System.out.println(obj.next());
}
obj.remove();
System.out.println(a);
	}

}
