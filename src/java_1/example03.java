package java_1;
import java.util.Scanner;
public class example03 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int numero = 0;
        // Variables para el grupo de mayores a 500
        int sumaMayores = 0;
        int contMayores = 0;
        // Variables para el grupo de menores a 500
        int sumaMenores = 0;
        int contMenores = 0;
        System.out.println("--- Separador de Promedios (Ingresa 0 para terminar) ---");

        do {
            System.out.print("Ingrese un número: ");
            numero = sr.nextInt();
            if (numero != 0) {
                if (numero > 500) {
                    sumaMayores += numero;
                    contMayores++;
                } else {
                    sumaMenores += numero;
                    contMenores++;
                }
            }

        } while (numero != 0);
        System.out.println("\n--- RESULTADOS FINALES ---");
        if (contMayores > 0) {
            double promMayores = (double) sumaMayores / contMayores;
            System.out.println("Promedio de los números mayores a 500: " + promMayores);
        } else {
            System.out.println("No se ingresaron números mayores a 500.");
        }

        if (contMenores > 0) {
            double promMenores = (double) sumaMenores / contMenores;
            System.out.println("Promedio de los números menores a 500: " + promMenores);
        } else {
            System.out.println("No se ingresaron números menores a 500.");
        }
        sr.close();
    }
}
