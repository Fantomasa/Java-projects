import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Fantomasa on 2.4.2016 г..
 */
public class FilterArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] strArray = sc.nextLine().split(" ");

        Arrays.stream(strArray)
                .filter(el -> el.length() > 3)
                .forEach(el -> System.out.print(el + " "));
    }
}