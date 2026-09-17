# Práctica de Laboratorio: Funciones, Preprocessor, Program Utilities y Metaprogramación en C++

**Carrera:** Ingeniería de Software  
**Semestre:** II Semestre  
**Lenguaje:** C++17 o superior  
**Modalidad:** Práctica de laboratorio / resolución de problemas

---

## 1. Propósito

Esta práctica tiene como propósito desarrollar habilidades de programación en C++ mediante la resolución progresiva de problemas relacionados con:

- Funciones.
- Preprocessor (preprocesador).
- Program Utilities (utilidades de programación).
- Metaprogramación introductoria.

Los problemas están organizados desde un nivel básico hasta un nivel integrador. Se busca que el estudiante no solamente obtenga un programa funcional, sino que comprenda cómo organizar, reutilizar y generalizar código.

---

## 2. Competencias

Al finalizar la práctica, el estudiante será capaz de:

1. Diseñar funciones con parámetros y valores de retorno.
2. Modularizar programas en C++.
3. Utilizar el preprocesador para constantes, macros y compilación condicional.
4. Utilizar bibliotecas estándar de C++ para resolver problemas.
5. Generar datos mediante `<random>`.
6. Medir tiempos de ejecución mediante `<chrono>`.
7. Comprender la programación genérica mediante plantillas.
8. Utilizar `constexpr` para realizar cálculos en tiempo de compilación.
9. Utilizar `type_traits` para obtener información sobre tipos.
10. Diferenciar conceptualmente entre tiempo de compilación y tiempo de ejecución.

---

## 3. Requisitos

### Software

- Compilador compatible con C++17 o superior.
- Visual Studio Code, Code::Blocks, CLion u otro IDE.
- Terminal.
- Git, opcionalmente para control de versiones.

### Compilación

Ejemplo utilizando `g++`:

```bash
g++ -std=c++17 -Wall -Wextra -pedantic main.cpp -o programa
./programa
```

En Linux también puede utilizarse:

```bash
g++ -std=c++17 main.cpp -o programa
```

---

# 4. Parte I — Funciones

## Problema 1. Calculadora modular

Desarrolle un programa que permita realizar las operaciones básicas entre dos números:

- Suma.
- Resta.
- Multiplicación.
- División.

El programa debe implementar una función independiente para cada operación:

```cpp
double sumar(double a, double b);
double restar(double a, double b);
double multiplicar(double a, double b);
double dividir(double a, double b);
```

El programa principal debe mostrar un menú y utilizar las funciones correspondientes.

### Restricciones

- Controlar la división entre cero.
- Las operaciones deben realizarse exclusivamente mediante funciones.
- El `main()` debe encargarse principalmente de la interacción con el usuario.

### Conceptos

- Funciones.
- Parámetros.
- Valores de retorno.
- Menús.
- Modularización.

---

## Problema 2. Número primo

Implemente una función:

```cpp
bool esPrimo(int n);
```

que determine si un número entero positivo es primo.

El programa debe solicitar un número y mostrar si es primo o no.

### Ejemplo

```text
Ingrese un número: 17

17 es un número primo.
```

### Extensión

Mostrar todos los números primos comprendidos entre `1` y `N`.

### Conceptos

- Funciones `bool`.
- Parámetros.
- Retorno de valores.
- Estructuras repetitivas.

---

## Problema 3. Estadísticas de un conjunto

Solicite `N` números enteros y cree funciones para calcular:

```cpp
int mayor(...);
int menor(...);
double promedio(...);
int contarPares(...);
int contarImpares(...);
```

El programa debe presentar un reporte similar a:

```text
===== ESTADÍSTICAS =====
Mayor       : 95
Menor       : 12
Promedio    : 48.50
Pares       : 6
Impares     : 4
```

### Conceptos

- Funciones.
- `vector`.
- Parámetros.
- Valores de retorno.
- Recorridos de estructuras de datos.

---

## Problema 4. Conversor de unidades

Construya un programa modular que permita realizar las siguientes conversiones:

- Celsius ↔ Fahrenheit.
- Kilómetros ↔ millas.
- Metros ↔ pies.
- Kilogramos ↔ libras.

Cada conversión debe implementarse mediante una función.

### Ejemplo

```cpp
double celsiusAFahrenheit(double c);
double fahrenheitACelsius(double f);
```

### Extensión

Implementar un menú general de conversiones.

### Conceptos

- Funciones.
- Menús.
- Modularización.
- Tipos `double`.

---

## Problema 5. Sistema de calificaciones

Una universidad necesita calcular el resultado final de un estudiante.

La nota final está determinada por:

- Prácticas: 30 %.
- Examen parcial: 30 %.
- Examen final: 40 %.

Implemente funciones para:

```cpp
double calcularPromedioPracticas(...);
double calcularNotaFinal(...);
bool aprobo(double nota);
```

El programa debe mostrar:

```text
Nota de prácticas : 15.50
Examen parcial    : 14.00
Examen final      : 17.00
Nota final        : 15.90
Estado            : APROBADO
```

### Conceptos

- Funciones.
- Parámetros.
- Retorno.
- Porcentajes.
- Funciones booleanas.

---

# 5. Parte II — Preprocessor

El preprocesador permite realizar transformaciones sobre el código fuente antes de la compilación.

En esta sección se trabajará principalmente con:

```cpp
#define
#ifdef
#ifndef
#else
#endif
#include
```

---

## Problema 6. Constantes mediante macros

Defina mediante el preprocesador:

```cpp
#define PI 3.141592653589793
```

Implemente funciones para calcular:

- Área del círculo.
- Perímetro del círculo.
- Volumen de una esfera.

El programa debe utilizar la constante definida mediante `#define`.

### Pregunta de análisis

Explique la diferencia entre:

```cpp
#define PI 3.14159
```

y:

```cpp
const double PI = 3.14159;
```

### Conceptos

- `#define`.
- Constantes.
- Preprocesamiento.
- Funciones.

---

## Problema 7. Macros matemáticas

Defina las siguientes macros:

```cpp
MAX(a,b)
MIN(a,b)
CUADRADO(x)
CUBO(x)
```

Ejemplos:

```cpp
cout << MAX(10, 20);
cout << CUADRADO(5);
cout << CUBO(3);
```

### Actividad de análisis

Pruebe:

```cpp
CUADRADO(2 + 3)
```

y explique por qué una macro mal definida puede producir resultados inesperados.

Una implementación adecuada de `CUADRADO` debe considerar los paréntesis:

```cpp
#define CUADRADO(x) ((x) * (x))
```

### Conceptos

- Macros.
- Parámetros de macros.
- Precedencia de operadores.
- Uso de paréntesis.

---

## Problema 8. Depuración mediante compilación condicional

Construya un programa que contenga:

```cpp
#define DEBUG
```

Cuando `DEBUG` esté definida, el programa debe mostrar información adicional:

```text
[DEBUG] Iniciando programa...
[DEBUG] Usuario ingresado: 125
[DEBUG] Calculando promedio...
[DEBUG] Proceso terminado.
```

Cuando `DEBUG` no esté definida, estos mensajes no deben aparecer.

Utilice:

```cpp
#ifdef DEBUG
...
#endif
```

### Objetivo

Comprender cómo el preprocesador puede utilizarse para crear diferentes comportamientos en versiones de desarrollo y producción.

---

## Problema 9. Configuración de una aplicación

Diseñe un programa que utilice compilación condicional para definir diferentes configuraciones.

Por ejemplo:

```cpp
#define VERSION_DESARROLLO
```

Dependiendo de la configuración, el programa debe mostrar:

```text
Aplicación Sistema Académico
Versión: DESARROLLO
```

o:

```text
Aplicación Sistema Académico
Versión: PRODUCCIÓN
```

Utilice:

```cpp
#ifdef
#ifndef
#else
#endif
```

### Extensión

Agregar una configuración denominada:

```text
PRUEBAS
```

### Conceptos

- Compilación condicional.
- Configuraciones.
- Preprocesador.

---

## Problema 10. Biblioteca propia mediante archivos de cabecera

Cree una pequeña biblioteca llamada:

```text
matematicas.h
```

que contenga las declaraciones:

```cpp
int sumar(int, int);
int restar(int, int);
int multiplicar(int, int);
double dividir(double, double);
```

El programa `main.cpp` debe incluir:

```cpp
#include "matematicas.h"
```

Utilice protección de inclusión:

```cpp
#ifndef MATEMATICAS_H
#define MATEMATICAS_H

// contenido

#endif
```

### Estructura sugerida

```text
problema10/
├── main.cpp
├── matematicas.h
└── matematicas.cpp
```

### Conceptos

- Archivos `.h`.
- Archivos `.cpp`.
- `#include`.
- Include guards.
- Modularización.

---

# 6. Parte III — Program Utilities

En esta sección se utilizarán algunas bibliotecas estándar de C++ para resolver problemas habituales de programación.

---

## Problema 11. Generador de números aleatorios

Desarrolle un juego en el que el computador genere un número aleatorio entre `1` y `100`.

El usuario debe intentar adivinarlo.

El programa debe indicar:

```text
El número es mayor.
El número es menor.
¡Correcto!
```

Al finalizar debe mostrar el número de intentos.

Utilice:

```cpp
#include <random>
```

### Restricción

Se recomienda utilizar las herramientas modernas de `<random>` en lugar de depender exclusivamente de `rand()`.

### Conceptos

- Generación de números aleatorios.
- `<random>`.
- Distribuciones.
- Bucles.

---

## Problema 12. Medición del tiempo de ejecución

Desarrolle un programa que genere un vector con `1 000 000` números y mida cuánto tarda en:

1. Generarlo.
2. Ordenarlo.
3. Buscar un elemento.

Utilice:

```cpp
#include <chrono>
```

El resultado debe ser similar a:

```text
Generación  : 25 ms
Ordenamiento : 87 ms
Búsqueda     : 1 ms
```

### Extensión

Comparar el tiempo de `std::sort()` con un algoritmo de ordenamiento desarrollado por el estudiante.

### Conceptos

- `<chrono>`.
- `std::vector`.
- `std::sort`.
- Medición de rendimiento.

> Nota: los tiempos pueden variar significativamente según el computador, sistema operativo, compilador y carga del sistema.

---

## Problema 13. Conversión y manipulación de cadenas

Solicite al usuario una frase y desarrolle funciones para:

- Convertir a mayúsculas.
- Convertir a minúsculas.
- Contar vocales.
- Contar palabras.
- Invertir la cadena.

Utilice:

```cpp
#include <string>
#include <cctype>
```

### Ejemplo

```text
Entrada:
Ingenieria de Software

Vocales       : 10
Palabras      : 3
Mayúsculas    : INGENIERIA DE SOFTWARE
Minúsculas    : ingenieria de software
```

### Conceptos

- `std::string`.
- `<cctype>`.
- Funciones.
- Recorrido de cadenas.

---

## Problema 14. Validación de datos

Desarrolle funciones para validar datos ingresados por el usuario:

```cpp
bool esNumeroEntero(string texto);
bool esCorreoValido(string correo);
bool esDNIValido(string dni);
bool esTelefonoValido(string telefono);
```

El programa debe permitir registrar un usuario solamente si los datos cumplen las condiciones establecidas.

### Extensión

Utilizar expresiones regulares mediante:

```cpp
#include <regex>
```

### Conceptos

- Validación.
- `string`.
- `<regex>`.
- Funciones booleanas.

---

## Problema 15. Generador de contraseñas

Construya un generador de contraseñas aleatorias.

El usuario debe indicar:

```text
Longitud: 12
¿Incluir mayúsculas? S
¿Incluir minúsculas? S
¿Incluir números? S
¿Incluir símbolos? S
```

El programa debe generar una contraseña utilizando:

```cpp
<random>
<string>
```

Ejemplo:

```text
Contraseña generada:
aK7@pQ2!xLm9
```

### Extensión

Crear una función que realice una comprobación básica de fortaleza según las reglas definidas por el estudiante.

### Conceptos

- `<random>`.
- `string`.
- Funciones.
- Generación aleatoria.

---

# 7. Parte IV — Metaprogramación introductoria

Para estudiantes de segundo semestre, la metaprogramación se abordará de forma progresiva:

```text
constexpr
   ↓
templates
   ↓
if constexpr
   ↓
type_traits
```

El objetivo es comprender la idea de realizar decisiones o cálculos relacionados con tipos y valores durante la compilación.

---

## Problema 16. Factorial en tiempo de compilación

Implemente:

```cpp
constexpr int factorial(int n);
```

de modo que pueda utilizarse:

```cpp
constexpr int resultado = factorial(5);
```

El resultado debe ser:

```text
120
```

### Preguntas de análisis

1. ¿Qué significa `constexpr`?
2. ¿Cuál es la diferencia entre una función normal y una función `constexpr`?
3. ¿Qué significa realizar un cálculo durante la compilación?
4. ¿El compilador está obligado a evaluar siempre una función `constexpr` durante la compilación?

---

## Problema 17. Potencia en tiempo de compilación

Implemente:

```cpp
constexpr long long potencia(int base, int exponente);
```

Ejemplo:

```cpp
constexpr auto resultado = potencia(2, 10);
```

Debe obtener:

```text
1024
```

### Extensión

Implementar la solución utilizando recursividad.

### Conceptos

- `constexpr`.
- Recursividad.
- Tiempo de compilación.

---

## Problema 18. Plantilla para encontrar el máximo

Construya una función genérica:

```cpp
template <typename T>
T maximo(T a, T b);
```

Debe funcionar con:

```text
int
double
float
char
```

Ejemplos:

```cpp
maximo(10, 20);
maximo(3.14, 2.71);
maximo('A', 'Z');
```

### Objetivo

Introducir al estudiante al concepto de programación genérica.

### Pregunta

Explique qué ventajas ofrece una plantilla frente a implementar:

```cpp
int maximoInt(...);
double maximoDouble(...);
float maximoFloat(...);
```

---

## Problema 19. Identificación del tipo de dato

Utilizando:

```cpp
#include <type_traits>
```

construya un programa que determine si un tipo es:

- Entero.
- Punto flotante.
- Booleano.
- Carácter.
- Firmado.
- No firmado.

Utilice herramientas como:

```cpp
std::is_integral_v<T>
std::is_floating_point_v<T>
std::is_signed_v<T>
std::is_unsigned_v<T>
```

### Ejemplo

Para:

```cpp
int
```

mostrar:

```text
Tipo: int
Entero: SI
Punto flotante: NO
Booleano: NO
Firmado: SI
```

### Extensión

Probar:

```text
int
unsigned int
float
double
char
bool
```

y analizar los resultados.

---

## Problema 20. Calculadora genérica

Desarrolle una calculadora utilizando plantillas:

```cpp
template <typename T>
T sumar(T a, T b);

template <typename T>
T restar(T a, T b);

template <typename T>
T multiplicar(T a, T b);
```

El programa debe funcionar con:

```text
int
float
double
```

### Ejemplo

```text
CALCULADORA

Enteros:
10 + 20 = 30

Reales:
10.5 + 20.3 = 30.8
```

### Extensión

Utilizar `if constexpr` para modificar el comportamiento dependiendo del tipo.

---

# 8. Problemas integradores

Los siguientes problemas combinan varios de los conceptos estudiados.

---

## Problema 21. Analizador de números

Construya un programa que reciba `N` números y genere un reporte:

```text
========== ANALIZADOR ==========

Cantidad de datos : 20
Mayor             : 98
Menor             : 4
Promedio          : 52.35
Pares             : 11
Impares           : 9
Primos            : 5
```

### Requisitos técnicos

El programa debe utilizar obligatoriamente:

- Funciones.
- `#define` para al menos una constante.
- `<algorithm>`.
- `<random>`.
- `constexpr` para una operación matemática.

### Actividad adicional

El estudiante debe explicar qué parte del programa corresponde a:

```text
Tiempo de preprocesamiento
Tiempo de compilación
Tiempo de ejecución
```

---

# 9. Problema 22 — Sistema de procesamiento de estudiantes

Desarrolle un pequeño sistema que permita registrar:

```text
Código
Nombre
5 notas
```

El sistema debe permitir:

1. Registrar estudiantes.
2. Calcular promedio.
3. Determinar aprobado/desaprobado.
4. Buscar estudiante por código.
5. Mostrar estudiante con mayor promedio.
6. Mostrar estudiante con menor promedio.
7. Mostrar estadísticas generales.

### Requisitos técnicos

El programa debe utilizar:

- Funciones.
- `vector`.
- `string`.
- `<algorithm>`.
- `constexpr`.
- Plantillas para al menos una función.
- Compilación condicional para mensajes `DEBUG`.

### Ejemplo de menú

```text
=================================
 SISTEMA DE ESTUDIANTES
=================================

1. Registrar estudiante
2. Listar estudiantes
3. Buscar estudiante
4. Calcular estadísticas
5. Mostrar mayor promedio
6. Mostrar menor promedio
0. Salir

Seleccione una opción:
```

---

# 10. Problema 23 — Mini sistema de configuración

Construya un programa que simule la configuración de una aplicación:

```text
========== CONFIGURACIÓN ==========

1. Mostrar versión
2. Mostrar modo de ejecución
3. Mostrar información del compilador
4. Mostrar arquitectura
5. Mostrar información del sistema
```

Utilice el preprocesador para detectar diferentes plataformas:

```cpp
#ifdef _WIN32
    // Windows
#elif __linux__
    // Linux
#elif __APPLE__
    // macOS
#endif
```

El programa debe mostrar información diferente dependiendo del sistema operativo.

### Extensión

Agregar información mediante macros predefinidas del compilador, como:

```cpp
__cplusplus
__DATE__
__TIME__
```

### Pregunta de análisis

Investigue qué valores puede proporcionar `__cplusplus` dependiendo de la versión del estándar utilizado.

---

# 11. Problema 24 — Biblioteca matemática genérica

Construya una pequeña biblioteca matemática utilizando:

```text
matematicas.h
matematicas.cpp
main.cpp
```

Debe incluir funciones para:

```cpp
sumar()
restar()
multiplicar()
dividir()
factorial()
esPrimo()
maximo()
```

### Requisitos

- `factorial()` debe ser `constexpr`.
- `maximo()` debe ser una plantilla.
- Utilizar protección de inclusión mediante `#ifndef`.
- Utilizar `<chrono>` para medir el tiempo de ejecución de alguna operación.
- Separar adecuadamente declaraciones e implementaciones.

### Estructura

```text
problema24/
├── main.cpp
├── matematicas.h
└── matematicas.cpp
```

---

# 12. Propuesta de distribución de la práctica

Para una sesión aproximada de **2 horas**:

| Nivel | Problemas | Tema | Tiempo aproximado |
|---|---|---|---:|
| Básico | 1, 2 | Funciones | 20 min |
| Básico-intermedio | 3, 4 | Funciones | 25 min |
| Intermedio | 7, 8 | Preprocessor | 20 min |
| Intermedio | 11, 12 | Program Utilities | 20 min |
| Intermedio-avanzado | 16, 18 | Metaprogramación | 20 min |
| Integrador | 21 | Todos | 15 min |

> La distribución puede modificarse según el ritmo de la sección y el nivel previo de los estudiantes.

---

# 13. Reto adicional

Como actividad opcional, cada grupo deberá seleccionar uno de los problemas y realizar una segunda versión aplicando mejoras de diseño.

La segunda versión debe:

1. Separar el código en archivos `.h` y `.cpp`.
2. Evitar duplicación de código.
3. Utilizar funciones pequeñas y con una responsabilidad clara.
4. Validar las entradas del usuario.
5. Utilizar nombres descriptivos.
6. Incorporar comentarios únicamente donde aporten información relevante.
7. Compilar sin errores ni advertencias importantes.

---

# 14. Buenas prácticas de programación

Durante toda la práctica se recomienda:

### 14.1. Utilizar nombres descriptivos

Preferir:

```cpp
double calcularPromedio();
```

en lugar de:

```cpp
double cp();
```

### 14.2. Evitar funciones excesivamente grandes

No concentrar toda la lógica en `main()`.

Preferir:

```cpp
int main() {
    mostrarMenu();
    procesarOpcion();
}
```

en lugar de colocar cientos de líneas dentro de `main()`.

### 14.3. Validar entradas

El programa debe contemplar entradas inválidas y situaciones como:

- División entre cero.
- Números negativos donde no corresponda.
- Opciones inexistentes.
- Cadenas vacías.
- Datos con formato incorrecto.

### 14.4. Evitar macros innecesarias

Aunque esta práctica estudia el preprocesador, no significa que `#define` deba utilizarse para todo.

Por ejemplo, para una constante normalmente puede ser preferible:

```cpp
constexpr double PI = 3.141592653589793;
```

El objetivo es que el estudiante conozca el preprocesador y, al mismo tiempo, pueda distinguir cuándo una característica moderna de C++ resulta más apropiada.

---

# 15. Preguntas de reflexión

Al finalizar la práctica, responda:

### Funciones

1. ¿Qué ventajas proporciona dividir un programa en funciones?
2. ¿Cuál es la diferencia entre parámetro y argumento?
3. ¿Cuándo conviene que una función devuelva un valor?
4. ¿Qué problemas puede generar una función demasiado grande?

### Preprocessor

5. ¿Qué es el preprocesador?
6. ¿En qué momento actúa el preprocesador?
7. ¿Cuál es la diferencia entre `#define` y `constexpr`?
8. ¿Para qué sirve `#ifdef`?
9. ¿Por qué se utilizan include guards?

### Program Utilities

10. ¿Para qué sirve `<random>`?
11. ¿Por qué es importante medir el tiempo de ejecución?
12. ¿Por qué dos ejecuciones del mismo programa pueden presentar tiempos diferentes?
13. ¿Qué ventajas ofrecen las bibliotecas estándar?

### Metaprogramación

14. ¿Qué significa `constexpr`?
15. ¿Qué es una plantilla?
16. ¿Qué problema resuelve la programación genérica?
17. ¿Qué información proporciona `std::type_traits`?
18. ¿Qué diferencia existe entre tiempo de compilación y tiempo de ejecución?
19. ¿Qué utilidad tiene `if constexpr`?

---

# 16. Entregables

Para cada problema seleccionado, el estudiante debe entregar:

```text
problemaXX/
├── README.md
├── main.cpp
```

Cuando el problema requiera varios archivos:

```text
problemaXX/
├── README.md
├── main.cpp
├── funciones.h
└── funciones.cpp
```

El `README.md` de cada problema debe contener:

1. Nombre del problema.
2. Descripción.
3. Algoritmo o estrategia utilizada.
4. Código fuente.
5. Ejemplos de ejecución.
6. Conclusiones.

---

# 17. Criterios de evaluación sugeridos

| Criterio | Puntaje |
|---|---:|
| Correcta resolución del problema | 30 % |
| Uso adecuado de funciones/modularización | 20 % |
| Aplicación del concepto solicitado | 20 % |
| Validación de entradas | 10 % |
| Calidad y legibilidad del código | 10 % |
| Documentación y explicación | 10 % |
| **Total** | **100 %** |

---

# 18. Nivel de dificultad sugerido

```text
                    ┌──────────────────────┐
                    │      FUNCIONES       │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │     PREPROCESSOR     │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │  PROGRAM UTILITIES   │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │ METAPROGRAMACIÓN     │
                    │    INTRODUCTORIA     │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │ PROBLEMAS INTEGRADOS │
                    └──────────────────────┘
```

La progresión busca pasar de la **modularización** a la **abstracción y generalización**:

```text
Funciones
    ↓
Modularización
    ↓
Preprocesamiento
    ↓
Uso de bibliotecas estándar
    ↓
Programación genérica
    ↓
Evaluación en tiempo de compilación
```

---

# 19. Desafío final

Como desafío final, desarrollar una aplicación en C++ que integre los cuatro temas:

> **Sistema de utilidades para estudiantes de Ingeniería de Software**

La aplicación debe proporcionar un menú con módulos para:

```text
================================================
     UTILIDADES - INGENIERÍA DE SOFTWARE
================================================

1. Calculadora
2. Analizador de números
3. Generador de contraseñas
4. Conversor de unidades
5. Analizador de estudiantes
6. Información del sistema
7. Pruebas de rendimiento
8. Información de tipos
0. Salir
```

### Requisitos mínimos

El proyecto debe utilizar:

- Funciones.
- `vector`.
- `string`.
- `<algorithm>`.
- `<random>`.
- `<chrono>`.
- `#ifdef`.
- `#define` o una alternativa moderna justificada.
- `constexpr`.
- Templates.
- `if constexpr`.
- `type_traits`.
- Archivos `.h` y `.cpp`.

### Objetivo

El estudiante debe demostrar que puede **integrar diferentes características del lenguaje C++ para construir una aplicación modular**, justificando técnicamente las decisiones tomadas.

---

# 20. Conclusión

Esta práctica introduce al estudiante de segundo semestre de Ingeniería de Software en cuatro aspectos importantes de C++:

- **Funciones:** permiten dividir problemas complejos en unidades reutilizables.
- **Preprocessor:** permite realizar procesamiento previo del código y compilación condicional.
- **Program Utilities:** proporcionan herramientas de la biblioteca estándar para resolver problemas reales.
- **Metaprogramación:** introduce la programación genérica y el procesamiento durante la compilación.

La meta no es únicamente escribir programas que funcionen, sino desarrollar progresivamente la capacidad de **abstraer, reutilizar, modularizar y analizar soluciones de software**.

---

## Autoría

**Curso:** Programación / Lenguaje de Programación  
**Carrera:** Ingeniería de Software  
**Semestre:** II  
**Lenguaje:** C++17+
