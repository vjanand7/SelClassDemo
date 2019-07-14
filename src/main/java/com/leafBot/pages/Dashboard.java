package com.leafBot.pages;

import org.openqa.selenium.WebElement;


import com.leafBot.testng.api.base.Annotations;

public class Dashboard extends Annotations {
	
	
	
	public MyHome clickCRMSFA() {
		WebElement eleCRMSFA = locateElement("link", "CRM/SFA");
		click(eleCRMSFA);
		return new MyHome();
	}

}
