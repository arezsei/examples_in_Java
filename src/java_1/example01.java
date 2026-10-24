package java_1;

public class example01 {
    //Imprimir la suma de los 100 números impares consecutivos menores a 500.
    public static void main(String[] args) {
        int numActual = 499;
        int sumTotal = 0;
        int count = 0;

        while (count < 100){
            sumTotal += numActual;
            numActual -= 2;
            count++;
        }
        System.out.println("La suma de los 100 números impares menores a 500 es: " + sumTotal);
    }

}
