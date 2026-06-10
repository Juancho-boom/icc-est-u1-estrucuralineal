# Práctica de Estructuras de Datos Lineales: Pilas y Colas

**Estudiante:** [Tu Nombre y Apellido]  
**Versión:** 2.0.2  

## Descripción del Proyecto
Este proyecto contiene la resolución de tres problemas de lógica algorítmica empleando Estructuras de Datos Lineales en Java. Se implementaron validaciones de sintaxis a través de Pilas (`Stack`) y de flujo de caracteres mediante el comportamiento FIFO propio de las Colas (`Queue`).

---

## Explicación de los Ejercicios

### Ejercicio 01: Validación de Signos usando Stack
- **Funcionamiento:** Se analiza la cadena mediante un bucle. Cada símbolo de apertura `(`, `{`, `[` se guarda en la pila. Al detectar un cierre, se extrae el elemento superior de la pila para verificar correspondencia de tipos. Si al final la pila queda vacía, la expresión es correcta.

### Ejercicio 02: Ordenamiento de un Stack
- **Funcionamiento:** Utilizando únicamente un `Stack` auxiliar y variables primitivas de control, se realiza un ordenamiento iterativo inverso. Los elementos mayores se desplazan temporalmente hacia atrás en la pila original para permitir posicionar el elemento menor en el fondo del stack auxiliar, logrando que el menor quede finalmente en el tope del stack principal.

### Ejercicio 03: Validación de Palíndromos usando Colas
- **Funcionamiento:** La palabra se ingresa simultáneamente en una Cola (`Queue`) y en una Pila (`Stack`). Al retirar los elementos en paralelo, la cola nos entrega la palabra en su sentido original (izquierda a derecha) y la pila en sentido inverso (derecha a izquierda), permitiendo comprobar la simetría del palíndromo de forma eficiente.

---

## Evidencias de Código y Salida

### Bloques de Código Desarrollado
*(Los bloques completos se encuentran en la carpeta `src/utils/`)*

### Salida de la Consola
```text
Ejercicio 01: Validación de Signos
Cadena: ([{}]) | Resultado: true
Cadena: ([()] | Resultado: false

Ejercicio 02: Ordenar Stack
Stack original: [2, 4, 1, 5]
Stack ordenado: [5, 4, 2, 1]
Tope esperado: 1

Ejercicio 03: Palíndromo usando Colas
ana   | Resultado: true
radar | Resultado: true
java  | Resultado: false