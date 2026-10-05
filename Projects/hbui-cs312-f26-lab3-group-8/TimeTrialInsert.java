/*
 * TimeTrialInsert.java
 * CS312 Lab 3 - Empirical Complexity (Group 8)
 * Authors: Colten Hargett, Ashley
 * Times inserting N Integers into an ArrayList or LinkedList.
 * Usage: java TimeTrialInsert N
 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class TimeTrialInsert
{

  public static void main(String [] args)
  {
	 int N = Integer.parseInt(args[0]);

    
    List<Integer> l = new ArrayList<>();
    //List<Integer> l = new LinkedList<>();
    int i;

    //start the timer
    long startTime_ns = System.nanoTime();

	for(i=0; i<N; i++){
    	l.add(0, Integer.valueOf(i));
    	//l.add(Integer.valueOf(i)); // insert at the end instead
	}
    
    //end the timer
    long endTime_ns = System.nanoTime();

    System.out.println("len = " + l.size());
    System.out.println("Took "+(endTime_ns - startTime_ns)/1e9 + " s"); 
    
  }
}

