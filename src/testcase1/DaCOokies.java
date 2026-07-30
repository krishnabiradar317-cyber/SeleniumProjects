package testcase1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DaCOokies {

	
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","chromedriver.exe");
		
	    WebDriver driver =	new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().window().maximize();
	//    driver.get("https://google.com");
	    driver.navigate().to("https://google.com");
	    driver.get("https://facebook.com");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    
	    driver.findElement(By.linkText("Sign in")).click();
	    String pgtitle = driver.getTitle();
	    System.out.println(pgtitle);

.close();
	     
	    

	}

}
