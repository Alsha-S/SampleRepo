package polymorphism;

public class Child extends Parent{
public void display(int a,int b) {
	super.display(125,15);
	int c=a-b;
	System.out.println(c);
}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.display(125, 15);

	}

}
