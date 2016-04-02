import java.util.Scanner;

/**
 * Created by Fantomasa on 30.3.2016 г..
 */
public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        scanner.close();
        int currentCount = 1;
        int previusCount = 0;
        String string = "";

        for (int i = 0; i < elements.length; i++) {
            if (i == 0){
                previusCount = 1;
                string = elements[i];
                continue;
            }
            if (elements[i].equals(elements[i - 1])) currentCount ++;
            else if (!elements[i].equals(elements[i - 1])) {
                if(currentCount > previusCount){
                    string = elements[i - 1];
                    previusCount = currentCount;
                }
                currentCount = 1;
            }
            if(currentCount > previusCount){
                string = elements[i - 1];
                previusCount = currentCount;
            }
        }


        for (int i = 0; i < previusCount; i++) {
            System.out.print(string + " ");
        }


    }
}
