package com.locate;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {
	WebDriver driver;

	public SelectProduct(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="twotabsearchtextbox")
	private WebElement enterTextToSearch;
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal'][1]")
    private WebElement ClickonMobile;
	@FindBy(id="nav-search-submit-button")
	private WebElement clickSearchbutton;
	@FindBy(id="add-to-cart-button")
	private WebElement clickaddtocart;
	@FindBy(xpath="//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")
	private WebElement clicktocheckout;
	@FindBy(xpath="//*[@id=\"address-book-entry-1\"]/div[2]")
	private WebElement clickdeliverto;
	@FindBy(xpath="//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]/span/input")
	private WebElement clickcontinue;
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div[8]/div/div[2]/div[2]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span")
	private WebElement clicdelete;

	public WebElement getClicdelete() {
		return clicdelete;
	}
	public WebElement getClickcontinue() {
		return clickcontinue;
	}
	public WebElement getClickdeliverto() {
		return clickdeliverto;
	}
	public WebElement getClicktocheckout() {
		return clicktocheckout;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getClickaddtocart() {
		return clickaddtocart;
	}
	public WebElement getClickSearchbutton() {
		return clickSearchbutton;
	}
	public void setClickSearchbutton(WebElement clickSearchbutton) {
		this.clickSearchbutton = clickSearchbutton;
	}
	public WebElement getEnterTextToSearch() {
		return enterTextToSearch;
	}
	public WebElement getClickonMobile() {
		return ClickonMobile;
	}
}
