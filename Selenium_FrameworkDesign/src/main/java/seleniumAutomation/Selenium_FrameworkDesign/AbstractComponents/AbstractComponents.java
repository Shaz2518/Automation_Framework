package seleniumAutomation.Selenium_FrameworkDesign.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumAutomation.Selenium_FrameworkDesign.pageobjects.CartPage;

public class AbstractComponents {

	WebDriver driver;

	public AbstractComponents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void waitTillElementAppear(By Findby) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Findby));
	}

	// Go To Cart Page
	@FindBy(css = "[routerlink*='cart']")
	WebElement cartHeader;

	public CartPage goToCart() {
		cartHeader.click();
		CartPage cart = new CartPage(driver);
		return cart;
	}

	public void waitTillElementDisapper(WebElement Ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf((Ele)));
	}

}
