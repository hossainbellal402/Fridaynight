package fridaytry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fridayhomepratice {

	@Test
	public void openBrowser() {
		

		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\bella\\eclipse-workspace\\Fridaynight\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	  driver.get( "https:www.amazon.com/");
		
		
		
		
		
	}

}
