package stepDefinition;

import java.net.MalformedURLException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LibrosPage;




public class AgregarLibros_Steps {
	
	LibrosPage librosPage = new LibrosPage();
	


	public AgregarLibros_Steps() throws MalformedURLException {
    }

    @Given("^Que he ingresado a la pagina All available books$")
    public void navigate() throws MalformedURLException
	{
    	librosPage.getDriver().get("http://sahitest.com/demo/training/books.htm");
        
	}


    @And("^he agregado \"(.*)\" core Java$")
    public void heagregadocoreJava(String cantidad1) throws Throwable {
    	librosPage.setCoreJava(cantidad1);
    	 }

    @And("^he agregado \"(.*)\" ruby for rail$")
    public void heagregadorubyforail(String cantidad2) throws Throwable {
    	librosPage.setRubyforRails(cantidad2);
    	 }
    
    @And("^he agregado \"(.*)\" Python Cookbook$")
    public void heagregadoPythonCookbook(String cantidad3) throws Throwable {
    	librosPage.setPython(cantidad3);
         }
    	
    	
    @When("^de click en el boton Add$")
    public void clickenadd() throws Throwable {
    	 librosPage.ClickAdd();
    	       
    	    }
    	
    @Then("^deberia presentar My cart con articulos y grantotal correctos$")
    public void verificarRespuesta() throws Throwable {
   	 librosPage.verificarRespuesta();
   	       
   	    }
   
}