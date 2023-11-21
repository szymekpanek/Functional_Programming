package ch_2;

import java.util.Vector;

public class task2_14 {
    public static void main(String[] args) {
        Vector vector = new Vector();

        for (int i = 0; i <= 200 ; i++) {
            vector.add(i);
            System.out.println("vector size = " + vector.size() + " vector capacity = " + vector.capacity());
        }
    }
}
