package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPOF{
 
	final WebDriver driver;
	@FindBy(how = How.XPATH, using = "//input[@id='txtUsername']")
	public WebElement Username;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtPassword']")
	public WebElement Password;

	@FindBy(how = How.XPATH, using = "//input[@id='btnLogin']")
	public WebElement Login;

	@FindBy(how = How.XPATH, using = "//a[@id='welcome']")
	public WebElement Welcome;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	public WebElement Logout;
	
	
	public LoginPOF(WebDriver driver){
		 
		this.driver = driver;
 
		}
	
	
	
	
}
