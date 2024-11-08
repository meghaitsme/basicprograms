package basic.programs.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathARAxes {

	public static void main(String[] args) {

		//eg :- First Name :- Text field  of that element (Ancestor, parent, following,preceding(checkbox),child, desendant(chil of child )
		//First Name -> current node , Text field :- Target node 


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.google.co.in/");		
			//FirstName 	
			Actions point = new Actions(driver);
			Thread.sleep(2000);
			WebElement fn = driver.findElement(By.xpath("// textarea[@class='gLFyf']/parent::div"));
			point.sendKeys(fn,"my first name is Gayatri").perform();

		}catch(Exception e) {
			e.printStackTrace();
		}














	}

}
