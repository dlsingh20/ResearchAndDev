package TestNgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass 
{
	@Test(priority=1, groups = { "Smoke", "Regression" })
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\DD1\\Software\\JarsAndAPIs\\GeckoDriver\\geckodriver32b1.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		//driver.findElement(By.cssSelector("input.gsfi")).sendKeys("CSS Selector");
		driver.findElement(By.cssSelector("input[id='lst-ib']")).sendKeys("CSS Selector");
		driver.findElement(By.cssSelector("input[name='btnK']")).click();;
	}
	
	//@Test(priority=2, groups = { "Smoke", "R1" })
	public void test2()
	{
		System.out.println("Test2");
	}
}
