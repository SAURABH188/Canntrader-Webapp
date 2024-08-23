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

public class ForgotPassword {
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
    public void testForgotPasswordLinkIsDisplayed() throws InterruptedException {
	      WebElement loginLink = driver.findElement(By.linkText("Log in"));
	        Thread.sleep(3000);
	        loginLink.click();
	        Thread.sleep(3000);
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
        Assert.assertTrue(forgotPasswordLink.isDisplayed());
    }

	@Test (alwaysRun = true)
    public void testForgotPasswordLinkIsClickable() throws InterruptedException {
	      WebElement loginLink = driver.findElement(By.linkText("Log in"));
	        Thread.sleep(3000);
	        loginLink.click();
	        Thread.sleep(3000);
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
        Assert.assertTrue(forgotPasswordLink.isEnabled());
    }

	@Test (alwaysRun = true)
    public void testForgotPasswordLinkNavigatesToResetPasswordPage() throws InterruptedException {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        Thread.sleep(3000);
        loginLink.click();
        Thread.sleep(3000);
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
        forgotPasswordLink.click();
        String expectedUrl = "https://cannatrader-frontend.vercel.app/reset-password";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }

	@Test (alwaysRun = true)
    public void testForgotPasswordLinkHasCorrectText() throws InterruptedException {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        Thread.sleep(3000);
        loginLink.click();
        Thread.sleep(3000);
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
        String linkText = forgotPasswordLink.getText();
        Assert.assertEquals("Forgot Password?", linkText);
}
	@Test (alwaysRun = true)
    public void testPageTitle() throws InterruptedException {
	    WebElement loginLink = driver.findElement(By.linkText("Log in"));
        Thread.sleep(3000);
        loginLink.click();
	    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
	    Forgotpasstab.click();
	     Thread.sleep(3000);
        String expectedTitle = "Forgot Password";
        String actualTitle = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

	@Test (alwaysRun = true)
    public void testEmailLabel() throws InterruptedException {
    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
        Thread.sleep(3000);
        loginLink.click();
	    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
	    Forgotpasstab.click();
	     Thread.sleep(3000);
        String expectedLabel = "Email";
        String actualLabel = driver.findElement(By.xpath("//label[@for='email']")).getText();
        Assert.assertEquals(expectedLabel, actualLabel);
    }

	@Test (alwaysRun = true)
    public void testEmailPlaceholder() throws InterruptedException {
    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
        Thread.sleep(3000);
        loginLink.click();
	    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
	    Forgotpasstab.click();
	     Thread.sleep(3000);
        String expectedPlaceholder = "Enter your email address";
        String actualPlaceholder = driver.findElement(By.id("email")).getAttribute("placeholder");
        Assert.assertEquals(expectedPlaceholder, actualPlaceholder);
    }

	@Test (alwaysRun = true)
    public void testSendButtonDisabled() throws InterruptedException {
    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
        Thread.sleep(3000);
        loginLink.click();
	    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
	    Forgotpasstab.click();
	     Thread.sleep(3000);
        WebElement sendButton = driver.findElement(By.xpath("//button[@type='button']"));
        Assert.assertTrue(sendButton.isDisplayed());
        Assert.assertTrue(sendButton.isEnabled() == false);
    }

	@Test (alwaysRun = true)
    public void testVerificationMessage() throws InterruptedException {
    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
        Thread.sleep(3000);
        loginLink.click();
	    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
	    Forgotpasstab.click();
	     Thread.sleep(3000);
        String expectedMessage = "Please enter your email address to receive a verification code";
        String actualMessage = driver.findElement(By.xpath("//p[contains(text(), 'Please enter your email address')]")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

	@Test (alwaysRun = true)
    public void testFormIsPresent() throws InterruptedException {
    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
        Thread.sleep(3000);
        loginLink.click();
	    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
	    Forgotpasstab.click();
	     Thread.sleep(3000);
        WebElement form = driver.findElement(By.tagName("form"));
        Assert.assertNotNull(form);
    }
	@Test (alwaysRun = true)
	public void Invalidemail() throws InterruptedException {
    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
        Thread.sleep(3000);
        loginLink.click();
	    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
	    Forgotpasstab.click();
	     Thread.sleep(3000);
        WebElement email = driver.findElement(By.cssSelector("#email"));
	     Thread.sleep(3000);
        email.sendKeys("saurabhkumbhargmail.com");
        WebElement Sendtab = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
	     Thread.sleep(3000);
	     Sendtab.click();
	     // Verify that the alert message is displayed
	     @SuppressWarnings("unused")
		boolean isAlertDisplayed = driver.findElement(By.cssSelector("small[class='ng-star-inserted']")).isDisplayed();

	}
	@Test (alwaysRun = true)
	public void Validemail() throws InterruptedException {
    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
        Thread.sleep(3000);
        loginLink.click();
	    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
	    Forgotpasstab.click();
	     Thread.sleep(3000);
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("saurabhkumbhar187@gmail.com");
        WebElement Sendtab = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
	     Thread.sleep(3000);
	     Sendtab.click();
	     Thread.sleep(3000);
	     @SuppressWarnings("unused")
		boolean isEmailVerfiy = driver.findElement(By.cssSelector("p[class='text-center mb-6 text-[#fafafa]']")).isDisplayed();
	     Thread.sleep(3000);

	}
	@Test (alwaysRun = true)
	    public void testPageTitleoTP() throws InterruptedException {
			WebElement loginLink = driver.findElement(By.linkText("Log in"));
	        Thread.sleep(3000);
	        loginLink.click();
		    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
		    Forgotpasstab.click();
		     Thread.sleep(3000);
	        WebElement email = driver.findElement(By.cssSelector("#email"));
	        email.sendKeys("saurabhkumbhar187@gmail.com");
	        WebElement Sendtab = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
		     Thread.sleep(3000);
		     Sendtab.click();
		     Thread.sleep(3000);
	        String expectedTitle = "Forgot Password";
	        String actualTitle = driver.findElement(By.cssSelector("h2.text-2xl")).getText();
	        Assert.assertEquals(expectedTitle, actualTitle);
	    }

	@Test (alwaysRun = true)
	    public void testEmailDisplayed() throws InterruptedException {
	    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
	        Thread.sleep(3000);
	        loginLink.click();
		    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
		    Forgotpasstab.click();
		     Thread.sleep(3000);
	        WebElement email = driver.findElement(By.cssSelector("#email"));
	        email.sendKeys("saurabhkumbhar187@gmail.com");
	        WebElement Sendtab = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
		     Thread.sleep(3000);
		     Sendtab.click();
		     Thread.sleep(3000);
	        String expectedEmail = "saurabhkumbhar187@gmail.com";
	        String actualEmail = driver.findElement(By.cssSelector("span.text-secondary")).getText();
	        Assert.assertEquals(expectedEmail, actualEmail);
	    }

	@Test (alwaysRun = true)
	    public void testInputFieldsExist() throws InterruptedException {
	    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
	        Thread.sleep(3000);
	        loginLink.click();
		    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
		    Forgotpasstab.click();
		     Thread.sleep(3000);
	        WebElement email = driver.findElement(By.cssSelector("#email"));
	        email.sendKeys("saurabhkumbhar187@gmail.com");
	        WebElement Sendtab = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
		     Thread.sleep(3000);
		     Sendtab.click();
		     Thread.sleep(3000);
	        WebElement firstInput = driver.findElement(By.id("first"));
	        WebElement secondInput = driver.findElement(By.id("second"));
	        WebElement thirdInput = driver.findElement(By.id("third"));
	        WebElement fourthInput = driver.findElement(By.id("fourth"));
	        
	        Assert.assertTrue(firstInput.isDisplayed());
	        Assert.assertTrue(secondInput.isDisplayed());
	        Assert.assertTrue(thirdInput.isDisplayed());
	        Assert.assertTrue(fourthInput.isDisplayed());
	    }

	@Test (alwaysRun = true)
	    public void testVerifyButtonExists() throws InterruptedException {
	    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
	        Thread.sleep(3000);
	        loginLink.click();
		    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
		    Forgotpasstab.click();
		     Thread.sleep(3000);
	        WebElement email = driver.findElement(By.cssSelector("#email"));
	        email.sendKeys("saurabhkumbhar187@gmail.com");
	        WebElement Sendtab = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
		     Thread.sleep(3000);
		     Sendtab.click();
		     Thread.sleep(3000);
	        WebElement verifyButton = driver.findElement(By.xpath("//button[contains(text(),'Verify & Continue')]"));
	        Assert.assertTrue(verifyButton.isDisplayed());
	    }

	@Test (alwaysRun = true)
	    public void testResendLinkExists() throws InterruptedException {
	    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
	        Thread.sleep(3000);
	        loginLink.click();
		    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
		    Forgotpasstab.click();
		     Thread.sleep(3000);
	        WebElement email = driver.findElement(By.cssSelector("#email"));
	        email.sendKeys("saurabhkumbhar187@gmail.com");
	        WebElement Sendtab = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
		     Thread.sleep(3000);
		     Sendtab.click();
		     Thread.sleep(3000);
	        WebElement resendLink = driver.findElement(By.cssSelector("a[class='hover:underline text-secondary mx-4 cursor-pointer'] span[class='ng-star-inserted']"));
	        Assert.assertTrue(resendLink.isDisplayed());
	    }

	@Test (alwaysRun = true)
	    public void testInputFieldMaxLength() throws InterruptedException {
	    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
	        Thread.sleep(3000);
	        loginLink.click();
		    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
		    Forgotpasstab.click();
		     Thread.sleep(3000);
	        WebElement email = driver.findElement(By.cssSelector("#email"));
	        email.sendKeys("saurabhkumbhar187@gmail.com");
	        WebElement Sendtab = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
		     Thread.sleep(3000);
		     Sendtab.click();
		     Thread.sleep(3000);
	        WebElement firstInput = driver.findElement(By.id("first"));
	        Assert.assertEquals("1", firstInput.getAttribute("maxlength"));
	    }

	@Test (alwaysRun = true)
	    public void testButtonClick() throws InterruptedException {
	    	WebElement loginLink = driver.findElement(By.linkText("Log in"));
	        Thread.sleep(3000);
	        loginLink.click();
		    WebElement Forgotpasstab = driver.findElement(By.xpath("//a[@class='text-sm font-semibold hover:underline text-secondary']"));
		    Forgotpasstab.click();
		     Thread.sleep(3000);
	        WebElement email = driver.findElement(By.cssSelector("#email"));
	        email.sendKeys("saurabhkumbhar187@gmail.com");
	        WebElement Sendtab = driver.findElement(By.cssSelector("span[class='ng-star-inserted']"));
		     Thread.sleep(3000);
		     Sendtab.click();
		     Thread.sleep(3000);
	        WebElement verifyButton = driver.findElement(By.xpath("//button[contains(text(),'Verify & Continue')]"));
	        verifyButton.click();
	        // Add assertion to check for expected behavior after click
	    }
		

		}
