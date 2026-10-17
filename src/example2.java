import java.util.Scanner;

public class example2 {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);

        int sumTotal = 0;
        int number ;

        do {
            System.out.print("Input number:");
            number = sr.nextInt();
            sumTotal += number;

        }while (number != 0);
        System.out.println("Suma total:"+sumTotal);
        System.out.print("finally");
        sr.close();
    }
}
