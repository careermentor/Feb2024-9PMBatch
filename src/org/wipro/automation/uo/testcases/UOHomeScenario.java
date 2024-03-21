package org.wipro.automation.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.uo.basepkg.InitiateCloseBrowser;
import org.wipro.automation.uo.pages.UOHomePage;

public class UOHomeScenario extends InitiateCloseBrowser
{

	@Test
	public void validate_homepagelinks() throws Exception
	{
		UOHomePage uo = new UOHomePage(driver);
		
		uo.click_exploreparks();
		uo.click_USF();
	}
	
}
