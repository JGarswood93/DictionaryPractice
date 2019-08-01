package com.barton;
import java.util.*;
public class SortingByKeys {
    public static void main(String[] args) {
        HashMap<Integer, String> ymap = new HashMap<Integer, String>();
        ymap.put(5, "High");
        ymap.put(6, "Something");
        ymap.put(7, "Everything");
        ymap.put(8, "Anything");
        ymap.put(10, "Low");
        ymap.put(22, "this");
        ymap.put(100, "tht");

        System.out.println("Before sorting:");
        Set set = ymap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        Map<Integer, String> map = new TreeMap<Integer, String>(ymap);
        System.out.println("After sorting: ");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()){
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.println(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }
    }
}
