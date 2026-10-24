package java_1;
import java.util.Scanner;

public class example010 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero positivo (a): ");
        int a = sr.nextInt();

        System.out.print("Ingrese el segundo número entero positivo (b): ");
        int b = sr.nextInt();
        if (a > 0 && b > 0) {
            int num1 = a;
            int num2 = b;
            // Bucle para hallar el MCD por residuo de divisiones sucesivas
            while (num2 != 0) {
                int temporal = num2;
                num2 = num1 % num2;
                num1 = temporal;
            }
            int mcd = num1;
            int mcm = (a * b) / mcd;
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Máximo Común Divisor (MCD): " + mcd);
            System.out.println("Mínimo Común Múltiplo (MCM): " + mcm);
        } else {
            System.out.println("Error: Ambos números deben ser enteros positivos mayores que cero.");
        }
        sr.close();
    }
}
