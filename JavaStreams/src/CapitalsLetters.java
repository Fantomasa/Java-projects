import java.io.*;

/**
 * Created by Fantomasa on 27.3.2016 г..
 */
public class CapitalsLetters {
    public static  final String FILE_READ_PATH = "./data/secondTaskLines.txt";
    public static  final String FILE_SAVE_PATH = "./data/secondTaskLines.txt";


    public static void main(String[] args) throws IOException {
        File file = new File (FILE_READ_PATH);
        File printFile = new File(FILE_SAVE_PATH);

        BufferedReader reader = new BufferedReader(new FileReader(file));
        FileWriter fWriter = new FileWriter(printFile, true);
        PrintWriter writer = new PrintWriter(fWriter, true);

        String line = reader.readLine();
        String newLines = "";

        while (line != null) {
            newLines += line.toUpperCase() + "\r\n";

            line = reader.readLine();
        }
        writer.println(newLines);
        System.out.println(newLines);

        reader.close();
        writer.close();


    }
}
