package basic.programs.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; //launched 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.driver.chrome","C:\\Users\\Megha K\\Downloads\\chromedriver-win64\\chromedriver-win64\\chrome.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//findElement -> return type is WebElement 
		WebElement enable = driver.findElement(By.name("search"));//name locator 
		enable.isEnabled();
		enable.sendKeys("Tablet");
		// className -> findElements
		List<WebElement> nooflinks = driver.findElements(By.className("list-inline-item"));
		System.out.println(nooflinks.size()); // total 7 
		
		for(int i=0; i <= nooflinks.size(); i++) {
			System.out.println(nooflinks.get(i).getAttribute("value"));
		}
		/* $ Currency              isDisplayed(), isEnabled(), click();
		  	123456789 
		 	My Account 
		  	Wish List (0)
		   Shopping Cart 
		   Checkout */
		
		// Tagname -> findElements
		List<WebElement> noooflinksinpage = driver.findElements(By.tagName("a"));
		System.out.println(noooflinksinpage.size()); // 76
		
		// LinkText 
		WebElement enable1 = driver.findElement(By.linkText("Desktops"));
		System.out.println(enable1.isEnabled()); // true 
		
		//partial link text 
		WebElement partiallinktext = driver.findElement(By.partialLinkText("Laptops & "));
		System.out.println(partiallinktext.isEnabled()); //true 
		
		driver.quit();
		
		
	}

}
