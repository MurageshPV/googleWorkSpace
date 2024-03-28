package com.workSpace.pages;

import java.time.Duration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.workSpace.utitlity.BrowserFactory;
import com.workSpace.utitlity.ConfigDataProvider;

public class BaseTest {
	public static  WebDriver driver;
	public static ConfigDataProvider config = new ConfigDataProvider();

	@BeforeClass
	public static void setUp() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingUrl());
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

	public void clickngOnWebElement(WebElement element, long waitTimeInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
		WebElement elements = null;
		elements = wait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
	}
	
//	public void isDisplay(WebElement element, String expectedText) {
//
//		String actualText = element.getText();
//		String expectedText = null;
//
//		// Verify that the actual text matches the expected text
//		if (actualText.equals(expectedText)) {
//			System.out.println("Text is as expected: " + actualText);
//		} else {
//			System.out.println("Text is not as expected. Actual: " + actualText + ", Expected: " + expectedText);
//		}
//	}

}
