package ttdbalaji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ttd_Balaji {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.get("https://tirupatibalaji.ap.gov.in/#/login");
    Thread.sleep(3000);
    driver.findElement(By.linkText("Sign Up")).click();
    Thread.sleep(3000);
    
    
    
    
	}

}
