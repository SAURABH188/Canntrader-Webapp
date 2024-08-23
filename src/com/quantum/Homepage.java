package com.quantum;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepage {
	 private WebDriver driver;
	    private String baseUrl = "https://cannatrader-frontend.vercel.app/home";
		
	
		@BeforeMethod
		  //TEST CASE NO 1
		  		public void setUp() throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAURABH\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.get(baseUrl);
		  			  driver.manage().window().maximize();
		  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  		
		  }
	    @AfterMethod
		public void teardown() {
			  driver.close();
		}
		@Test(alwaysRun = true)
	    public void HomepageVisibility() throws InterruptedException {
	    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
	    	SignInPage.click();
	    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
	        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
	       
	        passwordField.sendKeys("Saurabh@7");
	  
	    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
	    	 SigninTab.click();
	    
}
		@Test(alwaysRun = true)
		    public void testHomeLink() throws InterruptedException {
			 WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
		        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
		       
		        passwordField.sendKeys("Saurabh@7");
		      
		    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
		    	 SigninTab.click();
		    	 
		        WebElement homeLink = driver.findElement(By.linkText("Home"));
		        homeLink.isDisplayed();
		    }

		@Test(alwaysRun = true)
		    public void testAddProductsLink() throws InterruptedException {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
		        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
		        Thread.sleep(3000);
		        passwordField.sendKeys("Saurabh@7");
		        Thread.sleep(3000);
		    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
		    	 SigninTab.click();
		    	   Thread.sleep(3000);
		        WebElement addProductsLink = driver.findElement(By.linkText("Add Products"));
		        addProductsLink.isDisplayed();
		    }

		@Test(alwaysRun = true)
		    public void testWishListLink() throws InterruptedException {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
		        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
		        Thread.sleep(3000);
		        passwordField.sendKeys("Saurabh@7");
		        Thread.sleep(3000);
		    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
		    	 SigninTab.click();
		    	   Thread.sleep(3000);
		        WebElement wishListLink = driver.findElement(By.linkText("Wish List"));
		        wishListLink.isDisplayed();
		        
		    }

		@Test(alwaysRun = true)
		    public void testContactLink() throws InterruptedException {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
		        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
		        Thread.sleep(3000);
		        passwordField.sendKeys("Saurabh@7");
		        Thread.sleep(3000);
		    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
		    	 SigninTab.click();
		    	   Thread.sleep(3000);
		        WebElement contactLink = driver.findElement(By.linkText("Contact"));
		        contactLink.isDisplayed();

		    }

		@Test(alwaysRun = true)
		    public void testActiveLinkStyle() throws InterruptedException {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
		        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
		        Thread.sleep(3000);
		        passwordField.sendKeys("Saurabh@7");
		        Thread.sleep(3000);
		    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
		    	 SigninTab.click();
		    	   Thread.sleep(3000);
		        WebElement homeLink = driver.findElement(By.linkText("Home"));
		        homeLink.click();
		        AssertJUnit.assertTrue(homeLink.getAttribute("class").contains("active-link"));
		        Thread.sleep(3000);
		        WebElement addProductsLink = driver.findElement(By.linkText("Add Products"));
		        addProductsLink.click();
		        AssertJUnit.assertTrue(addProductsLink.getAttribute("class").contains("active-link"));
		        Thread.sleep(3000);
		        WebElement wishListLink = driver.findElement(By.linkText("Wish List"));
		        wishListLink.click();
		        AssertJUnit.assertTrue(wishListLink.getAttribute("class").contains("active-link"));
		        Thread.sleep(3000);
		        WebElement contactLink = driver.findElement(By.linkText("Contact"));
		        contactLink.click();
		        AssertJUnit.assertTrue(contactLink.getAttribute("class").contains("active-link"));
		       
		    }

		@Test(alwaysRun = true)
	    public void testProfileIconIsDisplayed() throws InterruptedException {
		 	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
	    	SignInPage.click();
	    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
	        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
	        Thread.sleep(3000);
	        passwordField.sendKeys("Saurabh@7");
	        Thread.sleep(3000);
	    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
	    	 SigninTab.click();
	    	   Thread.sleep(3000);
	        WebElement profileIcon = driver.findElement(By.cssSelector(".icon-profile-container"));
	        Thread.sleep(10000);
	        AssertJUnit.assertTrue(profileIcon.isDisplayed());
	 
	    }

		@Test(alwaysRun = true)
	    public void testNotificationCountIsDisplayed() throws InterruptedException {
		 	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
	    	SignInPage.click();
	    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
	        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
	        Thread.sleep(3000);
	        passwordField.sendKeys("Saurabh@7");
	        Thread.sleep(3000);
	    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
	    	 SigninTab.click();
	    	 Thread.sleep(3000);
	        WebElement notificationCount = driver.findElement(By.cssSelector(".notification-count"));
	        Thread.sleep(10000);
	        AssertJUnit.assertTrue(notificationCount.isDisplayed());
	        Thread.sleep(10000);
	        AssertJUnit.assertEquals("3", notificationCount.getText());
	    }

		@Test(alwaysRun = true)
	    public void testChatLinkIsDisplayed() throws InterruptedException {
		 	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
	    	SignInPage.click();
	    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
	        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
	        Thread.sleep(10000);
	        passwordField.sendKeys("Saurabh@7");
	        Thread.sleep(10000);
	    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
	    	 SigninTab.click();
		        Thread.sleep(10000);
	        WebElement chatLink = driver.findElement(By.cssSelector("a[href='/products/chats']"));
	        Thread.sleep(10000);
	        AssertJUnit.assertTrue(chatLink.isDisplayed());

	    }

		@Test(alwaysRun = true)
	    public void testProfileLinkIsDisplayed() throws InterruptedException {
		 	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
	    	SignInPage.click();
	    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
	        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
	        Thread.sleep(3000);
	        passwordField.sendKeys("Saurabh@7");
	        Thread.sleep(3000);
	    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
	    	 SigninTab.click();
		        Thread.sleep(3000);
	        WebElement profileLink = driver.findElement(By.cssSelector("a[href='/profile/profile-details']"));
	        Thread.sleep(10000);

	        AssertJUnit.assertTrue(profileLink.isDisplayed());


	    }

		@Test(alwaysRun = true)
	    public void testChatLinkRedirects() throws InterruptedException {
		 	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
	    	SignInPage.click();
	    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
	        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
	        Thread.sleep(3000);
	        passwordField.sendKeys("Saurabh@7");
	        Thread.sleep(3000);
	    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
	    	 SigninTab.click();
		        Thread.sleep(3000);
	        WebElement chatLink = driver.findElement(By.cssSelector("a[href='/products/chats']"));
	        Thread.sleep(10000);
	        chatLink.click();
	        Thread.sleep(10000);
	        AssertJUnit.assertEquals("https://cannatrader-frontend.vercel.app/products/chats", driver.getCurrentUrl());


	    }

		@Test(alwaysRun = true)
	    public void testProfileLinkRedirects() throws InterruptedException {
		 	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
	    	SignInPage.click();
	    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
	        emailField.sendKeys("saurabh187.quantumitinnovation@gmail.com\r\n");
               Thread.sleep(3000);
	        passwordField.sendKeys("Saurabh@7");
	        Thread.sleep(3000);
	    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
	    	 SigninTab.click();
	         Thread.sleep(3000);
	        WebElement profileLink = driver.findElement(By.cssSelector("a[href='/profile/profile-details']"));
	        Thread.sleep(10000);
	        profileLink.click();
	        Thread.sleep(10000);
	        AssertJUnit.assertEquals("https://cannatrader-frontend.vercel.app/profile/profile-details", driver.getCurrentUrl());

	    }

}