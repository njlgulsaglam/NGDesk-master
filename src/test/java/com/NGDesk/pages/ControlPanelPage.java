package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class ControlPanelPage {

	public ControlPanelPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="(//div[@class='col-12 col-sm-12'])[1]")
	public WebElement controlPanelText;
	
	@FindBy(partialLinkText="Public")
	public WebElement publicButton;
	
	@FindBy(id="messageAreaExternal")
	public WebElement publicTextBox;
	
	@FindBy(partialLinkText="Submit")
	public WebElement submit;
	
	@FindBy(xpath="//span[contains(@class,'ng-binding btn btn-sm btn-light pointer')]")
	public WebElement statusButton;
	
	@FindBy(xpath="//span[contains(@class,'ng-binding btn btn-primary btn-sm pointer')]")
	public WebElement severityButton;
	
	@FindBy(xpath="//div[contains(@class,'ng-isolate-scope')]//button[contains(@class,'btn btn-primary ng-binding')]")
	public WebElement createTagButton;
	
	@FindBy(xpath="//input[contains(@placeholder,\"CC'd Emails\")]")
	public WebElement ccEmail;
	
	@FindBy(xpath="//input[contains(@placeholder,\"CC'd Users\")]")
	public WebElement ccUser;
	
	
}
