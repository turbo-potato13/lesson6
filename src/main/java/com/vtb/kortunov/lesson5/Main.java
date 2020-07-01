package com.vtb.kortunov.lesson5;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //Task1
        String[] strings = {"one", "two", "three", "two", "three", "three", "four", "four", "four", "four",};
        System.out.println(WordFrequency.getWordAndFrequency(strings));

        //Task 2
        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        phoneBook.add(777, "Ivanov");
        phoneBook.add(707, "Petrov");
        phoneBook.add(100, "Ivanov");
        phoneBook.get("Ivanov");
    }
}
