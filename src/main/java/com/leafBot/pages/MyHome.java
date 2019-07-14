package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.leafBot.testng.api.base.Annotations;

public class MyHome extends Annotations {
	@FindBy(how=How.LINK_TEXT, using="Create Lead")
	WebElement eleCreateLead;
	
	public CreateLead clickCreateLeadButton() {
		click(eleCreateLead);
		return new CreateLead();
	}

}
