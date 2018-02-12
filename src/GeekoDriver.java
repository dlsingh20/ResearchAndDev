import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GeekoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ff();
	}
	
	public static void ff()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\DD1\\Software\\JarsAndAPIs\\GeckoDriver\\geckodriver32b1.exe");
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    //capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}
