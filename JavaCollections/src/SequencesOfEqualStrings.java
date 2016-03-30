import java.util.Scanner;

/**
 * Created by Fantomasa on 28.3.2016 г..
 */
public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split(" ");

        for (int i = 0; i < inputString.length; i++) {
            if(i == 0){
                System.out.print(inputString[i] + " ");
                continue;
            }

            if(inputString[i].contains(inputString[i - 1])){
                System.out.print(inputString[i] + " ");
            }
            else {
                System.out.println();
                System.out.print(inputString[i] + " ");
            }
        }

    }
}