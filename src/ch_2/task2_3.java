package ch_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//using arrayList write a program that puts 10 random number and sort them.
public class task2_3 {
    void array_creator(ArrayList<Integer> data){
        Random rand = new Random();
        task2_3 task = new task2_3();

        for (int i = 0; i < 100; i++) {
            data.add(Integer.valueOf(String.valueOf(rand.nextInt(100))));
        }

        System.out.println("Unsorted array:");
        task.printArray(data);
    }

    private void merge_sort (ArrayList<Integer> data){
        Collections.sort(data); //sorts the array
        task2_3 task = new task2_3();

        System.out.println("\n" + "Sorted array:");
        task.printArray(data);

    }

    private void printArray(ArrayList<Integer> data) {
        data.forEach((x) -> System.out.print(x + " "));
    }

    public static void main(String[] args) {
        task2_3 task = new task2_3();
        ArrayList<Integer> data = new ArrayList<>();
        task.array_creator(data);
        task.merge_sort(data);
    }

    public void sort_array(ArrayList<String> data) {
    }
}
