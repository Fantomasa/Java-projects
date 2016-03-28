import java.util.Scanner;

/**
 * Created by Fantomasa on 22.3.2016 г..
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] theString = console.nextLine().split(" ");
        String str1 = theString[0];
        String str2 = theString[1];

        int sum = 0;
        char s1;
        char s2;
        for (int i = 0;i < str1.length(); i++) {
            s1 = str1.charAt(i);
            s2 = str2.charAt(i);
            sum += (int)s1 * (int)s2;
        }
        System.out.println(sum);


    }
}
