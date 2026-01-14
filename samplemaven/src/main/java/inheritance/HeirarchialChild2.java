package inheritance;

public class HeirarchialChild2 extends HeirarchialParent{
public void show() {
	System.out.println("Heirarchial Child 2");
}
	public static void main(String[] args) {
		HeirarchialChild2 obj=new HeirarchialChild2();
		obj.show();
		obj.print();

	}

}
