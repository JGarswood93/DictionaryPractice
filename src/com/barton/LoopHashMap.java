package com.barton;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoopHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> tmap = new HashMap<Integer, String>();
        //add elements
        tmap.put(17, "PP");
        tmap.put(16, "PQ");
        tmap.put(11, "PW");
        tmap.put(13, "PD");
        tmap.put(12, "PA");

        System.out.println("For Loop:");
        for(Map.Entry me : tmap.entrySet()){
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
        /**
         * While loop and Iterator
         */
        System.out.println("While loop:");
        Iterator iterator = tmap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry me2 = (Map.Entry) iterator.next();
            System.out.println("Key: " +me2.getKey()+" & Value: " + me2.getValue());
        }
    }
}
