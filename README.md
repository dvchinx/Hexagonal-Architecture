# 📁 Hexagonal-Architecture  

Este proyecto demuestra el uso de la **Arquitectura Hexagonal** en una aplicación desarrollada en **Java** utilizando **Maven**, **Spring Framework 3.2.2**, **Spring Data JPA**, y una base de datos **PostgreSQL**.  

El propósito principal es proporcionar una API REST que permita interactuar con una base de datos llamada `school` y realizar operaciones CRUD en la tabla `students`, la cual contiene información básica de los estudiantes.  

## Tabla de contenidos  
- [Características](#características)  
- [Arquitectura](#arquitectura)  
- [Requisitos](#requisitos)  
- [Instalación](#instalación)  
- [Endpoints de la API](#endpoints-de-la-api)  
- [Base de Datos](#base-de-datos)  

---

## Características  
- Implementación de la **Arquitectura Hexagonal**, favoreciendo la independencia de la lógica de negocio respecto de los frameworks y tecnologías utilizadas.  
- Uso de **Spring Data JPA** para la comunicación con la base de datos PostgreSQL.  
- API RESTful con operaciones CRUD completas para la tabla `students`.  
- Base de datos inicializada con un conjunto de datos predefinido mediante un script SQL.  

---

## Arquitectura  
La **Arquitectura Hexagonal** se utiliza para separar claramente la lógica de negocio del acceso a datos, la exposición de servicios y las interacciones con el exterior.  
Esto asegura un diseño limpio, testeable y desacoplado, lo que facilita la evolución y mantenimiento del proyecto.  

### Componentes principales:  
- **Aplicación**: Contiene la lógica de negocio.  
- **Adaptadores**:  
  - Entrantes: Controladores REST.  
  - Salientes: Repositorios basados en Spring Data JPA para interactuar con PostgreSQL.  
- **Modelo de Dominio**: Representa las entidades y reglas del negocio.  

---

## Requisitos  
- **Java 21**.  
- **Maven 3.8**.  
- **PostgreSQL 14**.  
- **Spring Framework 3.2.2**.  

---

## Instalación  

1. Clona el repositorio:  
   ```bash
   git clone https://github.com/tu-usuario/Hexagonal-Architecture.git
   cd Hexagonal-Architecture

2. Configura la base de datos en el archivo application.properties:

    ```
    spring.datasource.url=jdbc:postgresql://localhost:5432/school
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=create
    spring.jpa.show-sql=true
3. Ejecuta el proyecto:

    ```
    mvn spring-boot:run
## Endpoints de la API
El proyecto expone los siguientes endpoints REST para interactuar con la tabla `students`.  

| Método HTTP | Endpoint               | Descripción                      |  
|-------------|------------------------|----------------------------------|  
| `GET`       | `/students/v1/api`     | Listar todos los estudiantes     |  
| `GET`       | `/students/v1/api/{id}`| Buscar estudiante por ID         |  
| `POST`      | `/students/v1/api`     | Guardar un estudiante nuevo      |  
| `PUT`       | `/students/v1/api/{id}`| Actualizar un estudiante         |  
| `DELETE`    | `/students/v1/api/{id}`| Eliminar un estudiante           |  

### Ejemplo de cuerpo para **POST**:  

  ```
  {
    "firstname": "Luis",
    "lastname": "Pérez",
    "age": 25,
    "address": "Calle 5"
  }
  ```

## Base de Datos  

### Script de inicialización (`data.sql`):  
```sql
INSERT INTO students (id, firstname, lastname, age, address) VALUES
(1, 'Juan', 'Mendoza', 28, 'Calle 1');

INSERT INTO students (id, firstname, lastname, age, address) VALUES
(2, 'Pedro', 'Ramirez', 30, 'Calle 2');

INSERT INTO students (id, firstname, lastname, age, address) VALUES
(3, 'Pepito', 'Jimenez', 10, 'Calle 3');

INSERT INTO students (id, firstname, lastname, age, address) VALUES
(4, 'Carmen', 'Velasquez', 40, 'Calle 4');
