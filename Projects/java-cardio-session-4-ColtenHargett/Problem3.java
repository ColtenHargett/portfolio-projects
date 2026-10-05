public class Problem3 {
    public static void main(String[] args) {
        int [] rainfall = {7, 2, 0, 0, 8, 4, 1};
        double sum = 0;
        int dryDays = 0;

        for (int i = 0; i < rainfall.length; i++){
            System.out.println("Day " + (i + 1) + ": " + rainfall[i] + "in");
            sum += rainfall[i];
            if (rainfall[i] == 0){
                dryDays += 1;
            }
        }
        System.out.println("Total rainfall: " + sum + "in");
        System.out.println("Average rainfall: " + sum/rainfall.length + "in");
        System.out.println("Dry days: " + dryDays);

    }
}
