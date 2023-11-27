package ch_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// task 3.4
// Write a program that sorts a collection of strings in descending order using comparator.

public class task3_4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ewelina", "Krzysztof", "Kamil", "Krzysztof", "Szymon", "Dominik");
        System.out.println("List before sort" + list);


        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
            return - o1.compareTo(o2);
            }
        };

        Collections.sort(list, comparator);
        System.out.println("List after sort" + list);
    }
}
