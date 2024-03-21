package org.wipro.automation.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.uo.utilitiespkg.ReusableClass;

public class UOHomePage 
{
	WebDriver driver;  //global variable

	public UOHomePage(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	public void click_exploreparks() throws Exception
	{
		driver.findElement(By.xpath(ReusableClass.readElementprop("UO_homepage_ExploreParks_xpath"))).click();
	}
	
	public void click_USF() throws Exception
	{
		driver.findElement(By.xpath(ReusableClass.readElementprop("UO_homePage_exploreparks_USF_xpath"))).click();
	}
	
	
}
