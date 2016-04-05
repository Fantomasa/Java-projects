import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Fantomasa on 5.4.2016 г..
 */
public class ExtractWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
