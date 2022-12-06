package fblogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com");
    driver.findElement(By.name("email")).sendKeys("josya@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("123456");
    driver.findElement(By.name("login")).click();
    

	}

}
