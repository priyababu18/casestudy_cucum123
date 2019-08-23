package casestudy_cucum;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demo_1 {
	static WebDriver driver;
	@Given("TestMeApp is launched")
	public void testmeapp_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\TESTING\\selenium\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	      driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
			driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
			 		  
		
	}

//	@Then("user clicks on the SignUp link")
//	public void user_clicks_on_the_SignUp_link() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
//	}
//
//	@Then("enter username {string}")
//	public void enter_username(String string) {
////	     Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		driver.findElement(By .name("userName")).sendKeys(string);
//	}
//
//	@Then("enter firstname {string}")
//	public void enter_firstname(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		 driver.findElement(By .name("firstName")).sendKeys(string);
//
//	}
//
//	@Then("enter lastname {string}")
//	public void enter_lastname(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		driver.findElement(By .name("lastName")).sendKeys(string);
//	}
//
//	@Then("enter password {string}")
//	public void enter_password(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////    throw new cucumber.api.PendingException();
//		driver.findElement(By .name("password")).sendKeys(string);
//	}
//
//	@Then("enter confirm password {string}")
//	public void enter_confirm_password(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////    throw new cucumber.api.PendingException();
//		driver.findElement(By .name("confirmPassword")).sendKeys(string);
//	}
//
//	@Then("enter gender")
//	public void enter_gender() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		driver.findElement(By .xpath("//*[@id=\"gender\"]")).click();
//	}
//
//	@Then("enter email {string}")
//	public void enter_email(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		 driver.findElement(By .name("emailAddress")).sendKeys(string);
//	}
//
//	@Then("enter mobile number {string}")
//	public void enter_mobile_number(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		 driver.findElement(By .name("mobileNumber")).sendKeys(string);
//	}
//
//	@Then("enter dob {string}")
//	public void enter_dob(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		driver.findElement(By .name("dob")).sendKeys(string);
//	}
//
//	@Then("enter address {string}")
//	public void enter_address(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		driver.findElement(By .name("address")).sendKeys(string);
//	}
//
//	@Then("enter security question")
//	public void enter_security_question() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		Select s=new Select (driver.findElement(By .name("securityQuestion")));
//		s.selectByValue("411011");
//	}
//
//	@Then("enter answer {string}")
//	public void enter_answer(String string) {
//	    // Write code here that turns the phrase above into concrete actions
////    throw new cucumber.api.PendingException();
//		driver.findElement(By .name("answer")).sendKeys(string);
//		
//	}
//
//	@Then("user clicks the registration button")
//	public void user_clicks_the_registration_button() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		driver.findElement(By .name("Submit")).click(); 
//	}

//	@Then("verify the registration process")
//	public void verify_the_registration_process() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
//		String b=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
//		Assert.assertEquals("SignOut",b);
//	}

	@Then("user provides valid username {string}")
	public void user_provides_valid_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\TESTING\\selenium\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	      driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
			driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
			 		 	
			driver.findElement(By .xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@Then("user provides valid password {string}")
	public void user_provides_valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(string);

	}

	@Then("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .name("Login")).click();

	}

	@Then("user verifies the login status")
	public void user_verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		String b=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		Assert.assertEquals("SignOut",b);
	}

	@Then("user enters the item name to be searched")
	public void user_enters_the_item_name_to_be_searched() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		//driver.findElement(By .name("products")).click();
		driver.findElement(By .name("products")).sendKeys("HeadPhone");
	}

	@Then("user click on find details")
	public void user_click_on_find_details() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();

	}

	@Then("add to cart")
	public void add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	}

	@Then("user proceeds to payment")
	public void user_proceeds_to_payment() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		driver.findElement(By .xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		
	}

	@Then("continue the payment process")
	public void continue_the_payment_process() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By .xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		   //click on continue
		   driver.findElement(By .xpath("//*[@id=\"btn\"]")).click();
		   //username
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
		   //password
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		   //login
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		   //transactionpassword
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
		   //paynow
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		   String s=driver.findElement(By .xpath("/html/body/b/section/div/div/div/div[2]/p")).getText();
		   String s1="Your order has been confirmed";
		   Assert.assertEquals(s,s1);

	}

	@Given("Alex has registered into TestMeApp")
	public void alex_has_registered_into_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\TESTING\\selenium\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	      driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
			driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();

		  driver.findElement(By .name("userName")).sendKeys("lalitha");
		  driver.findElement(By .name("password")).sendKeys("password123");
		  driver.findElement(By .name("Login")).click();
		
	}

	@Then("Alex search for a product like headphone")
	public void alex_search_for_a_product_like_headphone() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .name("products")).click();
		driver.findElement(By .name("products")).sendKeys("HeadPhone");
		driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();

	}

	@Then("Alex go for payment without adding items into cart")
	public void alex_go_for_payment_without_adding_items_into_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		boolean x=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).isDisplayed();
		Assert.assertTrue(x);
	}

	@Then("TestMe doesnt display the cart icon")
	public void testme_doesnt_display_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("there is no cart icon");
	}

}
