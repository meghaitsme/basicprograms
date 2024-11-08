package basic.programs.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextField { // different ways to sendkeys ->
	// sendkeys, javascriptexceutorsendkeys, action class , robot class 

	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\Megha K\\Downloads\\chromedriver-win64\\chromedriver-win64\\chrome.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		Actions A = new Actions(driver);
		WebElement FullN = driver.findElement(By.cssSelector("input[id='userName']"));
		A.sendKeys(FullN,"Megha K").perform();
		
		WebElement email = driver.findElement(By.cssSelector("input[id='userEmail']"));
		A.sendKeys(email, "abc@gmail.com").perform();
		
		WebElement currenetaddress = driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
		A.sendKeys(currenetaddress, "bengaluru").perform();
		
		WebElement permanantaddress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
		A.sendKeys(permanantaddress, "KGF").perform();
		
		permanantaddress.submit();
		
		Thread.sleep(2000);
		driver.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
