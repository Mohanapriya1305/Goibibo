package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class details {

	public WebDriver driver;
	public details(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='downshift-1-input']")
	WebElement hotelName;
	@FindBy(xpath="//input[@id='downshift-1-input']")
	WebElement selName;
	@FindBy(xpath="//div[@data-testid='openCheckinCalendar']")
	WebElement openCal;
	@FindBy(xpath="//span[@data-testid='date_12_12_2023']")
	WebElement in;
	@FindBy(xpath="//span[@data-testid='date_12_14_2023']")
	WebElement out;
	@FindBy(xpath="//input[@class='SearchBlockUIstyles__CitySearchInput-sc-fity7j-12 uGGSH']")
	WebElement guest_room;
	@FindBy(xpath="//span[@data-testid='button-adult-add']")
	WebElement selGuestadd;
	@FindBy(xpath="//span[@data-testid='button-adult-dec']")
	WebElement selectGuestdec;
	@FindBy(xpath="//button[@aria-label='button-pax-home']")
	WebElement done_btn;
	@FindBy(xpath="//button[@data-testid='searchHotelBtn']")
	WebElement search_btn;
	public WebElement hotelName(){
		return hotelName;
	}
	public WebElement selectName() {
		return selName;
	}
	public WebElement openCalender() {
		return openCal;
	}
	public WebElement checkIn() {
		return in;
	}
	public WebElement checkOut() {
		return out;
	}
	public WebElement guest_room_btn() {
		return guest_room;
	}
	public WebElement selectGuestadd() {
		return selGuestadd;
	}
	public WebElement selectGuestdec() {
		return selectGuestdec;
	}
	public WebElement doneButton() {
		return done_btn;
	}
	public WebElement search_btn() {
		return search_btn;
	}

}
