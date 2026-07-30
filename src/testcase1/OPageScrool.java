package testcase1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPageScrool {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome,driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//scrit to scrool a page for  specified number of pixels,this feature is not available in java,but available in javascript.we use javascript Excutore to call this methods
		driver.get("https://ebay.com");
		  // also visibility upto elements
		
		

	}

}
