import java.util.*;

/**
 * Created by Fantomasa on 30.3.2016 г..
 */
public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String[] string = input.nextLine().split(" ");
        int[] numbers = new int[string.length];
        List<Integer> currentList = new ArrayList<Integer>();

        int current = 0;
        int longest = 0;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(string[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if(i == 0){
                System.out.print(numbers[i] + " ");
                currentList.add(numbers[i]);
                current++;
                continue;
            }
            if(numbers[i] > numbers[i - 1]) {
                System.out.print(numbers[i] + " ");
                currentList.add(numbers[i]);
                current++;
            } else {
                if (current > longest) {
                    currentList.clear();
                    currentList.add(numbers[i]);
                }

                current = 1;
                System.out.println();
                System.out.print(numbers[i] + " ");
            }

            if(current > longest){
                longest = current;
            }
        }

        System.out.println();
        System.out.print("Longest: ");
        for (int j = 0; j < currentList.size(); j++) {
            System.out.print(currentList.get(j) + " ");
        }


    }
}
