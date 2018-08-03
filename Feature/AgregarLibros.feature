Feature: Agregar a la canasta de compra los libros 
Como usuario del aplicativo quiero Agregar libros y obtener el valor correcto
al totalizar costo unitario, costo total y el gran total.


Scenario: El usuario agrega libros a la canasta de compra y obtiene valor grantotal exitosamente
	Given Que he ingresado a la pagina All available books
	And he agregado "2" core Java
	And he agregado "5" ruby for rail
	And he agregado "2" Python Cookbook
	When de click en el boton Add
	Then deberia presentar My cart con articulos y grantotal correctos
	And He tomado evidencia