package basic.programs.java;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTC1 {
	//Logic  ----> ******** Working 
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {	

			//Steps : 1. Navigate to fb URL  
			driver.get("https://www.facebook.com/login.php/");

			//2. enter invalid email 
			WebElement email = driver.findElement(By.cssSelector("input[id='email"));
			Scanner inputE = new Scanner(System.in);
			System.out.println( "Enter email"  );
			email.sendKeys(inputE.next()); //  abc@gmail.com -> it prints the input in browser as well 

			//3. enter invalid pass 
			WebElement pass = driver.findElement(By.cssSelector("input[id='pass"));
			Scanner inputP = new Scanner(System.in);
			System.out.println("Enter Password" );
			pass.sendKeys(inputP.next());  //bavgcsds -> it prints the input in browser as well

			//4. click on login button 
			pass.submit(); // error message displayed as :-
				//The password that you've entered is incorrect. 
				//	Forgotten password?	
			driver.close();
		}
		finally
		{
			Thread.sleep(4000);
			//	driver.close();
		}

	}}
