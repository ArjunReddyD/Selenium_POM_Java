package com.qa.test.login;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestLogin {

	private WebDriver driver;
	ChromeOptions chromeOptions = new ChromeOptions();
	
	@BeforeSuite
	public void setup() {
		
	    chromeOptions.addArguments("--headless");
	    driver = new ChromeDriver(chromeOptions);
	}

	@Test(enabled = true)
	public void one() {
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
		driver.quit();
	}

	@AfterSuite
    public void quitDriver() throws Exception {
        driver.quit();
    }
}
