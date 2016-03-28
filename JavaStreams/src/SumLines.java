import java.io.*;

/**
 * Created by Fantomasa on 27.3.2016 г..
 */
public class SumLines {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./data/lines.txt"));
        String line = reader.readLine();
        int lettersSum = 0;

        while (line != null){
            lettersSum = 0;
            for (int i = 0; i < line.length(); i++) {
                lettersSum += line.charAt(i);
            }

            System.out.println(lettersSum);
            line = reader.readLine();
        }

        reader.close();
    }
}
