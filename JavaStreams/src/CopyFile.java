import java.io.*;

/**
 * Created by Fantomasa on 27.3.2016 г..
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream inputFile = new FileInputStream(new File("./data/mini.jpg"));
        FileOutputStream outputFile = new FileOutputStream(new File("./data/my-copied-picture.jpg"));

        int bytesRead;

        while ((bytesRead = inputFile.read()) != -1){
            outputFile.write(bytesRead);
        }

        inputFile.close();
        outputFile.close();

    }
}
