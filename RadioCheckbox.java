package basic.programs.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class RadioCheckbox { // Interview go with this 
	static  String option1 = "vfb-7-1"; // field memebers 
	static String option2 = "vfb-7-2";
	static String option3 = "vfb-7-3";

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");

		WebElement radio = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));

		System.out.println(radio.isSelected()); //true
		Thread.sleep(2000);
		
		for(int i=0; i < 6; i++) {
		if(option1 =="vfb-7-1") {  //compared with variable and valueof theelement
			radio.click();
			System.out.println("radio button1 is selected " + radio.isSelected() );
		} 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		if(option2 =="vfb-7-2") {
			radio2.click();
			System.out.println(" radio button selected"+ radio2.isSelected());
		} 
		Thread.sleep(2000);
		if(option3 =="vfb-7-3") {
			radio3.click();
			System.out.println("radio button selected"+ radio3.isSelected());
		} 
		if(option1 =="vfb-7-1") {
			radio.click();
			System.out.println("radio button1 is selected " + radio.isSelected() );
		} 
		
		System.out.println("Final:" + radio.isSelected()); //false
		System.out.println("Final:" + radio2.isSelected()); //false
		System.out.println("Final:" + radio3.isSelected()); // true 
		System.out.println("Final:" + radio.isSelected()); //false
		}
		
		driver.close();
		
	}
}
