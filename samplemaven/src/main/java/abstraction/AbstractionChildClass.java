package abstraction;

public class AbstractionChildClass extends AbstractionParent{
public void print() {
	System.out.println("Method");
}
	public static void main(String[] args) {
		AbstractionChildClass obj=new AbstractionChildClass();
		obj.display();
		obj.sum();
		obj.print();
//reference creation
		AbstractionParent obj1=new AbstractionChildClass();
		obj1.sum();
		obj1.display();
		
	}

	@Override
	public void sum() {
		int a=3;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}

}
