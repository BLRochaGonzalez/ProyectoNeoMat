#  Base de Datos para la Aplicacion.


## Requisitos.

Para almacenar datos en el aplicativo, haremos uso de un Sistema Gestor de Bases de Datos como MySql.



## Tablas y Atributos.

En principio, pero a espensas de ampliaciones debido a necesidades del proyecto, nuestra BD contará con las siguientes tablas y sus atributos:

- PLANET
    (La tabla *PLANETA* será la encargada de modelar el juego, solo habrá una instancia en principio de dicha tabla, a la que se irán agregando los jugadores).
    - id : BIGINT
    - name : VARCHAR(45)
    - launchDate : DATE
    - numPlayers : INT
    - numSettlements : INT

- USER
    (La tabla *USER* hace referencia a los jugadores que se registran en el aplicativo, por motivos de definición, no se ha llamado a la tabla *PLAYER*, ya que el usuario no solo accederá al juego, sino también a la Wiki, y en un futuro al Foro. Esta tabla contendrá el id del planeta(servidor) al que pertenece).
    - id : BIGINT
    - name : VARCHAR(45)
    - surname1 : VARCHAR(45)
    - surname2 : VARCHAR(45)
    - email : VARCHAR(80)
    - password : VARCHAR(18)
    - telephone : VARCHAR(30)
    - role : VARCHAR(10)

    - idPlanet : BIGINT

- SETTLEMENT
    (Esta tabla será la que mas relaciones posea, así como la que mas entradas y actualizaciones sufrirá ya que hace referencia a los distintos asentamientos que los usuarios pueden tener en el juego, además contiene la id de la tabla *LOCATION* cuya función es definir la ubicación única de cada asentamiento).
    - id : BIGINT
    - name : VARCHAR(45)
    - energyQuantity : INT
    - neomatQuantity : INT
    - wQuantity : INT
    - gQuantity : INT
    - cQuantity : INT
    - sQuantity : INT
    - radiationQuantity : INT
    
    - idUser : BIGINT
    - idLocation : BIGINT

- LOCATION
    (Tabla de apoyo de *SETTLEMENT* con los datos únicos de su ubicación).
    - id : BIGINT
    - continent : INT
    - contry : INT
    - region : INT

- VEHICLE
    (En esta tabla se recogerán los distintos tipos de vehiculos construidos en el asentamiento, asi como su cantidad. Cuenta con la id del asentamiento al que esta vinculada).
    - id : BIGINT
    - name : VARCHAR(45)
    - description : VARCHAR(255)
    - quantity : INT
    - reqWQuantity : INT
    - reqGQuantity : INT
    - reqCQuantity : INT
    - reqSQuantity : INT
    - reqRadQuantity : INT
    - buildingTime : TIME
    - reqResearchs : VARCHAR(100)

    - idSettlement : BIGINT

- DEFENSE
    (En esta tabla se recogerán los distintos tipos de estructuras defensivas construidas en el asentamiento, asi como su cantidad. Cuenta con la id del asentamiento al que esta vinculada).
    - id : BIGINT
    - name : VARCHAR(45)
    - description : VARCHAR(255)
    - quantity : INT
    - reqWQuantity : INT
    - reqGQuantity : INT
    - reqCQuantity : INT
    - reqSQuantity : INT
    - reqRadQuantity : INT
    - buildingTime : TIME
    - reqResearchs : VARCHAR(100)

    - idSettlement : BIGINT

- BUILDING
    (Tabla plantilla en la que se recogerán los datos de los diferentes edificios que se pueden construir, No contiene la id del asentamiento al que pertenece el edificio ya que se genera una tabla auxiliar debido a su cardinalidad).
    - id : BIGINT
    - name : VARCHAR(45)
    - description : VARCHAR(255)
    - isBuilt : BOOLEAN
    - reqWQuantity : INT
    - reqGQuantity : INT
    - reqCQuantity : INT
    - reqSQuantity : INT
    - reqRadQuantity : INT
    - buildingTime : TIME
    - resourceQuantity : INT
    - reqBuildings : VARCHAR(100)

- SETTLEMENT_BUILDING
    (Tabla auxiliar entre ambas tablas en la que se agregarán los diferentes edificios que se vayan construyendo vinculandolos directamente a su asentamiento, junto con el nivel que actualmente tienen).
    - idSettlement : BIGINT
    - idBuilding : BIGINT
    - buildingLevel : INT

- RESEARCH
    (Tabla plantilla en la que se recogerán los datos de las diferentes investigaciones que se pueden construir, No contiene la id del asentamiento al que pertenece la investigacion ya que se genera una tabla auxiliar debido a su cardinalidad).
    - id : BIGINT
    - name : VARCHAR(45)
    - description : VARCHAR(255)
    - reqWQuantity : INT
    - reqGQuantity : INT
    - reqCQuantity : INT
    - reqSQuantity : INT
    - reqRadQuantity : INT
    - buildingTime : TIME
    - reqResearchs : VARCHAR(100)

- SETTLEMENT_RESEARCH
    (Tabla auxiliar entre ambas tablas en la que se agregarán las diferentes investigaciones que se vayan ejecutando, vinculándolas directamente a su asentamiento).
    - idSettlement : BIGINT
    - idResearhc : BIGINT


## Relaciones.

- PLANET **1...N** USERS
- USER **1...N** SETTLEMENT
- SETTLEMENT **1...1** LOCATION
- SETTLEMENT **1...N** VEHICLE
- SETTLEMENT **1...N** DEFENSE
- SETTLEMENT **N...M** BUILDING (Tabla SETTLEMENT_BUILDING)
- SETTLEMENT **N...M** RESEARCH (Tabla SETTLEMENT_RESEARCH)
