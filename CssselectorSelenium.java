package basic.programs.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CssselectorSelenium {
	//Cascading style sheet -> for designing the colors , size , alignment 
	// collection of multiple attributes 
	// dynamic ,
	public static void main(String[] args) 
	{
		try {  //  tagname#id, tagname.classnamevalue , tagname[@att=value], tagname.cn[@att=value]
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		driver.manage().window().maximize();
		
		
		Actions control = new Actions(driver);//to perform complex user interactions to simulate 
		WebElement fn = driver.findElement(By.cssSelector("input#firstName"));
		control.sendKeys(fn,"Megha megha").perform();
		
		WebElement ln = driver.findElement(By.cssSelector("input.name[id='lastName']"));
		control.sendKeys(ln,"K").perform();
		
		WebElement gen = driver.findElement(By.cssSelector("input.gender[placeholder='Gender']"));
		control.sendKeys(gen,"Female").perform();
		
		WebElement city = driver.findElement(By.cssSelector("input.city[placeholder='City']"));
		control.sendKeys(city,"Bengaluru").perform();
		
		WebElement country = driver.findElement(By.cssSelector("input[placeholder='Country']"));
		control.sendKeys(country,"India").perform();
		
		WebElement securityq = driver.findElement(By.cssSelector("input[placeholder='Enter your security question']"));
		control.sendKeys(securityq,"Your pet name ?").perform();
		
		WebElement security2 = driver.findElement(By.cssSelector("input[placeholder='Enter your security answer']"));
		control.sendKeys(security2,"birth place").perform();
		
		WebElement pd = driver.findElement(By.cssSelector("input[placeholder='Verify your personal details']"));
		control.sendKeys(pd,"phneno").perform();
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}


















		/*		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//chained xpath -> if no attributes found, then reffer to the previous node , img is target node 
		Boolean status = driver.findElement(By.xpath("//div [@class='_8ice']/img")).isDisplayed();
		System.out.println(status); // true 


		// 1. tagName#idvalue
	WebElement email =	driver.findElement(By.cssSelector("input#email")); 
	email.sendKeys("meghamegu");
	email.clear();  // clear the text 
		driver.findElement(By.cssSelector("input#pass")).sendKeys("megha!234");

		// 2. tagName.className
		driver.get("http://demo.guru99.com/test/facebook.html");
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("jjhjjw");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("inputtext");

		// email and password had same classname -> output for email :- jjhjjwinputtext, pass is blank
		//ensure , pass will be in encrypted (not visible .........)

		// 3. tag with attribute
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("hhsjdlwiwm");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("526372");

		//4. tag , className with attribute :- placeholder  in case of attribute 
		driver.get("http://demo.guru99.com/test/facebook.html");
		driver.findElement(By.cssSelector("input.inputtext[id='email']")).sendKeys("haggh");
		driver.findElement(By.cssSelector("input.inputtext[id= 'pass']")).sendKeys("hhsgabbn");

		driver.get("https://demo.opencart.com/");
		//field name :- Password:
//mouse hover Action 
	//driver.findElement(By.cssSelector("a.nav-link[contains(PC (0))])")).click();  */

	//	driver.get("https://demo.guru99.com/test/selenium-xpath.html");

		//anchor tag :- inner text  
		//driver.findElement(By.xpath("//a[text()= 'Selenium']")).click(); // 404 not found

		// chained xpath -> combination of ansolute and relative 
		//driver.findElement(By.xpath("//div[@class= 'logo']/a/img")).isDisplayed();

		// getValue 
	/*	String value = driver.findElement(By.xpath("//td[text() = 'UserID']")).getText();
		System.out.println(value);  // UserID

		// contains() , id = "message23" part shoudl be exist 
		Boolean exist = driver.findElement(By.xpath("//label[contains(@id,'messa')]")).isDisplayed();
		System.out.println(exist); //true 
















		/*  1. Performance ,
		 *  userfriendly , 
		 *  element identification 
		 */ 

	}

}
