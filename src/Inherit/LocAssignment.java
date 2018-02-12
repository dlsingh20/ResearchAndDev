package Inherit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		gmail();
	}
	
	public static void gmail() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
	    Thread.sleep(5000);
		
		
	 // WebElement input = driver.findElement(By.id("lst-ib"));
	 // input.sendKeys("gmail");
	     
	  WebElement btn = driver.findElement(By.xpath("//div[@class='gmail-nav__nav-links-wrap']/a[3]"));
	  btn.click();
	  Thread.sleep(5000);
	   
	//\\  WebElement firsttext = driver.findElement(By.xpath("//input[@id='FirstName']"));
      // firsttext.sendKeys("Amita");
      
	   WebElement firsttext = driver.findElement(By.id("FirstName"));
       firsttext.sendKeys("Amita");
	   
	   WebElement secondtext = driver.findElement(By.id("LastName"));
	   secondtext.sendKeys("Sharma");
	   
	   WebElement gma = driver.findElement(By.id("GmailAddress"));
	    gma.sendKeys("sharmaamita87@gmail.com");
	   
	   
	   WebElement pass = driver.findElement(By.id("Passwd"));
	   pass.sendKeys("abcd12345");
	   WebElement passaga = driver.findElement(By.id("PasswdAgain"));
	   passaga.sendKeys("abcd12345");
	   
	   WebElement phone = driver.findElement(By.id("RecoveryPhoneNumber"));
	   phone.sendKeys("9876543213");
	   
	   WebElement recov = driver.findElement(By.id("RecoveryEmailAddress"));
	   recov.sendKeys("sharma.amita879@gmail.com");
	   
	   WebElement subbtn = driver.findElement(By.id("submitbutton"));
	   subbtn.click();
	   
	   
	   
	  
	   
	   //WebElement link = driver.findElement(By.xpath("//div[@class='srg']//div[1]//div[@class='rc']/h3/a"));
	  // link.click();
		
		
		
	}


}
