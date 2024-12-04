# author: David Gonzalez
# language: es

Característica: Inicio de sesión
  Yo como analista, realizo inicio de sesión


@test
 Escenario: Iniciar sesión exitosamente
   Dado que el usuario navega a la página inicio de sesión
   Cuando ingresa las credenciales de acceso correctas
   Entonces debería ver la página principal
