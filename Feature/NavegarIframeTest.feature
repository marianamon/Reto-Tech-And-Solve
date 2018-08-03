Feature: Navegar en opciones de menu del IframeTest
Como usuario del aplicativo quiero navegar entre las opciones dispuestas en la
opcion de menu IframeTest

Scenario: El usuario igresa a la opcion Window Open Test
	Given Que he ingresado a la pagina Sahitest
	And Que he Ingresado al link IframeTest
	When ingrese a la opcion Window open test
	Then deberia visualizar la pagina Window Open test
	
	
Scenario: El usuario igresa a la opcion de Error Page
	Given Que he ingresado a la pagina Sahitest
	And Que he Ingresado al link IframeTest
	When ingrese a la opcion Error Pages
	And seleccione la opcion 404 page
	Then deberia visualizar un mensaje indicando 