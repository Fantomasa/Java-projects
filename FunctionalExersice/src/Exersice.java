import java.util.Scanner;

/**
 * Created by Fantomasa on 28.3.2016 г..
 */
public class Exersice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        printRecursion(n);
    }

    private static void printRecursion(int n) {
        if (n <= 1) {
            return;
        }
        System.out.print(n + " ");
        printRecursion(n - 1);
    }
}
