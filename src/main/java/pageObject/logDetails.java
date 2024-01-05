package pageObject;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class logDetails {	
	
	public WebDriver driver;
	public logDetails(WebDriver driver) 
	{		
		this.driver=driver;		
	PageFactory.initElements(driver, this);	
	}	
	
	
	@FindBy(xpath=("//a[@class='close']"))	
	WebElement clbtn;
	@FindBy(xpath="//div[@class='HotelCardstyles__HotelNameWrapperDiv-sc-1s80tyk-16 jhHHUQ']")	
	List<WebElement> list;	
	@FindBy(xpath="(//div[@class='HotelCardstyles__HotelNameWrapperDiv-sc-1s80tyk-16 jhHHUQ'])[1]")
	WebElement hotelname;
	@FindBy(xpath="(//div[@class='HotelCardstyles__HeadingInfoWrapperDiv-sc-1s80tyk-14 dtRUhw'])[2]")
	WebElement hname2;
	@FindBy(xpath="//a[@class='close']")	
	WebElement clspop;	
	@FindBy(xpath="(//div[@class='HotelCardstyles__HeadingInfoWrapperDiv-sc-1s80tyk-14 dtRUhw'])[1]")
	WebElement clickhotel;	
	
	
	public WebElement clbtn()
	{		
		return clbtn;	
		}	
	public List<WebElement> list()
	{		
		return list;
	}	
	public WebElement hotelname()
	{	
		return hotelname;	
		}	
	public WebElement hname2()
	{
		return hname2;
		}	
	public WebElement clspop()
	{	
		return clspop;
		}	
	public WebElement clickhotel()
	{		
		return clickhotel;	
		}
	
}