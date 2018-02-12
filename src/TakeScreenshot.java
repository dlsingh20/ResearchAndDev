import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshot 
{
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		takeScreenshot(driver, "iffco");

	}
	public static void takeScreenshot(WebDriver driver, String fileName) throws IOException
	{
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file	, new File("C:\\Users\\din\\Desktop\\" +fileName+ ".png"));
	}
	

}
