package justrechargeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JRI_Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.justrechargeit.com/SignIn.aspx");
    driver.findElement(By.name("txtUserName")).sendKeys("abc@gmail.com");
    driver.findElement(By.name("txtPasswd")).sendKeys("abc123");
    driver.findElement(By.name("txtCaptcha")).sendKeys("55");
    driver.findElement(By.id("imgbtnSignin")).click();
    
    
	}

}
