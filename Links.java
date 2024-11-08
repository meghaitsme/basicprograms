package basic.programs.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement link = driver.findElement(By.linkText("Click here to navigate to the home page"));
		System.out.println(link.isDisplayed()); //  TC 1 
		System.out.println(link.isEnabled()); // TC 2
		link.click(); //TC 3 
		System.out.println(link.getAttribute("href"));
		
		String url = driver.getCurrentUrl();
		String Eurl = "https://www.hyrtutorials.com/";
		if(url == Eurl) {
			System.out.println("URL is same");
		}
		else {
			System.out.println("URL is not same");
		}
		
		//https://hyrtutorials.blogspot.com/
		String title = driver.getTitle();
		String url1 = driver.getCurrentUrl();
		System.out.println(title);//Basic Controls - H Y R Tutorials
		System.out.println(url1);//https://www.hyrtutorials.com/p/basic-controls.html#google_vignette
		






	}

}
