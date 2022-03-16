package org.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.testng.Assert;
import org.jsoup.parser.ParseSettings;
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
import net.bytebuddy.asm.Advice.Enter;

public class JingleBidLogin extends JBLoginPom{
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
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(jb.getValidateLogin()));
		String text = jb.getValidateLogin().getText();
		System.out.println(text);
      Assert.assertEquals(true, text.contains("Bharath"));
		
	}
	@Test(enabled=false)
	public void searchProduct() {
		JBLoginPom jb = new JBLoginPom();
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(jb.getAllProducts()));
		btnclick(jb.getAllProducts());
		moveTo(jb.getMobilesAndTabs());
		
		w.until(ExpectedConditions.elementToBeClickable(jb.getMobiles()));
		moveTo(jb.getMobiles());
		btnclick(jb.getMobiles());
		w.until(ExpectedConditions.elementToBeClickable(jb.getSelectProduct()));
		btnclick(jb.getSelectProduct());	
		w.until(ExpectedConditions.elementToBeClickable(jb.getSelectProductButton()));
		btnclick(jb.getSelectProductButton());
		
	}
	@Test(enabled=false)
	public void addAddress() throws AWTException {
		JBLoginPom jb = new JBLoginPom();
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getAddAddress()));
		btnclick(jb.getAddAddress());
		passValue(jb.getSelectCountry(), "India");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		passValue(jb.getName(), "Bharath");
		passValue(jb.getPhoneNumber(),"9080235290");
		passValue(jb.getPincode(), "600000");
		passValue(jb.getBuildingNumber(), "123/4");
		passValue(jb.getStreet(), "ashok nagar");
		passValue(jb.getLandmark(), "AP colony");
		passValue(jb.getArea(), "OMR");
		passValue(jb.getState(), "Tamil Nadu");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		passValue(jb.getCity(), "Chennai");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		btnclick(jb.getSave());
	}
	@Test(priority=3,enabled=false)
  public void StartAction() {
		JBLoginPom jb = new JBLoginPom();
		WebDriverWait w = new WebDriverWait(driver, 10);
    	w.until(ExpectedConditions.elementToBeClickable(jb.getConfirm()));
    	btnclick(jb.getConfirm());
    	w.until(ExpectedConditions.elementToBeClickable(jb.getGoToHome()));
    	btnclick(jb.getGoToHome());
	}
	@Test(priority=4,enabled=false)
	public void CancelAuction() {
		JBLoginPom jb = new JBLoginPom();
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getTotalAuction()));
		btnclick(jb.getTotalAuction());
		w.until(ExpectedConditions.elementToBeClickable(jb.getTrackOrder()));
		btnclick(jb.getTrackOrder());
		w.until(ExpectedConditions.elementToBeClickable(jb.getCancelAuction()));
		btnclick(jb.getCancelAuction());
		switchWindows();
    	w.until(ExpectedConditions.elementToBeClickable(jb.getReasonForCancel()));
		btnclick(jb.getReasonForCancel());
		btnclick(jb.getSumbitForCancelAuction());	
	}
	@Test
	public void UpdatePersonalInformation() {
		
		JBLoginPom jb = new JBLoginPom();
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateViewProfile()));
		btnclick(jb.getUpdateViewProfile());
		w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateName()));
		btnclick(jb.getUpdateName());
		clearText(jb.getUpdateName());
		passValue(jb.getUpdateName(), "M Bharath");
		jb.getUpdateEmail().clear();
		passValue(jb.getUpdateEmail(), "bharath4048@gmail.com");
		btnclick(jb.getUpdateGender());
		moveTo(jb.getSelectGender());
		btnclick(jb.getSelectGender());
		btnclick(jb.getChangePassword());
		w.until(ExpectedConditions.elementToBeClickable(jb.getNewPassword()));
		passValue(jb.getNewPassword(), "Bharath@123");
	    passValue(jb.getConfirmPassword(), "Bharath@123");
	    btnclick(jb.getSaveChangePassword());
	    w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateProfileSave()));
	    btnclick(jb.getUpdateProfileSave());
	
	}
	
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
}
