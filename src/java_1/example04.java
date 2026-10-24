package java_1;
import java.util.Scanner;

public class example04 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int totalNumeros = 0;
        int contador = 1;
        int numero = 0;

        int contMultiplos5 = 0;
        int contMultiplos2 = 0;

        System.out.print("¿Cuántos números enteros desea ingresar? (N): ");
        totalNumeros = sr.nextInt();

        while (contador <= totalNumeros) {
            System.out.print("Ingrese el número " + contador + ": ");
            numero = sr.nextInt();

            if (numero % 5 == 0) {
                contMultiplos5++;
            }
            if (numero % 2 == 0) {
                contMultiplos2++;
            }
            contador++;
        }
        // Mostramos los conteos finales
        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.println("Cantidad de múltiplos de 5 ingresados: " + contMultiplos5);
        System.out.println("Cantidad de múltiplos de 2 ingresados: " + contMultiplos2);
        sr.close();
    }
}
