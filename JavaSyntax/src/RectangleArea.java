import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by Fantomasa on 21.3.2016 г..
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();

        int area = a * b;

        System.out.println(abs(area));
    }
}
