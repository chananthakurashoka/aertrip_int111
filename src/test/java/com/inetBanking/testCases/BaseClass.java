package com.inetBanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseUrl = "http://demo.guru99.com/v4/index.php";
	public String username="mngr249972";
	public String password="zAbApUm";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String windowName = driver.getWindowHandle();
		driver.switchTo().frame(0).close();
		driver.switchTo().window(windowName);
	}
	
	/*@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	*/
}
