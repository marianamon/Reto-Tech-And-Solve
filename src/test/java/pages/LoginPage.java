package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class LoginPage extends BaseClass {

   

	public void setUser(String User) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.findElement(By.name("user")).sendKeys(User);
    }

   

    public void setPassword(String password) throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.findElement(By.name("password")).sendKeys(password);
    }

    
    public void clickLogin() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input")).click();
         
     }
}