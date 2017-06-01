package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleGoogleTest {

	private WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\eclipse_neon\\aqa_simple\\selenium_standalone_binaries\\windows\\googlechrome\\64bit\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com.ua");
	}

	@Test
	public void testGoogleSearch() {
		WebElement searchInput = driver.findElement(By.name("q"));
		searchInput.sendKeys("Selenium WebDriver");

		WebElement searchButton = driver.findElement(By.name("btnG"));
		searchButton.click();

		waitFor(1);

		List<WebElement> results = driver.findElements(By.cssSelector(".g"));

		int expectedNumberOfResults = 10;
		int actualNumberOfResults = results.size();

		Assert.assertEquals(actualNumberOfResults, expectedNumberOfResults,
				"Number of expected and actual results found is not the same.");
	}

	@Test
	public void testFirstResultContainsSearchKeyword() {
		String searchKeyword = "Java";
		WebElement searchInput = driver.findElement(By.name("q"));
		searchInput.sendKeys(searchKeyword);
		waitFor(1);
		WebElement searchButton = driver.findElement(By.name("btnG"));
		searchButton.click();
		waitFor(2);

		WebElement firstResultTitle = driver.findElement(By.cssSelector(".g .rc .r"));
		String actualTitle = firstResultTitle.getText();

		Assert.assertTrue(actualTitle.contains(searchKeyword),
				"First title <" + actualTitle + "> should contain search word " + searchKeyword);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		if (driver != null)
			driver.quit();
		driver = null;
	}

	private void waitFor(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			// Nothing to do here
		}
	}

}
