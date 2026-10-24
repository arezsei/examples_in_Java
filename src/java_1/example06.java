package java_1;

import java.util.Scanner;

public class example06 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int limiteInferior = 1;
        int limiteSuperior = 100;

        int numeroAleatorio = limiteInferior + (int)(Math.random() * (limiteSuperior + 1 - limiteInferior));

        int numeroUsuario = 0;
        int intentos = 0;
        System.out.println("He pensado un número entre 1 y 100. ¡Intenta adivinarlo!");

        do {
            System.out.print("Introduce tu número: ");
            numeroUsuario = sr.nextInt();
            intentos++;

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número que digitaste es MENOR que el número secreto. ¡Intenta de nuevo!");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número que digitaste es MAYOR que el número secreto. ¡Intenta de nuevo!");
            } else {
                System.out.println("\n ¡EXCELENTE! Has adivinado el número secreto.");
            }
        } while (numeroUsuario != numeroAleatorio);

        System.out.println("El número secreto era: " + numeroAleatorio);
        System.out.println("Te tomó un total de: " + intentos + " intentos.");
        sr.close();
    }
}
