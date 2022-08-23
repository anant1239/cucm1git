package stepdefintion;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definition {

	WebDriver driver;
	@Given("Open the browser and go to the Login page of OrangeHRM")
	public void open_the_browser_and_go_to_the_login_page_of_orange_hrm() {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("Enter the valid name {string}")
	public void enter_the_valid_name(String str)
	{
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("txtUsername")).sendKeys(str);
	}
	@When("Enter the valid password {string}")
	public void enter_the_valid_password(String pwd) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);	
	}
	@When("Click on LoginButton")
	public void click_on_login_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();	
	}	   	   
	   @Then("I should see the username as {string}")
	   public void i_should_see_the_username_as(String string) {
		   String Expectedname=driver.findElement(By.id("welcome")).getText();
		   String Actualname=Expectedname;
		   Assert.assertEquals(Expectedname, Actualname );
	   }

@When("Enter the invalid name {string}")
public void enter_the_invalid_name(String str) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("txtUsername")).sendKeys(str);
}
@When("Enter the invalid password {string}")
public void enter_the_invalid_password(String pwd) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("txtPassword")).sendKeys(pwd);
}
@When("Click on Login button")
public void click_on_login_button1() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("btnLogin")).click();	
}
@Then("I should see a spam message {string}")
public void i_should_see_a_spam_message(String errMsg) {
    // Write code here that turns the phrase above into concrete actions
	String expectedData = driver.findElement(By.id("spanMessage")).getText();
	String actual = errMsg;
	Assert.assertEquals(expectedData, actual);
	driver.close();
}
}

