package org.example;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        System.out.println(countElements(array));
    }
    public static Map<Integer, Integer> countElements(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        for (int integer : array){
            if (map.containsKey(integer)){
                map.put(integer, map.get(integer) + 1);
            }else {
                map.put(integer, 1);
            }
        }
        return map;
    }
}