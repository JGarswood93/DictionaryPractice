package com.barton;
/**
 * Just like an array but no guaranteed ordering
 */

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    /**
     * English to Spanish Dictionary
     */
    public static void main(String[] args) {
        /**
         * Here is a map constructor with the data type string and the name
         * This is for a key and a value
         */
        Map<String, String> englSpanDictionary = new HashMap<String, String>();
        /**
         * This puts the things inside the dictionary
         */
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");
        /**
         * This gets the stuff out of the dictionary
         */
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.get("Saturday"));
        System.out.println(englSpanDictionary.get("Sunday"));
        /**
         * print out the keys
         */
        System.out.println(englSpanDictionary.keySet());

        /**
         * print out the keys
         */
        System.out.println(englSpanDictionary.values());
        /**
         * size
         */
        System.out.println("The size of the dictionary is "+ englSpanDictionary.size());

        System.out.println();
        System.out.println();
        /**
         * Shopping list
         */
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        /**
         * Put some stuff in it
         */
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Oreo", false);
        shoppingList.put("Eggs", true);
        //Retrieve Items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Bread"));
        System.out.println(shoppingList.get("Oreo"));
        System.out.println(shoppingList.get("Eggs"));
        //Key-Value Pairs Printout
        System.out.println(shoppingList.toString());
        //Is Empty?
        System.out.println(shoppingList.isEmpty());
        //Clear our dictionary
        System.out.println(shoppingList.toString());
        //is Empty?
        System.out.println(shoppingList.isEmpty());
        shoppingList.remove("Eggs");
        }

}