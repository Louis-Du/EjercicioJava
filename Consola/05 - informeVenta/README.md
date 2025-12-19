# Informe de Ventas

## Tipo
Consola

## Descripción

Sistema de generación de informes de ventas que permite registrar múltiples vendedores y sus ventas trimestrales, calculando totales por vendedor, totales por trimestre y el total general de ventas del período.

## Conceptos Practicados

- Colecciones dinámicas (`ArrayList<String>`)
- Matrices bidimensionales (`int[][]`)
- Bucles anidados para procesamiento de matrices
- Entrada de datos estructurada
- Control de flujo con bucles `do-while`
- Cálculos acumulativos
- Relación entre índices de lista y matriz
- Comparación de cadenas con `equalsIgnoreCase()`

## Funcionamiento

El programa opera en dos fases:

### Fase 1: Registro de Vendedores
- Solicita nombres de vendedores uno por uno
- Almacena los nombres en un `ArrayList`
- Permite agregar múltiples vendedores hasta que el usuario indique 'exit'

### Fase 2: Registro de Ventas
- Crea una matriz de ventas con dimensiones: [número de vendedores][4 trimestres]
- Solicita las ventas de cada vendedor para cada uno de los 4 trimestres
- Calcula y muestra:
  - Total de ventas por vendedor
  - Total de ventas por trimestre
  - Total general de todas las ventas

## Notas

El programa utiliza una estructura de datos combinada (lista para nombres y matriz para ventas) que demuestra la integración de diferentes tipos de colecciones en Java. Los cálculos se realizan mediante bucles que recorren tanto filas como columnas de la matriz.
