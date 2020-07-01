package com.vtb.kortunov.lesson5;

import java.util.HashMap;

public class WordFrequency {

    public static HashMap<String, Integer> getWordAndFrequency(String[] strings) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Integer frequency = 1;
        for (String str : strings) {
            if (hashMap.containsKey(str)) {
                Integer k = hashMap.get(str);
                k++;
                hashMap.put(str, k);
            } else {
                hashMap.put(str, frequency);
            }
        }
        return hashMap;
    }
}
