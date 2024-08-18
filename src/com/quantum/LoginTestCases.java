package com.quantum;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCases {
	 private WebDriver driver;
	    private String baseUrl = "https://cannatrader-frontend.vercel.app/home";
		
		 @BeforeClass
		  //TEST CASE NO 1
		  		public void setUp() {
 			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAURABH\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.get(baseUrl);
		  			  driver.manage().window().maximize();
		  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	  			
		  }
		@AfterClass
		public void teardown() {
			  driver.close();
		}
		@Test (priority= 1)
	    public void testHomeLinkIsDisplayed() throws InterruptedException {
	        WebElement homeLink = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[1]/img"));
	        Assert.assertTrue(homeLink.isDisplayed());
	        Thread.sleep(3000);
	
	    }
		@Test (priority= 2)
		    public void testSignupLinkIsDisplayed() throws InterruptedException {
		        WebElement signupLink = driver.findElement(By.linkText("Sign up"));
		        Thread.sleep(3000);
		        Assert.assertTrue(signupLink.isDisplayed());
		        Thread.sleep(3000);
	
		    }

		    @Test(priority= 3)
		    public void testLoginLinkNavigatesToLoginPage() throws InterruptedException {
		        WebElement loginLink = driver.findElement(By.linkText("Log in"));
		        Thread.sleep(3000);
		        loginLink.click();
		        Thread.sleep(3000);
		        Assert.assertEquals("https://cannatrader-frontend.vercel.app/login", driver.getCurrentUrl());
		        Thread.sleep(3000);

		    }

		    @Test(priority= 4)
		    public void testSignupLinkNavigatesToSignupPage() throws InterruptedException {
		        WebElement signupLink = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[2]"));
		        Thread.sleep(3000);
		        signupLink.click();
		        Thread.sleep(3000);
		        Assert.assertEquals("https://cannatrader-frontend.vercel.app/signup", driver.getCurrentUrl());
		        Thread.sleep(3000);
	
		    }
		    @Test(priority= 5)
		    public void testPageTitle() throws InterruptedException {
		        String expectedTitle = "Cannatrader";
		        Thread.sleep(3000);
		        String actualTitle = driver.getTitle();
		        Thread.sleep(3000);
		        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
		        Thread.sleep(3000);
		    }

		    @Test(priority= 6)
		    public void testEmailFieldPresence() {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		        WebElement emailField = driver.findElement(By.id("email"));
		        Assert.assertTrue(emailField.isDisplayed(), "Email field is not displayed!");
		    }

		    @Test(priority= 7)
		    public void testPasswordFieldPresence() {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		        Assert.assertTrue(passwordField.isDisplayed(), "Password field is not displayed!");
		    }


		    @Test(priority= 8)
		    public void testForgotPasswordLink() {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		        WebElement forgotPasswordLink = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[3]/a"));
		        Assert.assertTrue(forgotPasswordLink.isDisplayed(), "Forgot Password link is displayed!");
		    }

		    @Test(priority= 9)
		    public void testSignUpLink() {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		        WebElement signUpLink = driver.findElement(By.linkText("Sign Up"));
		        Assert.assertTrue(signUpLink.isDisplayed(), "Sign Up link is not displayed!");
		     
		    }

		    @Test(priority= 10)
		    public void testEmailFieldAcceptsInput() throws InterruptedException {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		        WebElement emailField = driver.findElement(By.id("email"));
		        emailField.sendKeys("test@example.com");
		        Thread.sleep(3000);
		        Assert.assertEquals(emailField.getAttribute("value"), "test@example.com", "Email input is not accepted!");
		        Thread.sleep(3000);
		    }

		    @Test(priority= 11)
		    public void testPasswordFieldAcceptsInput() throws InterruptedException {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		        passwordField.sendKeys("password123");
		        Thread.sleep(3000);
		        Assert.assertEquals(passwordField.getAttribute("value"), "password123", "Password input is not accepted!");
		        Thread.sleep(3000);
		    }
		    @Test(priority= 12)
		    public void testEmailFieldPlaceholder() {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		        WebElement emailField = driver.findElement(By.id("email"));
		        String placeholder = emailField.getAttribute("placeholder");
		        assertTrue(placeholder.equals("Enter your email address"), "Email placeholder does not match");
		    }

		    @Test(priority= 13)
		    public void testPasswordFieldPlaceholder() {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
		        String placeholder = passwordField.getAttribute("placeholder");
		        assertTrue(placeholder.equals("Enter your password"), "Password placeholder does not match");
		        
}
		    @Test(priority= 14)
		    public void SuccessfulLogin() throws InterruptedException {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
		        emailField.sendKeys("k.patil6174@gmail.com");
		        Thread.sleep(3000);
		        passwordField.sendKeys("Komalpat@8");
		        Thread.sleep(3000);
		    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
		    	 SigninTab.click();
		    	 Thread.sleep(3000);
		    	 WebElement Homepageafterlogin = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[2]/img"));
		    	 Homepageafterlogin.isDisplayed();
		     	 Thread.sleep(3000);
		    }	
		    @Test(priority= 14)
		    public void SuccessfulLoginn() throws InterruptedException {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
		        emailField.sendKeys("k.patil6174@gmail.com");
		        Thread.sleep(3000);
		        passwordField.sendKeys("Komalpat@8");
		        Thread.sleep(3000);
		    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
		    	 SigninTab.click();
		    	 Thread.sleep(3000);
		    	 WebElement Homepageafterlogin = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[2]/img"));
		    	 Homepageafterlogin.isDisplayed();
		     	 Thread.sleep(3000);
		    }	        
		    @Test(priority= 14)
		    public void SuccessfulLoginbn() throws InterruptedException {
		    	WebElement SignInPage = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[1]"));
		    	SignInPage.click();
		    	 WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div[2]/span/p-password/div/input"));
		        emailField.sendKeys("k.patil6174@gmail.com");
		        Thread.sleep(3000);
		        passwordField.sendKeys("Komalpat@8");
		        Thread.sleep(3000);
		    	 WebElement SigninTab = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button"));
		    	 SigninTab.click();
		    	 Thread.sleep(3000);
		    	 WebElement Homepageafterlogin = driver.findElement(By.xpath("/html/body/app-root/app-header/div[1]/header/div[3]/a[2]/img"));
		    	 Homepageafterlogin.isDisplayed();
		     	 Thread.sleep(3000);
}