package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import utils.BaseClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class AlertasPage extends BaseClass {
	
	
	
	public void clickbotonAllpopupthispage() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/button")).click();   
    }


	public void aceptarAlerta() throws Exception {
		
	    try{
			   WebDriverWait wait = new WebDriverWait(driver, 10);
			   Alert alert = wait.until(ExpectedConditions.alertIsPresent());		  
			   alert.accept();
			   
			}catch(Throwable e){
				System.err.println("catch Alert");
				e.printStackTrace();
			}
		}
	
	
	public void Clickbotoncancelar() throws Exception {
		String parentWindowHandler = driver.getWindowHandle(); // Almacena tu ventana actual
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // Obten todas las ventana abiertas
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // Cámbiate a la ultima ventana (tu pop-up)

		// Aquí rellena la información referente a tu pop-up
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.className("cancel")).click();   

		driver.switchTo().window(parentWindowHandler);  // Vuelve a tu ventana principal (si lo necesitas)
		}
	
    public void verificarTest( ) throws Exception {
    String Actualtext;
	Actualtext = driver.findElement(By.xpath("html/body/h2")).getText();
	
	
	AssertJUnit.assertEquals(Actualtext,"Js Popup Test");

    }
}
