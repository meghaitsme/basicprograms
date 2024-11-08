package basic.programs.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
		    public static void main(String[] args) {
		        // Set up WebDriver (make sure to specify the correct path to your WebDriver)
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the webpage with checkboxes
		        driver.get("URL_OF_THE_PAGE_WITH_CHECKBOXES");

		        // Replace this with the value you want to select
		        String checkboxOption = "Option1"; // Options: "Option1", "Option2", "Option3"

		        // Find the checkboxes
		        WebElement option1Checkbox = driver.findElement(By.id("option1"));
		        WebElement option2Checkbox = driver.findElement(By.id("option2"));
		        WebElement option3Checkbox = driver.findElement(By.id("option3"));

		        // Use switch statement to toggle checkboxes
		        switch (checkboxOption) {
		            case "Option1":
		                toggleCheckbox(option1Checkbox);
		                break;
		            case "Option2":
		                toggleCheckbox(option2Checkbox);
		                break;
		            case "Option3":
		                toggleCheckbox(option3Checkbox);
		                break;
		            default:
		                System.out.println("Invalid checkbox option");
		                break;
		        }

		        // Optionally, verify which checkboxes are selected
		        if (option1Checkbox.isSelected()) {
		            System.out.println("Option 1 is selected");
		        }
		        if (option2Checkbox.isSelected()) {
		            System.out.println("Option 2 is selected");
		        }
		        if (option3Checkbox.isSelected()) {
		            System.out.println("Option 3 is selected");
		        }

		        // Close the browser
		        driver.quit();
		    }

		    // Method to toggle checkbox
		    private static void toggleCheckbox(WebElement checkbox) {
		        if (!checkbox.isSelected()) {
		            checkbox.click(); // Click to select if not already selected
		        } else {
		            checkbox.click(); // Click to deselect if already selected
		        }

	}

}
