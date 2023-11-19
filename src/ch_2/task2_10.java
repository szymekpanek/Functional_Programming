package ch_2;

// write a program that creates 2 hash sets. To the first one add 5 names of your classmates.
// nextly delete one name from the first set and print it. Then make seckond hash set and add
// 3 names


import java.util.HashSet;
import java.util.Set;

public class task2_10 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("John");
        set1.add("Richard");
        set1.add("Donna");
        set1.add("Ken");
        set1.add("Mikhail");

        System.out.println("first list elements: " + set1);

        set1.remove("Mikhail");

        System.out.println("first list elements: " + set1);

        set2.add("Szymon");
        set2.add("Kuba");
        set2.add("Kacper");
        set2.add("Marek");

        if (set2.contains("Marek")) {
            System.out.println("Marek is in the set");
        } else {
            System.out.println("Marek is not in the set");
        }

        System.out.println("Hash list elements: " + set2);

        set1.addAll(set2);

        System.out.println("first list elements: " + set1);
    }
}