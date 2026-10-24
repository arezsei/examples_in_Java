package java_1;

import java.util.Scanner;

public class example02 {
    public static void main(String[] args) {
        // Se ingresan números las cuales se detiene dicho ingreso cuando se ingresa el número cero. Hallar el promedio.
        Scanner sr = new Scanner(System.in);

        int numero = 0;
        int suma = 0;
        int contador = 0;

        System.out.println("--- Calculador de Promedio (Ingresa 0 para terminar) ---");

        do {
            System.out.print("Ingrese un número: ");
            numero = sr.nextInt();
            if (numero != 0) {
                suma += numero;
                contador++;
            }

        } while (numero != 0);

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("Cantidad de números válidos: " + contador);
            System.out.println("Suma total: " + suma);
            System.out.println("El promedio final es: " + promedio);
        } else {
            System.out.println("No se ingresaron números para calcular el promedio.");
        }

        sr.close();
    }
}