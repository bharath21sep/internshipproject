package org.testing;

import java.util.Date;

import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobjectmodel.JBLoginPom;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JingleBidLogin extends JBLoginPom{
	@BeforeClass
	private void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		windMax();
		loadUrl("https://qa.jinglebid.com/");
	}
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void EnterValidUsernameAndValidPassword() {
		JBLoginPom jb = new JBLoginPom();
		btnclick(jb.getViewProfile());
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getEmailLogin()));
		btnclick(jb.getEmailLogin());
		passValue(jb.getUsername(), "bharath4048@gmail.com");
		passValue(jb.getPassword(), "Bharath@123");
		 btnclick(jb.getSignin());
	}
	@Test
	public void ValidateLogin() {
		JBLoginPom jb = new JBLoginPom();
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(jb.getValidateLogin()));
		String text = jb.getValidateLogin().getText();
		System.out.println(text);
      Assert.assertEquals(true, text.contains("bharath"));
		
	}
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
}
