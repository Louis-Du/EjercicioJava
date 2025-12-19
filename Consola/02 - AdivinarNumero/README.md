# Adivinar Número

## Tipo
Consola

## Descripción

Juego interactivo de adivinanza donde el programa genera un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. El programa proporciona pistas indicando si el número ingresado es mayor o menor que el número secreto.

## Conceptos Practicados

- Generación de números aleatorios con `Random`
- Validación de entrada de usuario
- Estructuras de control (bucles `while` infinitos con `break`)
- Condicionales anidadas (`if-else`)
- Manejo de entrada con `Scanner`
- Verificación de tipos de datos (`hasNextInt()`)
- Comparación de cadenas (`equalsIgnoreCase()`)
- Control de flujo del programa (`continue`, `break`)

## Funcionamiento

El programa genera un número aleatorio entre 1 y 100. El usuario intenta adivinar el número y recibe pistas sobre si su intento fue mayor o menor. El juego valida que las entradas sean números válidos dentro del rango permitido. Al acertar, el usuario puede optar por jugar nuevamente.

## Notas

El programa incluye validación robusta de entrada para prevenir errores cuando el usuario ingresa datos no numéricos o fuera del rango establecido.
