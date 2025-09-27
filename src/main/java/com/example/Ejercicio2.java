package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
       int a = 10;
        int b = 3;

        int divisionEntera = a / b;
        double divisionDecimal = (double) a / b;
        double x = 15.5;
        double y = 4.2;
        double divisionDobleDecimales = x / y;


        System.out.println("--- Resultados de la División ---");
        System.out.println("Variables enteras: a = " + a + ", b = " + b);
        System.out.println("División Entera (int divisionEntera = a / b): " + divisionEntera);
        System.out.println("División Decimal (double divisionDecimal = (double)a / b): " + divisionDecimal);
        System.out.println("\nVariables decimales: x = " + x + ", y = " + y);
        System.out.println("División de Decimales (double divisionDobleDecimales = x / y): " + divisionDobleDecimales);

        // --- 7. Explicación en comentarios por qué los resultados son diferentes ---
        /*
        * Comentario Explicativo:
        *
        * 1. División Entera (a / b):
        * - Cuando ambos operandos (a y b) son de tipo 'int' (entero), el lenguaje
        * realiza una *división entera*, lo que significa que el resultado es solo
        * la parte entera del cociente (3) y se *trunca* la parte decimal (3.333...).
        *
        * 2. División Decimal ((double) a / b):
        * - Al castear o convertir explícitamente uno de los operandos ((double)a),
        * la operación se eleva a la aritmética de punto flotante. El resultado
        * es un valor 'double' que incluye la parte decimal (3.333...).
        *
        * 3. División de Decimales (x / y):
        * - Cuando ambos operandos (x y y) ya son de tipo 'double', la división
        * es inherentemente de punto flotante, dando un resultado preciso con decimales.
        *
        * La clave es que la *división entera* es el comportamiento por defecto cuando
        * se dividen dos números enteros, a menos que se fuerce una conversión a un tipo decimal.
        */
    }


    }

