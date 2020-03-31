Feature: Test Background Feature
Description: The purpose of this feature is to test the Background keyword

Background: Usuario en la pagina
	Given Que el usuario esta en la pagina principal de New Tour
	 

Scenario Outline: Ingresar con datos de usuario correctos
	Given Que el usuario ingresa <usuario> en el campo ususario del login
	And Ingresa <contrasena> en el campo contrasena del login
	When Ingresa con el boton de login
	Then Podra ver en pantalla el mensaje SIGN-OFF
	
	Examples:
	|usuario|contrasena|
	|Arctyrael|seleniumlomejor|