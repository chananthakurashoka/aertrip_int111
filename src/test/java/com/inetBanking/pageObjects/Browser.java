package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static String browser;
	
public static void launch_browser()
{
	if(browser.equalsIgnoreCase("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}
	if(browser.equalsIgnoreCase("Firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
	}
	if(browser.equalsIgnoreCase("Firefox"))
	{
		WebDriverManager.iedriver();
		WebDriver driver = new InternetExplorerDriver();
	}
}
}
