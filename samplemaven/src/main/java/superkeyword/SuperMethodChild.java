package superkeyword;

public class SuperMethodChild extends SuperMethodParend{
	public void print(){
		System.out.println("Child");
		super.print();
	}
	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.print();
	}

}
