package ch_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//if name length > 7 print name and length

public class task3_9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ewelina", "Krzysztof", "Kamil", "Baltazar", "Szymon", "Dominik", "Konfucjusz");
        list.forEach(s -> {
            if (s.length() > 7) {
                System.out.print(s + " Leght = " + s.length() + "\n");
            }
        });
    }
}
