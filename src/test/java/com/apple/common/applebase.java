package com.apple.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class applebase {
	
	public WebDriver driver;
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				driver.get("https://secure2.store.apple.com/shop/sign_in?c=aHR0cHM6Ly93d3cuYXBwbGUuY29tL2lwaG9uZS1zZS98MWFvczA0ZjY1YjhlZDc5NzI5OGI5YTk2ZjliMTc3MDEzMjI5ZjY4ZWEzOTk&r=SCDHYHP7CY4H9XK2H&s=aHR0cHM6Ly93d3cuYXBwbGUuY29tL2lwaG9uZS1zZS98MWFvczA0ZjY1YjhlZDc5NzI5OGI5YTk2ZjliMTc3MDEzMjI5ZjY4ZWEzOTk");
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
		
		
		public void closeAllBrowsers() {
		driver.close();
		
	}

}
