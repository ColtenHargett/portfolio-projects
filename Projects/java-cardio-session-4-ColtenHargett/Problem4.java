public class Problem4 {
    public static void main(String[] args) {
        int [] numbers = {12, -7, 45, -3, 0, -29, 18, -54};
        int minIndex = 0;
        int maxIndex = 0;

        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
            if (numbers[i] < numbers[minIndex]){
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]){
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Maximum: " + numbers[maxIndex] + " at index " + maxIndex);
        System.out.println("Minimum: " + numbers[minIndex] + " at index " + minIndex);

    }
}
