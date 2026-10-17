public class ejemplo1 {
    public static void main(String[] args) {
        var count = 1;
        var total = 0;

        while(count <= 10) {
            System.out.print("numero: "+ count++);
            total++;
        }
        System.out.print("total:"+ total++);
    }
}
