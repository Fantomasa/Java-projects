import java.io.*;
import java.util.ArrayList;

/**
 * Created by Fantomasa on 27.3.2016 г..
 */
public class ArrayListOfDoubles {
    public  static final String FILE_PATH = "./data/doubles.list";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Double> myArr = new ArrayList<>();
        myArr.add(3.2);
        myArr.add(5.5);
        myArr.add(3.3);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        outputStream.writeObject(myArr);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));

        System.out.println(inputStream.readObject());
        inputStream.close();
        outputStream.close();
    }
}
