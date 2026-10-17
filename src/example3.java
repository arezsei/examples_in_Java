import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        String password = "UCV2026";
        String enterPassword = "";

        do {
            System.out.println("Input password:");
            enterPassword = sr.nextLine();

        }while(!password.equals(enterPassword));
        System.out.println("entraste");
    }
}
