package org.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.baseclass.BaseClassMethods;

public class  JBLoginPom extends BaseClassMethods {
	public JBLoginPom() {

		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//p[@class='fs-12 fw-700']")
	private WebElement viewProfile;
	@FindBy(xpath="//span[@class='fs-11 fw-600 jingle-blue']")
	private WebElement emailLogin;
	@FindBy(id="email")
	private WebElement username ;
	@FindBy(id="password")
	private WebElement password ;
	@FindBy(xpath="//span[text()='SIGN IN']")
	private WebElement signin ;
	@FindBy(xpath="//span[@class='dashboard-profile-name']")
	private WebElement validateLogin;
	
	public WebElement getValidateLogin() {
		return validateLogin;
	}
	public WebElement getViewProfile() {
		return viewProfile;
	}
	public WebElement getEmailLogin() {
		return emailLogin;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin() {
		return signin;
	}
	
	
	
	
	
	
	
}
