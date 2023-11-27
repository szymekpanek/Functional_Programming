package ch_3;
// task 3.1 and 3.2
import java.util.*;

public class task3_1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Ewelina");
        list.add("Krzysztof");
        list.add("Kamil");
        list.add("Krzysztof");
        list.add("Szymon");
        list.add("Dominik");
        System.out.println("List before sort: " + list);
        list.sort(Comparator.reverseOrder());

        System.out.printf("List after sort and reverse : " + list);
    }
}
