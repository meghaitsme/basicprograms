package basic.programs.java;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtondynamic {
static WebDriver driver;
//org.openqa.selenium.ElementClickInterceptedException: -> make use of Javascript executor 
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	//	driver.get("https://demoqa.com/automation-practice-form");
		// identify the common attribute :-  find elements 
		/*<input name="gender" type="radio" id="gender-radio-1" class="custom-control-input" value="Male">
		 *<input name="gender" type="radio" id="gender-radio-2" class="custom-control-input" value="Female">
		 *<input name="gender" type="radio" id="gender-radio-3" class="custom-control-input" value="Other"> 
		 * */

		  driver.get("https://demoqa.com/automation-practice-form");

		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        // Replace this with the value you want to select
	        String gender = "Male"; // Options: "Male", "Female", "Other"

	        // Find the radio buttons
	        WebElement maleRadioButton = driver.findElement(By.id("gender-radio-1"));
	        WebElement femaleRadioButton = driver.findElement(By.id("gender-radio-2"));
	        WebElement otherRadioButton = driver.findElement(By.id("gender-radio-3"));

	        switch (gender) {
	            case "Male":
	                if (!maleRadioButton.isSelected()) {
	                	js.executeScript("arguments[0].click();", maleRadioButton);
	    	            System.out.println("Selected: Male");
	                }
	                break;
	            case "Female":
	                if (!femaleRadioButton.isSelected()) {
	                	js.executeScript("arguments[0].click();", femaleRadioButton);
	    	            System.out.println("Selected: Female"); //executed 

	                }
	                break;
	            case "Other":
	                if (!otherRadioButton.isSelected()) {
	                	js.executeScript("arguments[0].click();", otherRadioButton);
	    	            System.out.println("Selected: Other");

	                }
	                break;
	            default:
	                System.out.println("Invalid gender option");
	                break;
	        }

	 /*       // Optionally, verify which radio button is selected
	        if (maleRadioButton.isSelected()) {
	            System.out.println("Selected: Male");
	        } else if (femaleRadioButton.isSelected()) {
	            System.out.println("Selected: Female");
	        } else if (otherRadioButton.isSelected()) {
	            System.out.println("Selected: Other");
	        } */
		
	}

}
