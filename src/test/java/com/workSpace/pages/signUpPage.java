package com.workSpace.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUpPage {
	WebDriver driver;

	@FindBy(xpath = "//h2[@class='TyPAtf']")
	WebElement singUpPageTitle;

	public signUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void singUpPageTitleIsdisplay() {
		try {
			String actualText = singUpPageTitle.getText();

			// Define the expected text
			String expectedText = "Let's get started";

			// Verify that the actual text matches the expected text
			if (actualText.equals(expectedText)) {
				System.out.println("Text is as expected: " + actualText);
			} else {
				System.out.println("Text is not as expected. Actual: " + actualText + ", Expected: " + expectedText);
			}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}

}
