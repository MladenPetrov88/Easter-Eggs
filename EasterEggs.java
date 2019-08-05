import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsCount = Integer.parseInt(scanner.nextLine());
        int redEggsCount = 0;
        int orangeEggsCount =0;
        int blueEggsCount =0;
        int greenEggsCount=0;

        for (int i = 0; i < eggsCount; i++) {
            String  eggsCollor = scanner.nextLine();

            switch (eggsCollor){
                case "red":
                    redEggsCount++;
                    break;
                case "orange":
                    orangeEggsCount++;
                    break;
                case "blue":
                    blueEggsCount++;
                    break;
                case "green":
                    greenEggsCount++;
                    break;
            }
        }
        int maxEggsCounts = redEggsCount;
        String maxCollor = "red";


        if (orangeEggsCount > maxEggsCounts){
            maxEggsCounts=orangeEggsCount;
            maxCollor="orange";
        }
        if (blueEggsCount > maxEggsCounts){
            maxEggsCounts = blueEggsCount;
            maxCollor= "blue";
        }
        if (greenEggsCount > maxEggsCounts){
            maxEggsCounts = greenEggsCount;
            maxCollor= "green";
        }
        System.out.printf("Red eggs: %d%n", redEggsCount);
        System.out.printf("Orange eggs: %d%n", orangeEggsCount);
        System.out.printf("Blue eggs: %d%n", blueEggsCount);
        System.out.printf("Green eggs: %d%n", greenEggsCount);
        System.out.printf("Max eggs: %d -> %s", maxEggsCounts, maxCollor );
    }
}

