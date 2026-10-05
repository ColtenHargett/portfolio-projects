/*
 * TimeTrialGet.java
 * CS312 Lab 3 - Empirical Complexity (Group 8)
 * Authors: Colten Hargett, Ashley
 * Times getting all N Integers from an ArrayList or LinkedList.
 * Usage: java TimeTrialGet N
 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class TimeTrialGet
{

  public static void main(String [] args)
  {
         int N = Integer.parseInt(args[0]);


    List<Integer> l = new ArrayList<>();
    //List<Integer> l = new LinkedList<>();
    int i;

    for(i=0; i<N; i++){
                l.add(0, Integer.valueOf(i));
        }

    //start the timer
    long startTime_ns = System.nanoTime();

	int sum = 0;
	for(i=0; i<N; i++)
	{
   		Integer it = l.get(i);
   		sum += it;
	}

    //end the timer
    long endTime_ns = System.nanoTime();

    System.out.println("len = " + l.size());
    System.out.println("sum = " + sum);
    System.out.println("Took "+(endTime_ns - startTime_ns)/1e9 + " s");

  }
}
