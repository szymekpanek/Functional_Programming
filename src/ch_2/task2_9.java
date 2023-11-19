package ch_2;

import java.util.HashSet;
import java.util.Set;
// Learning how to work with HashSet methods
public class task2_9 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Richard");
        set.add("Donna");
        set.add("Ken");
        set.add("Mikhail");
        // set.add("Mikhail"); // hash set doesn't allow duplicates

        System.out.println("Hash list elements: " +set);

        System.out.println("Uppercase elements: ");
        for (String element: set){
            System.out.print(element.toUpperCase()+ " ");
        }

        System.out.println("\nLowercase elements: ");
        for (String element : set){
            System.out.print(element.toLowerCase() + " ");
        }

    }
}
