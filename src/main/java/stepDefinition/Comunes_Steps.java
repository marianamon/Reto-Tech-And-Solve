package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.BaseClass;


public class Comunes_Steps {
	

	BaseClass claseBase = new BaseClass();
	
	 protected WebDriver driver;
	
	public Comunes_Steps() throws MalformedURLException {
    }
/*
	@Given("^Que he ingresado a la pagina \"([^\"]*)\"$")
	public void navigateTo(String url) throws MalformedURLException
	{
		claseBase.getDriver(url);
	}
	*/
	
	@And("^He tomado evidencia$")
    public void takeScreenshot() throws IOException
    {
		    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmm");
		    	String screenShotName = "resources/screenshot/" + dateFormat.format(GregorianCalendar.getInstance().getTime());		
		    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	FileUtils.copyFile(scrFile, new File(String.format("%s.png", screenShotName)));    	
    }
	
	
	/** Check if the page title (is/is not) the same */
	@Then("^I should\\s*((?:not)?)\\s+see page title as \"(.+)\"$")
	public void checkPageTitle(String present,String title)
	{
		String pageTitle = driver.getTitle();
		if(present.equals("see")){
		
			Assert.assertTrue("The title is not present", pageTitle.equals(title));			
		}
		else if(present.equals("not see")){
			
			Assert.assertFalse("The title is present", pageTitle.equals(title));		
		}
	}
	
	/** Check if the page title (have/not have) a partial text */
	@Then("^I should\\s*((?:not)?)\\s+see page title having partial text as \"(.*?)\"$")
	public void checkTitlePartialText(String present, String partialTextTitle)
	{
		String pageTitle = driver.getTitle();
		if(present.equals("see")){
			
			Assert.assertTrue("The partial title is not present", pageTitle.contains(partialTextTitle));			
		}
		else if(present.equals("not see")){
			
			Assert.assertFalse("The partial title is present", pageTitle.contains(partialTextTitle));		
		}
	}
	
	
	
	
}
