package java_2;

import java.util.Scanner;

public class example003 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Cantidad de numeros a ingresar: ");
        int n = sr.nextInt();
        int countPositivos = 0;

        for (int i=1; i <= n; i++){
            System.out.println("Ingresar el numero "+1+":");
            int num = sr.nextInt();

            if (num > 0){
                countPositivos++;
            }
        }
        System.out.println("Cantidad de numeros positivos ingresados es: "+countPositivos);
        sr.close();

    }
}
