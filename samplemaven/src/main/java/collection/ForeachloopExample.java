package collection;

import java.util.HashSet;
import java.util.Set;

public class ForeachloopExample {

	public static void main(String[] args) {
		Set<String>a=new HashSet<String>();
		a.add("Car");
		a.add("Auto");
		a.add("Scooty");
		a.add("Lorry");
		
		int s[][]= {{1,2,3},{4,5,6}};
		for(int i[]:s) {
			for(int j:i) {
				System.out.print(j+" ");
			}
		System.out.println();
		}

		for(String elements:a)
		{
			System.out.print(elements+" ");
		}
	}

}
