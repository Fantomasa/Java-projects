import java.util.Scanner;

/**
 * Created by Fantomasa on 5.4.2016 г..
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\W+");
        int counter = 0;
        String findWord = scan.nextLine();
        for (String word: input) {
            if (word.equals(findWord))counter++;
        }
        System.out.println(counter);
    }
}
