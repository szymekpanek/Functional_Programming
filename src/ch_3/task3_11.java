package ch_3;

import java.util.Arrays;
import java.util.List;

public class task3_11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ewelina", "Krzysztof", "Kamil", "Baltazar", "Szymon", "Dominik", "Konfucjusz");
        long count = list.stream()
                .filter(s -> s.length() > 7)
                .peek(s -> System.out.print(s + " Leght = " + s.length() + "\n"))
                .count();
        System.out.println("Number of names with length > 7 = " + count);
    }
}
