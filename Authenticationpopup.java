package basic.programs.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {
//How u will handle authentication popup ?
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String un = "abc";
		String passwrd = "123";
		String url = "https://" + un + passwrd +"@the-internet.herokuapp.com/basic_auth";
		driver.get(url); //if it is a valid url , it accepts ., if invalid, wont sendKeys.
		//manually , enter un, password -> on submit form invalid , page gets reloaded automatically.
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://un:password@the-internet.herokuapp.com/basic_auth");

		//for this type of authentication we wont have any locators ,
		//it support only copy paste 
		//Username , password , Signin and cancel button 
		
		
	}

}
