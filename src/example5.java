import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int totalNote = 0;
        int count = 1;
        double nota = 0;
        double sumNotas = 0;

        System.out.println("Cantidad de notas:");
        totalNote = sr.nextInt();

        while (count <= totalNote){
            System.out.println("ingresar nota "+ count + ": ");
            nota = sr.nextDouble();

            sumNotas = sumNotas + nota;
            count++;
        }

        if (totalNote > 0){
            double promedio = sumNotas / totalNote;
            System.out.println("La suma total es: " + sumNotas);
            System.out.println("El promedio de las notas es: " + promedio);
        }else {
            System.out.println("Sin notas añadidas");
        }
    }
}
