import com.sun.javafx.binding.StringFormatter;

import java.util.Scanner;

/**
 * Created by Fantomasa on 22.3.2016 г..
 */
public class FormatingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        double b = console.nextDouble();
        double c = console.nextDouble();

        System.out.print('|');
        System.out.print(String.format("%1$-10s", Integer.toHexString(a).toUpperCase()));
        System.out.print('|');
        System.out.print(String.format("%010d", Integer.parseInt(Integer.toBinaryString(a))));
        System.out.print('|');

        System.out.print(String.format("%1$10s", String.format("%.2f", b)));
        System.out.print('|');
        System.out.print(String.format("%1$-10s", String.format("%.3f", c)));
        System.out.print('|');
        System.out.println();
    }
}
