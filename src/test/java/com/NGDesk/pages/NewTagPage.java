package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.Driver;

public class NewTagPage extends TestBase{
	
		public NewTagPage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		
	    @FindBy(id="tagName")
	    public WebElement tagName;	
		
		@FindBy(xpath="//li[contains(@class,'nav-item reply-item message-focus')]//a[contains(@class,'nav-link message-type-item')][contains(text(),'Details')]")
	    public WebElement detailsButton;
		
		@FindBy(xpath="//input[contains(@placeholder,'Select Team')]")
		public WebElement selectTeam;
		
		
		@FindBy(xpath="//div[contains(@class,'option ui-select-choices-row-inner')]")
		public WebElement selectTeamOption;
		
		@FindBy(xpath="//button[contains(@type,'Submit')]")
		public WebElement saveTagButton;
		
		
}
