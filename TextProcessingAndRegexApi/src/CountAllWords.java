import java.util.Scanner;

/**
 * Created by Fantomasa on 5.4.2016 г..
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\W+");
        System.out.println(input.length);
    }
}
