package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.basepkg.InitiateCloseBrowser;
import org.wipro.automation.uo.pages.SignupPage;

public class SignupScenario extends InitiateCloseBrowser
{

	@Test
	public void validate_signupfunction() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname("selenium");
	}
	
}
