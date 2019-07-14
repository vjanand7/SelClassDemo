package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.leafBot.testng.api.base.Annotations;


public class ViewLeadsPage extends Annotations{
	
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	WebElement elefirstName;
	
	public ViewLeadsPage verifyFirstName() {
		String text = driver.findElementById("viewLead_firstName_sp")
		.getText();
		if(text.equals("Sethu")) {
			System.out.println("First name matches with input data");
		}else {
			System.err.println("First name not matches with input data");
		}
		return this;
	}

}
