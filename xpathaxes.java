package basic.programs.java;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class xpathaxes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//xpath axes -> current node , after node , before node 
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		//<li> -> 'li' is parent for 'a'    following -> forward element 
		//   <a href="//money.rediff.com/index.html" class="blue"> Home </a>
		driver.findElement(By.xpath("//a[text()='Home']/parent::li")).click();// same element 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Home']/following::a")).click(); //MarketNews 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Market News']/following::a")).click(); //portfolio
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='My Portfolio']/following::a")).click();//My watchlist
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//a[text()='Sectors']/preceding::a")).getText();
		//back element-> takes to main link refiff.com link 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sectors']/ancestor::li")).getText();
		// self, parent, ancestor ---> same elemnt -> previous node 
		
		driver.findElement(By.xpath("//a[text()='Sectors']/ancestor::div")).getText();
		//a[text()='Sectors']/ancestor::div
		System.out.println("Hello");

		
		//a[text()='Home']/ancestor::ul
		
		
		
		
		
		
		
		
/* sample 
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class = 'nav-link dropdown-toggle']/preceding::a")).click();
		//locates ,currency dropdown 
		
		
		//<a href="https://demo.opencart.com/en-gb?route=common/home">  -> ancestor, tagname a
		//   <img src="https://demo.opencart.com/image/catalog/opencart-logo.png"
		//     title="Your Store" alt="Your Store" class="img-fluid">    </a>
		driver.findElement(By.xpath("//img[@title = 'Your Store']/ancestor::a")).click();
		//image du parent same element 
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='search']/self::input")).getText();
		
		Thread.sleep(2000);
		
		
		driver.get("https://demo.guru99.com/V4/");
		Thread.sleep(2000);
		
		//No need to write the attribute for the target node  
		// before password field -> set as preceding
		driver.findElement(By.xpath("//input[@name='password']/preceding::input")).sendKeys("Username");
		
		//after username field ,  following
		driver.findElement(By.xpath("//input[@name='uid']/following::input")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@name='btnLogin']/following::input")).click();
		// all data got cleared 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		// GET methods
//1. open the Url in browser 		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//2. getTitle()
		System.out.println(driver.getTitle()); // OrangeHRM

//3. getCurrentUrl()
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
//4. getPageSource()- returns source code of the page 
		System.out.println(driver.getPageSource()); // <html> <head> ....... </html></head>
		
		//driver.manage().window().maximize();
//5. getWindowHandle() -> returns the id of the single browser window 
		System.out.println(driver.getWindowHandle()); // id :- 1FBD62E2420DDAD3894D5D2526EBB3FC
		 // always it is unique , if u run for 2nd time its unique.19C267B63FCE8A329D3F837F935BC8B9
	
		
		// unable to find element -> throwing exception , as add thread.sleep 
		Thread.sleep(2000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // 2nd window :-opens another browser window 
		
		Set<String> noofids = driver.getWindowHandles();
		System.out.println(noofids); //it prints id of both opened windows 
		//[FF76871D5624D38AE5DF1688D4B32994, 9555B32916DBF4BABC0583F0BCF16A1D]
		
		//==============================================================================================
	//	driver.close(); // close the single window in the browser
		driver.quit(); // close the all windows in the browser 
		
				*/
	}

}
