# Alcance.

El proyecto pretende favorecer e impulsar el uso del *ocio digital* frente a la imposibilidad actual de diversión en el mundo exterior por la COVID-19.
Inicialmente deberemos recrear un mundo paralelo en el que los usuarios puedan tomar el control de una civilización autodirigida. Tras este paso inicial serán los propios jugadores quienes con sus actos y decisiones irán modelando la partida a nivel global, creando alianzas, rivalidades y haciendo evolucionar sus asentamientos mediante el uso de recursos generados en el propio juego. Para ello debemos tener en cuenta que: 

- El aplicativo debe permitir el registro de nuevos usuarios en el sistema. para posteriormente acceder al juego.

- El aplicativo debe permitir el acceso a usuarios registrados previamente en el sistema mediante un sistema de *Login* por usuario/email y contraseña.

- El aplicativo debe permitir el acceso a administradores en el sistema. Este acceso se realizará mediante el mismo sistema antes mencionado, pero utilizando unas credenciales específicas que el sistema reconocerá como *Administrador*.

- La vista del administrador no permite jugar en el servidor, pero tendra acceso a la informacion publica de los usuarios de cara a penalizaciones o modificaciones que se pidan por parte de usuarios en su información una vez estén registrados (Cambio de nick, fecha de nacimiento, etc...).

- En el caso de un intento de acceso mediante Login por parte de un usuario no registrado, el aplicativo debe redireccionarle a la ventana de **Registro** previamente antes de efectuar la acción requerida por el cliente.

- El aplicativo reenviará al usuario a la ventana de **Login** si un usuario intenta acceder a cualquier direccion URL desde el navegador excepto las de **NeoMat**,**Registro** y **Login**.

- El aplicativo mostrará como pantalla inicial la pestaña de **Juego** y junto a ella un menú con las pestañas **NeoMat**, **LogOut**(esto será un botón de desconexión).

- El aplicativo debe mostrar una forma de salir del sistema(desconexión) mediante un LogOut en todas las pestañas una vez el usuario haya accedido al sistema.