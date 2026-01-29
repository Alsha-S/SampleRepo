package interfaceexample;

public class InterfaceChild implements Interface1{

	public void show() {
		System.out.println("World");
	}
		public static void main(String[] args) {
		/*InterfaceChild obj=new InterfaceChild();
		obj.display();
		obj.print();
		obj.show();*/
			Interface1 obj=new InterfaceChild();
			obj.display();
			obj.print();
	}

	@Override
	public void print() {
		System.out.println("Hello");		
	}

	@Override
	public void display() {
		System.out.println("Dear");
		
	}

}
