package ch_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task3_12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ewelina", "Krzysztof", "Kamil", "Baltazar", "Szymon", "Dominik", "Konfucjusz");
        List<String> upperList = list.stream()
                .map(String::toUpperCase)
                .toList();


        upperList.stream()
                .filter(s -> s.length() > 7)
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\n" + list);

    }
}
