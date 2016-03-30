import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Fantomasa on 28.3.2016 г..
 */
public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = scanner.nextInt();
        int[] numbers = new int[numbersCount];
        scanner.nextLine();

        String strNumbers = scanner.nextLine();
        String[] arrayStrNumbers = strNumbers.split(" ");
        for (int i = 0; i < arrayStrNumbers.length; i++) {
            numbers[i] = Integer.parseInt(arrayStrNumbers[i]);
        }
        Arrays.sort(numbers);

        for (int i = 0; i < numbersCount; i++) {
            System.out.print(numbers[i] + " ");
        }


    }
}
