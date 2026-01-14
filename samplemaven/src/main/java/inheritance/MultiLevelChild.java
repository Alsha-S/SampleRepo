package inheritance;

public class MultiLevelChild extends MultiLevelParent {
public void show() {
	System.out.println("Multi Level Child");
}
	public static void main(String[] args) {
		MultiLevelChild obj=new MultiLevelChild();
		obj.display();
		obj.print();
		obj.show();
	}

}
