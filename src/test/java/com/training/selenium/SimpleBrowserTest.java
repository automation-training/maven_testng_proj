package com.training.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class SimpleBrowserTest {

	@Test
	public void testOpneingExampleHtml() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\eclipse_neon\\aqa_simple\\selenium_standalone_binaries\\windows\\googlechrome\\64bit\\chromedriver.exe");
		WebDriver driver = new IOSDriver<>(null);

		driver.get("file:///E:/courses/Vitaliy/html/example.html");
		// driver.navigate().to("https://www.google.com");
		// WebElement clickMeButton = driver.findElement(By.id("cool_button"));
		WebElement clickMeButton = driver.findElement(By.xpath("//button[1]"));

		clickMeButton.click();
		waitFor(2);

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		Assert.assertEquals(alertText, "Hello world", "Incorrect message on alert");

		alert.accept();
		waitFor(2);

		driver.close();
	}

	/**
	 * Sleeps for a few {@code seconds}
	 * 
	 * @param seconds
	 */
	private void waitFor(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			// Nothing to do here
		}
	}
}
