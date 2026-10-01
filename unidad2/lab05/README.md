# LABORATORIO 05

## Contenedores STL de C++: `deque`, `list`, `set` y `map`

### 1. Datos generales

| Campo     | Información                |
| --------- | -------------------------- |
| Curso     | Lenguaje de Programación I |
| Unidad    | II – Contenedores de C++   |
| Duración  | 90 minutos                 |
| Modalidad | Trabajo grupal             |
| Grupos    | 2 grupos                   |
| Lenguaje  | C++17 o superior           |

---

# 2. Propósito

En esta práctica los estudiantes trabajarán en **dos grupos**, cada uno especializado en diferentes contenedores de la STL.

* **Grupo 1:** `deque` y `list`
* **Grupo 2:** `set` y `map`

Cada grupo deberá resolver **un ejercicio integrador**, no ejercicios independientes.

Al finalizar, los grupos intercambiarán sus resultados para identificar:

* qué problema resuelve cada contenedor;
* qué operaciones facilita;
* sus ventajas;
* sus limitaciones;
* y cuándo sería apropiado utilizarlo en un sistema real.

---

# 3. Organización de los grupos

## Grupo 1 — `deque` y `list`

Trabajará con un sistema de **gestión de atención de estudiantes**.

Deberá analizar principalmente:

```cpp
deque<T>
list<T>
```

---

## Grupo 2 — `set` y `map`

Trabajará con un sistema de **gestión de estudiantes y códigos únicos**.

Deberá analizar principalmente:

```cpp
set<T>
map<K, V>
```

---

# 4. Distribución del tiempo

Los 90 minutos se distribuirán de la siguiente manera:

| Actividad                   |     Tiempo |
| --------------------------- | ---------: |
| Explicación inicial         |     10 min |
| Desarrollo del ejercicio    |     45 min |
| Pruebas y experimentación   |     15 min |
| Preparación de conclusiones |     10 min |
| Exposición de grupos        |     10 min |
| **Total**                   | **90 min** |

> El objetivo no es desarrollar un sistema completo, sino construir un **prototipo funcional** que permita experimentar con los contenedores.

---

# PARTE I — GRUPO 1

# `deque` y `list`

## 5. Problema integrador

### Sistema de atención de estudiantes

Una universidad necesita desarrollar un pequeño sistema para administrar la atención de estudiantes en una oficina.

Los estudiantes pueden:

* llegar y colocarse al final de la cola;
* ser atendidos desde el inicio;
* recibir atención prioritaria;
* abandonar la cola;
* ser registrados en una lista de estudiantes atendidos.

El sistema debe utilizar:

```cpp
deque<Estudiante>
```

para representar la **cola de atención** y:

```cpp
list<Estudiante>
```

para representar el **historial de estudiantes atendidos**.

---

# 6. Estructura `Estudiante`

Crear:

```cpp
struct Estudiante {
    int codigo;
    string nombre;
    string tramite;
};
```

Ejemplo:

```text
1001 Ana Torres Matrícula
1002 Carlos Pérez Certificado
1003 María López Traslado
1004 José Ramos Matrícula
```

---

# 7. Uso obligatorio de `deque`

Crear:

```cpp
deque<Estudiante> cola;
```

Implementar las siguientes operaciones:

### Registrar estudiante

Agregar al final:

```cpp
cola.push_back(estudiante);
```

### Atención prioritaria

Agregar al inicio:

```cpp
cola.push_front(estudiante);
```

### Atender estudiante

Extraer el primero:

```cpp
cola.front();
cola.pop_front();
```

### Mostrar cola

Recorrer todos los elementos.

---

# 8. Uso obligatorio de `list`

Crear:

```cpp
list<Estudiante> atendidos;
```

Cada vez que un estudiante sea atendido:

```text
cola → atendidos
```

El estudiante deberá eliminarse del `deque` y agregarse a la `list`.

Utilizar:

```cpp
push_back()
```

y posteriormente implementar una funcionalidad adicional:

> Buscar un estudiante en el historial y eliminarlo.

Para ello deberán experimentar con:

```cpp
find()
erase()
```

---

# 9. Menú mínimo

El programa deberá presentar:

```text
===================================
 SISTEMA DE ATENCIÓN DE ESTUDIANTES
===================================

1. Registrar estudiante
2. Atención prioritaria
3. Atender estudiante
4. Mostrar cola
5. Mostrar atendidos
6. Eliminar estudiante del historial
7. Mostrar cantidad de estudiantes
0. Salir
```

---

# 10. Reto del Grupo 1

El programa debe permitir demostrar la diferencia entre:

```cpp
deque
```

y:

```cpp
list
```

Los estudiantes deberán experimentar con:

```text
Agregar al inicio
Agregar al final
Eliminar
Recorrer
Buscar
```

y registrar sus observaciones.

### Preguntas

1. ¿Por qué `deque` es apropiado para administrar una cola?
2. ¿Qué ventaja tiene `deque` sobre `vector` cuando se necesita insertar en ambos extremos?
3. ¿Por qué se utilizó `list` para el historial?
4. ¿Qué diferencia existe entre acceder a un elemento de un `deque` y uno de una `list`?
5. ¿Por qué `list` no permite utilizar:

```cpp
lista[3]
```

?
6. ¿En qué situaciones utilizarían `list` en lugar de `deque`?

---

# PARTE II — GRUPO 2

# `set` y `map`

## 11. Problema integrador

### Sistema de registro de estudiantes

Una universidad necesita controlar los códigos de estudiantes y consultar rápidamente la información asociada a cada código.

El sistema debe garantizar que:

* no existan códigos duplicados;
* los códigos puedan mostrarse ordenados;
* se pueda buscar un estudiante mediante su código;
* se pueda eliminar un estudiante;
* se pueda mostrar toda la información registrada.

Para resolver el problema deberán utilizar:

```cpp
set<int>
```

y:

```cpp
map<int, Estudiante>
```

---

# 12. Estructura `Estudiante`

Crear:

```cpp
struct Estudiante {
    int codigo;
    string nombre;
    string carrera;
    double promedio;
};
```

Ejemplo:

```text
1001 Ana Torres Ingeniería de Software 17.5
1002 Carlos Pérez Ingeniería de Sistemas 15.8
1003 María López Ingeniería de Software 18.2
```

---

# 13. Uso obligatorio de `set`

Crear:

```cpp
set<int> codigos;
```

El `set` será responsable de mantener los códigos únicos.

Implementar:

### Registrar código

```cpp
codigos.insert(codigo);
```

### Buscar código

```cpp
codigos.find(codigo);
```

### Eliminar código

```cpp
codigos.erase(codigo);
```

### Mostrar códigos

Recorrer el `set`.

---

# 14. Uso obligatorio de `map`

Crear:

```cpp
map<int, Estudiante> estudiantes;
```

La estructura tendrá la relación:

```text
CÓDIGO → ESTUDIANTE
```

Implementar:

### Registrar estudiante

```cpp
estudiantes.insert({codigo, estudiante});
```

### Buscar estudiante

```cpp
auto it = estudiantes.find(codigo);
```

### Eliminar estudiante

```cpp
estudiantes.erase(codigo);
```

### Mostrar estudiantes

Recorrer el `map`.

---

# 15. Menú mínimo

El programa deberá presentar:

```text
===================================
 SISTEMA DE REGISTRO DE ESTUDIANTES
===================================

1. Registrar estudiante
2. Buscar por código
3. Eliminar estudiante
4. Mostrar códigos registrados
5. Mostrar estudiantes
6. Mostrar estudiante con mayor promedio
7. Verificar código
0. Salir
```

---

# 16. Reto del Grupo 2

El grupo deberá demostrar experimentalmente la diferencia entre:

```cpp
set<int>
```

y:

```cpp
map<int, Estudiante>
```

Realizar las siguientes pruebas:

### Prueba 1 — Duplicados

Intentar registrar:

```text
1001
1002
1003
1001
1002
```

Responder:

> ¿Qué ocurre con los valores repetidos?

---

### Prueba 2 — Orden

Registrar:

```text
1050
1002
1010
1001
1030
```

Mostrar los elementos.

Responder:

> ¿En qué orden aparecen?

---

### Prueba 3 — Búsqueda

Buscar:

```text
1001
1050
9999
```

Comparar:

```cpp
set.find()
```

con:

```cpp
map.find()
```

---

### Prueba 4 — Relación clave/valor

Explicar qué representan:

```cpp
map<int, Estudiante>
```

```text
int          → clave
Estudiante   → valor
```

---

# 17. Preguntas del Grupo 2

1. ¿Por qué `set` no permite duplicados?
2. ¿Los elementos de `set` se mantienen ordenados?
3. ¿Qué representa la clave en un `map`?
4. ¿Qué representa el valor?
5. ¿Cuál es la diferencia conceptual entre `set` y `map`?
6. ¿Qué ventaja proporciona `map` cuando conocemos el código del estudiante?
7. ¿Qué ocurre si intentamos insertar dos estudiantes con el mismo código?
8. ¿Por qué no sería necesario recorrer todos los estudiantes para buscar un código utilizando `map::find()`?

---

# 18. Comparación final entre grupos

Al finalizar el desarrollo, ambos grupos deberán completar esta tabla.

| Característica       | `deque` | `list` | `set` | `map` |
| -------------------- | ------- | ------ | ----- | ----- |
| Tipo de contenedor   |         |        |       |       |
| Permite duplicados   |         |        |       |       |
| Mantiene orden       |         |        |       |       |
| Acceso mediante `[]` |         |        |       |       |
| Inserción al inicio  |         |        |       |       |
| Inserción al final   |         |        |       |       |
| Búsqueda             |         |        |       |       |
| Uso principal        |         |        |       |       |

---

# 19. Mini exposición

Cada grupo tendrá aproximadamente **5 minutos**.

## Grupo 1

Deberá explicar:

```text
deque
 ↓
cola de atención

list
 ↓
historial
```

y responder:

> ¿Por qué no utilizaron `vector`?

---

## Grupo 2

Deberá explicar:

```text
set
 ↓
códigos únicos

map
 ↓
código → estudiante
```

y responder:

> ¿Por qué no utilizaron simplemente un `vector<Estudiante>`?

---

# 20. Desafío final para toda la clase

El docente planteará las siguientes situaciones.

Los estudiantes deberán levantar una tarjeta o indicar qué contenedor utilizarían:

### Caso A

Necesito almacenar una colección y acceder frecuentemente mediante posición.

```text
¿?
```

### Caso B

Necesito insertar elementos al inicio y al final.

```text
¿?
```

### Caso C

Necesito realizar muchas inserciones y eliminaciones mediante iteradores.

```text
¿?
```

### Caso D

Necesito mantener elementos únicos y ordenados.

```text
¿?
```

### Caso E

Necesito relacionar un código con un objeto.

```text
¿?
```

Finalmente se presenta:

```text
vector → acceso secuencial mediante posición

deque  → operaciones eficientes en ambos extremos

list   → inserciones/eliminaciones con iteradores

set    → elementos únicos y ordenados

map    → clave → valor
```

---

# 21. Entrega

Cada grupo deberá entregar:

```text
laboratorio05_grupo1/
│
├── README.md
│
├── main.cpp
│
└── conclusiones.md
```

o:

```text
laboratorio05_grupo2/
│
├── README.md
│
├── main.cpp
│
└── conclusiones.md
```

El código debe:

* compilar correctamente;
* utilizar los contenedores asignados;
* tener funciones;
* utilizar iteradores cuando corresponda;
* demostrar las operaciones solicitadas;
* incluir comentarios breves.

---

# 22. Rúbrica rápida

| Criterio                                | Puntaje |
| --------------------------------------- | ------: |
| Uso correcto de los contenedores        |       4 |
| Funcionamiento del ejercicio integrador |       4 |
| Uso de operaciones de la STL            |       3 |
| Análisis de ventajas y desventajas      |       3 |
| Código organizado                       |       2 |
| Pruebas y demostración                  |       2 |
| Exposición y conclusiones               |       2 |
| **Total**                               |  **20** |

---

# 23. Conclusión esperada

El objetivo de la práctica es que el estudiante comprenda que:

> **La elección de un contenedor depende del problema que se desea resolver y de las operaciones que se realizan con mayor frecuencia.**

Por tanto:

```text
              CONTENEDORES STL
                     │
       ┌─────────────┼─────────────┐
       │             │             │
   Secuenciales   Asociativos   ...
       │             │
   ┌───┴───┐     ┌───┴───┐
   │       │     │       │
 deque    list  set     map
```

La comparación entre grupos permitirá que los estudiantes no memoricen solamente la sintaxis, sino que aprendan a **seleccionar una estructura de datos de acuerdo con las necesidades del software**.
