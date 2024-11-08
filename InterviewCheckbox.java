package basic.programs.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewCheckbox {
	static String id1 = "englishchbx";
	static String id2 = "hindichbx";
	static String id3 = "chinesechbx";
	static String id4 = "spanishchbx";
	static String id5 = "latinchbx";
	static String id6 = "frenchchbx"; 

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha K\\eclipse-workspace\\com.project.projectname\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		WebElement English = driver.findElement(By.id("englishchbx"));
		WebElement Hindi = driver.findElement(By.id("hindichbx"));
		WebElement Chinese = driver.findElement(By.id("chinesechbx"));
		WebElement Spanish = driver.findElement(By.id("spanishchbx"));
		WebElement Latin = driver.findElement(By.id("latinchbx"));
		WebElement French = driver.findElement(By.id("frenchchbx"));

		for(int i= 0; i <9; i++) { // 9 means finally will be checked , 10 - uncheck
			if(id1 == "englishchbx" ) { // compared with variable & valueof element 
				English.click();
				System.out.println("English checkbox is selected" +English.isSelected());
			}

			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			if(id2 == "hindichbx" ) {
				Hindi.click();
				System.out.println("Hindi checkbox is selected" +Hindi.isSelected());
			}

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if(id3 == "chinesechbx") {
				Chinese.click();
				System.out.println("Chinese checkbox is selected " + Chinese.isSelected());
			}

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if(id4 == "spanishchbx") {
				Spanish.click();
				System.out.println("Spanish checkbox is selected" + Spanish.isSelected());
			}

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if(id5 != "latinchbx") {
				System.out.println("not selected ");
			}
		}








	}

}
