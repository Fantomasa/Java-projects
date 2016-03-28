import java.util.Scanner;

/**
 * Created by Fantomasa on 22.3.2016 г..
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double firstPart = (Math.pow(a,2) + Math.pow(b,2)) / (Math.pow(a,2) - Math.pow(b,2));
        double secondPart = (a + b + c) / Math.sqrt(c);
        double F1 = Math.pow(firstPart, secondPart);

        double F2 = Math.pow((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,3)),(a - b));

        double diff = Math.abs(((a + b + c) / 3) - (F1 + F2)/2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", F1, F2, diff);

    }
}
