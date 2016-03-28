import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Fantomasa on 22.3.2016 г..
 */
public class FirstOddEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");
        String[] needNumbers = console.nextLine().split(" ");
        Integer[] newNumbers = new Integer[numbers.length];

        for (int i = 0; i <newNumbers.length ; i++) {
            newNumbers[i] = Integer.parseInt(numbers[i]);
        }

        GiveMeTheNumbers(newNumbers, Integer.parseInt(needNumbers[1]), needNumbers[2]);
    }

    public static void GiveMeTheNumbers(Integer[] Array, int number, String type){
        int rest;
        List<Integer> newNumbers = new ArrayList<Integer>();

        if(type.equals("even")){
           rest = 0;
        } else {
           rest = 1;
        }

        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == rest) {
                newNumbers.add(Array[i]);
            }
        }
        for (int i = 0; i < newNumbers.size() ; i++) {
            System.out.print(newNumbers.get(i) + " ");
        }

    }
}
