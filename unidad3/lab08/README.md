# LABORATORIO 08: Gestión de colecciones de objetos con JavaBeans y ArrayList

**Curso:** Lenguaje de Programación I  
**Laboratorio:** 08  
**Entorno de desarrollo:** Eclipse IDE  
**Lenguaje:** Java  
**Duración máxima:** 2 horas  
**Modalidad:** Desarrollo práctico individual  
**Tema integrador:** Sistema de gestión de una biblioteca

---

## 1. Introducción

En este laboratorio desarrollaremos progresivamente una aplicación de consola en Java para gestionar los libros y sus préstamos en una biblioteca.

El propósito es aplicar los conceptos de programación orientada a objetos mediante el uso de clases JavaBean y estructuras de datos dinámicas, específicamente `ArrayList`.

La práctica está organizada en tres ejercicios secuenciales: básico, intermedio y avanzado. Cada ejercicio amplía la funcionalidad del anterior, reutilizando las clases y los archivos creados desde el inicio.

El desarrollo se realizará en Eclipse IDE y se utilizará Git para registrar la evolución del proyecto mediante tres commits obligatorios.

**Importante:** No se deben crear tres proyectos independientes. Los tres ejercicios forman parte de un único proyecto Java que evolucionará progresivamente.

## 2. Objetivos de aprendizaje

Al finalizar el laboratorio, el estudiante será capaz de:

1. Crear y configurar un proyecto Java utilizando Eclipse IDE.
2. Diseñar clases JavaBean aplicando encapsulamiento.
3. Implementar atributos privados, constructores, getters y setters.
4. Crear y administrar colecciones de objetos utilizando `ArrayList`.
5. Implementar operaciones para agregar, listar, buscar, modificar y eliminar objetos.
6. Relacionar objetos de diferentes clases JavaBean.
7. Aplicar validaciones y controlar la disponibilidad de los libros.
8. Utilizar Git para registrar la evolución incremental de una solución.
9. Documentar el proceso de desarrollo y las funcionalidades implementadas.

## 3. Requisitos técnicos

Antes de comenzar, verificar que se cuenta con los siguientes recursos:

| Recurso | Requisito |
|---|---|
| IDE | Eclipse IDE for Java Developers |
| JDK | Java 17 o superior |
| Control de versiones | Git |
| Repositorio | GitHub o plataforma institucional |
| Tipo de aplicación | Aplicación Java de consola |
| Estructura de datos | ArrayList |
| Modelo de objetos | Clases JavaBean |

No se requiere conexión a una base de datos. Toda la información se almacenará temporalmente en colecciones `ArrayList` durante la ejecución del programa.

## 4. Distribución del tiempo

La duración máxima del laboratorio es de 120 minutos.

| Actividad | Tiempo |
|---|---:|
| Configuración de Eclipse y creación del proyecto | 10 min |
| Ejercicio 1: Implementación básica | 25 min |
| Ejercicio 2: Administración de libros | 35 min |
| Ejercicio 3: Gestión de préstamos | 40 min |
| Pruebas, documentación y verificación de commits | 10 min |
| **Total** | **120 min** |

Se recomienda respetar el orden de los ejercicios, ya que cada uno utiliza y amplía el código desarrollado anteriormente.

---

# 5. Desarrollo del laboratorio

## Ejercicio 1. Nivel básico: Registro y listado de libros

<sub>Tiempo estimado: 25 minutos</sub>

### Situación problemática

Una biblioteca necesita registrar los libros disponibles en su colección. Actualmente, el personal lleva el registro de los libros de manera manual.

Se solicita desarrollar una aplicación Java que permita registrar libros y mostrar todos los libros almacenados en memoria.

### Actividades

**Paso 1. Crear el proyecto en Eclipse**

1. Abrir Eclipse IDE.
2. Seleccionar un workspace de trabajo.
3. Ir a `File > New > Java Project`.
4. Asignar el nombre `Laboratorio08Biblioteca`.
5. Seleccionar el JDK instalado.
6. Finalizar la creación del proyecto.

**Paso 2. Crear el paquete**

Dentro de `src`, crear el paquete:

`pe.edu.laboratorio08`

**Paso 3. Crear la clase JavaBean Libro**

Crear la clase `Libro.java` con los siguientes atributos privados:

- `codigo`: String.
- `titulo`: String.
- `autor`: String.
- `anioPublicacion`: int.

La clase debe implementar:

- Constructor vacío.
- Constructor con todos los atributos.
- Métodos getters y setters.
- Método `toString()` para representar la información del libro.

La clase debe respetar las convenciones de JavaBean.

**Paso 4. Crear la clase principal**

Crear la clase `Main.java`, que contendrá el método `main()`.

Dentro de esta clase:

1. Crear un `ArrayList<Libro>`.
2. Instanciar al menos tres objetos de tipo `Libro`.
3. Agregar los objetos a la colección mediante `add()`.
4. Recorrer la colección utilizando un ciclo `for` o `for-each`.
5. Mostrar los datos de todos los libros registrados.

### Ejemplo de salida esperada

```text
====================================
       SISTEMA DE BIBLIOTECA
====================================

LISTADO DE LIBROS

Código: L001
Título: Programación en Java
Autor: Juan Pérez
Año: 2022

Código: L002
Título: Estructuras de Datos
Autor: María López
Año: 2023

Código: L003
Título: Programación Orientada a Objetos
Autor: Carlos Torres
Año: 2024

Total de libros registrados: 3
```

### Resultado esperado

Al finalizar este ejercicio, el estudiante debe tener:

- Un proyecto Java funcional en Eclipse.
- Una clase JavaBean denominada `Libro`.
- Una colección `ArrayList<Libro>`.
- Tres objetos registrados y visualizados correctamente.

### Commit 1: Versión básica

Registrar los archivos creados y funcionales mediante el siguiente commit:

```bash
git add .
git commit -m "Commit 1: Implementar registro y listado básico de libros"
```

---

## Ejercicio 2. Nivel intermedio: Administración de libros

<sub>Tiempo estimado: 35 minutos</sub>

### Situación problemática

La biblioteca necesita mejorar su sistema de registro. No es suficiente con almacenar y mostrar libros: también necesita localizar libros específicos, actualizar su información y eliminar registros.

Se solicita ampliar el programa anterior incorporando operaciones de administración sobre la colección `ArrayList`.

**Importante:** Se debe continuar trabajando sobre el mismo proyecto y los mismos archivos del ejercicio anterior.

### Actividades

**Paso 1. Incorporar un menú de opciones**

Modificar `Main.java` para implementar un menú interactivo utilizando `Scanner` y una estructura repetitiva.

El menú debe presentar las siguientes opciones:

```text
====================================
       SISTEMA DE BIBLIOTECA
====================================

1. Registrar libro
2. Listar libros
3. Buscar libro por código
4. Modificar información de libro
5. Eliminar libro
6. Salir

Seleccione una opción:
```

**Paso 2. Implementar el registro de libros**

Implementar la opción 1:

- Solicitar el código del libro.
- Solicitar el título.
- Solicitar el autor.
- Solicitar el año de publicación.
- Crear un objeto `Libro`.
- Agregarlo al `ArrayList` mediante `add()`.

Validar que el código no esté registrado previamente.

**Paso 3. Implementar el listado de libros**

Implementar la opción 2:

- Recorrer el `ArrayList`.
- Mostrar los datos de cada libro.
- Mostrar un mensaje cuando no existan registros.

**Paso 4. Implementar la búsqueda**

Implementar la opción 3:

- Solicitar el código del libro.
- Recorrer la colección.
- Comparar el código ingresado con el código de cada objeto.
- Mostrar los datos del libro encontrado.
- Mostrar un mensaje cuando el libro no exista.

**Paso 5. Implementar la modificación**

Implementar la opción 4:

- Solicitar el código del libro que se desea modificar.
- Buscar el objeto correspondiente.
- Solicitar los nuevos datos.
- Actualizar los atributos utilizando los métodos setters.

**Paso 6. Implementar la eliminación**

Implementar la opción 5:

- Solicitar el código del libro.
- Localizar su posición dentro de la colección.
- Eliminar el registro utilizando `remove()`.

**Paso 7. Incorporar validaciones**

Considerar las siguientes reglas:

- No permitir códigos duplicados.
- No aceptar códigos vacíos.
- No aceptar títulos ni autores vacíos.
- El año de publicación debe ser válido.
- No permitir modificar ni eliminar libros inexistentes.

### Ejemplo de ejecución esperada

```text
====================================
       SISTEMA DE BIBLIOTECA
====================================

1. Registrar libro
2. Listar libros
3. Buscar libro por código
4. Modificar libro
5. Eliminar libro
6. Salir

Seleccione una opción: 1

Ingrese código: L004
Ingrese título: Java Avanzado
Ingrese autor: Pedro Ramírez
Ingrese año: 2025

¡Libro registrado correctamente!

Seleccione una opción: 3

Ingrese código a buscar: L004

LIBRO ENCONTRADO
Código: L004
Título: Java Avanzado
Autor: Pedro Ramírez
Año: 2025
```

### Resultado esperado

Al finalizar este ejercicio, el sistema debe permitir administrar los libros mediante las operaciones CRUD:

- Create: registrar.
- Read: listar y buscar.
- Update: modificar.
- Delete: eliminar.

Se debe continuar utilizando `ArrayList<Libro>` como estructura de almacenamiento.

### Commit 2: Versión intermedia

Registrar los cambios realizados:

```bash
git add .
git commit -m "Commit 2: Implementar administración CRUD de libros"
```

---

## Ejercicio 3. Nivel avanzado: Gestión de préstamos de libros

<sub>Tiempo estimado: 40 minutos</sub>

### Situación problemática

La biblioteca requiere incorporar un módulo de préstamos para controlar qué libros han sido prestados y cuáles se encuentran disponibles.

El sistema debe permitir registrar préstamos, consultar los préstamos realizados y devolver libros.

Para resolver este problema, se deberá crear una segunda clase JavaBean denominada `Prestamo`.

Esta clase estará relacionada con la clase `Libro` desarrollada en los ejercicios anteriores.

### Actividades

**Paso 1. Crear la clase JavaBean Prestamo**

Dentro del mismo paquete, crear la clase `Prestamo.java`.

Incorporar los siguientes atributos privados:

- `codigoPrestamo`: String.
- `libro`: Libro.
- `nombreUsuario`: String.
- `fechaPrestamo`: String.
- `devuelto`: boolean.

Implementar:

- Constructor vacío.
- Constructor con todos los atributos.
- Getters y setters.
- Método `toString()`.

La propiedad `libro` debe ser de tipo `Libro`, no de tipo String. Esto permitirá relacionar directamente el préstamo con el objeto registrado en la biblioteca.

**Paso 2. Incorporar una segunda colección**

En `Main.java`, declarar una colección adicional:

```java
ArrayList<Prestamo> prestamos = new ArrayList<>();
```

El sistema tendrá ahora dos colecciones:

```java
ArrayList<Libro> libros = new ArrayList<>();

ArrayList<Prestamo> prestamos = new ArrayList<>();
```

Cada colección administrará objetos de su respectiva clase JavaBean.

**Paso 3. Ampliar el menú principal**

Agregar las siguientes opciones al menú existente:

```text
====================================
       SISTEMA DE BIBLIOTECA
====================================

1. Registrar libro
2. Listar libros
3. Buscar libro
4. Modificar libro
5. Eliminar libro
6. Registrar préstamo
7. Listar préstamos
8. Registrar devolución
9. Listar libros disponibles
10. Salir

Seleccione una opción:
```

**Paso 4. Implementar el registro de préstamos**

Para registrar un préstamo:

1. Solicitar el código del préstamo.
2. Solicitar el código del libro.
3. Buscar el libro en `ArrayList<Libro>`.
4. Verificar que el libro exista.
5. Verificar que no se encuentre prestado.
6. Solicitar el nombre del usuario.
7. Solicitar la fecha del préstamo.
8. Crear un objeto `Prestamo`.
9. Agregarlo a `ArrayList<Prestamo>`.

La fecha puede ingresarse inicialmente como texto utilizando el formato `dd/MM/yyyy`.

**Paso 5. Implementar el listado de préstamos**

Recorrer la colección `ArrayList<Prestamo>` y mostrar:

- Código del préstamo.
- Código del libro.
- Título del libro.
- Nombre del usuario.
- Fecha del préstamo.
- Estado de devolución.

El estado debe mostrarse como:

- PENDIENTE.
- DEVUELTO.

**Paso 6. Implementar la devolución de libros**

Para registrar una devolución:

1. Solicitar el código del préstamo.
2. Buscar el préstamo correspondiente.
3. Verificar que exista.
4. Verificar que todavía no haya sido devuelto.
5. Cambiar el atributo `devuelto` a `true`.
6. Mostrar un mensaje de confirmación.

La disponibilidad del libro se determinará considerando sus préstamos activos.

**Paso 7. Implementar el listado de libros disponibles**

Recorrer todos los libros registrados y verificar cuáles no tienen préstamos pendientes de devolución.

Mostrar únicamente los libros disponibles.

### Reglas de negocio

El sistema debe respetar las siguientes condiciones:

1. No se puede prestar un libro que no exista.
2. No se puede prestar un libro que ya tenga un préstamo activo.
3. No se puede devolver un préstamo inexistente.
4. No se puede devolver dos veces el mismo préstamo.
5. Al registrar una devolución, el libro vuelve a estar disponible.
6. Un libro con un préstamo activo no debe poder eliminarse.
7. No se pueden registrar dos préstamos con el mismo código.

### Ejemplo de ejecución esperada

```text
====================================
       SISTEMA DE BIBLIOTECA
====================================

Seleccione una opción: 6

REGISTRO DE PRÉSTAMO

Código del préstamo: P001
Código del libro: L001

Libro encontrado: Programación en Java

Nombre del usuario: Ana Torres
Fecha del préstamo: 19/11/2026

¡Préstamo registrado correctamente!

====================================

Seleccione una opción: 7

LISTADO DE PRÉSTAMOS

Código: P001
Libro: Programación en Java
Usuario: Ana Torres
Fecha: 19/11/2026
Estado: PENDIENTE

====================================

Seleccione una opción: 9

LIBROS DISPONIBLES

L002 - Estructuras de Datos
L003 - Programación Orientada a Objetos
L004 - Java Avanzado

====================================

Seleccione una opción: 8

Código del préstamo a devolver: P001

¡Devolución registrada correctamente!

El libro vuelve a estar disponible.
```

### Resultado esperado

Al finalizar el ejercicio, el sistema debe contar con:

- Dos clases JavaBean: `Libro` y `Prestamo`.
- Dos colecciones `ArrayList`.
- Administración CRUD de libros.
- Registro y consulta de préstamos.
- Registro de devoluciones.
- Control de disponibilidad de libros.
- Validaciones para evitar inconsistencias en los registros.

### Commit 3: Versión avanzada

Registrar la versión final:

```bash
git add .
git commit -m "Commit 3: Implementar gestión de préstamos y devoluciones"
```

---

# 6. Estructura final del proyecto

El repositorio debe contener el proyecto completo de Eclipse y el archivo README.md.

La estructura referencial será la siguiente:

```text
Laboratorio08/
│
├── README.md
│
└── Laboratorio08Biblioteca/
    │
    ├── .project
    ├── .classpath
    │
    ├── .settings/
    │
    ├── src/
    │   └── pe/
    │       └── edu/
    │           └── laboratorio08/
    │               ├── Libro.java
    │               ├── Prestamo.java
    │               └── Main.java
    │
    └── bin/
        └── (archivos compilados, opcionales)
```

**Consideraciones:**

- La carpeta `Laboratorio08Biblioteca` debe contener el proyecto Eclipse completo.
- Se deben incluir los archivos `.project` y `.classpath`.
- Se debe incluir el código fuente dentro de `src`.
- Se recomienda incluir `.settings` si contiene configuraciones necesarias del proyecto.
- No es obligatorio incluir `bin`, dado que Eclipse puede generar nuevamente los archivos compilados.
- No se deben entregar únicamente los archivos `.java`.
- El README.md debe estar en la raíz del repositorio, junto a la carpeta del proyecto Eclipse.

# 7. Control de versiones: commits obligatorios

Durante el laboratorio se deben realizar exactamente tres commits de avance, uno por cada ejercicio.

| Commit | Ejercicio | Funcionalidad |
|---|---|---|
| 1 | Básico | Registro y listado de libros |
| 2 | Intermedio | Administración CRUD de libros |
| 3 | Avanzado | Gestión de préstamos y devoluciones |

Los tres commits deben reflejar la evolución del mismo proyecto.

**Importante:**

- No crear un proyecto independiente para cada ejercicio.
- No reemplazar el historial de Git.
- No realizar los tres commits al finalizar toda la práctica.
- Cada commit debe contener los cambios correspondientes a la funcionalidad desarrollada.
- Los archivos creados en el ejercicio básico deben evolucionar en los siguientes ejercicios.

Para verificar el historial, ejecutar:

```bash
git log --oneline
```

El resultado debe evidenciar los tres commits solicitados.

# 8. Pruebas funcionales obligatorias

Antes de entregar el laboratorio, verificar los siguientes escenarios:

| N.º | Prueba | Resultado esperado |
|---|---|---|
| 1 | Registrar un libro | Libro agregado correctamente |
| 2 | Registrar un código duplicado | El sistema rechaza el registro |
| 3 | Listar libros | Se muestran todos los libros |
| 4 | Buscar un libro existente | Se muestran sus datos |
| 5 | Buscar un libro inexistente | Se informa que no existe |
| 6 | Modificar un libro | Se actualiza su información |
| 7 | Eliminar un libro sin préstamo activo | Se elimina correctamente |
| 8 | Registrar un préstamo | Se registra correctamente |
| 9 | Prestar un libro ya prestado | El sistema rechaza la operación |
| 10 | Registrar una devolución | El libro vuelve a estar disponible |
| 11 | Devolver dos veces el mismo préstamo | El sistema rechaza la operación |
| 12 | Listar libros disponibles | Solo aparecen los libros disponibles |

# 9. Documentación del desarrollo

El archivo README.md y el proyecto deben permitir comprender cómo se construyó la solución.

Se debe documentar:

1. Descripción general del problema.
2. Objetivos del laboratorio.
3. Requisitos y herramientas utilizadas.
4. Estructura del proyecto.
5. Descripción de las clases JavaBean.
6. Explicación de las colecciones `ArrayList`.
7. Descripción de cada ejercicio.
8. Funcionalidades implementadas.
9. Validaciones realizadas.
10. Evidencias de ejecución.

Se recomienda incluir capturas de pantalla de:

- Proyecto abierto en Eclipse.
- Clase `Libro.java`.
- Clase `Prestamo.java`.
- Código principal `Main.java`.
- Ejecución del registro y listado de libros.
- Ejecución de las operaciones CRUD.
- Registro y devolución de préstamos.
- Historial de los tres commits.

Las imágenes deben almacenarse en una carpeta `evidencias/` en la raíz del repositorio y referenciarse desde el README.

Ejemplo:

```markdown
## Evidencias

### Ejercicio 1: Registro de libros

![Registro de libros](evidencias/ejercicio01.png)

### Ejercicio 2: Administración CRUD

![Administración de libros](evidencias/ejercicio02.png)

### Ejercicio 3: Gestión de préstamos

![Gestión de préstamos](evidencias/ejercicio03.png)

### Historial de commits

![Historial Git](evidencias/commits.png)
```

# 10. Entregable

Cada estudiante deberá entregar un repositorio Git que contenga:

- El archivo `README.md` con la documentación del laboratorio.
- La carpeta completa del proyecto Eclipse.
- Los archivos fuente Java.
- Las dos clases JavaBean implementadas.
- La aplicación funcional con sus tres niveles de desarrollo.
- Los tres commits obligatorios.
- Las evidencias de ejecución.

**No se aceptarán entregas que contengan únicamente archivos `.java`, capturas de pantalla o fragmentos de código. Se debe entregar el proyecto Eclipse completo y su documentación dentro del repositorio.**

## 11. Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Creación y configuración del proyecto Eclipse | 2 puntos |
| Implementación correcta de las clases JavaBean | 3 puntos |
| Uso y administración de ArrayList | 3 puntos |
| Implementación de operaciones CRUD | 3 puntos |
| Relación entre Libro y Prestamo | 2 puntos |
| Gestión de préstamos, devoluciones y disponibilidad | 3 puntos |
| Validaciones y pruebas funcionales | 2 puntos |
| Documentación, evidencias y tres commits | 2 puntos |
| **TOTAL** | **20 puntos** |

## 12. Recomendaciones finales

- Desarrollar los ejercicios en el orden establecido.
- Mantener el mismo proyecto durante todo el laboratorio.
- Aplicar encapsulamiento en todas las clases JavaBean.
- Evitar utilizar arreglos convencionales para reemplazar las colecciones solicitadas.
- Utilizar `ArrayList` para almacenar y administrar los objetos.
- Evitar duplicar código cuando sea posible.
- Utilizar nombres descriptivos para las variables y métodos.
- Probar cada funcionalidad antes de realizar el commit correspondiente.
- Verificar que el proyecto pueda importarse y ejecutarse correctamente desde Eclipse.

## Referencias
- https://www.youtube.com/watch?v=XQdL-1PRJWw&list=PLAzlSdU-KYwXaX_zidZ3Kns1qdKeN35fO
- https://www.youtube.com/watch?v=0jbDTCLmyiw
- https://www.youtube.com/watch?v=tVJvL4ZuaDo
- https://www.youtube.com/watch?v=Y6W9LA1jIPA
- https://www.youtube.com/watch?v=4T7fxEffnU4
- https://www.youtube.com/watch?v=D0VH50zFVIA
- https://docs.oracle.com/javase/tutorial/collections/index.html
- https://docs.oracle.com/javase/tutorial/javabeans/index.html
- https://docs.oracle.com/javase/tutorial/java/javaOO/index.html
- https://help.eclipse.org/latest/index.jsp
- https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html
---

## ¡Éxitos en el desarrollo del Laboratorio 08!

**Recuerda:** El objetivo no es solamente conseguir que el programa funcione, sino construir una solución progresiva, organizada, reutilizable y documentada, aplicando los fundamentos de programación orientada a objetos en Java.
