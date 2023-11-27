package ch_3;

//Write a program that sorts a collection of strings in descending order using anonymous class.

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task3_5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ewelina", "Krzysztof", "Kamil", "Krzysztof", "Szymon", "Dominik");
        System.out.println("List before sort" + list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2);
            }
        });

        System.out.println("List after sort" + list);
    }
}
