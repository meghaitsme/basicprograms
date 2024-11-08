package basic.programs.java;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* getWindowHandle() -get the ID of current window .
getWindowHandles() :- returns the ID of multiple browser windows  
driver focus on only 1 window at a time. u opened 2 window , currently driver is in 1st window ,
so, to switch to 2nd window , use switch command , to return back use switch command 
 */

public class WindowTabhandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Megha K\\eclipse-workspace\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//1. Window/Windows 		
		
		
		
		//1 url 
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");

		//2nd url in same page -opens new small window with url 
		String parentwindowhandle = driver.getWindowHandle();
		driver.findElement(By.cssSelector("button.whButtons[id=\"newWindowBtn\"]")).click();
		System.out.println(parentwindowhandle); 
		//66C2392BD756D3D865EF972688877988
		
//	driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("hello megha");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//3.  open new tab  :- from this link to https://www.hyrtutorials.com/p/window-handles-practice.html
		driver.findElement(By.cssSelector("button.whButtons[id=\"newTabBtn\"]")).click();
		System.out.println("tab" +driver.getWindowHandle()); 
		// o/p :-  tabF9F77926FFCEFFD9EC3B26822F89E929https://www.hyrtutorials.com/p/alertsdemo.html


		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		//how to handle multiple windows at a time 
		driver.findElement(By.cssSelector("button.whButtons[id=\"newWindowsBtn\"]")).click();
		System.out.println("windows" + driver.getWindowHandles()); //it open 3or 5 windows opened at a time.
		//windows[920FC5FF1315FB566AB950C60654CB42, B48A43CAD448F50FC0EF96605F8F1E87, 91B4C9E3422C126CF3AEFD16E49DD211]
		Thread.sleep(2000);
		driver.quit();


	}

}
