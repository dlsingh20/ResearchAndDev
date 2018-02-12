public class Super2 extends Super1
{
	Super2()
	{
		System.out.println("Child Const");
	}
	int i=20;

	public void display()
	{
		System.out.println("Super2 Class Display");
	}
	
	public void printNum()
	{
		
		System.out.println("Super1 Class i: "+super.i);
		System.out.println("Super2 Class i: "+i);
		super.display();
		display();
	}
	
	
	public static void main(String[] args) {
		Super2 obj = new Super2();
	//	obj.display();
		//obj.printNum();
				
	}
}