package com.stepdef;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.locate.SelectProduct;
import com.locate.baseclass;
import com.locate.loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class stepdefinition  {
	WebDriver driver;
	loginpage Page;
	SelectProduct S;
	@Given("user is on amazon page")
	public void userIsOnAmazonPage() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		driver.get("https://www.amazon.in/your-account");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

@When("user click signin")
	public void userClickSignin() {
//	Page = new loginpage(driver);
//	Page.getClicksignin();
		WebElement d = driver.findElement(By.id("nav-link-accountList"));
    d.click();
	
	}
	@When("enter Mobile number and password")
	public void enterMobileNumberAndPassword() {
		Page = new loginpage(driver);
		Page.getEntermobilno().sendKeys("7373559947");
		Page.getClickcontinue().click();
		Page.getEnterpasswrd().sendKeys("Sudar@8760");
	}
	@Then("click login")
	public void clickLogin() {
//	driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();	
	}
//		@Then("user should validate the login page")
//	    public void userShouldValidateTheLoginPage() {
//	    String expectedText="Deliver to Sudarva...";
//	    String actualText= driver.findElement(By.xpath("nav-global-location-popover-link")).getText();
//      Assert.assertTrue("Login  successful",expectedText.equals(actualText));
//	    if (actualText.equals(expectedText)) {
//	    	  System.out.println("sucessfullyverified");
//		}
//	     }
	@When("User should search the Product")
	public void userShouldSearchTheProduct() {
		S = new SelectProduct(driver);
	S.getEnterTextToSearch().sendKeys("mobiles");
//		WebElement srchprdt = driver.findElement(By.id("twotabsearchtextbox"));
//		srchprdt.sendKeys("mobiles");
	S.getClickSearchbutton().click();
	}
	@When("user should select the product")
	public void userShouldSelectTheProduct() {
		S.getClickonMobile().click();
		
	}
	@Then("User should add the Product to cart")
	public void userShouldAddTheProductToCart() {
		String prtwindow = driver.getWindowHandle();
		System.out.println(prtwindow);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		for (String string : allwindow) {
			if(!prtwindow.equals(string)) {
				driver.switchTo().window(string);
			}
				}
		S.getClickaddtocart().click();
		S.getClicktocheckout().click();
	}
	
	@Then("User should validate the Product is succefully added to cart or Not")
	public void userShouldValidateTheProductIsSuccefullyAddedToCartOrNot() {
		 String expectedText="Select a delivery address";
		    String actualText= driver.findElement(By.xpath("//*[@id=\"addres-select\"]/h1")).getText();
	     // Assert.assertTrue("Login  successful",expectedText.equals(actualText));
		    if (actualText.equals(expectedText)) {
		    	  System.out.println("sucessfully Added to cart");
		    }
		   
	}

	@Then("user should enter the payment page")
		public void userShouldEnterThePaymentPage() {
	S.getClickdeliverto().click();
	driver.findElement(By.xpath("//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]/span/input")).click();
	System.out.println("hi");
//		S.getClickcontinue().click();
			}



		@Then("user validate user should be on the Payment Page")
		public void userValidateUserShouldBeOnThePaymentPage() {
			 String expectedText="Select a payment method";
			    String actualText= driver.findElement(By.xpath("//*[@id=\"checkoutDisplayPage\"]/div[1]/div[2]/div[1]/h1")).getText();
		     // Assert.assertTrue("Login  successful",expectedText.equals(actualText));
			    if (actualText.equals(expectedText)) {
			    	  System.out.println("User is sccessfully in Payment Page");
			    }
			   
		}
		@When("user should navigate to home page")
		public void userShouldNavigateToHomePage() {
			String prtwindow = driver.getWindowHandle();
			System.out.println(prtwindow);
			Set<String> allwindow = driver.getWindowHandles();
			System.out.println(allwindow);
			for (String string : allwindow) {
				if(!prtwindow.equals(string)) {
					driver.switchTo().window(string);
					driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
					
				}}}
				
		@When("goto cart and remove the product")
		public void gotoCartAndRemoveTheProduct() {
			System.out.println("Cart is Empty");
		S.getClicdelete().click();
//			WebElement deletebtn = driver.findElement(By.xpath("//input[@name='submit.delete.C7fcd88a4-a4ba-46e6-9f86-79d8b80ff6e4']"));
//			deletebtn.click();
			}
		@Then("validate the cart is empty")
		public void validateTheCartIsEmpty() {
			String expectedText="Your Amazon Cart is empty.";
		    String actualText= driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
		    if (actualText.equals(expectedText)) {
		    	  System.out.println("Cart is Empty");
		    
		}



		}}
