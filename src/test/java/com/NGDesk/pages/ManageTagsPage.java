package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.Driver;

public class ManageTagsPage extends TestBase{
	public ManageTagsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
		
	
	@FindBy(xpath="//button[contains(@class,'rule-ctl btn btn-primary float-right pointer ng-binding ng-isolate-scope')]")
	public WebElement newTagButton;
	
	
	

}
