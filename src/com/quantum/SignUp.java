package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.Properties;

public class SignUp {
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
		@Test(alwaysRun = true)
	    public void Signup() throws InterruptedException {
		      WebElement SignupLink = driver.findElement(By.linkText("Sign up"));
		        Thread.sleep(3000);
		        SignupLink.click();
		        Thread.sleep(3000);
	        WebElement Signuppage = driver.findElement(By.cssSelector("h2[class='font-semibold mb-4 text-center font-custom text-secondary text-3xl sm:text-[40px] font-Poppins leading-12']"));
	        Assert.assertTrue(Signuppage.isDisplayed());
	    }
		@Test(alwaysRun = true)
	    public void testSignUpPageTitle() throws InterruptedException {
			  WebElement SignupLink = driver.findElement(By.linkText("Sign up"));
		        Thread.sleep(3000);
		        SignupLink.click();
		        Thread.sleep(3000);
			@SuppressWarnings("unused")
			WebDriverWait wait = new WebDriverWait(driver, 10);
	        String pageTitle = driver.getTitle();
	        Thread.sleep(3000);
	        Assert.assertEquals(pageTitle, "Cannatrader");
	        Thread.sleep(3000);
	    }

	    @Test(alwaysRun = true)
	    public void testNameFieldRequired() throws InterruptedException {
	    	  WebElement SignupLink = driver.findElement(By.linkText("Sign up"));
		        Thread.sleep(3000);
		        SignupLink.click();
		        Thread.sleep(3000);
	        WebElement signUpButton = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
	        signUpButton.click();
	        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Name is required.')]"));
	        Assert.assertTrue(errorMessage.isDisplayed());
	    }

	    @Test(alwaysRun = true)
	    public void testEmailFieldRequired() throws InterruptedException {
	    	  WebElement SignupLink = driver.findElement(By.linkText("Sign up"));
		        Thread.sleep(3000);
		        SignupLink.click();
		        Thread.sleep(3000);
	        WebElement nameField = driver.findElement(By.id("name"));
	        nameField.sendKeys("Test User");
	        WebElement signUpButton = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
	        signUpButton.click();
	        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Email is required.')]"));
	        Assert.assertTrue(errorMessage.isDisplayed());
	    }

	    @Test(alwaysRun = true)
	    public void testPhoneNumberFieldRequired() throws InterruptedException {
	    	  WebElement SignupLink = driver.findElement(By.linkText("Sign up"));
		        Thread.sleep(3000);
		        SignupLink.click();
		        Thread.sleep(3000);
	        WebElement nameField = driver.findElement(By.id("name"));
	        nameField.sendKeys("Test User");
	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys("test@example.com");
	        WebElement signUpButton = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
	        signUpButton.click();
	        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Phone Number is required.')]"));
	        Assert.assertTrue(errorMessage.isDisplayed());
	    }

	    @Test(alwaysRun = true)
	    public void testPasswordFieldRequired() throws InterruptedException {
	    	  WebElement SignupLink = driver.findElement(By.linkText("Sign up"));
		        Thread.sleep(3000);
		        SignupLink.click();
		        Thread.sleep(3000);
	        WebElement nameField = driver.findElement(By.id("name"));
	        nameField.sendKeys("Test User");
	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys("test@example.com");
	        WebElement phoneField = driver.findElement(By.id("phone"));
	        phoneField.sendKeys("1234567890");
	        WebElement signUpButton = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
	        signUpButton.click();
	        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Password is required.')]"));
	        Assert.assertTrue(errorMessage.isDisplayed());
	    }

	    @Test(alwaysRun = true)
	    public void testConfirmPasswordFieldRequired() throws InterruptedException {
	    	  WebElement SignupLink = driver.findElement(By.linkText("Sign up"));
		        Thread.sleep(3000);
		        SignupLink.click();
		        Thread.sleep(3000);
	        WebElement nameField = driver.findElement(By.id("name"));
	        nameField.sendKeys("Test User");
	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys("test@example.com");
	        WebElement phoneField = driver.findElement(By.id("phone"));
	        phoneField.sendKeys("1234567890");
	        WebElement passwordField = driver.findElement(By.id("password"));
	        passwordField.sendKeys("Password123");
	        WebElement signUpButton = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
	        signUpButton.click();
	        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Confirm Password is required.')]"));
	        Assert.assertTrue(errorMessage.isDisplayed());
	    }

	    @Test(alwaysRun = true)
	    public void testSuccessfulSignUp() throws InterruptedException {
	    	  WebElement SignupLink = driver.findElement(By.linkText("Sign up"));
		        Thread.sleep(3000);
		        SignupLink.click();
		        Thread.sleep(3000);
	        WebElement nameField = driver.findElement(By.id("name"));
	        nameField.sendKeys("Test User");
	        Thread.sleep(3000);

	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys("emailId");
	      
	        Thread.sleep(3000);
	        WebElement phoneField = driver.findElement(By.id("phone"));
	        phoneField.sendKeys("1234567890");
	        Thread.sleep(3000);
	        WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
	        passwordField.sendKeys("Password123");
	        Thread.sleep(3000);
	        WebElement confirmPasswordField = driver.findElement(By.cssSelector("input[placeholder='Enter your confirm password']"));
	        confirmPasswordField.sendKeys("Password123");
	        Thread.sleep(3000);
	        WebElement agreeCheckbox = driver.findElement(By.id("agree"));
	        if (agreeCheckbox.isSelected()) {
	        	agreeCheckbox.click();  // Select the checkbox
	        }

	        // Verify that the checkbox is selected
	        if (agreeCheckbox.isSelected()) {
	            System.out.println("Checkbox is selected!");
	        } else {
	            System.out.println("Checkbox is not selected.");
	        }
	        WebElement signUpButton = driver.findElement(By.cssSelector(".checkmark"));
	        Thread.sleep(3000);
	        signUpButton.click();
	        Thread.sleep(10000);
	        

	   
	    }

}
