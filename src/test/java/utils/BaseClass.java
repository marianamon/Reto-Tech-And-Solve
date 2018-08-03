package utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class BaseClass {

 protected static WebDriver driver;
    
 
 @Before
    public WebDriver getDriver() throws MalformedURLException{
    	try {
			driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

			
		} catch (Exception e) {
			System.err.println("catch TEst");
			e.printStackTrace();
			}
		return driver;
	}
     
 
    
 @After
	
	public void quitDriver() {
		
		try {
			driver.quit(); 
		} catch (Exception e) {
			System.err.println("ingresa a try Driverquit()");
			e.printStackTrace();
		} 
		
	} 
}
