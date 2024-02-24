package com.example.miaplicacion;

public class Recursividad {
    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumaDigitos(n / 10);
        }
    }

    public static void main(String[] args) {
        int resultado = sumaDigitos(12345);
        System.out.println("La suma de los dígitos de 12345 es: " + resultado);
    }
}
