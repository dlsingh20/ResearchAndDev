import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TakeScreenSho {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		 //File src = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));
	}

}
