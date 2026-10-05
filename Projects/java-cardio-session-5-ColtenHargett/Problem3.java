public class Problem3 {
    public static void main(String[] args) {
        double overallSum = 0;
        int overallCount = 0;
        int[][] scores = {
                {85, 90, 78},
                {92, 88, 84},
                {76, 81, 79},
                {88, 85, 91}
        };
        String[] players = {"Alex", "Jamie", "Sam", "Riley"};
        String[] games = {"Game 1", "Game 2", "Game 3"};

        System.out.println("ARCADE LEADERBOARD");
        for (int row = 0; row < scores.length; row++) {
            double rowSum = 0;

            System.out.print("Player " + (row + 1) + " (" + players[row] + "):   ");
            for (int col = 0; col < scores[row].length; col++) {
                System.out.print(scores[row][col] + "  ");
                rowSum += scores[row][col];
                overallSum += scores[row][col];
                overallCount++;
            }

            double rowAvg = rowSum / scores[row].length;
            System.out.printf("| Average: %.2f%n", rowAvg);
        }

        System.out.println();
        System.out.println("Game Averages:");

        for (int col = 0; col < scores[0].length; col++) {
            double colSum = 0;

            for (int row = 0; row < scores.length; row++) {
                colSum += scores[row][col];
            }

            double colAvg = colSum / scores.length;
            System.out.printf("%s: %.2f%n", games[col], colAvg);
        }

        double overallAvg = overallSum / overallCount;
        System.out.printf("%nOverall Arcade Average: %.2f%n", overallAvg);
    }
}
