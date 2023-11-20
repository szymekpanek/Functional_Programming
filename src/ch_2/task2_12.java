package ch_2;

import java.util.TreeSet;

public class task2_12 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Szymon");
        set.add("Antek");
        set.add("Kuba");
        set.add("Michał");

        System.out.println("set size = " + set.size());

        set.remove("Antek");

        System.out.println("TreeSet elements: " + set);

        System.out.println("set size = " + set.size());

        set.clear(); // removes all elements from the set

        System.out.println("TreeSet elements: " + set);
        System.out.println("set size = " + set.size());
    }
}
