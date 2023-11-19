package ch_2;

import java.util.Collections;
import java.util.LinkedList;

//linked list
//write a program using LinkedList properties. Add letters from A to Z. To print them use reverse() method from Collections class
public class task2_7 {
    private void list_creator (LinkedList<String> data){
        for (char i = 'A'; i <= 'Z'; i++) {
            data.add(String.valueOf(i));
        }
    }

    private void printList(LinkedList<String> data) {
        Collections.reverse(data);
        data.forEach((x) -> System.out.print(x + " "));
    }

    public static void main(String[] args) {
        task2_7 task = new task2_7();
        LinkedList<String> data = new LinkedList<>();
        task.list_creator(data);
        task.printList(data);
    }
}
