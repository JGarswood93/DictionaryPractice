package com.barton;

import java.util.HashMap;
import java.util.Map;

public class Collection {

    public static void main(String[] args) {
        HashMap<Integer,String> yh=new HashMap<Integer, String>();
        yh.put(240,"Aunt");
        yh.put(250,"Nick");
        yh.put(300,"Pal");
        yh.put(100,"Sam");
        for(Map.Entry t:yh.entrySet()){
            System.out.println(t.getKey() + " " +t.getValue());
        }
    }
}
