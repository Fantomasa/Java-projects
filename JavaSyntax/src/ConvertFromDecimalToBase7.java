import java.util.Scanner;

/**
 * Created by Fantomasa on 22.3.2016 г..
 */
public class ConvertFromDecimalToBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = console.nextInt();
        System.out.println(Integer.toString(number,7));
    }
}
