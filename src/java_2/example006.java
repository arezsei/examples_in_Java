package java_2;

import java.util.Scanner;

public class example006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Error: El número debe ser estrictamente positivo, máquina.");
        } else {
            int numeroTemporal = numero;
            int sumaImpares = 0;

            // Bucle While: Recorremos cada dígito del número
            while (numeroTemporal > 0) {
                int digito = numeroTemporal % 10; // Extraemos el último dígito

                // Evaluamos si el dígito extraído es impar
                if (digito % 2 != 0) {
                    sumaImpares += digito; // Lo acumulamos a la suma total de impares
                }

                numeroTemporal /= 10; // Eliminamos la última cifra del temporal
            }
            System.out.println("La suma de los dígitos impares de " + numero + " es: " + sumaImpares);
        }

        scanner.close();
    }
}
