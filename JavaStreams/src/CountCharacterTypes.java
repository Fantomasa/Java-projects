import java.io.*;

/**
 * Created by Fantomasa on 27.3.2016 г..
 */
public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./data/words.txt"));
        FileWriter writer = new FileWriter(new File("./data/count-chars.txt"));

        String line = reader.readLine();
        int volwels = 0;
        int consonants = 0;
        int punctuation = 0;
        char symbol;
        String strPunctuation = "!,.?";
        String strVolwels = "aeiou";

        while ( line != null){
            line = line.replace(" ", "");
            for (int i = 0; i < line.length(); i++) {
                symbol = line.charAt(i);
                if(strPunctuation.contains(symbol + "")){
                    punctuation++;
                } else if (strVolwels.contains(symbol + "")) {
                    volwels++;
                } else if (!strVolwels.contains(symbol + "")){
                    consonants ++;
                }
            }

            line = reader.readLine();
        }

        writer.write(String.format("Volwels: %d%n", volwels));
        writer.write(String.format("Consonants: %d%n", consonants));
        writer.write(String.format("Punctuation: %d%n", punctuation));
        reader.close();
        writer.close();
    }
}
