package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@id='BirthMonth']/div")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//div[@id=':5']/div")).click();
		driver.findElement(By.id("BirthDay")).sendKeys("15");
		driver.findElement(By.id("BirthYear")).sendKeys("1990");
	}

}
