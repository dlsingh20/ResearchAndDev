package TestNgTest;

import org.testng.Assert;
import org.testng.annotations.Test;



public class FindTestName 
{
	@Test
	public void test()
	{
		try {
			System.out.println("Test");
			//String st = new Object(){}.getClass().getEnclosingMethod().getName();
			//System.out.println(st);
			System.out.println(FindTestName.class.getEnclosingMethod().getName());
				Assert.assertTrue(true);
		} catch (Exception e) {
			throw e;
		}
		
	}

}
