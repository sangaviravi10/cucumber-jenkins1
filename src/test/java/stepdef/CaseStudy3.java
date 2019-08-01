package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CaseStudy3 {
	WebDriver driver;
	@Given("user opens the TestMeApp")
	public void user_opens_the_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("http://10.232.237.143:443/TestMeApp");
	     
	}

	@When("user clicks signin button")
	public void user_clicks_signin_button() {
		driver.findElement(By.xpath("//a[@href='login.htm']")).click(); 
	}

	@When("user enters the username and password in the required fields")
	public void user_enters_the_username_and_password_in_the_required_fields() {
		driver.findElement(By.id("userName")).sendKeys("Diya1234");
	    driver.findElement(By.id("password")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click();
	}

	@When("user searches for a particular product like headphones")
	public void user_searches_for_a_particular_product_like_headphones() {
		WebElement search = driver.findElement(By.id("myInput"));
		   search.sendKeys("h");
		   search.sendKeys("e");
		   search.sendKeys("a");
		   search.sendKeys("d");
		   Actions act1 = new Actions(driver);
		   act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).click().build().perform();
		 
	}

	@When("user clicks findDetails button")
	public void user_clicks_findDetails_button() {
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@When("user proceed to payment by addding product to the cart and clicks the Add To Cart button")
	public void user_proceed_to_payment_by_addding_product_to_the_cart_and_clicks_the_Add_To_Cart_button() {
		 String title = driver.getTitle();
		 Assert.assertEquals("Search", title);
		//driver.findElement(By.linkText("Add to cart")).click();
		 //driver.findElement(By.partialLinkText("Cart")).click();
	}

}
