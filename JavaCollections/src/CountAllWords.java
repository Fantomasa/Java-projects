import java.util.Scanner;

/**
 * Created by Fantomasa on 30.3.2016 г..
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("[ '-]");
        System.out.println(text.length);

    }
}
