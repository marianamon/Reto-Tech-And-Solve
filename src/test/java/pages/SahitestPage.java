package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import utils.BaseClass;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class SahitestPage extends BaseClass {
	
	
	public void LinkBack() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("/html/body/a")).click();
    }


    public void clickIframetest() throws Exception {
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a[6]")).click();
	    
    }

    public void clickWindowopentest() throws Exception {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
    	driver.switchTo (). frame (0); 
    	
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a[8]")).click();
    }

    public void clickErrorPage() throws Exception {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.switchTo (). frame (0); 
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td[4]/a[8]")).click();
    }
    
    public void clickError404() throws Exception {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//driver.switchTo (). frame (2);
	    driver.findElement(By.xpath("/html/body/a[1]")).click();
    }
    
    public void verificarOpentest( ) throws Exception {
    String Actualtext;
	Actualtext = driver.findElement(By.xpath(".//*[@id='mensajePagoAnticipo']/li[1]")).getText();
	
	
	AssertJUnit.assertEquals(Actualtext,"Aplica Pago Anticipo Cargo Fijo."
				);

    }
}
