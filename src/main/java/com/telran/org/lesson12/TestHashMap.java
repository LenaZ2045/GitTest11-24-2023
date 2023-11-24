package com.telran.org.lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // key of the meaning
        // hello -. 5
        // world -> 15
        // again -> 30
        // hi -> 10
        // next -> 15

        //      key     value
        map.put("hello", 5); // first is the key-'hello' is unique and second is the value-'5'
        map.put("world", 15);
        map.put("again", 30);
        map.put("hi", 10);
        map.put("next", 15); // pomescheni element x array kajdaiy est golova but can have same values

        // v Hash Map element po index is not available
        printMap(map);
        map.put("again", 2); // duplicate of meaning is not available
        System.out.println();
        printMap(map);
        System.out.println();
        printMapVersionTwo(map);

        System.out.println();
        Integer value = map.get("world");
        System.out.println("World value in " + value); // we get value by the key

        // array table Node<K, V>[] table;
        // "hello" -> hashCode() -> (int, length) - hash -> index in table
        // -> Node -> Node<String, Integer> hello, 5 (if empty in cell)
        // iterate Node -> equals "hello" -> Node<String, Integer>

        // change -> may lose the object

        // get -> "hello" -> hashCode() -> (int, length) - hash -> index in table
        // Node<String, Integer> node -> node.key equals ("hello") -> value
    }

    private static void printMap(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : map.entrySet()) { // entries instead of map.
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Pair : key = " + key + ", value = " + value); // ne podderjivaet poryadok v HashMap
        }
    }

    private static void printMapVersionTwo(Map<String, Integer> map) {
        map.forEach((key, value) -> { // prisvoenie putem opelyandi
            System.out.println("Pair : key " + key + ", value = " + value);
        });
    }
}
