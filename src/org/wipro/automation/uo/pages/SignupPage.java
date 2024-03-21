package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.wipro.automation.uo.utilitiespkg.ReusableClass;

public class SignupPage 
{
	WebDriver driver;  //global variable

	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReusableClass.readElementprop("fb_login_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_firstname_name"))).sendKeys(fname);
	}
	
	public WebElement dob_day = driver.findElement(By.name("birthday_day"));
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReusableClass.readElementprop("fb_signup_signupbtn_name"))).click();
	}
	
}
