package basic.programs.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxBasic {
	//    Test cases - > need to perform -> Auto fill , copy -paste , error messages 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//it waits
		WebElement fn = driver.findElement(By.cssSelector("input.bcTextBox"));
		fn.sendKeys("Megha"); //1. Enter valid data 
		
		
		//implict wait  wont wait after finding element, it can wait before findelement
		
		//2. Clear the text box
	//	fn.clear(); //it wont wait while performing operation.
		
		//3. Validate the text input with Expected result 
		String Eresult = "Megha K ";
		String Aresult = "Megha";
		if(Eresult == Aresult) {
			System.out.println("TC Pass");
		} else {
			System.out.println("TC Fail");
		}
		
		//4. check placeholder text after text is clear 
		//fn.clear();
		
		String Eplaceholder="Enter First Name" ; // inspect element attribute 
		if(Eplaceholder == Eplaceholder) { // if placeholder is same , sendkeys 
			fn.clear();
			fn.sendKeys("My first name");
			System.out.println("Actual PH and E PH are same");
		} else {
			System.out.println("not same ");
		}
		
		//5. enter special characters 
		fn.sendKeys("!@#@%@&@*#(#^#)+(@{}]]]]");
		Thread.sleep(2000);
		

		
		//6. maximum characters 
	//	fn.clear();
		String longText = "A".repeat(10); // Assuming max length is 255
		fn.sendKeys(longText);
		fn.sendKeys("Some input" + Keys.ENTER);
		//Auto fill , copy -paste , error messages 
		//driver.close();
		
		
		
	}

}
