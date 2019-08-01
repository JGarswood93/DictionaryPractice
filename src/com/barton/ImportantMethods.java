package com.barton;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ImportantMethods {
    public static void main(String[] args) {
        /**
         * Declare HashMap
         */
        HashMap<Integer, String> imap = new HashMap<Integer, String>();
        /**
         * This puts in the elements
         */
        imap.put(12, "Garry");
        imap.put(12, "Fred");
        imap.put(12, "Rupert");
        imap.put(12, "Grant");
        imap.put(12, "Mike");
        /**
         * Display content using iterator
         */
        Set set = imap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry ientry = (Map.Entry) iterator.next();
            System.out.println("key is: " + ientry.getKey() + " & Value is: ");
            System.out.println(ientry.getValue());
        }
        /**
         * Get values based on keys
         */
        String iar = imap.get(2);
        System.out.println("Value at index 2 is: " + iar);

        /**
         * remove values based on their keys
         */
        imap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = imap.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry ientry2 = (Map.Entry) iterator2.next();
            System.out.println("Key is: " + ientry2.getKey() + " & Value is: ");
            System.out.println(ientry2.getValue());
        }
    }
}
