import java.util.Scanner;

/**
 * Created by Fantomasa on 30.3.2016 г..
 */
public class CalculateFactorel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(Factorel(n));
    }

    private static Integer Factorel(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            return Factorel(n - 1) * n;
        }
    }
}
