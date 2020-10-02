package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "c", "c", "d", "b", "a", "y", "a", "b"};
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer count = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], count + 1);
        }
        System.out.println(hm);
        ArrayList<String> al = new ArrayList<>();
        al.add("ывафы");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+791828313");
        phoneBook.add("Иванов", al);
        phoneBook.add("Иванов", new String[]{"+1424", "123"});
        phoneBook.add("Иванов", new String[]{"5432", "+99999"});
        phoneBook.add("Иванов", new String[]{"+98349325"});
        phoneBook.add("Иванов", "+77777");

        System.out.println(phoneBook.get("Иванов"));
    }
}