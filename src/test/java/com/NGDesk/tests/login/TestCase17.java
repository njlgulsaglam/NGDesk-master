package com.NGDesk.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.NGDesk.pages.ControlPanelPage;
import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.pages.TicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.*;

	public class TestCase17 extends TestBase {
		
		
		String usernameN = ConfigurationReader.getProperty("usernameN");
		String passwordN = ConfigurationReader.getProperty("passwordN");
		String subdomainN= ConfigurationReader.getProperty("subdomainN");
		
		String url =ConfigurationReader.getProperty("url");
		//1. Navigate To ngDesk Login Page
		
			@Test
			public void testCase17() throws InterruptedException {
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
		
		
		//2.Login using valid Username and Password
		
		//3. Click Login
		
			BrowserUtils.hover(homePage.havorovr);
			
			homePage.viewTickets.click();
		
		
		//5.Click "Assignee" dropdown / Choose Assignee and Click on Assignee
			//*****//5. Verify
			TicketPage ticketPage = new TicketPage();
			ticketPage.ticket.click();
		    ControlPanelPage controlPanelPage = new ControlPanelPage();
		   
		Assert.assertTrue(controlPanelPage.statusButton.isDisplayed()); 
		Assert.assertTrue(controlPanelPage.severityButton.isDisplayed());
		Assert.assertTrue(controlPanelPage.createTagButton.isDisplayed());	
			
			
			
			
			
			}		
	}
