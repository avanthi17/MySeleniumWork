package seleniumwork11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
public class LaunchChbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TO add the path of chrome driver
System.setProperty("webdriver.chrome.driver","C:\\Users\\avant\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	//it should have key and value	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("987654321");
		//this is the password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Create new account")).click();
		
	//	driver.close();
	}

}
