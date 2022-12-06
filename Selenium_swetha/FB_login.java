import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

public class FB_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      driver.findElement(By.id("email")).sendKeys("swetha.vasupalli@gmail.com");
      driver.findElement(By.name("pass")).sendKeys("josya@123");
      driver.findElement(By.name("login")).click();
      }

}
