package org.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.testng.Assert;
import org.jsoup.parser.ParseSettings;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobjectmodel.JBPom;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JingleBid extends JBPom {
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

	@Test
	public void EnterValidUsernameAndValidPassword() {
		jb = new JBPom();
		btnclick(jb.getViewProfile());
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getEmailLogin()));
		btnclick(jb.getEmailLogin());
		passValue(jb.getUsername(), "bharath4048@gmail.com");
		passValue(jb.getPassword(), "Bharath@123");
		btnclick(jb.getSignin());

	}

	@Test(priority = 0)
	public void ValidateLogin() {
		jb = new JBPom();
		w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(jb.getValidateLogin()));
		String text = jb.getValidateLogin().getText();
		System.out.println(text);
		Assert.assertEquals(true, text.contains("Bharath"));
	}
	@Test(priority = 1, enabled = true)
	public void searchProduct() {
		jb = new JBPom();
		w = new WebDriverWait(driver, 20);
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

	@Test(priority = 2, enabled = true)
	public void addAddress() throws AWTException {
		jb = new JBPom();
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getAddAddress()));
		btnclick(jb.getAddAddress());
		passValue(jb.getSelectCountry(), "India");
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		passValue(jb.getName(), "Bharath");
		passValue(jb.getPhoneNumber(), "9080235290");
		passValue(jb.getPincode(), "600000");
		passValue(jb.getBuildingNumber(), "123/4");
		passValue(jb.getStreet(), "ashok nagar");
		passValue(jb.getLandmark(), "AP colony");
		passValue(jb.getArea(), "OMR");
		passValue(jb.getState(), "Tamil Nadu");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		passValue(jb.getCity(), "Virudhunagar");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		btnclick(jb.getSave());

	}

	@Test(priority = 3, enabled = true)
	public void StartAuction() {
		jb = new JBPom();
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getConfirm()));
		btnclick(jb.getConfirm());
		w.until(ExpectedConditions.elementToBeClickable(jb.getGoToHome()));
		btnclick(jb.getGoToHome());
	}

	@Test(priority = 11, enabled = true)
	public void CancelAuction() {
		jb = new JBPom();
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getTotalAuction()));
		btnclick(jb.getTotalAuction());
		w.until(ExpectedConditions.elementToBeClickable(jb.getTrackOrder()));
		btnclick(jb.getTrackOrder());
		// JavascriptExecutor j = (JavascriptExecutor) driver;
		// j.executeScript("arguments[0].click()", jb.getTrackOrder());
		w.until(ExpectedConditions.elementToBeClickable(jb.getCancelAuction()));
		btnclick(jb.getCancelAuction());
		switchWindows();
		w.until(ExpectedConditions.elementToBeClickable(jb.getReasonForCancel()));
		btnclick(jb.getReasonForCancel());
		btnclick(jb.getSumbitForCancelAuction());
		w.until(ExpectedConditions.elementToBeClickable(jb.getJbHomePage()));
		btnclick(jb.getJbHomePage());
	}

	@Test(priority = 5, enabled = true)
	public void UpdatePersonalInformation() throws AWTException {
		jb = new JBPom();
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateViewProfile()));
		btnclick(jb.getUpdateViewProfile());
		w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateName()));
		douClick(jb.getUpdateName());
		r = new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		passValue(jb.getUpdateName(), "M Bharath");
		w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateEmail()));
		btnclick(jb.getUpdateEmail());
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		passValue(jb.getUpdateEmail(), "bharath4048@gmail.com");
		// w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateGender()));
		// btnclick(jb.getUpdateGender());
		// JavascriptExecutor j = (JavascriptExecutor) driver;
		// j.executeScript("arguments[0].click()", jb.getUpdateGender());
		// moveTo(jb.getSelectGender());
		// btnclick(jb.getSelectGender());
		w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateProfileSave()));
		btnclick(jb.getUpdateProfileSave());
		w.until(ExpectedConditions.elementToBeClickable(jb.getJbHomePage()));
		btnclick(jb.getJbHomePage());

	}

	@Test(priority = 6, enabled = true)
	public void updateDeliveryLocation() throws AWTException, InterruptedException {
		jb = new JBPom();
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateViewProfile()));
		btnclick(jb.getUpdateViewProfile());
		w.until(ExpectedConditions.elementToBeClickable(jb.getDeliveryLocation()));
		btnclick(jb.getDeliveryLocation());
		w.until(ExpectedConditions.elementToBeClickable(jb.getAddNewAddress()));
		btnclick(jb.getAddNewAddress());
		w.until(ExpectedConditions.elementToBeClickable(jb.getSelectCountry()));
		passValue(jb.getSelectCountry(), "India");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		passValue(jb.getName(), "Bharath");
		passValue(jb.getPhoneNumber(), "9080235290");
		passValue(jb.getPincode(), "600000");
		passValue(jb.getBuildingNumber(), "123/4");
		passValue(jb.getStreet(), "ashok nagar");
		passValue(jb.getLandmark(), "AP colony");
		passValue(jb.getArea(), "OMR");
		passValue(jb.getState(), "Tamil Nadu");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		passValue(jb.getCity(), "Virudhunagar");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		btnclick(jb.getSaveNewAddress());

	}

	@Test(priority = 7, enabled = true)
	public void EditAddress() throws AWTException {
		jb = new JBPom();
		w = new WebDriverWait(driver, 10);
		// w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateViewProfile()));
		// btnclick(jb.getUpdateViewProfile());
		// w.until(ExpectedConditions.elementToBeClickable(jb.getDeliveryLocation()));
		// btnclick(jb.getDeliveryLocation());
		w.until(ExpectedConditions.elementToBeClickable(jb.getEditAddress()));
		btnclick(jb.getEditAddress());
		w.until(ExpectedConditions.elementToBeClickable(jb.getName()));
		douClick(jb.getName());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		passValue(jb.getName(), "vijay");
		btnclick(jb.getSaveNewAddress());
	}

	@Test(priority = 8, enabled = true)
	public void DeleteAddress() {
		jb = new JBPom();
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getDeleteAddress()));
		btnclick(jb.getDeleteAddress());
		w.until(ExpectedConditions.elementToBeClickable(jb.getConfirmDeleteAddress()));
		btnclick(jb.getConfirmDeleteAddress());
		w.until(ExpectedConditions.elementToBeClickable(jb.getJbHomePage()));
		btnclick(jb.getJbHomePage());
	}

	@Test(priority = 9, enabled = true)
	public void ChangePassword() {
		jb = new JBPom();
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateViewProfile()));
		btnclick(jb.getUpdateViewProfile());
		w.until(ExpectedConditions.elementToBeClickable(jb.getChangePassword()));
		btnclick(jb.getChangePassword());
		w.until(ExpectedConditions.elementToBeClickable(jb.getNewPassword()));
		passValue(jb.getNewPassword(), "Bharath@1234");
		passValue(jb.getConfirmPassword(), "Bharath@1234");
		btnclick(jb.getSaveChangePassword());
		w.until(ExpectedConditions.elementToBeClickable(jb.getUpdateProfileSave()));
		btnclick(jb.getUpdateProfileSave());
		w.until(ExpectedConditions.elementToBeClickable(jb.getJbHomePage()));
		btnclick(jb.getJbHomePage());

	}
	@Test(priority = 10, enabled = true)
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

	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

}
