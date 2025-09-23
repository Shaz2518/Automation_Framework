package seleniumAutomation.Selenium_FrameworkDesign.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	// Create a constructor to declare and initialize driver
	WebDriver driver;

	public LandingPage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this); // This will initialize the driver and get the locator
	}

	// PageFactory Pattern to Login
	@FindBy(id = "userEmail")
	WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement userPassword;

	@FindBy(id = "login")
	WebElement loginBtn;
	
	//Action Method for login page
	public void loginApp(String username, String password)
	{
		userEmail.sendKeys(username);
		userPassword.sendKeys(password);
		loginBtn.click();
	}
	
	public void goToURL()
	{
		driver.get("https://rahulshettyacademy.com/client/");
	}

}
