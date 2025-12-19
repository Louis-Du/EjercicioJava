# Analizador de Triángulos

## Tipo
Interfaz Gráfica (Applet/Swing)

## Descripción

Aplicación que analiza triángulos según las dimensiones de sus lados. Permite ingresar la longitud de los tres lados y la altura, clasificando el tipo de triángulo (equilátero, isósceles, escaleno) y calculando propiedades geométricas como los ángulos internos.

## Conceptos Practicados

- Diseño de interfaces gráficas con Swing
- Uso de componentes: JTextField, JLabel, JButton
- Manejo de eventos con ActionListener
- Validación de entrada numérica
- Cálculos geométricos y trigonométricos
- Lógica condicional para clasificación de triángulos
- Conversión de tipos de datos (String a double)
- Presentación de resultados en etiquetas

## Funcionamiento

El usuario ingresa:
- La longitud de los tres lados del triángulo
- La altura del triángulo

Al presionar el botón "ANALIZAR", la aplicación:
1. Valida que los valores ingresados formen un triángulo válido
2. Clasifica el triángulo según sus lados:
   - **Equilátero**: Los tres lados son iguales
   - **Isósceles**: Dos lados son iguales
   - **Escaleno**: Todos los lados son diferentes
3. Calcula los ángulos internos usando relaciones trigonométricas
4. Muestra los resultados en la interfaz

## Notas

Este proyecto fue desarrollado originalmente como Java Applet y ha sido adaptado para funcionar con Swing. Demuestra la aplicación de conceptos matemáticos en programación, específicamente geometría y trigonometría.
