package com.barton;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sca.next();
            int phone = sca.nextInt();
            phoneBook.put(name, phone);
        }
        while(sca.hasNext()){
            String t = sca.next();
            Integer phoneNumber = phoneBook.get(t);
            System.out.println((phoneNumber != null)
            ? t + "=" + phoneNumber : "Not found"
            );
            System.out.println(phoneBook);
            System.out.println(phoneNumber);
        }
        sca.close();
    }
}