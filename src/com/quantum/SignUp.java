package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
}
