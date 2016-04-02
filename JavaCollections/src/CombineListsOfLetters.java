import java.util.*;

/**
 * Created by Fantomasa on 30.3.2016 г..
 */
public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String firstList = text.replace(" ", "");
        String[] secondList = scanner.nextLine().split(" ");
        ArrayList<String> newChar = new ArrayList<String>();
        ArrayList<String> lastArr = new ArrayList<String>();


        for (int i = 0; i < secondList.length; i++) {
            if(firstList.contains(secondList[i])){
                continue;
            } else {
                newChar.add(secondList[i]);
            }
        }

        lastArr.add(text);
        lastArr.addAll(newChar);

        for (int i = 0; i < lastArr.size(); i++) {
            System.out.print(lastArr.get(i) + " ");
        }


    }
}
