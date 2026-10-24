package java_2;

import java.util.Scanner;

public class example005 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Ingresá un número entero positivo: ");
        int numero = sr.nextInt();

        if (numero <= 0) {
            System.out.println("Error: El número debe ser estrictamente positivo, máquina.");
        } else {
            int numeroTemporal = numero;
            int producto = 1;
            while (numeroTemporal > 0) {
                int digito = numeroTemporal % 10; // Extraemos el último dígito
                producto *= digito; // Multiplicamos el dígito al acumulador (producto = producto * digito)
                numeroTemporal /= 10; // Eliminamos la última cifra del temporal
            }

            // Mostramos el resultado final
            System.out.println("El producto de los dígitos de " + numero + " es: " + producto);
        }
        sr.close();
    }
}
