package collegeweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CW_Week {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup");
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("swetha");
		driver.findElement(By.id("lastName")).sendKeys("vasupalli");
		driver.findElement(By.id("emailAddress")).sendKeys("swetha.vasupalli@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("9392712307");
		driver.findElement(By.name("password")).sendKeys("josya@123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("josya@123");
		driver.findElement(By.name("nationality")).sendKeys("indian");
	    driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		driver.findElement(By.id("submit")).click();
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
	
	}
}
		
		
	