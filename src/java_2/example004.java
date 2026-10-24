package java_2;

import java.util.Scanner;

public class example004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá un número entero positivo: ");
        int numeroOriginal = scanner.nextInt();

        // Validamos que el número sea positivo
        if (numeroOriginal < 0) {
            System.out.println("Error: El número debe ser entero y positivo, máquina.");
        } else {
            int numeroTemporal = numeroOriginal;
            int numeroInvertido = 0;

            // Bucle While: No sabemos cuántos dígitos tiene, así que iteramos
            // hasta que el número temporal se quede sin dígitos (llegue a 0)
            while (numeroTemporal > 0) {
                int digito = numeroTemporal % 10; // Extraemos el último dígito
                numeroInvertido = (numeroInvertido * 10) + digito; // Desplazamos y sumamos el dígito
                numeroTemporal /= 10; // Eliminamos el último dígito del temporal
            }

            // Evaluamos la condición de simetría
            if (numeroOriginal == numeroInvertido) {
                System.out.println("¡El número " + numeroOriginal + " SÍ es capicúa!");
            } else {
                System.out.println("El número " + numeroOriginal + " NO es capicúa.");
            }
        }

        scanner.close();
    }
}
