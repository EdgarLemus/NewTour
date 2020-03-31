Feature: Title of your feature
  I want to use this template for my feature file

  Background: Usuario logueado en la pagina
    Given Que el usuario esta logueado en la pagina principal de New Tour

  Scenario Outline: Buscar vuelos
    Given Que el usuario ingresa los datos de busqueda de vuelos <tipo>,<pasajeros>,<destino>,<mesDestino>,<diaDestino>,<regreso>,<mesRegreso>,<diaRegreso>,<clase>,<aerolinea>
    When valide los datos con el boton continue
    Then El Podra ver en pantalla el mensaje DEPART

    Examples: 
      | tipo       | pasajeros | destino | mesDestino | diaDestino | regreso | mesRegreso | diaRegreso | clase       | aerolinea       |
      | Round Trip |         2 | Paris   | November   |         12 | Londo   | December   |          1 | First class | Pangea Airlines |     