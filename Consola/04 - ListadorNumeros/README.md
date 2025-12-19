# Listador de Números

## Tipo
Consola

## Descripción

Sistema de filtrado y almacenamiento de números que permite al usuario ingresar múltiples valores numéricos, los valida y los almacena en una lista dinámica. El programa continúa aceptando entradas hasta que el usuario indique que desea finalizar.

## Conceptos Practicados

- Colecciones dinámicas (`ArrayList`)
- Validación de entrada con expresiones regulares
- Uso de `List<Double>` para almacenar números
- Estructuras de control con variable booleana
- Método `matches()` para validación de patrones
- Conversión de tipos (`parseDouble()`)
- Manejo de números decimales y negativos
- Comparación de cadenas sin distinción de mayúsculas

## Funcionamiento

El programa solicita al usuario que ingrese números uno por uno. Cada entrada se valida mediante una expresión regular que acepta:

- Números enteros positivos y negativos
- Números decimales
- Notación con punto decimal

Los números válidos se agregan a una lista que se muestra después de cada entrada. El usuario puede finalizar el proceso ingresando la letra 's'.

## Notas

La expresión regular utilizada (`-?\\d+(\\.\\d+)?`) permite validar diferentes formatos numéricos, incluyendo números negativos y decimales. El programa maneja entradas incorrectas mostrando mensajes de error apropiados.
