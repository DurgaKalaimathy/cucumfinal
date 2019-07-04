package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy4 {
	WebDriver driver;
	@Given("Alex opens the app")
	public void alex_opens_the_app() {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		WebElement var1=driver.findElement(By.linkText("SignIn"));
		var1.click();
		WebElement var2=driver.findElement(By.id("userName"));
		var2.sendKeys("lalitha"); 
		WebElement var3=driver.findElement(By.id("password"));
		var3.sendKeys("password123");
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
	}

	@When("Alex search the product")
	public void alex_search_the_product() {
		WebElement var4=driver.findElement(By.id("myInput"));
		Actions act=new Actions(driver);
		act.sendKeys(var4,"wear").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("Alex views the cart page")
	public void alex_views_the_cart_page() {
	 System.out.println("viewed");
	}

	@Then("Alex verifies the alert message")
	public void alex_verifies_the_alert_message() {
	   System.out.println("yes");
	}


}
