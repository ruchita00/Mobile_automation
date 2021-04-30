package Signup_positive_scenario;


import java.io.IOException;


import org.openqa.selenium.By;
import org.testng.Assert;

import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup_positive_scenario extends Generic_functions{
	public static boolean value1,value2;
	
	@Given("App is open and user is on sign up page")
	public static void signup_positive_tc_001() throws IOException {
		try {
			App_Launch();
			System.out.println("inside app");
			page_wait(20);
	}catch(IOException e) {
		e.printStackTrace();
		takeScreenShot("signup_positive_tc_001");
	}
	}
	
	/* For verifying that the user is navigated to the login page on clicking the login link*/
	@When("user clicks on the login link user is navigated to the login page")
	public static void signup_positive_tc_002() throws IOException{
		try {	click("login_link");
			page_wait(5);
			value1 = driver.findElement(By.xpath(OR_reader("Object_Locator", "login_page_title"))).isDisplayed();
			Assert.assertEquals(true,value1);
			page_wait(10);
			click("signup_link");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_002");
		}
		}
	
	@When("User enters the details in the Password and Confirmed Password field should be masked")
	public void signup_positive_tc_003() throws IOException {
		try {page_wait(10);
		driver.findElement(By.xpath(OR_reader("Object_Locator","password"))).sendKeys(td_reader("password"));
		driver.findElement(By.xpath(OR_reader("Object_Locator", "confirm_password"))).sendKeys(td_reader("confirm_password"));
		value1=driver.findElement(By.xpath(OR_reader("Object_Locator", "password"))).isDisplayed();
		value2=driver.findElement(By.xpath(OR_reader("Object_Locator", "confirm_password"))).isDisplayed();
		Assert.assertEquals(true,value1);
		Assert.assertEquals(true,value2);
		driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_003");
		}
		}
	
	@Then("User clicks on the Eye and Orginal value should be displayed in the password fields")
	public void signup_positive_tc_004() throws IOException {
		try {click("sign_up");
		driver.findElement(By.xpath(OR_reader("Object_Locator","password"))).sendKeys(td_reader("password"));
		click("show_password");
		value1=driver.findElement(By.xpath(OR_reader("Object_Locator", "show_password"))).isDisplayed();
		Assert.assertEquals(true,value1);
		driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_004");
		}
		}
	
	@When("user enter same values of Password in the Confirmed field")
	public void signup_positive_tc_005() throws IOException {
		try {click("sign_up");
		driver.findElement(By.xpath(OR_reader("Object_Locator","password"))).sendKeys(td_reader("password"));
		driver.findElement(By.xpath(OR_reader("Object_Locator", "confirm_password"))).sendKeys(td_reader("confirm_password"));
		value1=driver.findElement(By.xpath(OR_reader("Object_Locator", "password"))).isDisplayed();
		value2=driver.findElement(By.xpath(OR_reader("Object_Locator", "confirm_password"))).isDisplayed();
		Assert.assertEquals(true,value1);
		Assert.assertEquals(true,value2);
      	driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_005");
		}
			}
	
	@When("User enters valid credentials")
	public void signup_positive_tc_006() throws IOException {
		try {click("sign_up");
		driver.findElement(By.xpath(OR_reader("Object_Locator","first_name"))).sendKeys(td_reader("first _name"));
		driver.findElement(By.xpath(OR_reader("Object_Locator", "last_name"))).sendKeys(td_reader("last_name"));
		driver.findElement(By.xpath(OR_reader("Object_Locator","email_id"))).sendKeys(td_reader("email_id"));
		driver.findElement(By.xpath(OR_reader("Object_Locator", "phone_number"))).sendKeys(td_reader("phone_number"));
		driver.findElement(By.xpath(OR_reader("Object_Locator","password"))).sendKeys(td_reader("password"));
		driver.findElement(By.xpath(OR_reader("Object_Locator", "confirm_password"))).sendKeys(td_reader("confirm_password"));
		click("checkbox");
		click("Sign_Up");
		value1=driver.findElement(By.xpath(OR_reader("Object_Locator", "otp_1"))).isDisplayed();
		Assert.assertEquals(true,value1);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_006");
		}
		}
	
	@When("user enters otp and clicks on verify button and is navigated to the login page")
	public void signup_positive_tc_007() throws IOException {
		try {driver.findElement(By.xpath(OR_reader("Object_Locator","otp_1"))).sendKeys(td_reader("otp_1"));
		driver.findElement(By.xpath(OR_reader("Object_Locator","otp_2"))).sendKeys(td_reader("otp_2"));
		driver.findElement(By.xpath(OR_reader("Object_Locator","otp_3"))).sendKeys(td_reader("otp_3"));
		driver.findElement(By.xpath(OR_reader("Object_Locator","otp_4"))).sendKeys(td_reader("otp_4"));
		click("verify");
		value1=driver.findElement(By.xpath(OR_reader("Object_Locator", "otp_page"))).isDisplayed();
		Assert.assertEquals(true,value1);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_tc_007");
		}
		}
}