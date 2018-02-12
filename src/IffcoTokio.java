import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IffcoTokio 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		test();
		IndividualHealthProtector();

	}
	
	public static void test() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("https://www.online.iffcotokio.co.in/itgiwebportal/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		WebElement healthIns = driver.findElement(By.xpath("//div[@class='navigation desktop']/ul/li[2]/a"));
		WebElement IndividualHealthPro = driver.findElement(By.xpath("//div[@class='navigation desktop']/ul/li[2]/div/ul/li/a")); 
		Actions act = new Actions(driver);
		act.moveToElement(healthIns).perform();
		
		IndividualHealthPro.click();
			
	}
	
	public static void IndividualHealthProtector() throws Exception
	{
		try {
			//Thread.sleep(2000);
			//WebElement InspectionDate = driver.findElement(By.xpath("//div[@id='table-form']//input[@name='policyDate']"));
			WebElement InspectionDate = driver.findElement(By.name("policyDate"));
			InspectionDate.click();
		} catch (Exception e) {
			throw e;
		}
		
		//Select current Date
		try {
			int currDate = 22;
			String cDate = Integer.toString(currDate);
									
			List<WebElement> CalInspectionDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
			int size = CalInspectionDate.size();
			for(int i=0; i<size; i++)
			{
				String date = CalInspectionDate.get(i).getText();
				if(cDate.equals(date))
				{
					//System.out.println(date);
					CalInspectionDate.get(i).click();
				}
			}						
		} catch (Exception e) {
			throw e;
		}
		//Critical Illness Cover and Room Rent Cover
		try {
			WebElement CriticalIllnessCover = driver.findElement(By.xpath("//input[@name='criticalIllnessCovered']"));
			CriticalIllnessCover.click();
			WebElement RoomRentWaiver = driver.findElement(By.xpath("//input[@name='rentWaiver']"));
			RoomRentWaiver.click();
		} catch (Exception e) {
			throw e;
		}
		
		//First Name and Last Name
		try {
			WebElement  fName = driver.findElement(By.id("firstName"));
			fName.sendKeys("Deenu");
			
			WebElement  lName = driver.findElement(By.id("lastName"));
			lName.sendKeys("Singh");
		} catch (Exception e) {
			throw e;
		}
		
		//Select Date of Birth
		try {
			WebElement dob = driver.findElement(By.id("dateOfBirth"));
			dob.click();
			
			WebElement selMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select selM = new Select(selMonth);
			selM.selectByIndex(0);
			
			WebElement selYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select selY = new Select(selYear);
			selY.selectByVisibleText("1990");
			
			String cDate = "15";
			List<WebElement> CalInspectionDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
			int size = CalInspectionDate.size();
			for(int i=0; i<size; i++)
			{
				String date = CalInspectionDate.get(i).getText();
				if(cDate.equals(date))
				{
					//System.out.println(date);
					CalInspectionDate.get(i).click();
				}
			}			
		} catch (Exception e) {
			throw e;
		}
		
		//Select Sum Assured
		try {
			WebElement sumAssured = driver.findElement(By.id("sumInsured"));
			Select selSumAss = new Select(sumAssured);
			selSumAss.selectByIndex(3);
			
		} catch (Exception e) {
			throw e;
		}
		
		//Select Relationship
		try {
			WebElement relationship = driver.findElement(By.name("relationship"));
			Select selRelationship = new Select(relationship);
			selRelationship.selectByIndex(1);
		} catch (Exception e) {
			throw e;
		}
		
		//select Gender
		try {
			WebElement gender = driver.findElement(By.name("gender"));
			Select selGender= new Select(gender);
			selGender.selectByIndex(1);
		} catch (Exception e) {
			throw e;
		}
		//Enter Height
		try {
			WebElement height = driver.findElement(By.name("height"));
			height.sendKeys("164");
		} catch (Exception e) {
			throw e;
		}
		try {
			WebElement weight = driver.findElement(By.name("weight"));
			weight.sendKeys("66");
		} catch (Exception e) {
			throw e;
		}
		
		//Select Occupation
		try {
			WebElement occupa = driver.findElement(By.name("occupation"));
			Select seloccup= new Select(occupa);
			seloccup.selectByIndex(2);
		} catch (Exception e) {
			throw e;
		}
		
		try {
			WebElement mobile = driver.findElement(By.name("mobile"));
			mobile.sendKeys("97169656520");
		} catch (Exception e) {
			throw e;
		}
		
		try {
			WebElement email = driver.findElement(By.name("emailId"));
			email.sendKeys("test@gmail.com");
		} catch (Exception e) {
			throw e;
		}
		
		try {
			WebElement EmergencyConName = driver.findElement(By.name("emergencyContact"));
			EmergencyConName.sendKeys("Deepak");
		} catch (Exception e) {
			throw e;
		}
		
		try {
			WebElement EmergencyConMobile = driver.findElement(By.name("emergencyContactMobile"));
			EmergencyConMobile.sendKeys("97169343410");
		} catch (Exception e) {
			throw e;
		}
		
		try {
			WebElement CalculatePremium = driver.findElement(By.xpath("//span[@id='button']"));
			CalculatePremium.click();
		} catch (Exception e) {
			throw e;
		}
		
		Thread.sleep(4000);
		
		//TakeScreenshot
		try {
			TakeScreenshot.takeScreenshot(driver, "iffcot");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}
