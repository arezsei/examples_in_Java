package java_1;

import java.util.Scanner;

public class example08 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Ingrese el valor de a (Dividendo): ");
        int a = sr.nextInt();

        System.out.print("Ingrese el valor de b (Divisor): ");
        int b = sr.nextInt();

        int dividendoOriginal = a; // Respaldamos el valor original

        if (b > 0) {
            // El bucle resta "b" a "a" consecutivamente mientras se pueda
            while (a >= b) {
                a = a - b;
            }

            System.out.println("\nEl residuo de dividir " + dividendoOriginal + " entre " + b + " es: " + a);
        } else {
            System.out.println("Error: El divisor debe ser mayor que cero.");
        }

        sr.close();
    }
}
