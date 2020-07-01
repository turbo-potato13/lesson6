package com.vtb.kortunov.lesson5;

import java.util.*;

public class PhoneBook {

    private final HashMap<Integer, String> phoneBook;

    public PhoneBook(HashMap<Integer, String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void add(Integer number, String surname) {
        phoneBook.put(number, surname);
    }

    public void get(String surname) {
        phoneBook.forEach((key, value) -> {
            if (value.equals(surname)) {
                System.out.println(key);
            }
        });
    }

}
