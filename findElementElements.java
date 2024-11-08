package basic.programs.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementElements {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		/* cntrl + shift + / 
		 * driver.findElement(By.cssSelector("input#yes")).click(); Thread.sleep(2000);
		 * driver.findElement(By.cssSelector("input#no")).click();
		 */
		
		//radio button and its name 
		List<WebElement> list = driver.findElements(By.name("name"));
		System.out.println("number of radio buttons " +list.size()); // 2
		for(int i=0; i < list.size() ; i++) {
			System.out.println("Radio button text : " + list.get(i).getAttribute("value"));
		}
		/*number of radio buttons 2
Radio button text : Yes
Radio button text : No
		  */
		driver.get("https://demo.guru99.com/test/newtours/login.php");

		
	}

}
