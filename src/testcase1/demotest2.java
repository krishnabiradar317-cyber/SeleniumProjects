package testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class demotest2 {

	public static  void main(String[] args) {
		System.setProperty("webdriver.edge.driver","edgedriver.com");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://edge.com");
		driver.findElement(By.linkText("signin")).click();
		String pgtitle = driver.getTitle();
		System.out.println(pgtitle);

	}

}
