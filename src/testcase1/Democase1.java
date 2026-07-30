package testcase1;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class Democase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\temp\\edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.get("https://youtube.com");
	// 	driver.navigate().back();
//		driver.navigate().forward();
	//	driver.navigate().refresh();
		driver.findElement(By.linkText("signin")).click();
	    String pgtitle = driver.getTitle();
		System.out.println("pgtitle");
	//	driver.close();
	}

}
