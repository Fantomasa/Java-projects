import java.io.*;

/**
 * Created by Fantomasa on 21.3.2016 г..
 */
public class IO {
    private static final String FILE_PATH = "users.txt";
    private static final String SAVE_PATH = "TOTAL-TIME.txt";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        File save = new File(SAVE_PATH);

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));

            FileWriter fw = new FileWriter(save);
            PrintWriter writer = new PrintWriter(fw, true);

            String line = reader.readLine();
            while(line != null) {
                String[] lineArgs = line.split(" ");
                String username = lineArgs[0];
                int totalMinutes = 0;

                for (int i = 1; i < lineArgs.length; i++) {
                    String[] loggedTime = lineArgs[i].split(":");
                    int hours = Integer.parseInt(loggedTime[0]);
                    int minutes = Integer.parseInt(loggedTime[1]);
                    totalMinutes += (hours * 60) + minutes;
                }
                line = reader.readLine();

                int hours = totalMinutes / 60;
                int minutes = totalMinutes % 60;
                int days = 0;

                String output = username + " " + totalMinutes;
                output += " ( days " + days + " " + hours + " hours "+ minutes + " minutes " + ")";
                writer.println(output);
            }

        } catch (FileNotFoundException ex){
            System.out.println("File not found");
        } catch (IOException io){
            System.out.println("Bam bam");
        }
    }
}
