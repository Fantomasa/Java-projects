package ExamPreparation_1;

import java.util.Scanner;

/**
 * Created by Fantomasa on 12.4.2016 г..
 */
public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixData = scanner.nextLine().split("\\s+");
        int matrixRows = Integer.parseInt(matrixData[0]);
        int matrixCols = Integer.parseInt(matrixData[1]);
        boolean[][] matrix = new boolean[matrixRows][matrixCols];
        String line = scanner.nextLine();

        while (!line.equals("stop")){
            int stepCounter = 1;

            String[] splitLine = line.split(" ");
            int startRow = Integer.parseInt(splitLine[0]);
            int parkRow = Integer.parseInt(splitLine[1]);
            if(isRollFull(matrix, parkRow)){
                System.out.printf("Row %d is full\n", parkRow);
            } else {
                int parkCol = Integer.parseInt(splitLine[2]);
                stepCounter += Math.abs(parkRow - startRow);
                stepCounter += Math.abs(parkCol);
                if (!matrix[parkRow][parkCol]){
                    matrix[parkRow][parkCol] = true;
                    System.out.println(stepCounter);
                } else {
                    int distance = 0;
                }
            }

            line = scanner.nextLine();
        }

    }
    static boolean isRollFull(boolean[][] matrix, int row){
        for (int i = 1; i < matrix[row].length; i++) {
            if(matrix[row][i] == false){
                return false;
            }
        }
        return true;
    }
}
