package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver, ldriver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "uid")
	private WebElement userId;
	
	@FindBy(how = How.ID_OR_NAME, using = "password")
	private WebElement password;
	
	@FindBy(how = How.ID_OR_NAME, using = "btnLogin")
	private WebElement login;
	
	
	public void sendUserName(String username) 
	{
		userId.sendKeys(username);
	}
	public void sendPassword(String password) 
	{
		this.password.sendKeys(password);
	}
	public void login() 
	{
		login.click();
	}
}
