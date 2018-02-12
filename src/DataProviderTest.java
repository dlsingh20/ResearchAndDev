import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="getData")
	public void test(String user, String pass)
	{
		System.out.println(user);
		System.out.println(pass);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "User1";
		data[0][1] = "Pass1";
		
		data[1][0] = "User2";
		data[1][1] = "Pass2";
		
		data[2][0] = "User3";
		data[2][1] = "Pass3";
		
		
		return data;
	}
}
