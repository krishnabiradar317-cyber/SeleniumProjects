package testcase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome,driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://ebay.com");
		
		// Script to mo0uve over the element
//		Actions act = new Actions(driver);
	//	act.moveToElement(driver.findElement(By.linkText("Electronics")));
		//act.build().perform();
		
		// script to right action on an element
		
//		Actions act = new Actions(driver);
	//		act.moveToElement(driver.findElement(By.linkText("Electronics")));
		//	act.contextClick();
			//act.build().perform();
		
//Script to drag and drop
		driver.get("https://jqueryui.com");
		driver.findElement(By.linkText("Droppable")).click();
		
		WebElement srcelement,trgelement;
		srcelement = driver.findElement(By.id("draggable"));
		trgelement = driver.findElement(By.id("droppable"));
		
		// here unable tyo perform an action bucz it contains one html action frame contains a inner html window called iframes,,operationn can be performed using by shifiting the target window
		// we use driver
		Actions act = new Actions(driver);
		act.dragAndDrop(srcelement, trgelement);
		act.build().perform();
		//sssss######
		
		
	}

}
