package ch_2;
import java.util.ArrayList;
import java.util.Random;

//Write a program that puts  a random number in ArrayList then sum them up
public class task2_6 {
    private int sum(ArrayList<Integer> data){
        int result = 0;
        for (Integer datum : data) {
            result += datum;
        }
        return result;
    }

    private void array_creator (ArrayList<Integer> data){
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            data.add(Integer.valueOf(String.valueOf(rand.nextInt(100))));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        task2_6 task = new task2_6();
        task.array_creator(data);
        System.out.println(data);
        System.out.println("Sum of all elements in table: " + task.sum(data));
    }
}
