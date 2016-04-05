import java.util.Scanner;

/**
 * Created by Fantomasa on 4.4.2016 г..
 */
public class CollectResources {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] item = scanner.next().split(" ");
        int tests = scanner.nextInt();
        int maxQuantity = 0;
        int currentPosition = 0;

        for (int test = 0; test < tests; test++) {
            int currentQuantity = 0;
            boolean[] itemsFlags = new boolean[item.length];
            String[] input = scanner.nextLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int step = Integer.parseInt(input[1]);
            currentPosition = start;

            step %= item.length;

            while(!itemsFlags[currentPosition]){

                String[] resourceData = item[currentPosition].split(" ");
                String resourceType = resourceData[0];
                int quantity;
                if(resourceData.length == 1){
                    quantity = 1;
                } else {
                    quantity = Integer.parseInt(resourceData[1]);
                }
                switch (resourceType){
                    case "stone":
                    case "gold":
                    case "wood":
                    case "food":
                        currentQuantity += quantity;
                }
                currentPosition += step;
                currentPosition %= item.length;

                if (currentQuantity > maxQuantity){
                    maxQuantity = currentQuantity;
                }
            }
        }

        System.out.println(maxQuantity);
    }
}
