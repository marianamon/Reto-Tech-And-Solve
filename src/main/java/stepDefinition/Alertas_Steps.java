package stepDefinition;

import java.net.MalformedURLException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AlertasPage;


public class Alertas_Steps {
	
	AlertasPage ALertaPage = new AlertasPage();
	


	public Alertas_Steps() throws MalformedURLException {
    }

    @Given("^Que he ingresado a la pagina Js popup Test$")
    public void navigate(String url) throws MalformedURLException
	{
    	//ALertaPage.getDriver(url).get("http://sahitest.com/demo/jsPopup.htm");
        
	}

    @And("^he dado click en el boton All popup this page$")
    public void clickbotonAllpopupthispage() throws Throwable {
    	ALertaPage.clickbotonAllpopupthispage();
    	 }

    @And("^he aceptado la alerta Show Alert$")
    public void aceptarlaalertaShowAlert() throws Throwable {
    	
    	ALertaPage.aceptarAlerta();
    	
    	 }
    
    @And("^he aceptado la alerta Show confirm$")
    public void aceptarlaalertaShowconfirm() throws Throwable {
    	ALertaPage.aceptarAlerta();
         }
    	
    	
    @When("^he ingresado un valor en el campo de alerta show prompt$")
    public void aceptarlaalertaShowprompt() throws Throwable {
    	ALertaPage.aceptarAlerta();
    	       
    	    }
    
    
    @When("^de click en el boton cancelar de la ventana imprimir$")
    public void clickencancelar() throws Throwable {
    	ALertaPage.Clickbotoncancelar();
    	       
    	    }
    
    	
    @Then("^deberia retornar a la pagina inicial Js popup Test$")
    public void retornarpaginainicio() throws Throwable {
    	ALertaPage.verificarTest(); 
    	
   	    }
   
  
}
