import java.util.Scanner;

/**
 * Created by Fantomasa on 5.4.2016 г..
 */
public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().toLowerCase().split("\\s+");
        String pattern = scan.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length ; i++) {
            count +=CountWord(input[i], pattern);
        }
        System.out.println(count);
    }

    public static int CountWord(String word, String pattern){
        int counter = 0;
        int index = 0;
        while ((index = word.indexOf(pattern, index)) != -1) {
            index++;
            counter++;
        }
        return counter;
    }
}
