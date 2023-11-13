package ch_2;

import java.util.Random;

//Write a program that puts a random number in the range from 1 to 100 and adds seperately even and odd numbers
public class task2_2 {

    private int[] table_creator (int[] data){
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(10000);
        }

        return data;
    }

    private String sum (int[] data){
        int even_sum = 0;
        int odd_sum = 0;
        for (int x : data){
            if (x % 2 == 0){
                even_sum += x;
            } else {
                odd_sum += x;
            }
        }
        System.out.println("even numbers: " + even_sum);
        System.out.println("odd numbers: " + odd_sum);
        return "Sum of all elements in table: " + (even_sum + odd_sum);
    }

    public static void main(String[] args) {
        int [] data = new int[100];
        task2_2 task = new task2_2();
        data = task.table_creator(data);
        System.out.println(task.sum(data));
    }
}
