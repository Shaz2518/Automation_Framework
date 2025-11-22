package amazonAutomation;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
	//Amazon Login
		driver.findElement(By.cssSelector(".a-button-text")).click();
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		driver.findElement(By.id("nav-flyout-ya-signin")).click();
		driver.findElement(By.name("email")).sendKeys("wiprowaseproject@gmail.com");
		driver.findElement(By.cssSelector(".a-button-input")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Wipro@123");
		driver.findElement(By.id("signInSubmit")).click();
		
		
		//Searching and Adding product to cart.
		driver.findElement(By.cssSelector(".a-button-text")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		//Take all the products in list
		List<WebElement> products = driver.findElements(By.cssSelector(".puisg-col-inner"));
		
		//Get the product
		WebElement cartProd = products.stream().filter(product->product.getText()
				.contains("iPhone 16 128 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Teal"))
				.findFirst().orElse(null);
		cartProd.findElement(By.name("submit.addToCart")).click();
		
		//By cartBtn = By.cssSelector(".ewc-go-to-cart");
		expWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Go to Cart")));
		driver.findElement(By.linkText("Go to Cart")).click();
		
		
		

	}

}
