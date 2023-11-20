package ch_2;
// TreeSet learning

import java.util.TreeSet;

public class task2_11 {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(2);
        set.add(35);
        set.add(3);

        System.out.println("TreeSet elements: " + set);
        System.out.println("set size = " + set.size());

        set.remove(2);

        System.out.println("TreeSet elements: " + set);

        System.out.println("set size = " + set.size());

        set.clear(); // removes all elements from the set

        System.out.println("TreeSet elements: " + set);
        System.out.println("set size = " + set.size());

    }
}
