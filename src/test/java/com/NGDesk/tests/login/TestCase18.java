package com.NGDesk.tests.login;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.pages.ManageTagsPage;
import com.NGDesk.pages.NewTagPage;

import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.BrowserUtils;
import com.NGDesk.utilities.ConfigurationReader;

public class TestCase18 extends TestBase {
	String usernameN = ConfigurationReader.getProperty("usernameN");
	String passwordN = ConfigurationReader.getProperty("passwordN");
	String subdomainN= ConfigurationReader.getProperty("subdomainN");
	
	String url =ConfigurationReader.getProperty("url");
	//1. Navigate To ngDesk Login Page
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
		                      
Assert.assertTrue(homePage.searchTicketBox.isDisplayed());
			
			
			
	//3.Search Tickets Box is displayed
	
	homePage.searchTicketBox.isDisplayed();
	  
	
	//4.*Hover over 5th tab on left side tab section *Click on "Manage Tags"                                                   
	
	BrowserUtils.hover(homePage.havorover1);
	homePage.manageTags.click();
	

	ManageTagsPage manageTagsPage = new ManageTagsPage();
	Thread.sleep(3000);
	manageTagsPage.newTagButton.click();
	Thread.sleep(3000);
	NewTagPage newTagPage = new NewTagPage();

	Thread.sleep(3000);
	//newTagPage.tagName.sendKeys("newyork");
	Thread.sleep(3000);
	Assert.assertTrue(newTagPage.saveTagButton.isDisplayed());	
	
	System.out.println("Page Title is " + driver.getTitle());

	String actual= "ngDesk - Portal";
	String expected= driver.getTitle();
	Assert.assertEquals(actual, expected);
	driver.quit();

	
	

	
	
	
}
}










