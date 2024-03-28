package com.workSpace.utitlity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public static WebDriver startApplication(WebDriver driver, String browserName, String appurl) {

		if (browserName.equals("Chrome")) {
			System.setProperty("webDriver.chrome.driver", "/Driver/Drivers/chromedriver.exe");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			System.setProperty("webDriver.chrome.driver", "/Driver/Drivers/chromedriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("InternetExplore")) {
			System.setProperty("webDriver.chrome.driver", "/Driver/Drivers/chromedriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("We do not support this browser");
		}

		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

}
