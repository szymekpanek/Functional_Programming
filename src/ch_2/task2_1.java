package ch_2;

import java.util.Random;

// Write a program that puts counts from 1 by 100 in a one-dimensional array named data and then adds them up
public class task2_1 {
    private int[] table_creator (int[] data){
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }

        return data;
    }

    private int sum (int[] data){
        int sum = 0;
        for (int x : data){
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] data = new int[100];
        task2_1 task = new task2_1();
        data = task.table_creator(data);
        System.out.println("Sum of all elements in table: " + task.sum(data));
    }
}
