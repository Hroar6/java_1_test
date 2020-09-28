package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> hm = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        ArrayList<String> al = new ArrayList<>();
        if (hm.get(surname) != null){
            al = hm.get(surname);
        }
        al.add(phoneNumber);
        hm.put(surname,al);
    }

    public void add(String surname, String[] phoneNumbers) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(phoneNumbers));
        if (hm.get(surname) != null) {
            al.addAll(hm.get(surname));
        }
        hm.put(surname, al);
    }

    public void add(String surname, ArrayList<String> phoneNumbers) {
        if (hm.get(surname) != null) {
            phoneNumbers.addAll(hm.get(surname));
        }
        hm.put(surname, phoneNumbers);
    }

    public ArrayList<String> get(String surname) {
        return hm.get(surname);
    }

}
