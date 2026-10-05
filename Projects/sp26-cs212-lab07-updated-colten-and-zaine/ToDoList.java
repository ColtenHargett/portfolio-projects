/**
* This is my code! It's goal is to define the ToDoList class
* CS 212 - Lab 7
* @author Zaine, Colten
* @version 1.0 3/10/2026
*/

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> array;

    public ToDoList() {
        array = new ArrayList<>(0);
    }

    /**
    * Adds an item to the end of the array
    *
    * @param item item to add
    */
    public void addItem(String item) {
        array.add(item);
    }
    /**
    * Adds an item to a specific index in the array
    *
    * @param item item to add
    * @param index index to add it at
    */
    public void addItem(String item, int index) {
        array.add(index, item);
    }

    /**
    * Removes an item at a specific index in the array
    *
    * @param index index to remove
    */
    public void removeItem(int index) {
        array.remove(index);
    }

    /**
    * Marks an item as "DONE"
    *
    * @param index index to mark as done
    */
    public void markAsDone(int index) {
        array.set(index, "DONE " + array.get(index));
    }

    /**
    * Clears the array
    */
    public void clearArray() {
        array.clear();
    }

    /**
    * Returns size of the array
    * 
    * @return size of array
    */
    public int size() {
        return array.size();
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < array.size(); ++i) {
            output += (i+1) + ": " + array.get(i) + "\n";
        }
        return output;
    }
}