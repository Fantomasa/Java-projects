import java.util.Scanner;

/**
 * Created by Fantomasa on 22.3.2016 г..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] xyA = console.nextLine().split(" ");
        String[] xyB = console.nextLine().split(" ");
        String[] xyC = console.nextLine().split(" ");

        int xA = Integer.parseInt(xyA[0]);
        int yA = Integer.parseInt(xyA[1]);

        int xB = Integer.parseInt(xyB[0]);
        int yB = Integer.parseInt(xyB[1]);

        int xC = Integer.parseInt(xyC[0]);
        int yC = Integer.parseInt(xyC[1]);

        int area = Math.abs(xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2;

        System.out.println(area);


    }
}
