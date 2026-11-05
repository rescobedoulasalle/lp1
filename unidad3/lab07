# Introducción al Lenguaje de Programación Java

## 1. Objetivo

Desarrollar habilidades básicas de programación utilizando Java, aplicando variables, tipos de datos, operadores, estructuras de control, ciclos y métodos para resolver problemas sencillos.

## 2. Requisitos

- Tener instalado el JDK (Java Development Kit).
- Disponer de un entorno de desarrollo: Visual Studio Code, IntelliJ IDEA o NetBeans.
- Conocer los comandos básicos de compilación y ejecución de Java.

Verificar la instalación:

```bash
java -version
javac -version
```

## 3. Primer programa en Java

Crear un archivo denominado `HolaMundo.java`.

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
        System.out.println("Bienvenidos a Java");
    }
}
```

Compilar y ejecutar:

```bash
javac HolaMundo.java
java HolaMundo
```

**Ejercicio 01:** Modificar el programa para mostrar los siguientes datos:

- Nombres y apellidos.
- Carrera profesional.
- Universidad.
- Una breve descripción personal.

## 4. Ejercicios de introducción a Java

### Ejercicio 02: Variables y tipos de datos

Declarar variables para almacenar información de un estudiante.

```java
public class DatosEstudiante {
    public static void main(String[] args) {
        String nombre = "Carlos";
        int edad = 20;
        double promedio = 16.5;
        char categoria = 'A';
        boolean matriculado = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Categoría: " + categoria);
        System.out.println("Matriculado: " + matriculado);
    }
}
```

**Actividades:**
1. Modificar los datos del estudiante.
2. Declarar dos variables de tipo entero y calcular su suma.
3. Declarar una variable de tipo `double` para almacenar el promedio de tres notas.

### Ejercicio 03: Entrada de datos por teclado

Utilizar la clase `Scanner` para solicitar información al usuario.

```java
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();

        System.out.println("Hola " + nombre);
        System.out.println("Tu edad es " + edad);

        teclado.close();
    }
}
```

**Actividades:**
1. Solicitar dos números enteros y mostrar su suma.
2. Solicitar el precio de un producto y su cantidad.
3. Calcular e imprimir el importe total de la compra.

### Ejercicio 04: Operadores aritméticos

Implementar una calculadora básica.

```java
public class Operadores {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Residuo: " + (a % b));
    }
}
```

**Actividades:**
1. Calcular el área de un rectángulo.
2. Calcular el área de un círculo.
3. Convertir grados Celsius a Fahrenheit.

### Ejercicio 05: Estructuras condicionales

Determinar si un estudiante aprobó o desaprobó una asignatura.

```java
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la nota: ");
        double nota = teclado.nextDouble();

        if (nota >= 11) {
            System.out.println("Estudiante aprobado");
        } else {
            System.out.println("Estudiante desaprobado");
        }

        teclado.close();
    }
}
```

**Actividades:**
1. Determinar si un número es positivo, negativo o cero.
2. Determinar si un número es par o impar.
3. Identificar el mayor de tres números.
4. Determinar si una persona es mayor de edad.

### Ejercicio 06: Estructuras repetitivas

Utilizar las estructuras `for`, `while` y `do-while`.

```java
public class Ciclos {
    public static void main(String[] args) {

        System.out.println("Ciclo FOR");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Ciclo WHILE");

        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("Ciclo DO-WHILE");

        int numero = 1;

        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 5);
    }
}
```

**Actividades:**
1. Mostrar los números del 1 al 100.
2. Mostrar los números pares del 1 al 50.
3. Calcular la suma de los primeros N números naturales.
4. Mostrar la tabla de multiplicar de un número.

### Ejercicio 07: Métodos

Crear métodos para organizar y reutilizar el código.

```java
public class Metodos {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void mostrarMensaje() {
        System.out.println("Bienvenidos a Java");
    }

    public static void main(String[] args) {
        mostrarMensaje();

        System.out.println("Suma: " + sumar(10, 5));
        System.out.println("Multiplicación: " + multiplicar(10, 5));
    }
}
```

**Actividades:**
1. Crear un método que calcule el cuadrado de un número.
2. Crear un método que determine si un número es par.
3. Crear un método que calcule el promedio de tres notas.

---

## 5. Trabajo de laboratorio: Sistema de registro de estudiantes

<escape>**Título:**</escape> Desarrollo de un programa de registro y evaluación de estudiantes utilizando Java.

**Objetivo:** Integrar los conocimientos adquiridos sobre variables, entrada de datos, operadores, condicionales, ciclos y métodos.

### Descripción del problema

Desarrollar una aplicación de consola que permita registrar y evaluar las notas de varios estudiantes.

El programa debe presentar el siguiente menú:

```text
==================================
    SISTEMA DE REGISTRO
==================================
1. Registrar estudiante
2. Mostrar estudiantes registrados
3. Calcular promedio general
4. Mostrar cantidad de aprobados
5. Salir
==================================
Seleccione una opción:
```

### Requerimientos funcionales

**RF01. Registrar estudiante**

Solicitar los siguientes datos:
- Nombre del estudiante.
- Nota 1.
- Nota 2.
- Nota 3.

Calcular automáticamente el promedio de las tres notas.

**RF02. Mostrar estudiantes**

Mostrar una lista de los estudiantes registrados, incluyendo sus tres notas, promedio y condición (Aprobado o Desaprobado).

**RF03. Calcular promedio general**

Calcular el promedio general de todos los estudiantes registrados.

**RF04. Mostrar cantidad de aprobados**

Contabilizar cuántos estudiantes tienen promedio igual o superior a 11.

**RF05. Menú interactivo**

El menú debe repetirse hasta que el usuario seleccione la opción Salir.

### Consideraciones técnicas

- Utilizar `Scanner` para ingresar información.
- Utilizar arreglos para almacenar los datos.
- Utilizar estructuras condicionales `if-else`.
- Utilizar ciclos `while` o `do-while`.
- Implementar métodos para organizar las operaciones.
- Validar que las notas estén entre 0 y 20.
- Permitir registrar como máximo 20 estudiantes.

### Ejemplo de ejecución

```text
Seleccione una opción: 1

Nombre del estudiante: Ana
Nota 1: 15
Nota 2: 17
Nota 3: 16

Estudiante registrado correctamente.
Promedio: 16.00
Condición: APROBADO
```

### Entregables

1. Código fuente completo del programa.
2. Archivo `README.md` con instrucciones de compilación y ejecución.
3. Capturas de pantalla que evidencien el funcionamiento.
4. Repositorio GitHub con el proyecto desarrollado.

---

## 6. Preguntas de comprensión

Responder las siguientes cuatro preguntas en el archivo README.md.

**Pregunta 1.** ¿Cuál es la diferencia entre JDK, JRE y JVM? ¿Qué función cumple cada uno dentro del entorno Java?

**Pregunta 2.** ¿Cuál es la diferencia entre declarar una variable de tipo `int` y una variable de tipo `double`? Presentar un ejemplo de cada una.

**Pregunta 3.** ¿Qué diferencias existen entre las estructuras repetitivas `for`, `while` y `do-while`? ¿En qué situaciones utilizarías cada una?

**Pregunta 4.** ¿Qué ventajas ofrece utilizar métodos en Java en lugar de escribir todas las instrucciones dentro del método `main()`?

---

## 7. Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Desarrollo de ejercicios 01 al 04 | 4 puntos |
| Desarrollo de ejercicios 05 al 07 | 4 puntos |
| Funcionamiento del sistema de registro | 6 puntos |
| Organización del código y uso de métodos | 2 puntos |
| Respuestas a las cuatro preguntas | 2 puntos |
| README y evidencias de ejecución | 2 puntos |
| **TOTAL** | **20 puntos** |

## 8. Reflexión final

La programación en Java permite desarrollar soluciones mediante instrucciones estructuradas, reutilizables y organizadas. Los conceptos desarrollados en esta práctica constituyen la base para estudiar posteriormente programación orientada a objetos, clases, objetos, encapsulamiento, herencia y polimorfismo.
