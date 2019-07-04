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
import org.testng.Assert;

public class casestudy1 {
	WebDriver driver;
	@Given("user is on signup page")
	public void user_is_on_signup_page() {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		WebElement reg=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a"));
		reg.click();
	}

	@When("user provides the uname as {string}")
	public void user_provides_the_uname_as(String un) {
		WebElement uname=driver.findElement(By.name("userName"));
        uname.sendKeys(un);	
	}

	@When("user provides the fname as {string}")
	public void user_provides_the_fname_as(String fn) {
		WebElement fname=driver.findElement(By.name("firstName"));
        fname.sendKeys(fn);
	}

	@When("user provides the lname as {string}")
	public void user_provides_the_lname_as(String ln) {
		 WebElement lname=driver.findElement(By.name("lastName"));
	        lname.sendKeys(ln); 
	}

	@When("user provides the pwd as {string}")
	public void user_provides_the_pwd_as(String pw) {
		 WebElement pwd=driver.findElement(By.name("password"));
	        pwd.sendKeys(pw);
	}

	@When("user provides the cpwd as {string}")
	public void user_provides_the_cpwd_as(String cpw) {
		  WebElement confirmpwd=driver.findElement(By.name("confirmPassword"));
	        confirmpwd.sendKeys(cpw);
	}

	@When("user provides the gender")
	public void user_provides_the_gender() {
		WebElement gender=driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label"));
        gender.click();
	}

	@When("user provides the mail as {string}")
	public void user_provides_the_mail_as(String mail) {
		 WebElement email=driver.findElement(By.name("emailAddress"));
	        email.click();
	        email.sendKeys(mail);
	}

	@When("user provides the num as {string}")
	public void user_provides_the_num_as(String num) {
		 WebElement mobile=driver.findElement(By.name("mobileNumber"));
	        mobile.click();
	        mobile.sendKeys(num);
	}

	@When("user provides the dob as {string}")
	public void user_provides_the_dob_as(String db) {
		  WebElement dob=driver.findElement(By.name("dob"));
	        dob.click();
	        dob.sendKeys(db);
	}

	@When("user provides the address as {string}")
	public void user_provides_the_address_as(String ad) {
		WebElement address=driver.findElement(By.name("address"));
        address.click();
        address.sendKeys(ad);
	}

	@When("user provides the seques")
	public void user_provides_the_seques() {
		Actions act=new Actions(driver);
        WebElement qus=driver.findElement(By.xpath("//*[@id='securityQuestion']"));
        qus.click();
        act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("user provides the ans as {string}")
	public void user_provides_the_ans_as(String an) {
		 WebElement ans=driver.findElement(By.name("answer"));
	        ans.click();
	        ans.sendKeys(an);
	        WebElement reg=driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]"));
	        reg.click();
	}

	@Then("user verifies the registration")
	public void user_verifies_the_registration() {
	System.out.println("verified");
		String s1=driver.getTitle();
		Assert.assertEquals(s1, "Login");
	driver.close();
	}
	
	
}
