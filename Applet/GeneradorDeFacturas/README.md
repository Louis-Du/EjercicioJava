# Generador de Facturas

## Tipo
Interfaz Gráfica (Applet/Swing)

## Descripción

Sistema básico de generación de facturas que permite registrar hasta tres productos con sus respectivos nombres, valores unitarios y cantidades. La aplicación calcula automáticamente el valor total de cada producto y el valor total de la factura.

## Conceptos Practicados

- Diseño de interfaces gráficas con Swing
- Uso de componentes: JTextField, JLabel
- Manejo de múltiples campos de entrada
- Cálculos automáticos y actualización en tiempo real
- Conversión de tipos de datos (String a numérico)
- Operaciones aritméticas (multiplicación, suma)
- Formateo de valores monetarios
- Organización de formularios con múltiples campos relacionados

## Funcionamiento

El usuario ingresa la siguiente información:

### Datos del Cliente
- Nombre del cliente

### Datos de Productos (hasta 3)
Para cada producto:
- Nombre del producto
- Valor unitario
- Cantidad

### Cálculos Automáticos
La aplicación calcula:
- **Valor total por producto**: Valor unitario × Cantidad
- **Valor total de la factura**: Suma de todos los valores totales de productos

Los resultados se muestran en campos de texto de solo lectura, actualizándose conforme el usuario ingresa los datos.

## Notas

Este proyecto simula un sistema básico de facturación y demuestra el manejo de formularios complejos con múltiples campos relacionados. Es útil para entender cómo estructurar aplicaciones que requieren entrada de datos tabulares y cálculos derivados.
