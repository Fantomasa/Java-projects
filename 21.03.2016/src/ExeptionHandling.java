/**
 * Created by Fantomasa on 21.3.2016 г..
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionHandling {
    public static void main(String[] args) {

        try {
            Scanner console = new Scanner(System.in);
            int number = console.nextInt();
            System.out.println(number);
            console.nextLine();

            String someString = console.nextLine();
            int someNumber = Integer.parseInt(someString);
            System.out.println(someNumber);
        } catch (InputMismatchException name){
            System.out.println("Not a valide number");
        } catch (NumberFormatException numberFormat){
            System.out.println("asd");
        } finally {
            System.out.println("If we need to close file.");
        }




    }


}
