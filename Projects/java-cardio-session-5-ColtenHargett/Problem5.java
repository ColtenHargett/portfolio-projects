public class Problem5 {
    public static void main(String[] args) {
        int[][] grid = {
                {64, 25, 12, 22, 11},
                {90, 3, 47, 85, 19},
                {33, 15, 28, 9, 41},
                {72, 56, 38, 61, 44}
        };

        System.out.println("Original 2D Array:");
        printGrid(grid);

        System.out.println("\nSorting each row...\n");

        for (int[] ints : grid) {
            selectionSort(ints);
        }

        System.out.println("Sorted 2D Array:");
        printGrid(grid);
    }

    private static void selectionSort(int[] row) {
        for (int i = 0; i < row.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < row.length; j++) {
                if (row[j] < row[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = row[i];
                row[i] = row[minIndex];
                row[minIndex] = temp;
            }
        }
    }

    private static void printGrid(int[][] grid) {
        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.printf("%-3d ", anInt);
            }
            System.out.println();
        }
    }
}
