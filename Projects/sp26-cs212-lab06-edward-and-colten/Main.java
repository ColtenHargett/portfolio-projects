import java.util.Random;
import java.util.Arrays;

public class Main{


    public static void main(String [] args){

        if(args.length != 1){
            return;
        }

        //Use CLI to get the value of N
        int n = Integer.parseInt(args[0]);
        System.out.println("n is: " + n);

        //Generate an array of n integers
        int [] numbers = new int[n];
        Random get = new Random();
        for(int i = 0; i <numbers.length; i++ ){
            numbers[i] = get.nextInt();
        }

        //Copy the array
        int [] toSort = new int[n];
        for(int i = 0; i <numbers.length; i++ ){
            toSort[i] = numbers[i];
        }

        //time regular merge sort in milisecond
        System.out.println("\nRunning merge sort");
        long startTime_ns = System.nanoTime();
        Sort.merge(toSort);
        long endTime_ns = System.nanoTime();
        //System.out.println(Arrays.toString(toSort));
        System.out.println("Merge sort() took "+(endTime_ns - startTime_ns)/1000000.0 + " ms\n");

        // copy array
        int [] toSortSelection = new int[n];
        for (int i = 0; i < numbers.length; i++){
            toSortSelection[i] = numbers[i];
        }

        // run selection sort
        System.out.println("Running selection sort");
        long startTimeSelection = System.nanoTime();
        Sort.selectionSort(toSortSelection);
        long endTimeSelection = System.nanoTime();
        //System.out.println(Arrays.toString(toSort));
        System.out.println("Selection sort() took "+(endTimeSelection  - startTimeSelection )/1000000.0 + " ms\n");


        // copy array
         int [] toSortInsertion = new int[n];
        for (int i = 0; i < numbers.length; i++){
            toSortInsertion[i] = numbers[i];
        }

        // run insertion sort
        System.out.println("Running Insertion sort");
        long startTimeInsertion = System.nanoTime();
        Sort.insertionSort(toSortInsertion);
        long endTimeInsertion = System.nanoTime();
        //System.out.println(Arrays.toString(toSort));
        System.out.println("Insertion sort() took "+(endTimeInsertion - startTimeInsertion)/1000000.0 + " ms");


    }
}

