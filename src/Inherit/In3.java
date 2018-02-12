package Inherit;

public class In3 extends In2 {
	public void test2()
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		In3 i3 = new In3();
		i3.test2();

	}

}
