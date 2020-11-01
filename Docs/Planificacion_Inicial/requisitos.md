# Requisitos.

En este apartado del proyecto describiremos los requisitos, las posibles acciones que los usuarios podrán llevar a cabo en la aplicación.

- El sistema puede interrumpir el acceso al juego por parte de un usuario no registrado o cuyas credenciales hayan caducado.

- El sistema debe guardar en la base de datos del sistema datos referentes a los usuarios registrados.

- El sistema debe informar a los usuarios sobre la aceptacion o no del envio de correos a su dirección e-mail para informarle de nuevas ofertas y noticias en el formulario de **Registro**.

- El sistema debe encriptar las contraseñas a la hora de introducirlas en la base de datos por motivos de segudirad y confidencialidad, el metodo de encriptación sera MD5
## Usuarios Registrados.

- El Aplicativo debe mostrarse visualmente a los usuarios del mismo modo que si no estuvieran registrados excepto que ya estén Loggeados en la aplicacion
## Usuarios Logeados.

- El aplicativo debe permitir al usuario ya Logueado acceder a **NeoMat** manteniendo su acceso mientras el usuario no haya pulsado en el botón de **LogOut**. así mismo podrá navegar por las diferentes pestañas y pantallas del juego del mismo modo sin perder sus credenciales.

- El sistema deberá desconectar a un usuario y borrar su Token de acceso si el usuario no actualiza o efectua ningún cambio en la aplicacion durante 10 minutos.


## Ususarios no Logueados.

- El usuario puede aceder a la pestaña **NeoMat** para ver una descripcion y enlaces de interás sobre el juego.

- El usuario puede Registrarse mediante la pestaña **Registro**.

- El usuario puede Acceder al juego mediante la pestaña de **Login**.

## Usuarios Logeados.

- El usuario puede aceder a la pestaña **NeoMat** para ver una descripcion y enlaces de interás sobre el juego.

- El usuario puede desconectarse mediante el botón **LogOut** de la parte superior de la ventana.


## En el Juego.

- El usuario puede acceder a las pestañas **Vision General**, **Edificios**, **Investigacion**, **Vehiculos**, **Belicismo** y **Planeta** mediante el Submenú disponible del juego
- En la parte superior de la ventana, debajo del submenú, aparecera una información sobre la cantidad de recursos por hora que el usuario está recogiendo y la cantidad actual que posee.

### Vision General.

- El usuario podrá visualizar el estado general de su partida (Recursos recogidos por hora, Cantidad de puntos, Ubicación de su asentamiento, etc...).
- Otro usuario diferente al propietario del asentamiento podrá iniciar acciones belicas haciendo clic sobre un botón situado en la parte inferior de la vista, redirigiéndole esta a la pestaña **Belicismo** cuyo campo "Ubicación" será autocompletado por el sistema con los datos de ubicación obtenidos de la pestaña anterior.

### Edificios.

- El usuario podrá ver el nivel actual de sus edificios construidos superpuesto a la imagen del edificio en cuestión.
- El usuario podrá diferenciar entre edificios cuyos requisitos de construcción estén cumplidos (independientemente del nivel que tengan) y sin cumplir en función de la coloracion del edificio (a color si ya están completos, o en blanco y negro si aun no lo están).
- El usuario podrá acceder a una ventana específica del edificio en cuestión haciendo clic sobre el edificio, permitiendole ver una informacion mas detallada del mismo.
- El usuario podrá aumentar el nivel de sus edificios haciendo click sobre un icono superpuesto en la imagen del edificio.
- El usuario podrá ver en tiempo real el tiempo que queda para que finalice la construcción mediante un temporizador superpuesto a la imagen del edificio.

### Investigación.

- El usuario podrá ver el nivel actual de sus investigaciones construidas superpuesto a la imagen de la investigación en cuestión.
- El usuario podrá diferenciar entre investigaciones cuyos requisitos haya cumplido (independientemente del nivel que tengan) y sin hacer en función de la coloracion de la investigacion (a color si ya están cumplidos, o en blanco y negro si aun no lo están).
- El usuario podrá acceder a una ventana específica de la investigacion en cuestión haciendo clic sobre ella, permitiendole ver una informacion mas detallada de la misma.
- El usuario podrá aumentar el nivel de sus investigaciones haciendo click sobre un icono superpuesto en la imagen de la investigacion.
- El usuario podrá ver en tiempo real el tiempo que queda para que finalice la investigación mediante un temporizador superpuesto a la imagen de la investigación.

### Vehículos.

- El usuario podrá ver la cantidad de vehículos construidos del mismo modelo superpuesto a la imagen del vehículo en cuestión.
- El usuario podrá diferenciar entre vehículo cuyos requisitos de construcción estén cumplidos (independientemente de su cantidad que tengan) en función de la coloracion del vehículo (a color si ya están completos, o en blanco y negro si aun no lo están).
- El usuario podrá acceder a una ventana específica del edificio en cuestión haciendo clic sobre el edificio, permitiendole ver una informacion mas detallada del mismo.
- El usuario podrá aumentar el nivel de sus edificios haciendo click sobre un icono superpuesto en la imagen del edificio.
- El usuario podrá ver en tiempo real el tiempo que queda para que finalice la construcción mediante un temporizador superpuesto a la imagen del edificio.

### Belicismo.

- El usuario podrá emprender un ataque contra otro jugador desde esta pestaña, completando los campos "Ubicacion"(Si no viene redirigido desde la pestaña **Vision General** del otro usuario), y una lista de campos con nos nombres al lado de cada vehículo para seleccionar su cantidad.
- Para validar su ataque y enviarlo, el usuario deberá hacer clic en el botón "Enviar Tropas" una vez completados al menos el campo "Ubicación" y habiendo seleccionado al menos una unidad de algún tipo de vehículo.
- El usuario atacante verá en tiempo real, en sus pestañas **Vision General** y **Belicismo** tanto el tiempo restante hasta que su ataque llegue al asentamiento rival como el tiempo total (ida+vuelta).
- El usuario atacado verá en tiempo real, en su pestaña **Vision General* El tiempo restante hasta que el ataque llegue a su asentamiento.

- El sistema calculará la cantidad máxima en función a la cantidad de vehículos de ese tipo creados por el usuario atacante menos la cantidad de vehículos de ese tipo ya enviados en otro ataque y que aun no haya vuelto).
- El sistema calculará el tiempo restante en función del tiempo de viaje del vehículo mas lento(cada vehículo tiene un tiempo de viaje diferente) y de la distancia al asentamiento atacado.

### Planeta.

- El usuario tendrá una vista de su región en la que podrá ver que jugadores están asentados en la misma que él.
- El usuario podrá mover la vista de región, mediante unos campos en los que indicará que continente, país y región quiere visualizar (C:P:R) y el sistema le devolverá una vista de dicha región con sus asentamientos.
- El usuario podrá acceder a la pestaña **Perfil** (Será una vista de la pestaña **Vision General** de otro usuario) haciendo clic sobre el nombre del asentamiento de otro usuario en la vista de región.
