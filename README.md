# IMCWeb - Sistema de Cálculo de IMC

## Descripción

IMCWeb es una aplicación web desarrollada en Java que permite gestionar usuarios, realizar cálculos del Índice de Masa Corporal (IMC) y consultar el historial de resultados almacenados.

El sistema permite el registro de usuarios, autenticación, cálculo del IMC y consulta de información mediante una aplicación web basada en tecnologías Java.

## Objetivo del proyecto

Desarrollar una aplicación web utilizando Java y tecnologías empresariales para aplicar conceptos de programación orientada a objetos, arquitectura MVC, conexión con base de datos y servicios REST.

## Tecnologías utilizadas

- Java
- Maven
- Jakarta EE
- JSP
- Servlets
- MySQL
- JPA
- REST API
- Git y GitHub

## Arquitectura del sistema

La aplicación utiliza el patrón Modelo-Vista-Controlador (MVC):

- **Modelo:** contiene las clases encargadas de representar los datos y la lógica del sistema.
- **Vista:** contiene las páginas JSP utilizadas para la interacción con el usuario.
- **Controlador:** contiene los Servlets encargados de procesar las solicitudes y coordinar las acciones del sistema.

## Funcionalidades principales

- Registro de usuarios.
- Inicio de sesión.
- Cálculo del Índice de Masa Corporal.
- Almacenamiento de historial de cálculos.
- Consulta de historial.
- Servicios REST para manejo de información.

## Estructura del proyecto

```text
src/main/java
 ├── controlador
 ├── dao
 ├── modelo
 ├── rest
 └── util

src/main/webapp
 ├── JSP
 └── WEB-INF

## Control de versiones

El proyecto fue administrado mediante Git y GitHub utilizando las siguientes ramas:

- master
- develop
- feature-registro
- feature-login
- feature-imc
- feature-historial
- feature-rest

Las ramas de funcionalidad fueron integradas mediante merge hacia la rama develop y posteriormente hacia master.

## Versión estable

La versión final del proyecto corresponde al tag:

v1.0