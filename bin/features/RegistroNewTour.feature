Feature: Title of your feature
  I want to use this template for my feature file
  
  Background: Usuario en la pagina
	Given Que el usuario esta en la pagina principal de NewTours

	Scenario Outline: Registrar usuario correctamente
	Given El usuario ingrese al formulario de registro de NewTours
	When Ingresa los datos del formulario <nombre>,<apellido>,<telefono>,<email>,<direccion>,<ciudad>,<provivencia>,<postal>,<pais>,<usuario>,<contraseña>
	And Confirme con el boton submit del formulario
	Then El podra ver en pantalla Thank you for registering. You may now sign-in using the user name and password you've just entered.

	Examples:
	|nombre|apellido|telefono|email|direccion|ciudad|provivencia|postal|pais|usuario|contraseña|
	|Edgar|Lemus|3113198129|edgar_duvan_l_r@hotmail.com|Carrera 89 #68A-126|Medellin|Antioquia|050050|COLOMBIA|Arctyrael|seleniumlomejor|