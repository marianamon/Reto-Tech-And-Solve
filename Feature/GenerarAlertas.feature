Feature: Navegar entre alertas
Como usuario del aplicativo quiere navegar entre las alertas 
presentadas hasta retornar a la pagina de inicio

Scenario: El usuario navega entre alertas Exitosamente
	Given Que he ingresado a la pagina Js popup Test
	And he dado click en el boton All popup this page
	And he aceptado la alerta Show Alert
	And he aceptado la alerta Show confirm
	And he ingresado un valor en el campo de alerta show prompt
	When de click en el boton cancelar de la ventana imprimir
	Then deberia retornar a la pagina inicial Js popup Test