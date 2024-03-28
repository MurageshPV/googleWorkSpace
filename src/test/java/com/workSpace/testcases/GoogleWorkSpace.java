package com.workSpace.testcases;



import org.junit.Test;

import com.workSpace.pages.BaseTest;
import com.workSpace.pages.WorkSpaceHomePage;
import com.workSpace.pages.signUpPage;

public class GoogleWorkSpace extends BaseTest {
	WorkSpaceHomePage hp = new WorkSpaceHomePage(driver);
	signUpPage singUp = new signUpPage(driver);

	@Test
	public void verifyFreeTrailBtn() throws InterruptedException {
		hp.freeTrailisDisplay();
		hp.clickOnFreeTrailBtn();
		Thread.sleep(3000);
		singUp.singUpPageTitleIsdisplay();
	}

	public void verifyGoogleLogo() {
		hp.googleLogoIsDispaly();
	}

//	@Ignore
//	@Test
//	public void verifyContactSale() throws InterruptedException {
//		hp.contactSale().isDisplayed();
//		clickngOnWebElement(hp.contactSale(),2);
//		Thread.sleep(1000);
//		String currentUrl = driver.getCurrentUrl();
//
//		String expectedUrl = "https://workspace.google.com/intl/en_in/contact/?source=gafb-home-globalnav-en-IN";
//
//		if (currentUrl.equals(expectedUrl)) {
//			System.out.println("Successfully navigated to the expected page: " + currentUrl);
//		} else {
//			System.out.println("Failed to navigate to the expected page. Current URL: " + currentUrl);
//		}
//
//	}
//
//	
//	@Test
//	public void verifyAdminBtnIsdispaly() throws InterruptedException {
//		hp.adminConsole().isDisplayed();
//		String excpectedText = "Admin console";
//		Assert.assertEquals(hp.adminConsole().getText(), excpectedText);
//		clickngOnWebElement(hp.adminConsole(),2);
//		Thread.sleep(5000);
//	}
//	@Ignore
//	@Test
//	public void verifyAdminCosoleLandingPage() throws InterruptedException {
//		hp.adminConsole().click();
//		Thread.sleep(5000);
//		Set<String> windowHandles = driver.getWindowHandles();
//
//		// Iterate over each window handle and switch to it
//		for (String handle : windowHandles) {
//			driver.switchTo().window(handle);
//			// Perform actions on the new window if needed
//			// For example, get its title
//			String title = driver.getTitle();
//			System.out.println("Title of the window: " + title);
//
//		}
//	}

}
