package testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testcase3 {

	public static void main(String[] args) {
		System.setProperty("Webdrive.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		String pgtitle = driver.getTitle().toLowerCase();
		if(pgtitle.contains("signup"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.print(false);
		}
		

	}

}
