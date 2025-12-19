# Convertidor de Días

## Tipo
Interfaz Gráfica (Applet/Swing)

## Descripción

Herramienta de conversión que transforma una cantidad de días ingresada por el usuario en su equivalente en horas, minutos y segundos. La aplicación realiza los cálculos automáticamente al presionar un botón y muestra los resultados de forma clara en la interfaz.

## Conceptos Practicados

- Diseño de interfaces gráficas con Swing
- Uso de componentes: JSpinner, JLabel, JButton
- Manejo de eventos (ActionListener)
- Conversiones de unidades de tiempo
- Operaciones aritméticas básicas
- Formateo de resultados numéricos
- Validación de entrada con JSpinner
- Actualización dinámica de etiquetas

## Funcionamiento

El usuario ingresa la cantidad de días mediante un JSpinner y presiona el botón "CALCULAR". La aplicación realiza las siguientes conversiones:

- **Horas**: Días × 24
- **Minutos**: Días × 24 × 60
- **Segundos**: Días × 24 × 60 × 60

Los resultados se muestran en etiquetas separadas para cada unidad de tiempo, presentando una conversión completa y detallada.

## Notas

El uso de JSpinner garantiza que el usuario solo pueda ingresar valores numéricos válidos, eliminando la necesidad de validación manual. Este proyecto demuestra conceptos básicos de conversión de unidades y manipulación de componentes Swing.
