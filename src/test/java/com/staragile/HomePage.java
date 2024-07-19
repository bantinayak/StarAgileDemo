package com.staragile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Utility.Utility;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	private By link = By.linkText("Sign In");

	public String getAppURL() {
		return driver.getCurrentUrl();
	}

	public String getStatusOfLink() {
		driver.findElement(link).click();
		
		return driver.getCurrentUrl();
	}

	public String getAppTitle() {

		return driver.getTitle();

	}

}
