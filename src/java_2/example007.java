package java_2;

import java.util.Scanner;

public class example007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá un número entero positivo: ");
        int numero = scanner.nextInt();

        // Validamos que el número sea positivo
        if (numero <= 0) {
            System.out.println("Error: El número debe ser estrictamente positivo, máquina.");
        } else {
            int numeroTemporal = numero;

            // Tomamos el último dígito como nuestro molde o referencia inicial
            int digitoReferencia = numeroTemporal % 10;
            boolean esMismoDigito = true; // Nuestra bandera de estado

            // Recorremos el número cifra por cifra
            while (numeroTemporal > 0) {
                int digitoActual = numeroTemporal % 10;

                // Si encontramos un dígito distinto a la referencia, rompe la regla
                if (digitoActual != digitoReferencia) {
                    esMismoDigito = false;
                    break; // Cortocircuito: salimos del bucle al instante
                }

                numeroTemporal /= 10;
            }
            if (esMismoDigito) {
                System.out.println("¡El número " + numero + " SÍ está formado por el mismo dígito!");
            } else {
                System.out.println("El número " + numero + " NO está formado por el mismo dígito.");
            }
        }

        scanner.close();
    }
}
