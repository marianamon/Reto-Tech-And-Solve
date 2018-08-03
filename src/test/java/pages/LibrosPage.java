package pages;


import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import utils.BaseClass;
import java.util.concurrent.TimeUnit;


public class LibrosPage extends BaseClass {
	
	
	
	public void setCoreJava(String cantidad) throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='listing']/tbody/tr[2]/td[4]/input")).clear();
	    driver.findElement(By.xpath(".//*[@id='listing']/tbody/tr[2]/td[4]/input")).sendKeys(cantidad);
    }


	public void setRubyforRails(String cantidad) throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='listing']/tbody/tr[3]/td[4]/input")).clear();
	    driver.findElement(By.xpath(".//*[@id='listing']/tbody/tr[3]/td[4]/input")).sendKeys(cantidad);
    }

	public void setPython(String cantidad) throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='listing']/tbody/tr[4]/td[4]/input")).clear();
	    driver.findElement(By.xpath(".//*[@id='listing']/tbody/tr[4]/td[4]/input")).sendKeys(cantidad);
    }

	public void ClickAdd() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='available']/input[1]")).click();
    }
	
    public void verificarRespuesta( ) throws Exception {
    String Actualtext;
	Actualtext = driver.findElement(By.id("total")).getText();
	AssertJUnit.assertEquals(Actualtext,"2300");

    }
}
