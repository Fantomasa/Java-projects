import java.util.Scanner;

/**
 * Created by Fantomasa on 22.3.2016 г..
 */
public class ConvertFromBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String base7Number = console.nextLine();

        Integer number = Integer.valueOf(base7Number, 7);

        System.out.println(number);
    }
}
