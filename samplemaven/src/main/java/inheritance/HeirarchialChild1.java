package inheritance;

public class HeirarchialChild1 extends HeirarchialParent{
public void display() {
	System.out.println("Heirarchial Child 1");
}
	public static void main(String[] args) {
		HeirarchialChild1 obj= new HeirarchialChild1();
		obj.print();
		obj.display();

	}

}
