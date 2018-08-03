package stepDefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.SahitestPage;
import utils.BaseClass;



public class Login_Steps {
	
	LoginPage loginPage = new LoginPage();
	


	public Login_Steps() throws MalformedURLException {
    }

    @Given("^Que he ingresado a la pagina$")
    public void navigateTo(String url) throws MalformedURLException
	{
    	//loginPage.getDriver(url).get("http://sahitest.com/demo/training/login.htm");
        
	}


    @And("^he Ingresado nombre de usuario \"(.*)\" Y Password \"(.*)\"$")
    public void userEnterusernameandpassword(String username, String password) throws Throwable {
    	loginPage.setUser(username);
    	loginPage.setPassword(password);
 
    }

  
    @When("^de click en el boton login$")
    public void userClickOnSubmitButton() throws Exception{
    	loginPage.clickLogin();
       
    }
    
    @When("^deberia acceder al aplicativo$")
    public void deberiaingresar() throws Exception{
    	
       
    }
   
}