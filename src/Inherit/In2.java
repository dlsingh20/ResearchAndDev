package Inherit;

public class In2 extends In1 {
	int b=20;
	public void test1()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		In2 i2 = new In2();
		i2.test1();

	}

}
