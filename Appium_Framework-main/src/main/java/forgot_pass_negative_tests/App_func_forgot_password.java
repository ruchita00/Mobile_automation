package forgot_pass_negative_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import Reusable_functions.Generic_functions;
import io.cucumber.java.en.*;

public class App_func_forgot_password extends Generic_functions{
	public static String str;
	@Given("App is open")
	public void app_is_open() {
		
		try {
			App_Launch();
			page_wait(20);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    /*TC_001 User get the validation message when Phone number field is blank*/
	@Then("User get the validation message when Phone number field is blank")
	public void forgot_password_negative_tc_001() throws InterruptedException  {
		try {
			driver.findElement(By.xpath(OR_reader("Object_Locator1","welcome_login"))).click();	
			driver.findElement(By.xpath(OR_reader("Object_Locator1","forgot_password_link"))).click();	
			String a= driver.findElement(By.xpath(OR_reader("Object_Locator1","forgot_password_phone_no"))).getText();
			System.out.println("clicked on phone number "+a);
			driver.findElement(By.xpath(OR_reader("Object_Locator1","forgot_password_phone_no"))).sendKeys("send button");
			driver.findElement(By.xpath(OR_reader("Object_Locator1","send_reset_link"))).click();
		    str= driver.findElement(By.xpath(OR_reader("Object_Locator1","phone_number_blank_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("forgot_password_phone_msg"));
			page_wait(60);
		    page_refresh();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}		
//
//	/*TC_002 User get the validation message on entering less than ten digit phone number*/
//	@Given("User get the validation message on entering less than ten digit phone number")
//	public void forgot_password_negative_tc_002() {
//		try {
//			driver.findElement(By.xpath(OR_reader("Object_Locator1","forgot_password_phone_no"))).sendKeys(td_reader("forgot_password_phone_no",0));
//			driver.findElement(By.xpath(OR_reader("Object_Locator1","send_reset_link"))).click();
//		    str= driver.findElement(By.xpath(OR_reader("Object_Locator1","phone_number_valid_msg"))).getText();
//			Assert.assertEquals(str,"forgot_less_ten_msg");
//			page_wait(60);	
//			page_refresh();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//    /*TC_003 User get the validation message on entering more than ten digit phone number*/
//	@Given("User get the validation message on entering more than ten digit phone number")
//	public void forgot_password_negative_tc_003() {
//		try {
//			driver.findElement(By.xpath(OR_reader("Object_Locator1", "forgot_password_phone_no"))).sendKeys(td_reader("forgot_password_phone_no",1));
//			driver.findElement(By.xpath(OR_reader("Object_Locator1","send_reset_link"))).click();
//	        str= driver.findElement(By.xpath(OR_reader("Object_Locator1","phone_number_valid_msg"))).getText();
//			Assert.assertEquals(str,td_reader("forgot_less_ten_msg"));
//			page_wait(60);
//			page_refresh();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//   /*TC_004 Send Reset Link button is disabled when Phone number field is blank*/
//	@Then("Send Reset Link button is disabled when Phone number field is blank")
//	public void forgot_password_negative_tc_004() {
//		try {
//			Assert.assertEquals(driver.findElement(By.xpath(OR_reader("Object_Locator1","send_reset_link"))).isEnabled(),true);
//			page_refresh();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}		
//	}
//	    
//	/*TC_005 User should able to get a validation message on entering non registered phone number in the phone number field*/
//	@Then("User should able to get a validation message on entering non registered phone number in the phone number field")
//	public void forgot_password_negative_tc_005() {
//		try {
//			driver.findElement(By.xpath(OR_reader("Object_Locator1","forgot_password_phone_no"))).sendKeys(td_reader("forgot_password_phone_no",2));
//			driver.findElement(By.xpath(OR_reader("Object_Locator1","send_reset_link"))).click();
//			str= driver.findElement(By.xpath(OR_reader("Object_Locator1","forgot_password_phoneno_exist_valid_msg"))).getText();
//	        Assert.assertEquals(str,td_reader("forgot_phone_no_exist_msg"));
//	        page_close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	
/*
Scenario: Validate that the user should get a validation message on entering less than ten digit phone number in phone number field  
Given User get the validation message on entering less than ten digit phone number
 
Scenario: Validate that the user should get a validation message on entering more than ten digit phone number in phone number field 
Given User get the validation message on entering more than ten digit phone number
  
Scenario: Validate that the Send Reset Link button is disabled when Phone number field is blank  
Then Send Reset Link button is disabled when Phone number field is blank

Scenario: Validate that the user should able to get a validation message on entering non registered phone number in the phone number field 
Then User should able to get a validation message on entering non registered phone number in the phone number field
*/
}
