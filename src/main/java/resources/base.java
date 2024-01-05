package resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class base {	
	public static WebDriver driver;
	public static Properties prop;
	public WebDriver initializeDriver() throws IOException {	
		prop=new Properties();	
		FileInputStream fis=new FileInputStream("E:\\eclipsework\\HybridFrameworkGoibibo\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);	
		String browserName=prop.getProperty("browser");		
		if(browserName.equals("chrome")) 
		{			
			System.setProperty("webdriver.chrome.driver", "E:\\eclipsework\\HybridFrameworkGoibibo\\drivers\\chromedriver.exe");	
			driver=new ChromeDriver();	
			driver.manage().window().maximize();	
			}	
		else if(browserName.equals("edge"))
		{		
			System.setProperty("webdriver.chrome.driver", "E:\\Webdrivers\\msedgedriver.exe");	
			 driver=new EdgeDriver();
			driver.manage().window().maximize();
			}	
		else if(browserName.equals("firefox")) {
			
		}		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;	
		}
}
