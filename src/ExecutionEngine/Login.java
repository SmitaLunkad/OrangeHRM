package ExecutionEngine;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Config.Constants;
import Config.Log1;
import Config.LoginPOF;

@Test
public class Login extends Constants {
	public static LoginPOF lgnPage = new LoginPOF(driver);
	public void validateLogin() throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1000,500));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		DOMConfigurator.configure("log4j.xml");
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(5000);
		Log1.info("User : "+driver.findElement(By.xpath("//a[@id='welcome']")).getText());
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.close();
		Log1.info("Test Succeeded");
		/*lgnPage.Username.sendKeys(uid);
		lgnPage.Password.sendKeys(pwd);
		lgnPage.Login.click();
		lgnPage.Welcome.click();
		Log1.info("User : "+lgnPage.Welcome.getText());
		lgnPage.Logout.click();
		*/
		
	}
	
	

}
