import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Fantomasa on 2.4.2016 г..
 */
public class SortArrayWithStreamAPI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strNumbers = scanner.nextLine().split(" ");
        String sort = scanner.nextLine();

        if (sort.equals("Ascending")){
            Arrays.stream(strNumbers)
                    .map(number -> Integer.parseInt(number))
                    .sorted()
                    .forEach(number -> System.out.printf("%d ", number));
        } else {
            Arrays.stream(strNumbers)
                    .map(number -> Integer.parseInt(number))
                    .sorted((first, second) -> second.compareTo(first))
                    .forEach(number -> System.out.printf("%d ", number));
        }

    }
}
