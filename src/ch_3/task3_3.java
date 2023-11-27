package ch_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task3_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ewelina", "Krzysztof", "Kamil", "Krzysztof", "Szymon", "Dominik");
        Collections.sort(list);
        System.out.println("List after sort" + list);
    }
}
