import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting 
{
	@Test
	@Parameters("browser")
	public void openBrowser(String p)
	{
		if(p.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\DD1\\Software\\JarsAndAPIs\\GeckoDriver\\geckodriver32b1.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.google.com");
			
		}else if(p.equalsIgnoreCase("ch")){
			System.setProperty("webdriver.chrome.driver", "F:\\DD1\\Software\\JarsAndAPIs\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
		}else {
			System.out.println("Wrong Parameter");
		}
	}
	//@Test
	public void test()
	{
		System.out.println("Test1");
	}

}
