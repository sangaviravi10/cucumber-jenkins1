package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaseStudy2 {
	WebDriver driver;
	@Given("user opens testmeapp")
	public void user_opens_testmeapp() {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("http://10.232.237.143:443/TestMeApp");
	     driver.findElement(By.xpath("//a[@href='login.htm']")).click();  
	}

	@Then("user enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String un, String pwd) {
		driver.findElement(By.id("userName")).sendKeys(un);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@Then("Validate the login page")
	public void validate_the_login_page() {
		driver.findElement(By.name("Login")).click();
		 
	}


}
