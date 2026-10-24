package java_1;
import java.util.Scanner;

public class example09 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Ingresar un número entero positivo: ");
        int numeroOriginal = sr.nextInt();

        if (numeroOriginal > 0) {
            int numeroTemporal = numeroOriginal;
            int sumaCifras = 0;

            while (numeroTemporal > 0) {
                int digito = numeroTemporal % 10;  // Extrae el último número (ej: de 181 saca el 1)
                sumaCifras += digito;               // Lo suma al acumulador
                numeroTemporal = numeroTemporal / 10; // Corta el número (ej: de 181 pasa a 18)
            }
            System.out.println("La suma de las cifras es: " + sumaCifras);
            // Verificamos si el residuo de dividir la suma entre 9 es 0
            if (sumaCifras % 9 == 0) {
                System.out.println("El número " + numeroOriginal + " SI es múltiplo de 9.");
            } else {
                System.out.println("El número " + numeroOriginal + " NO es múltiplo de 9.");
            }
        } else {
            System.out.println("Error: El número ingresado debe ser positivo.");
        }
        sr.close();
    }
}
