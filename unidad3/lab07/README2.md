# GUÍA DE PRÁCTICA N.° 02

# Desarrollo de ejercicios básicos de programación en Java

## 1. Objetivo

Fortalecer las habilidades de programación utilizando el lenguaje Java mediante la resolución de problemas prácticos relacionados con operaciones matemáticas, procesamiento de información, estructuras de control, ciclos, métodos y arreglos.

Al finalizar la práctica, el estudiante será capaz de desarrollar pequeños programas de consola, organizar instrucciones mediante métodos y resolver problemas aplicando lógica de programación.

## 2. Requisitos

- Tener instalado el JDK (Java Development Kit).
- Disponer de Visual Studio Code, IntelliJ IDEA o NetBeans.
- Conocer los comandos básicos de compilación y ejecución de Java.
- Haber desarrollado ejercicios básicos de variables, operadores y estructuras de control.

**Verificar la instalación:**

```bash
java -version
javac -version
```

## 3. Ejercicios de programación en Java

### Ejercicio 01: Información personal y operaciones básicas

Desarrollar un programa denominado `InformacionPersonal.java` que solicite los datos personales de un estudiante.

**Requerimientos:**

1. Solicitar nombres y apellidos.
2. Solicitar edad.
3. Solicitar carrera profesional.
4. Solicitar ciclo académico.
5. Mostrar toda la información ingresada.
6. Calcular cuántos años tendrá el estudiante dentro de cinco años.

**Ejemplo de ejecución:**

```text
Ingrese sus nombres y apellidos: Juan Perez
Ingrese su edad: 20
Ingrese su carrera: Ingenieria de Sistemas
Ingrese su ciclo: 4

========= DATOS DEL ESTUDIANTE =========
Nombre: Juan Perez
Edad actual: 20
Carrera: Ingenieria de Sistemas
Ciclo: 4
Edad dentro de cinco años: 25
```

### Ejercicio 02: Variables y tipos de datos

Desarrollar un programa denominado `DatosProducto.java` que permita almacenar información de un producto.

**Requerimientos:**

Declarar variables para almacenar:

- Nombre del producto (`String`).
- Código del producto (`int`).
- Precio unitario (`double`).
- Cantidad disponible (`int`).
- Categoría (`char`).
- Disponibilidad (`boolean`).

**Actividades:**

1. Mostrar los datos del producto.
2. Calcular el valor total del inventario.
3. Incrementar el precio del producto en un 10 %.
4. Mostrar el nuevo precio.
5. Determinar el valor total del inventario después del incremento.

### Ejercicio 03: Entrada de datos y cálculo de remuneraciones

Desarrollar un programa denominado `CalculoSueldo.java` que permita calcular el sueldo de un trabajador.

**Requerimientos:**

Solicitar los siguientes datos:

- Nombre del trabajador.
- Horas trabajadas.
- Pago por hora.
- Bonificación adicional.

**Calcular:**

1. Sueldo básico.
2. Bonificación.
3. Sueldo bruto.
4. Descuento del 10 % por concepto de aportación.
5. Sueldo neto.

**Fórmulas:**

```java
Sueldo básico = Horas trabajadas * Pago por hora

Sueldo bruto = Sueldo básico + Bonificación

Descuento = Sueldo bruto * 0.10

Sueldo neto = Sueldo bruto - Descuento
```

Mostrar un reporte con todos los resultados.

### Ejercicio 04: Operadores aritméticos y matemáticos

Desarrollar un programa denominado `CalculadoraGeometrica.java`.

El programa debe permitir realizar cálculos geométricos.

**Actividades:**

1. Calcular el área y perímetro de un cuadrado.
2. Calcular el área y perímetro de un triángulo.
3. Calcular el volumen de un cubo.
4. Calcular el volumen de un cilindro.
5. Convertir kilómetros a metros.
6. Convertir horas a minutos y segundos.

**Fórmulas:**

```java
Área del cuadrado = lado * lado

Perímetro del cuadrado = 4 * lado

Área del triángulo = (base * altura) / 2

Volumen del cubo = lado * lado * lado

Volumen del cilindro = PI * radio * radio * altura

Metros = kilómetros * 1000
```

Utilizar variables de tipo `double` para almacenar los resultados.

### Ejercicio 05: Estructuras condicionales

Desarrollar un programa denominado `EvaluacionAcademica.java` que permita evaluar el rendimiento académico de un estudiante.

**Requerimientos:**

Solicitar tres notas y calcular el promedio.

Determinar la condición del estudiante según los siguientes criterios:

| Promedio | Condición |
|:---:|:---|
| 18 a 20 | Excelente |
| 15 a 17.99 | Bueno |
| 11 a 14.99 | Regular |
| 0 a 10.99 | Desaprobado |

**Actividades adicionales:**

1. Determinar si un número ingresado es divisible entre 3 y 5.
2. Identificar el menor de cuatro números.
3. Determinar si un año es bisiesto.
4. Calcular el descuento de una compra según el importe:
   - Mayor o igual a S/ 500: 20 %.
   - Mayor o igual a S/ 300: 15 %.
   - Mayor o igual a S/ 100: 10 %.
   - Menor a S/ 100: sin descuento.

Validar que las notas ingresadas estén entre 0 y 20.

### Ejercicio 06: Estructuras repetitivas

Desarrollar un programa denominado `OperacionesCiclicas.java` utilizando las estructuras `for`, `while` y `do-while`.

**Actividades:**

1. Mostrar los números del 100 al 1 en orden descendente.
2. Mostrar los múltiplos de 3 comprendidos entre 1 y 100.
3. Calcular el factorial de un número.
4. Calcular la suma de los números pares comprendidos entre 1 y N.
5. Solicitar números al usuario hasta que ingrese el número cero.
6. Contabilizar cuántos números positivos y negativos fueron ingresados.

**Ejemplo de ejecución:**

```text
Ingrese un numero (0 para terminar): 10
Ingrese un numero (0 para terminar): -5
Ingrese un numero (0 para terminar): 8
Ingrese un numero (0 para terminar): -3
Ingrese un numero (0 para terminar): 0

Numeros positivos: 2
Numeros negativos: 2
```

### Ejercicio 07: Métodos y reutilización de código

Desarrollar un programa denominado `OperacionesMetodos.java`.

**Crear los siguientes métodos:**

1. `calcularAreaRectangulo(double base, double altura)`: devuelve el área de un rectángulo.
2. `calcularFactorial(int numero)`: devuelve el factorial de un número.
3. `esPrimo(int numero)`: determina si un número es primo.
4. `calcularPromedio(double n1, double n2, double n3)`: devuelve el promedio de tres notas.
5. `mostrarTabla(int numero)`: muestra la tabla de multiplicar.
6. `mostrarMensaje()`: imprime un mensaje de bienvenida.

**Actividades:**

- Invocar todos los métodos desde el método `main()`.
- Mostrar los resultados de cada operación.
- Utilizar parámetros y valores de retorno.
- Evitar repetir instrucciones innecesariamente.

### Ejercicio 08: Arreglos unidimensionales

Desarrollar un programa denominado `ArregloNotas.java` que permita almacenar las notas de diez estudiantes.

**Requerimientos:**

1. Declarar un arreglo de tipo `double` con capacidad para diez notas.
2. Solicitar las diez notas mediante teclado.
3. Mostrar todas las notas registradas.
4. Calcular el promedio general.
5. Identificar la nota mayor.
6. Identificar la nota menor.
7. Contabilizar estudiantes aprobados y desaprobados.
8. Mostrar cuántos estudiantes obtuvieron una nota superior al promedio.

**Consideraciones:**

- Utilizar ciclos `for` para recorrer el arreglo.
- Validar las notas entre 0 y 20.
- Utilizar métodos para realizar los cálculos.

### Ejercicio 09: Menú de operaciones matemáticas

Desarrollar un programa denominado `MenuMatematico.java`.

El programa debe presentar el siguiente menú:

```text
==================================
       MENU MATEMATICO
==================================
1. Sumar dos numeros
2. Restar dos numeros
3. Multiplicar dos numeros
4. Dividir dos numeros
5. Calcular potencia
6. Calcular raiz cuadrada
7. Salir
==================================
Seleccione una opcion:
```

**Requerimientos funcionales:**

- Solicitar dos números cuando corresponda.
- Ejecutar la operación seleccionada.
- Mostrar el resultado.
- Validar la división entre cero.
- Validar que no se calcule la raíz cuadrada de un número negativo.
- Repetir el menú hasta seleccionar la opción 7.

**Consideraciones técnicas:**

- Utilizar `Scanner`.
- Utilizar `switch`.
- Utilizar `do-while`.
- Implementar métodos para cada operación.
- Validar las opciones del menú.

## 4. Trabajo de laboratorio integrador

### Título: Sistema de gestión de ventas de una tienda

**Objetivo:**

Desarrollar una aplicación de consola que permita registrar productos, controlar ventas y calcular los ingresos de una pequeña tienda, integrando los conocimientos adquiridos durante la práctica.

### Descripción del problema

Una tienda necesita un sistema básico para registrar sus productos y controlar las ventas realizadas durante el día.

El programa debe presentar el siguiente menú:

```text
========================================
       SISTEMA DE GESTION DE VENTAS
========================================
1. Registrar producto
2. Mostrar productos registrados
3. Buscar producto por codigo
4. Registrar venta
5. Mostrar total de ventas
6. Mostrar producto con mayor precio
7. Mostrar cantidad de productos disponibles
8. Salir
========================================
Seleccione una opcion:
```

### Requerimientos funcionales

**RF01. Registrar producto**

Solicitar los siguientes datos:

- Código del producto.
- Nombre del producto.
- Precio unitario.
- Cantidad disponible.

Almacenar la información en arreglos.

**RF02. Mostrar productos registrados**

Mostrar todos los productos registrados, incluyendo:

- Código.
- Nombre.
- Precio.
- Cantidad disponible.

**RF03. Buscar producto**

Solicitar el código de un producto y mostrar sus datos.

Si el producto no existe, mostrar un mensaje indicando que no fue encontrado.

**RF04. Registrar venta**

Solicitar el código del producto y la cantidad que desea comprar el cliente.

El sistema debe:

- Verificar que el producto exista.
- Verificar que exista suficiente stock.
- Calcular el importe de la venta.
- Actualizar la cantidad disponible.
- Acumular el importe en el total de ventas.

**RF05. Mostrar total de ventas**

Mostrar el importe acumulado de todas las ventas realizadas.

**RF06. Mostrar producto con mayor precio**

Identificar y mostrar el producto que tenga el precio unitario más elevado.

**RF07. Mostrar cantidad de productos disponibles**

Mostrar la cantidad total de unidades disponibles en el inventario.

**RF08. Menú interactivo**

El menú debe repetirse hasta que el usuario seleccione la opción Salir.

### Consideraciones técnicas

- Utilizar `Scanner` para ingresar información.
- Utilizar arreglos para almacenar los productos.
- Utilizar variables de tipo `String`, `int`, `double` y `boolean`.
- Utilizar estructuras condicionales `if-else` y `switch`.
- Utilizar ciclos `while`, `do-while` o `for`.
- Implementar métodos para organizar las operaciones.
- Permitir registrar como máximo 30 productos.
- Validar que los precios sean mayores que cero.
- Validar que las cantidades sean mayores que cero.
- Evitar códigos de productos duplicados.
- Evitar realizar ventas con cantidades superiores al stock disponible.

### Ejemplo de ejecución

```text
Seleccione una opcion: 1

Codigo del producto: 101
Nombre del producto: Teclado
Precio unitario: 80
Cantidad disponible: 10

Producto registrado correctamente.

Seleccione una opcion: 4

Codigo del producto: 101
Cantidad a comprar: 2

========== DETALLE DE VENTA ==========
Producto: Teclado
Precio unitario: S/ 80.00
Cantidad: 2
Importe total: S/ 160.00

Venta realizada correctamente.
Stock disponible: 8
```

## 5. Preguntas de comprensión

Responder las siguientes preguntas en el archivo `README.md`.

**Pregunta 1.** ¿Qué diferencia existe entre utilizar variables individuales y arreglos para almacenar información en Java? Presentar un ejemplo de cada uno.

**Pregunta 2.** ¿Qué es un método en Java? Explicar la diferencia entre un método que utiliza `void` y otro que devuelve un valor mediante `return`.

**Pregunta 3.** ¿Qué diferencias existen entre las estructuras condicionales `if-else` y `switch`? ¿En qué situaciones conviene utilizar cada una?

**Pregunta 4.** ¿Qué es un arreglo unidimensional en Java y cuáles son sus principales ventajas para almacenar y procesar información?

**Pregunta 5.** ¿Por qué es importante validar los datos ingresados por el usuario? Presentar dos ejemplos de validaciones aplicadas a los ejercicios desarrollados.

## 6. Criterios de evaluación

| Criterio | Puntaje |
|:---|:---:|
| Desarrollo de ejercicios 01 al 04 | 3 puntos |
| Desarrollo de ejercicios 05 al 07 | 4 puntos |
| Desarrollo de ejercicios 08 y 09 | 3 puntos |
| Funcionamiento del sistema de gestión de ventas | 6 puntos |
| Organización del código y uso de métodos | 1 punto |
| Respuestas a las cinco preguntas | 1 punto |
| README y evidencias de ejecución | 2 puntos |
| **TOTAL** | **20 puntos** |

## 7. Entregables

El estudiante deberá presentar:

1. Código fuente completo de los ejercicios desarrollados.
2. Código fuente del sistema de gestión de ventas.
3. Archivo `README.md` con la descripción del proyecto, requisitos e instrucciones de compilación y ejecución.
4. Capturas de pantalla que evidencien el funcionamiento de los programas.
5. Repositorio GitHub con todos los archivos del proyecto.

## 8. Reflexión final

El desarrollo de los ejercicios propuestos permitirá fortalecer el pensamiento lógico y la capacidad de resolver problemas mediante el lenguaje de programación Java.

La aplicación de variables, operadores, estructuras condicionales, ciclos, métodos y arreglos constituye una base fundamental para desarrollar programas más organizados y funcionales.

Estos conocimientos permitirán avanzar hacia el estudio de la programación orientada a objetos, trabajando posteriormente con clases, objetos, constructores, encapsulamiento, herencia y polimorfismo.
