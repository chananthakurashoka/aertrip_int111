package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		
		LoginPage lp = new LoginPage(driver);
		lp.sendUserName(username);
		lp.sendPassword(password);
		lp.login();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			System.out.println("Login Sucessfull");
			Assert.assertTrue(true);
		}
		else 
		{
		System.out.println("Login not Sucessfull");	
		Assert.assertTrue(false);
		}
	}
	
}
