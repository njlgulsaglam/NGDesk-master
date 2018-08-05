package com.NGDesk.tests.login;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.NGDesk.pages.ControlPanelPage;
import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.pages.TicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.BrowserUtils;
import com.NGDesk.utilities.ConfigurationReader;

public class TestCase15 extends TestBase{

		String usernameN = ConfigurationReader.getProperty("usernameN");
		String passwordN = ConfigurationReader.getProperty("passwordN");
		String subdomainN= ConfigurationReader.getProperty("subdomainN");
		String ccsEmailaddress= ConfigurationReader.getProperty("ccsEmailaddress");
		String url =ConfigurationReader.getProperty("url");
		//1. Navigate To ngDesk Login Page
		
			@Test
			public void testCase15() throws InterruptedException {
				//1. Navigate To ngDesk Login Page 
				//2. Log in
				//3. Click on login
			driver.get(url);
			HomePage homePage = new HomePage();
			homePage.loginButton.click();
			homePage.subdomainBox.sendKeys(subdomainN);
			homePage.goLoginButton.click();
			
			
			LoginPage loginPage=new LoginPage();
			loginPage.login(usernameN,passwordN);
			loginPage.loginButton.click();
	
	
	//4. Click on ticket demis oncesi //*Hover over 2nd tab on left side of page and Click on "View tickets" 

	BrowserUtils.hover(homePage.havorovr);
	homePage.viewTickets.click();
	TicketPage ticketPage = new TicketPage();
	ticketPage.ticket.click();

	
	ControlPanelPage controlPanelPage = new ControlPanelPage();

	//controlPanelPage.ccUser.sendKeys(subdomainN);
	//controlPanelPage.ccUser.sendKeys(Keys.ENTER);
	//Assert.assertTrue(controlPanelPage.ccUser.isDisplayed());

	//7. Enter CC'd users email
	controlPanelPage.ccEmail.sendKeys(ccsEmailaddress);

	controlPanelPage.ccEmail.sendKeys(Keys.ENTER);

	//8. Verify that "usa@gmail.com" is there
	Assert.assertTrue(controlPanelPage.ccEmail.isDisplayed());
	
	
	
	
	
	
	
	}
	
}	
	
	