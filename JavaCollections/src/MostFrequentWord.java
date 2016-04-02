import java.util.*;
/**
 * Created by Fantomasa on 30.3.2016 г..
 */
public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> dictonary = new TreeMap<String, Integer>();
        String[] splitText = scanner.nextLine().split(" ");

        for(String word : splitText){
            if(dictonary.containsKey(word)){
                dictonary.put(word, dictonary.get(word) + 1);
            } else dictonary.put(word, 1);
        }

        int mostUsed = 0;

        for (Map.Entry<String, Integer> word : dictonary.entrySet()) {
            if (mostUsed < word.getValue())
                mostUsed = word.getValue();
        }

        for (Map.Entry<String, Integer> word : dictonary.entrySet()) {
            if (mostUsed == word.getValue())
                System.out.println(word.getKey() + " -> " + word.getValue());
        }


    }
}
