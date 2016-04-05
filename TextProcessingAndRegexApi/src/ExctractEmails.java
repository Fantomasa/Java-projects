import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Fantomasa on 5.4.2016 г..
 */
public class ExctractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(
                "[\\-\\.A-Za-z0-9]+@[A-Za-z\\.\\-]+\\.[a-z]+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
