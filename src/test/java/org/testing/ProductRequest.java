package org.testing;

import java.awt.Robot;
import java.util.Date;

import javax.swing.JButton;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobjectmodel.JBPom;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductRequest extends JBPom {
	JBPom jb;
	WebDriverWait w;
	Robot r;

	@BeforeClass
	private void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		windMax();
		loadUrl("https://qa.jinglebid.com/");
		parentWindow();
	}

	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test(priority = 0, enabled = true)
	public void LoginJB() {

		jb = new JBPom();
		btnclick(jb.getViewProfile());
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getEmailLogin()));
		btnclick(jb.getEmailLogin());
		passValue(jb.getUsername(), "bharath4048@gmail.com");
		passValue(jb.getPassword(), "Bharath@123");
		btnclick(jb.getSignin());
   }

	@Test(priority = 1, enabled = true)
	public void ProductRequest1() {
		jb = new JBPom();
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(jb.getAllProducts()));
		btnclick(jb.getAllProducts());
		driver.navigate().refresh();
		w.until(ExpectedConditions.elementToBeClickable(jb.getProductRequest()));
		btnclick(jb.getProductRequest());
		w.until(ExpectedConditions.elementToBeClickable(jb.getProductName()));
		passValue(jb.getProductName(), "samsung S22");
		passValue(jb.getProductUrl(), "https://www.samsung.com/in/smartphones/galaxy-s22");
		passValue(jb.getProductModel(), "SM-S901EZGDINU");
		// passValue(jb.getAdditionalNotes(), "");
		btnclick(jb.getProductsubmit());
		w.until(ExpectedConditions.elementToBeClickable(jb.getGoToHome()));
		btnclick(jb.getGoToHome());

	}

	@AfterClass
	public void CloseBrowser() {
		CloseBrowser();
	}

}