package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        int numero = 15;
        System.out.println("verificando si" + numero + "es par o impar..");
        if (numero % 2 == 0) {
        }
            System.out.println("numero es par");
        } 
        else {
            System.out.println("numero es impar");
        }
        double temperatura = 25.5;
        System.out.println("verificando temperatura" + temperatura);
        if (temperatura > 30) {
            System.out.println("hace calor");
        }
        else {
            System.out.println("clima agradable");
        }

        int puntuacion = 85;
        if (puntuacion >= 70) {
            System.out.println("aprobado");
        } else {
            System.out.println("reprobado");
        }
        boolean esEstuante = true;
        if (esEstuante) {
            System.out.println("es estudiante");
        } else {
            System.out.println("no es estudiante");
        }

    
    }
}
