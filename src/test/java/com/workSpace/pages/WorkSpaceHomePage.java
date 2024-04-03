package com.workSpace.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkSpaceHomePage extends BaseTest {
	WebDriver driver;
//
	@FindBy(xpath = "(//span[contains(text(),'Start Free Trial')])[2]")
	WebElement freeTrail;
	@FindBy(linkText = "Contact sales")
	WebElement contact_sale;
	@FindBy(xpath = "//span[contains(text(),'Admin console')]")
	WebElement adminConsole;
	@FindBy(xpath = "//div[@class='asset link__image']//*[name()='svg']")
	WebElement googleLogo;

	public WorkSpaceHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void freeTrailisDisplay() {
		
		String actualText = freeTrail.getText();

		// Define the expected text
		String expectedText = "Start Free Trial";

		// Verify that the actual text matches the expected text
		if (actualText.equals(expectedText)) {
			System.out.println("Text is as expected: " + actualText);
		} else {
			System.out.println("Text is not as expected. Actual: " + actualText + ", Expected: " + expectedText);
		}
	}

	public void clickOnFreeTrailBtn() {
		clickngOnWebElement(freeTrail, 5);
	}

	public void googleLogoIsDispaly() {
	
	}

}
