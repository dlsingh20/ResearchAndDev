import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class propertiesFile {

	public static void main(String[] args) throws IOException {
		//propertiesFile.readProFile("btn_Search");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement ele = driver.findElement(By.xpath(propertiesFile.readProFile("txtbx_Search")));
		ele.sendKeys("Download Selenium");
		
		WebElement btn = driver.findElement(By.xpath(propertiesFile.readProFile("btn_Search")));
		btn.click();
	}
	
	public static String readProFile(String name) throws IOException
	{
		//File file = new File("D:\\ResearchAndDev\\RandD\\webEle.properties");
		FileInputStream fis = new FileInputStream(new File("D:\\ResearchAndDev\\RandD\\webEle.properties"));
		Properties pro = new Properties();
		
		pro.load(fis);
		
		System.out.println(pro.getProperty(name));
		return pro.getProperty(name);
	}

}
