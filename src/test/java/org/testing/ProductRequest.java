package org.testing;

import java.awt.Robot;
import java.util.Date;

import javax.swing.JButton;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobjectmodel.JBPom;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
	@Test(priority=0)
	public void LoginJB(){
		jb = new JBPom();
		btnclick(jb.getViewProfile());
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getEmailLogin()));
		btnclick(jb.getEmailLogin());
		passValue(jb.getUsername(), "bharath4048@gmail.com");
		passValue(jb.getPassword(), "Bharath@123");
		btnclick(jb.getSignin());
}
	@Test(priority=1)
	public void ProductRequest() {
		jb = new JBPom();
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getProductRequest()));
		btnclick(jb.getProductRequest());
		w.until(ExpectedConditions.elementToBeClickable(jb.getProductName()));
		passValue(jb.getProductName(), "samsung S22");
		passValue(jb.getProductUrl(), "https://www.samsung.com/in/smartphones/galaxy-s22");
		passValue(jb.getProductModel(), "SM-S901EZGDINU");
		//passValue(jb.getAdditionalNotes(), "");
		btnclick(jb.getProductsubmit());
		w.until(ExpectedConditions.elementToBeClickable(jb.getGoToHome()));
		btnclick(jb.getGoToHome());
	}
	
}