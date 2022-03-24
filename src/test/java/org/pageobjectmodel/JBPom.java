package org.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.baseclass.BaseClassMethods;

public class  JBPom extends BaseClassMethods {
	public JBPom() {

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
	@FindBy(xpath="//h6[contains(text(),'Samsung Galaxy M32 5G ')]")
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
	@FindBy(xpath="//span[text()='Total Auctions']")
	private WebElement totalAuction;
	@FindBy(xpath="(//span[text()=' Track'])[1]")
	private WebElement trackOrder;
	@FindBy(xpath="//span[text()='Cancel Auction']")
	private WebElement cancelAuction;
	@FindBy(xpath="//span[text()='Changed my mind']")
	private WebElement reasonForCancel;
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement sumbitForCancelAuction;
	@FindBy(xpath="//p[text()='View Profile']")
	private WebElement updateViewProfile;
	@FindBy(id="User_Name")
	private WebElement updateName;
	@FindBy(id="Email_ID")
	private WebElement updateEmail;
	@FindBy(xpath="//span[@class='ant-select-arrow']")
	private WebElement updateGender;
	@FindBy(xpath="(//div[text()='Male'])[2]")
	private WebElement selectGender;
	@FindBy(xpath="//span[text()='Change Password']")
	private WebElement changePassword;
	@FindBy(id="newPassword")
	private WebElement newPassword;
	@FindBy(id="confirmPassword")
	private WebElement confirmPassword;
	@FindBy(xpath="(//span[text()='Change Password'])[2]")
	private WebElement saveChangePassword;
	@FindBy(xpath="//span[text()=' Save ']")
	private WebElement updateProfileSave;
	@FindBy(xpath="//div[text()='Delivery Location']")
	private WebElement deliveryLocation;
	@FindBy(xpath="//span[text()='ADD NEW ADDRESS']")
	private WebElement addNewAddress ;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement saveNewAddress;
	@FindBy(xpath="//div[text()='Erode']")
	private WebElement selectCity;
	@FindBy(xpath="(//span[text()='Edit'])[3]")
	private WebElement editAddress;
	@FindBy(xpath="(//span[text()='Delete'])[3]")
	private WebElement deleteAddress;
	@FindBy(xpath="//img[@class='header-logo']")
	private WebElement jbHomePage;
	@FindBy(xpath="//span[@class='anticon anticon-file-text header-icon']")
	private WebElement productRequest;
	@FindBy(id="Product_Name")
	private WebElement productName;
	@FindBy(id="Reference_Url")
	private WebElement productUrl;
	@FindBy(id="Model_Number")
	private WebElement productModel;
	@FindBy(xpath="//span[text()='submit']")
	private WebElement productsubmit;
	@FindBy(xpath="//span[text()='Yes']")
	private WebElement confirmDeleteAddress;
	@FindBy(id="Addition_Notes")
	private WebElement additionalNotes;
	
	public WebElement getAdditionalNotes() {
		return additionalNotes;
	}

	public WebElement getProductRequest() {
		return productRequest;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProductUrl() {
		return productUrl;
	}

	public WebElement getProductModel() {
		return productModel;
	}

	public WebElement getProductsubmit() {
		return productsubmit;
	}

	public WebElement getJbHomePage() {
		return jbHomePage;
	}

	public WebElement getEditAddress() {
		return editAddress;
	}

	public WebElement getDeleteAddress() {
		return deleteAddress;
	}

	public WebElement getConfirmDeleteAddress() {
		return confirmDeleteAddress;
	}
	
	public WebElement getSelectCity() {
		return selectCity;
	}

	public WebElement getDeliveryLocation() {
		return deliveryLocation;
	}

	public WebElement getAddNewAddress() {
		return addNewAddress;
	}

	public WebElement getSaveNewAddress() {
		return saveNewAddress;
	}

	public WebElement getUpdateViewProfile() {
		return updateViewProfile;
	}

	public WebElement getUpdateName() {
		return updateName;
	}

	public WebElement getUpdateEmail() {
		return updateEmail;
	}

	public WebElement getUpdateGender() {
		return updateGender;
	}

	public WebElement getSelectGender() {
		return selectGender;
	}

	public WebElement getChangePassword() {
		return changePassword;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getSaveChangePassword() {
		return saveChangePassword;
	}

	public WebElement getUpdateProfileSave() {
		return updateProfileSave;
	}

	public WebElement getGoToHome() {
		return goToHome;
	}

	public WebElement getTotalAuction() {
		return totalAuction;
	}

	public WebElement getTrackOrder() {
		return trackOrder;
	}

	public WebElement getCancelAuction() {
		return cancelAuction;
	}

	public WebElement getReasonForCancel() {
		return reasonForCancel;
	}

	public WebElement getSumbitForCancelAuction() {
		return sumbitForCancelAuction;
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
