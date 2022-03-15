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
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchProduct;
	@FindBy(xpath="//span[text()='All Products']")
	private WebElement allProducts;
	@FindBy(xpath="//div[@title='Mobiles & Tabs ']")
	private WebElement mobilesAndTabs;
	@FindBy(xpath="//li[text()='Mobiles']")
	private WebElement mobiles;
	
	@FindBy(xpath="//h6[contains(text(),'Samsung Galaxy M32 5G')]")
	private WebElement selectProduct;
	@FindBy(xpath="//span[text()='SELECT PRODUCT']")
	private WebElement selectProductButton;
	@FindBy(xpath="(//button[@type='button'])[18]")
	private WebElement addAddress;
	@FindBy(xpath="//input[@id='country']")
	private WebElement selectCountry;
	@FindBy(name="userName")
	private WebElement name;
	@FindBy(xpath="//input[@id='phoneNumber']")
	private WebElement phoneNumber;
	@FindBy(name="pincode")
	private WebElement pincode;
	@FindBy(name="buildingNumber")
	private WebElement buildingNumber;
	@FindBy(name="street")
	private WebElement street;
	@FindBy(name="landmark")
	private WebElement landmark;
	@FindBy(name="area")
	private WebElement area;
	@FindBy(id="state")
	private WebElement state;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;
	@FindBy(xpath="(//div[@class='ant-radio-group ant-radio-group-outline'])[4]")
	private WebElement selectAddress;
	@FindBy(xpath="//span[text()='Confirm']")
	private WebElement confirm;
	@FindBy(xpath="//span[text()='GO TO HOME']")
	private WebElement goToHome;
	
	public WebElement getGoToHome() {
		return goToHome;
	}

	public WebElement getSelectAddress() {
		return selectAddress;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getSearchProduct() {
		return searchProduct;
	}
	
	public WebElement getName() {
		return name;
	}

	public WebElement getSelectProduct() {
		return selectProduct;
	}
	public WebElement getSelectProductButton() {
		return selectProductButton;
	}
	public WebElement getAddAddress() {
		return addAddress;
	}
	public WebElement getSelectCountry() {
		return selectCountry;
	}
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getBuildingNumber() {
		return buildingNumber;
	}
	public WebElement getStreet() {
		return street;
	}
	public WebElement getLandmark() {
		return landmark;
	}
	public WebElement getArea() {
		return area;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getAllProducts() {
		return allProducts;
	}

	public WebElement getMobilesAndTabs() {
		return mobilesAndTabs;
	}

	public WebElement getMobiles() {
		return mobiles;
	}

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
