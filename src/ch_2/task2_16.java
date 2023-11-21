package ch_2;

import java.util.LinkedList;
import java.util.Random;

public class task2_16 {
    private void printIterator (LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private void printDescendingIterator (LinkedList list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    private void listCreator(LinkedList list){
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        task2_16 task = new task2_16();

        task.listCreator(list);
        System.out.println("List: ");
        task.printIterator(list);
        System.out.println('\n' + "List descending: " );
        task.printDescendingIterator(list);
    }
}
