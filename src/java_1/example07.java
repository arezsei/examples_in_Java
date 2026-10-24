package java_1;

public class example07 {
    public static void main(String[] args) {
        int numeroActual = 456;
        long sumaTotal = 0;
        int contador = 1;

        while (contador <= 800) {
            sumaTotal += numeroActual; // Acumulamos el número actual
            numeroActual += 2;         // Avanzamos al siguiente número par (+2)
            contador++;                // Incrementamos el contador de términos
        }

        // Mostramos el resultado en la consola
        System.out.println("--- RESULTADO DE LA SERIE ---");
        System.out.println("La suma de los 800 sumandos es: " + sumaTotal);
    }
}
