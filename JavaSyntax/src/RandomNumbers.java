import java.util.Scanner;

/**
 * Created by Fantomasa on 22.3.2016 г..
 */
public class RandomNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int first = console.nextInt();
        int second = console.nextInt();
        int diff = Math.abs(first - second);
        int maxNumber = Math.max(first, second);

        for (int i = 0; i < diff ; i++) {
            System.out.println((int)(Math.random() * maxNumber));
        }

    }
}
