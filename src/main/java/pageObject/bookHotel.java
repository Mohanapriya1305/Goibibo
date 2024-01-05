package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class bookHotel {
	
	
	public WebDriver driver;	
	public bookHotel(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
		}	
	
	
	@FindBy(xpath="(//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-13 RoomFlavorstyles__ButtonWrapper-sc-90vv8b-16 kwEZmw bQODVI'])[1]")
	WebElement selbed;
	@FindBy(xpath="//input[@data-guestdetailsinnerwrapid='first-name']")	
	WebElement fname;
	@FindBy(xpath="//input[@data-guestdetailsinnerwrapid='last-name']")
	WebElement lname;	
	@FindBy(xpath="//input[@data-guestdetailsinnerwrapid='guest-details-email']")	
	WebElement email;	
	@FindBy(xpath="//input[@data-guestdetailsinnerwrapid='guest-details-phone']")	
	WebElement phone;	
	@FindBy(id="Billing Address")	
	WebElement billAdd;	
	@FindBy(id="Pincode")	
	WebElement pin;
	@FindBy(xpath="//span[@class='sc-fXazxj geDMnu']")
	WebElement chbox;
	@FindBy(xpath="//span[@class='GuestDetailsBlockstyles__ButtonSpan-sc-1rzm4ar-7 cpurHQ']")
	WebElement payment;	
	
	
	public WebElement selbed() {	
		return selbed;	
		}	
	public WebElement fname() {	
		return fname;
		}	
	public WebElement lname() {	
		return lname;	
		}	
	public WebElement email() {	
		return email;	
		}
	public WebElement phone() {	
		return phone;	
		}	
	public WebElement billAdd() {	
		return billAdd;	
		}	
	public WebElement pin() {	
		return pin;
		}	
	public WebElement chbox() {		
		return chbox;
		}	
	public WebElement payment() {	
		return payment;	
		}
}