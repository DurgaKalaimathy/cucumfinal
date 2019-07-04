package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy3 {
	WebDriver driver;
	@Given("Alex logins testme app")
	public void alex_logins_testme_app() {
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
		WebElement var4=driver.findElement(By.id("myInput"));
		Actions act=new Actions(driver);
		act.sendKeys(var4,"wear").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		WebElement var5=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[1]/center[1]/h4"));
		String s1=var5.getText();
		//System.out.println(s1);
		Assert.assertEquals(s1, "Outer wear");
	}

	@When("Alex searches the product")
	public void alex_searches_the_product() {
		
	   
	}

	@When("Alex selects the product")
	public void alex_selects_the_product() {

	}

	@Then("Alex verifies the product")
	public void alex_verifies_the_product() {
	 
	}


}
