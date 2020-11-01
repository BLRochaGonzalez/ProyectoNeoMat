# Stack Tecnológico.

Herramientas y tecnologías en las que se fundamentará el proyecto. *Debido a que aun se desconoce la envergadura final del poyecto, se irán añadiendo las debidas tecnologías y herramientas conforme a su uso para la realización del proyecto*.


## Base de Datos.

Con la finalidad de almacenar los datos almacenados y/o modificados en el aplicativo usaremos:
- MySQL
    - Usaremos este gestor de base de datos debido a su popularidad, el hecho de ser una tecnología opensource, lo que asegura un amplio mantenimiento y una gran capacidad de resolución de problemas gracias a la comunidad con la que cuenta.

##  Backend.

Para el desarrollo del serverside(lado servidor) y toda la estructuración, logíca de negocio y control del aplicativo usaremos:
- Java 8
    - Versión del lenguaje de programación que utilizaremos gracias a sus características, mejoras y correcciones de bugs en relación con su anterior versión para mejorar la eficacia en el desarrollo y la ejecución de programas, y su estabilidad frente a sus versiones posteriores. Además de ser la versión que mas hemos utilizado durante el grado y con la qeu más cómodo me encuentro.
- Tomcat 8
    - Tomcat: funciona como un contenedor de servlets, a grandes rasgos, será nuestro *servidor* en ambito local sobre el que desplegaremos el aplicativo con el fin de poder configurarlo, observarlo y testearlo.
    - Versión: usaremos la versión 8 debido a su soporte de especificaciones de Servlet 3.1 (Mapeado de Servlet).
- Spring Tool Suite
    - Usaremos este *framework* por su alta interoperabilidad y su integración con otras herramientas que provee para la extensión y personalización de aplicaciones web.
    - Algunas de las dependencias y herramientas de este framework que utilizaremos serán: *Spring MVC*, *Spring Data* y *Spring Boot*.
        - Spring MVC: El marco de Spring Web model-view-controller (MVC) está diseñado en torno a una *DispatcherServlet* que envía solicitudes a los controladores, con asignaciones de controladores configurables, resolución de vista, resolución de configuración regional y tema, así como soporte para la carga de archivos externos.
        - Spring Data: Su misión es proporcionar un modelo de programación familiar y coherente basado en Spring para el acceso a los datos y, al mismo tiempo, conservar las características especiales de la base de datos subyacente.
        - Spring Boot: permite compilar nuestras aplicaciones Web como un archivo *.jar* que podemos ejecutar como una aplicación Java normal. Esto lo consigue integrando el servidor de aplicaciones en el propio *.jar* y levantándolo cuando arrancamos la aplicación.
- Hibernate y JPA
    - JPA: son las siglas de  Java Persistence API. Esta herramienta Permite tener una metodología de tener objetos en nuestro entorno Java y que esos objetos sean un reflejo de las diferentes tablas de la base de datos, de tal manera que nosotros modifiquemos nuestros objetos y en la base de datos se vean reflejados esos cambios. Este reflejo se consigue mediante el uso de las *@Anotaciones* que nos proporciona.
    - Hibernate: por su parte, es un framework para poder mapear nuestra base de datos con el código a tráves de entidades POJO (Plain-Old Java Object). Hibernate nos permite consumir nuestras tablas SQL a través de entidades y repositorios o crear dichas tablas si no existen a través de nuestras entidades.
    - HQL: es el lenguaje de consulta de datos de Hibernate, está completamente orientado a objetos y comprende nociones como herencia, polimorfismo y asociación, lo cual, nos facilita y agiliza mucho la labor de consultar la BD.
- PHP
    Utilizaremos este lenguaje de programación para generar cierta información que será transmitida al lado del cliente desde el servidor gracias a su simplicidad, avanzadas características y la posibilidad de enmascarar los procesos y el codigo tras los que subyacen la apariencia que se muestra al cliente, mejorando su experiencia.

##  Frontend.

De cara al diseño, estructura y desarrollo del clientsido(lado cliente) usaremos las siguientes herramientas y tecnologías:
- Visual Studio Code
    - Como base para el front usaremos este editor de código fuente debido a su versatilidad, la cantidad de herramientas(plugins) con las que cuenta en su store, su soporte para la depuración de codigo, el resaltado de sintaxis, su adaptabilidad a numerosos lenguajes de programación y al hecho de, al igual que MySql, ser una herramienta opensource.
    - Integración contínua: Gracias a la posibilidad de vincularse con GitHub, nos permitirá el acceso, modificación y creación de nuevos documentos y paqueterías desde el propio editor, otorgándonos la posibilidad de actualizar el repositorio directamente desde él.
- HTML5, CSS3 y BootStrap4
    - HTML5: define una estructura básica y un código para la definición de contenido de una página web de las vistas del usuario. Utilizaremos como base este lenguaje de marcado integrado en los archivos de la *Vista* de MVC.
    - CSS3: el uso de este lenguaje de diseño gráfico para definir y crear la presentación del documento, así como para determinar qué reglas de estilo se aplican si más de una regla coincide para un elemento en particular.
    - Bootstrap4: es una biblioteca que contiene plantillas de diseño con tipografía, formularios, botones, cuadros, menús de navegación y otros elementos de diseño basado en HTML y CSS, es modular, compatible con la mayoría de los navegadores web y modificable desde sus archivos o mediante el uso de hojas de estilo *CSS* que se superpongan a las dadas por la biblioteca.
- JAVASCRIPT, JQUERY y AJAX
    - Su uso viene motivado por la necesidad de dotar de dinamismo el aplicativo, puesto que no se trata de una web de contenido estático, sino una aplicación web en constante cambio, independientemente de que el usuario recargue o no la pestaña del navegador.
    - JavaScript: Este lenguaje de programación orientado a objetos nos permitirá proporcionar mecanismos a la web para la resolución de eventos que sucedan.
    - JQuery: es una biblioteca de *JavaScript* que nos v a permitir simplificar la forma de interactuar con el documento HTML, manipular el arbol DOM, manejar eventos, desarrollar animaciones y agregar interaccion mediante *AJAX*.
    - AJAX: Nos proporcionará mecanismos para realizar cambios sobre las páginas sin necesidad de recargarlas (de forma asíncrona), mejorando la interactividad, velocidad y usabilidad en las aplicaciones.

  
## Documentación.

La documentación, control de versiones, gestion del proyecto, integración contínua, control de errores y organización del proyecto correrá a cargo de las siguientes herramientas:
- Trello: usaremos este software para la administración del proyecto y la organización de las tareas a realizar.
- GitHub: para alojar el proyecto y el control de las distintas versiones y *ramas*.
- SourceTree: nos proporcionará una interfaz gráfica amigable, intuitiva y dinámica de nuestro repositorio para el manejo de versiones gracias a su vinculación con Spring de forma que podamos crear, modificar y actualizar el repositorio de *GitHub* desde esta interfaz, mejorando el rendimiento, y facilitando el proceso.
- Jenkins: es un servidor de automatización de código abierto autónomo que se puede utilizar para automatizar todo tipo de tareas relacionadas con la creación, prueba y entrega o implementación de software de cara a la generación de pruebas, la detección y el control de errores; y la integración contínua. La posibilidad de vincularse con GitHub es otro de los factores que nos lleva a su uso.