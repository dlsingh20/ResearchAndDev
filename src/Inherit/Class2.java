package Inherit;

public class Class2 extends Class1 {
	int i=15;

	public void test1()
	{
		System.out.println(i);
	}
	
	public void run()
	{
		test1();
		super.test1();
	}
	public static void main(String[] args) {
		Class2 c2 = new Class2();
		c2.run();
		Class1 c1 = new Class1();
		//c1.test1();
		
		
	}

}
