## Ejercicios sesiones 7, 8 y 9

### Ejercicio 1

Implementar los métodos CRUD en el API REST de Laptop creada en ejercicios anteriores.
Los métodos CRUD:
* findAll()
* findOneById()
* create()
* update()
* delete()
* deleteAll()

### Ejercicio 2

Implementar swagger sobre el API REST de Laptop y verificar que funciona en la URL:
* http://localhost:8081/swagger-ui/

### Ejercicio 3


Crear casos de test para el controlador de Laptop desde Spring Boot.

Con click derecho dentro del código de la clase LaptopController utilizar la opción Generate > Test para crear la clase con todos los tests unitarios e implementarlos siguiente el proceso visto en clase.


## Ejercicios sesiones 10, 11 y 12

### Ejercicio 1

* Probar a empaquetar la aplicación con maven package desde Intellij IDEA
* Desde terminal en Intellij IDEA verificar que se se ejecuta correctamente con el comando:
  * java -jar target/spring-deploy-1.0.jar
* Crear un perfil para dev y otro para test con una propiedad nueva que carguemos en el controlador.

### Ejercicio 2

* Desplegar el API REST de Laptops en Heroku y verificar funcionamiento desde POSTMAN.

### Ejercicio 3

* Añadir Spring Security sobre el proyecto API REST de Laptops y configurar 2 usuarios en memoria utilizando una clase WebSecurityConfig.