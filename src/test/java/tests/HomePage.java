package tests;

import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.bookHotel;
import pageObject.details;
import pageObject.logDetails;
import pageObject.searchHotel;
import resources.base;
public class HomePage extends base{	

	public static Logger log=LogManager.getLogger(HomePage.class.getName());	
	public WebDriver driver;	
	@BeforeTest	
	public void initdriver() throws IOException {		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		}		
	@Test(priority=1)	
		public void home()
	{			
			searchHotel sh=new searchHotel(driver);	
			sh.Closepopup().click();	
			sh.Clickonhotelbtn().click();	
			sh.ClickonIndiaButton().click();		
			}
	
	@Test(priority=2)
			public void hotel()
	{		
		details d=new details(driver);		
		d.hotelName().sendKeys("Ooty");		
		d.selectName().sendKeys(Keys.ARROW_DOWN);	
		try {
			Thread.sleep(3000);	
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();	
			}
		
		d.selectName().sendKeys(Keys.ENTER);	
			d.openCalender().click();	
			d.checkIn().click();	
			d.checkOut().click();	
			d.guest_room_btn().click();	
			d.selectGuestdec().click();		
			d.doneButton().click();	
			d.search_btn().click();		
			}
	@Test(priority=3)
			public void logs()
	{	
			logDetails ld=new logDetails(driver);		
				List<WebElement> h=ld.list();			
				String hname=ld.hotelname().getText();	
				log.info("Hotel name: "+hname);	
				log.info("Hotel search count= "+h.size());	
				try 
				{
					Assert.assertEquals(hname,ld.hotelname().getText());
				 log.info("Hotel names are matched.");
				}
				catch(Exception e) {
				
					log.error("Hotel names are not matched."+e);
					}						
				ld.clickhotel().click();	
				ld.clspop().click();
}
	
	@Test(priority=4)
	public void booking()
	{		
		for(String child:driver.getWindowHandles() )
		{			
			driver.switchTo().window(child);	
		}	
		
		bookHotel bh=new bookHotel(driver);		
		bh.selbed().click();	
		bh.fname().sendKeys("Firstname");	
		bh.lname().sendKeys("Lastname");	
		bh.email().sendKeys("xyz@gmail.com");	
		bh.phone().sendKeys("0123456789");	
		bh.billAdd().sendKeys("chennai");	
		bh.pin().sendKeys("600018");	
		bh.chbox().click();	
		
		bh.payment().click();		
		}
	
				@AfterTest	
				public void closedriver()
				{		
					driver.quit();	
						
					}	
}
