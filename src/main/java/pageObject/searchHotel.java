package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchHotel {	
	
	public WebDriver driver;	
	public searchHotel(WebDriver driver) {	
		this.driver=driver;		
		PageFactory.initElements(driver, this);	
		}	
	
	@FindBy(xpath="//span[@class='logSprite icClose']")
	WebElement closebtn;	
	@FindBy(xpath="//div[@class='sc-hUpaCq fKFvYE']")
	WebElement closebtn2;	
	@FindBy(xpath="//span[@class='header-sprite nav-icon-hotels gr-append-right5']")	
	WebElement clickhtl;		
	@FindBy(xpath="(//input[@name='CountryType'])[1]")
	WebElement clkIndia;
	
	
	public WebElement Closepopup()
	{
		return closebtn;
		}	
	public WebElement Closepopup2()
	{	
		return closebtn2;	
		}		
	public WebElement Clickonhotelbtn()
	{		
		return clickhtl;
	}		
	public WebElement ClickonIndiaButton()
	{	
		return clkIndia;
		}	
}