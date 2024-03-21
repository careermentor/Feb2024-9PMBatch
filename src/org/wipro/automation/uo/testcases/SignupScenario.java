package org.wipro.automation.uo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.wipro.automation.uo.basepkg.InitiateCloseBrowser;
import org.wipro.automation.uo.pages.SignupPage;
import org.wipro.automation.uo.utilitiespkg.ReusableClass;

public class SignupScenario extends InitiateCloseBrowser
{

	@Test
	public void validate_signupfunction() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Shruthi");
		
		Select day = new Select(sign.dob_day);
		day.selectByVisibleText(ReusableClass.readConfigprop("bday"));
		
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Apr");
		
	}
	
}
