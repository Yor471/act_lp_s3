package com.example;

public class Ejercicio1 {
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        

        int x = 10;
        int y = 5;
        
        System.out.println("--- Ejercicio 1: Operadores Aritméticos ---");

        
        int resultadoSuma = x + y;
        System.out.println("Suma de " + x + " + " + y + " = " + resultadoSuma);

        
        int resultadoResta = x - y;
        System.out.println("Resta de " + x + " - " + y + " = " + resultadoResta);

        
        int resultadoMultiplicacion = x * y;
        System.out.println("Multiplicación de " + x + " * " + y + " = " + resultadoMultiplicacion);

        
        int resultadoDivision = x / y;
        System.out.println("División Entera de " + x + " / " + y + " = " + resultadoDivision);

        
        int resultadoModulo = x % y;
        System.out.println("Módulo/Resto de " + x + " % " + y + " = " + resultadoModulo);

    }
}
