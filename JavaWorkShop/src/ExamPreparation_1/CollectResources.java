package ExamPreparation_1;

import java.util.Scanner;

/**
 * Created by Fantomasa on 12.4.2016 г..
 */
public class CollectResources {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] resourcesToCollect = scanner.nextLine().split(" ");
        int numberOfPaths = Integer.parseInt(scanner.nextLine());
        boolean[] itemsFlags = new boolean[resourcesToCollect.length];
        int maxQuantity = 0;
        int currentQuantity;
        int currentPosition;

        for (int i = 0; i < numberOfPaths; i++) {
            itemsFlags = new boolean[resourcesToCollect.length];
            currentQuantity = 0;
            String[] startPath = scanner.nextLine().split(" ");
            int start = Integer.parseInt(startPath[0]);
            int step = Integer.parseInt(startPath[1]);
            currentPosition = start;
            step %= resourcesToCollect.length;
            while (!itemsFlags[currentPosition]){

                String[] resourceData = resourcesToCollect[currentPosition].split("_");
                String resourceType = resourceData[0];
                int quantiy = 0;
                if(resourceData.length == 1) quantiy = 1;
                else quantiy = Integer.parseInt(resourceData[1]);
                switch (resourceType){
                    case "stone":
                    case "gold":
                    case "wood":
                    case "food":
                        currentQuantity += quantiy;
                        itemsFlags[currentPosition] = true;
                }

                currentPosition += step;
                currentPosition %= resourcesToCollect.length;
            }
            if (currentQuantity > maxQuantity) maxQuantity = currentQuantity;
        }
        System.out.println(maxQuantity);
    }
}
