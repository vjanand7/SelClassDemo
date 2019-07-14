package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.Annotations;

public class CreateLead extends Annotations {
	
	//Test comments
	
	public CreateLead typeCompanyName(String data) {
				
		//driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		WebElement elecName = locateElement("ID", "createLeadForm_companyName");
		clearAndType(elecName, data); 
		return this;
	}
	
	public CreateLead typeFirstName(String data) {
		//driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		WebElement elefName = locateElement("id", "createLeadForm_firstName");
		clearAndType(elefName, data);
		return this;
	}
	
	public CreateLead typeLastName(String data) {
		//driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		WebElement elelName = locateElement("id", "createLeadForm_lastName");
		clearAndType(elelName, data);
		return this;
	}
	
	public ViewLeadsPage clickCreateLeadButton() {
		//driver.findElementByClassName("smallSubmit").click();
		WebElement eleSubmit = locateElement("class", "smallSubmit");
		click(eleSubmit);
		return new ViewLeadsPage();
	}
}
