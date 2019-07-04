package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class casestudy2 {
	WebDriver driver;
	@Given("open testme app")
	public void open_testme_app() {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		WebElement var1=driver.findElement(By.linkText("SignIn"));
		var1.click();
	}

	@When("user gives username as {string}")
	public void user_gives_username_as(String un) {
		WebElement var2=driver.findElement(By.id("userName"));
		var2.sendKeys(un); 
	}

	@When("user gives password as {string}")
	public void user_gives_password_as(String pw) {
		WebElement var3=driver.findElement(By.id("password"));
		var3.sendKeys(pw);
	}

	@When("user clicks login")
	public void user_clicks_login() {
		WebElement var4=driver.findElement(By.name("Login"));
		var4.click();
	}

	@Then("user verifies login")
	public void user_verifies_login() {
		WebElement check=driver.findElement(By.linkText("Home"));
		String s1=check.getText();
		System.out.println(s1);
		Assert.assertEquals(s1, "Home");
		driver.close();
	}
}
