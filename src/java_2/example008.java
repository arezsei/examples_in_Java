package java_2;

import java.util.Scanner;

public class example008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá un número entero positivo: ");
        int numero = scanner.nextInt();
        if (numero <= 0) {
            System.out.println("Error: El número debe ser positivo, máquina.");
        } else {
            int sumaDivisores = 0; // Acumulador para sumar los divisores

            // Recorremos desde 1 hasta la mitad del número (Optimización de rendimiento)
            for (int i = 1; i <= numero / 2; i++) {
                // Si el residuo es 0, 'i' es un divisor exacto
                if (numero % i == 0) {
                    sumaDivisores += i; // Acumulamos el divisor
                }
            }

            // Evaluamos la condición de perfección matemática
            if (sumaDivisores == numero) {
                System.out.println("¡El número " + numero + " SÍ es un número perfecto!");
            } else {
                System.out.println("El número " + numero + " NO es un número perfecto.");
            }
        }
        scanner.close();
    }
}
