# Análisis de Texto

## Tipo
Consola

## Descripción

Herramienta de análisis estadístico de cadenas de texto que procesa una entrada del usuario y genera métricas sobre el contenido, incluyendo conteo de palabras, caracteres, identificación de la palabra más larga y frecuencia de aparición de cada palabra.

## Conceptos Practicados

- Manipulación de cadenas de texto
- Uso de expresiones regulares (`split()`, `trim()`)
- Colecciones (`HashMap`)
- Recorrido de arreglos con bucle `for-each`
- Método `merge()` para conteo de frecuencias
- Comparación de longitudes de cadenas
- Entrada de texto con `nextLine()`
- Formateo de salida de resultados

## Funcionamiento

El programa lee una línea de texto completa, la divide en palabras usando espacios como delimitadores (manejando múltiples espacios), y calcula:

- Total de palabras
- Total de caracteres (con y sin espacios)
- Palabra más larga
- Frecuencia de aparición de cada palabra

Los resultados se muestran en un formato estructurado al finalizar el análisis.

## Notas

El programa utiliza `HashMap` para almacenar la frecuencia de palabras de forma eficiente, y el método `merge()` para simplificar el incremento de contadores.
