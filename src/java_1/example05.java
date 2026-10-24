package java_1;
import java.util.Scanner;

public class example05 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int numero = 0;
        int contadorPositivos = 0;
        System.out.println("--- Contador de Números Positivos (Ingresa 0 para terminar) ---");
        do {
            System.out.print("Ingrese un número: ");
            numero = sr.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            }

        } while (numero != 0);

        // Mostramos el resultado solicitado
        System.out.println("\n--- RESULTADO ---");
        System.out.println("El número de valores mayores que cero leídos es: " + contadorPositivos);

        sr.close();
    }
}
