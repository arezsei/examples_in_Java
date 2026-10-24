package java_2;

public class example002 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 8; i<=56; i+= 2){
            //Implementamos logica boleanda (or) en la cual el numero va pasar solo si es menos a 20 "O" mayor a 32
            if(i < 20 || i > 32) {
                sum += i;
            }
        }
        System.out.println("La suma total es: "+ sum);
    }
}
