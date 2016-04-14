package ExamPreparation_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Fantomasa on 12.4.2016 г..
 */
public class SoftUniNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dict = new HashMap<>();
        dict.put("aa", "0");
        dict.put("aba", "1");
        dict.put("bcc", "2");
        dict.put("cc", "3");
        dict.put("cdc", "4");
        String input = scanner.nextLine();
        String regex = "(aa|aba|bcc|cc|cdc)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder sb = new StringBuilder();
        while (matcher.find()){
            sb.append(dict.get(matcher.group()));
        }
        int number = Integer.parseInt(sb.toString(), 5);
        System.out.println(number);
    }
}
