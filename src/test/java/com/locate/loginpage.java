package com.locate;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
 WebDriver driver;

public loginpage(WebDriver driver) {
	this.driver = driver;
PageFactory.initElements(driver, this);
}

@CacheLookup
@FindBy(id="nav-link-accountList")
private WebElement siginclick;
@FindBy(id="ap_email")
private WebElement Entermobilno;
@FindBy(id="continue")
private WebElement clickcontinue;
@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
private WebElement clicksignin;
@FindBy(id="ap_password")
private WebElement enterpasswrd;
@FindBy(id="auth-signin-button")
private WebElement clicksubmit;

public WebDriver getDriver() {
	return driver;
}
public void setClicksubmit(WebElement clicksubmit) {
	this.clicksubmit = clicksubmit;
}
public WebElement getSiginclick() {
	return siginclick;
}
public WebElement getClicksignin() {
	return clicksignin;
}

public WebElement getEntermobilno() {
	return Entermobilno;
}

public WebElement getClickcontinue() {
	return clickcontinue;
}

public WebElement getEnterpasswrd() {
	return enterpasswrd;
}

public WebElement getClicksubmit() {
	return clicksubmit;
}


}
