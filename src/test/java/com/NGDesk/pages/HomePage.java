package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//li[@id='menu-item-5609']//span[@class='menu-text'][contains(text(),'Log In')]")
	public WebElement loginButton;
	
	@FindBy(xpath="//input[@placeholder='Subdomain']")
	public WebElement subdomainBox;
	
	@FindBy(css=".btn.btn-block.col-12.mx-auto.ng-binding")
	public WebElement goLoginButton;
	//TC6-GS
	@FindBy(css=".menu-text.fusion-button.button-default.button-small")
	public WebElement signUpButton;
	
	////njl
	@FindBy(xpath="//i[@class='fa fa-ticket icon-color']")
	public WebElement havorovr;
	
	
	@FindBy(xpath="//li[@title='Tickets']//ul[@id='sidebar-dropdown']//a[1]//div[1]//div[2]")
	public WebElement viewTickets;
	
	@FindBy(xpath="//ul[@id='sidebar-dropdown']//a[6]//div[1]//div[1]")
	public WebElement manageTags;
	
	
	@FindBy(xpath="//a[contains(@class,'nav-link ng-isolate-scope')]//i[contains(@class,'icon-color')]")
	public WebElement havorover1;
	
	
	

	@FindBy(xpath="//input[@id='search-box']")
	public WebElement searchTicketBox;
}
