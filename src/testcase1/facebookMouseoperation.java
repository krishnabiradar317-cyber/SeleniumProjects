package testcase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookMouseoperation {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome,driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("messager")).click();

	}

}
