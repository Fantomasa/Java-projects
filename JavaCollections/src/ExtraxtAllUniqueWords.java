import java.util.*;

/**
 * Created by Fantomasa on 30.3.2016 г..
 */
public class ExtraxtAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase().replaceAll("[.,:?!]", "");


        String[] splitText = text.split(" ");
        Set<String> set = new TreeSet<String>();

        for (int i = 0; i < splitText.length; i++) {
            set.add(splitText[i]);
        }

        System.out.println(set); // thing that is the point of this task, to use tree set
    }
}
