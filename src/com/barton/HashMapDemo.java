package com.barton;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        /**
         * New HashMap
         */
        HashMap gm = new HashMap();

        /**
         * Putting elements to the map
         */
        gm.put("Mick", new Double(3454.678));
        gm.put("Micky", new Double(3454.6782));
        gm.put("Mickey", new Double(3454.6783));
        gm.put("Micki", new Double(3454.6784));
        gm.put("Mickel", new Double(3454.6785));
        gm.put("Mickul", new Double(3454.6786));
        //entry set
        Set set = gm.entrySet();
        //get am iterator
        Iterator i = set.iterator();

        /**
         * Display elements
         */
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        /**
         * Put in new balances
         */
        double balance = ((Double)gm.get("Mick")).doubleValue();
        gm.put("Mick", new Double(balance + 1000));
        System.out.println("Mick's new balance: " + gm.get("Mick"));
        ((Double)gm.get("Micky")).doubleValue();
        gm.put("Mick", new Double(balance + 1000));
        System.out.println("Mick's new balance: " + gm.get("Micky"));
    }
}
