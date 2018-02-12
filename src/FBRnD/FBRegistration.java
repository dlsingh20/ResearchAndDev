package FBRnD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBRegistration {

	public static WebDriver driver;
	public static void main(String[] args) {
		registerFB();
	}
	
	public static void registerFB()
	{
		try {
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("u_0_l")).sendKeys("Raj");
			
			//System.out.println(driver.getPageSource());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
