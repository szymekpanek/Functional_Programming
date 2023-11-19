package ch_2;

import java.util.ArrayList;
import java.util.Collections;

// Write a program that puts a random name in ArrayList and then sorts it
public class task2_5 {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("John");
        data.add("Jack");
        data.add("James");
        data.add("Jill");
        data.add("Jenny");
        data.add("Jade");
        data.add("Jasmine");
        data.add("Jade");
        System.out.println("Unsorted array:" + data);

        Collections.sort(data); //sorts the array

        System.out.println("Sorted array:" + data);

        data.remove(data.get(1)); //removes the second element
        data.add(1, "Szymon"); //adds Jack to the second element
        System.out.println("Array after removing and adding element:" + data);

        Collections.sort(data); //sorts the array

        System.out.println("Sorted array:" + data);
    }
}
