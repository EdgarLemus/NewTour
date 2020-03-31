Feature: Title of your feature
  I want to use this template for my feature file

  Background: Usuario logueado en la pagina
    Given Que el usuario esta logueado en la pagina principal de New Tour
    And Que el usuario ingresa los datos de busqueda de vuelos
    
    Scenario Outline: Reservar vuelo
    Given Que el usuario buscara lo hora de salida y la hora de regreso
    When El usuario confirme la reserva con los datos <nombre>,<apellido>,<numeroTarjeta>,<middle>
    Then el podra ver en pantalla la palabra Departing
    
    Examples:
    |nombre|apellido|numeroTarjeta|middle|
    |Edgar|Lemus|31097660231|Anthon|
   