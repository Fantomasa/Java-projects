import java.util.Scanner;

/**
 * Created by Fantomasa on 30.3.2016 г..
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().toLowerCase().split(" ");
        //scanner.nextLine();

        String word = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            if(text[i].contains(word.toLowerCase())) {
                count++;
            }
        }

        System.out.println(count);

    }
}
