package ch_2;

import java.util.HashMap;
import java.util.Map;

//Map studies
public class task2_13 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "John");
        map.put(2, "Richard");
        map.put(3, "Donna");
        map.put(4, "Ken");
        map.put(5, "Mikhail");
        map.put(6, "Mikhail");

        for(Map.Entry m: map.entrySet()){ // entrySet() returns a set view of the mappings contained in this map
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("map size = " + map.size());

        map.remove(2);

        System.out.println("map size = " + map.size());

        System.out.println("map elements: " + map);

        map.remove("3" , "Donna"); // removes the entry only if it is currently mapped to the specified value

        System.out.println("map elements: " + map);
    }
}
