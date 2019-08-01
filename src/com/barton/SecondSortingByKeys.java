package com.barton;

import java.util.*;
import java.util.Comparator;


public class SecondSortingByKeys {
    public static void main(String[] args) {
        HashMap<Integer, String> imap = new HashMap<Integer, String>();
        imap.put(5, "A");
        imap.put(67, "B");
        imap.put(45, "D");
        imap.put(0, "V");
        imap.put(33, "N");
        System.out.println("Before Sorting:");
        Set set = imap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        Map<Integer, String> map = sortByValues(imap);
        System.out.println("After Sorting");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.println(me2.getKey());
            System.out.println(me2.getValue());
        }
    }

    private static HashMap<Integer,String> sortByValues(HashMap<Integer, String> imap) {
        List list = new LinkedList(imap.entrySet());
        //defined custom comparator
        Collections.sort(list, new Comparator() {
        public int compare(Object o1, Object o2) {
            return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
        }
        });

            HashMap sortedHashMap = new LinkedHashMap();
            for(Iterator it = list.iterator(); it.hasNext();){
                Map.Entry entry = (Map.Entry) it.next();
                sortedHashMap.put(entry.getKey(), entry.getValue());
            }
        return sortedHashMap;
    }
}
