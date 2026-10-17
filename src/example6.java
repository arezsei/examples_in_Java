import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int numero = 0;
        int contador = 1;

        System.out.print("Ingrese el número: ");
        numero = sr.nextInt();

        System.out.println("\nTabla del " + numero + ":");
        while (contador <= 10) {
            int resultado = numero * contador;

            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }
        sr.close();
    }
}
