package TestNgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\DD1\\Software\\JarsAndAPIs\\GeckoDriver\\geckodriver32b1.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("download java");
		
		driver.findElement(By.name("btnK")).click();
		

	}

}
