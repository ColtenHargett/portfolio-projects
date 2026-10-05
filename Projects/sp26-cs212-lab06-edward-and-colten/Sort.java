public class Sort {

    private static void merge(int[] arr, int start, int end) {

        int mid = (start + end) / 2;

        int sizeOfLeftHalf = mid - start + 1;
        int sizeOfRightHalf = end - mid;

        int[] left = new int[sizeOfLeftHalf];
        int[] right = new int[sizeOfRightHalf];

        // copy a chunk [start to end] of the array to 2 halves
        for (int i = 0; i < sizeOfLeftHalf; i++) {
            left[i] = arr[start + i];
        }

        for (int i = 0; i < sizeOfRightHalf; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = 0;

        // merge the 2 halves back to the original part of array
        while (i < sizeOfLeftHalf && j < sizeOfRightHalf) {
            if (left[i] <= right[j]) {
                arr[start + k] = left[i];
                i++;
            } else {
                arr[start + k] = right[j];
                j++;
            }
            k++;
        }

        // copy the rest of the halves if any back
        for (; i < sizeOfLeftHalf; i++) {
            arr[start + k] = left[i];
            k++;
        }

        for (; j < sizeOfRightHalf; j++) {
            arr[start + k] = right[j];
            k++;
        }
    }

    private static void mergeSort(int[] numbers, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(numbers, start, mid);
            mergeSort(numbers, mid + 1, end);

            merge(numbers, start, end);
        }
    }

    public static void merge(int[] num) {
        mergeSort(num, 0, num.length - 1);
    }

    // Selection sort method
    public static void selectionSort(int[] numbers) {
        int n = numbers.length;
        int numOfComparisons = 0;
        int numOfSwaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                numOfComparisons++;
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
                numOfSwaps++;
            }
        }
    }

    // Insertion sort method
    public static void insertionSort(int[] numbers) {
        int n = numbers.length;

        for (int i = 1; i < n; i++) {
            int key = numbers[i];
            int j = i - 1;

            // Shift elements that are greater than key
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            // Place key in its correct position
            numbers[j + 1] = key;
        }
    }
}