package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent{

	public static void main(String[] args) {
		SuperConstructorChild obj3=new SuperConstructorChild();
		
	}
public SuperConstructorChild() {
	super();
	System.out.println("Super Constructor Child");
}
}
