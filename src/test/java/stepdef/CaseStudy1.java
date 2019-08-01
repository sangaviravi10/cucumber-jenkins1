package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy1 {
	WebDriver driver;
	@Given("user opens TestMeApp")
	public void user_opens_TestMeApp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("user clicks signup button")
	public void user_clicks_signup_button() {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();  
	    
	}

	@Then("user enters the username as {string}")
	public void user_enters_the_username_as(String string) {
		 driver.findElement(By.id("userName")).sendKeys("Diya1234");
		 
	}

	@Then("user enters the FirstName as {string}")
	public void user_enters_the_FirstName_as(String string) {
		driver.findElement(By.id("firstName")).sendKeys("Diya");
	}

	@Then("user enters the LastName as {string}")
	public void user_enters_the_LastName_as(String string) {
		driver.findElement(By.id("lastName")).sendKeys("Ram");
	}

	@Then("user enters the Password as {string}")
	public void user_enters_the_Password_as(String string) {
		driver.findElement(By.id("password")).sendKeys("password123");
		 
	}

	@Then("user enters the ConfirmPassword as {string}")
	public void user_enters_the_ConfirmPassword_as(String string) {
		driver.findElement(By.id("pass_confirmation")).sendKeys("password123");
		 
	}

	@Then("user enters the Gender as {string}")
	public void user_enters_the_Gender_as(String string) {
		 driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@Then("user enters the Email as {string}")
	public void user_enters_the_Email_as(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys("DiyaRam@gmail.com");
		 
	}

	@Then("user enters the PhoneNumber as {string}")
	public void user_enters_the_PhoneNumber_as(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys("1236547895");
	}

	@Then("user enters the DOB as {string}")
	public void user_enters_the_DOB_as(String string) {
		 driver.findElement(By.xpath("//img[@title='Ch']")).click();
		  WebElement month=driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		  Select selMonth=new Select(month);
		  selMonth.selectByValue("8");
		  WebElement year=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		  Select selYear=new Select(year);
		  selYear.selectByValue("1998");
		  WebElement cal=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table"));
		  cal.findElement(By.linkText("10")).click();
	}

	@Then("user enters the Address as {string}")
	public void user_enters_the_Address_as(String string) {
		 driver.findElement(By.id("address")).sendKeys("Nehru street chennai");
		 
	}

	@Then("user enters the Answer as {string}")
	public void user_enters_the_Answer_as(String string) {
		driver.findElement(By.id("answer")).sendKeys("Chennai");
	}

	@Then("user clicks the Register button")
	public void user_clicks_the_Register_button() {
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}



}
