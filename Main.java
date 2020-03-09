package com.kruger.brandt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    static void GetDuplicateEntry(String[] names){

        Map<String, Integer> nameAndcount = new HashMap<>();

        for (String name:names){
            Integer count = nameAndcount.get(name);

            if (count == null){
                nameAndcount.put(name, 1);
            } else {
                nameAndcount.put(name, ++count);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = nameAndcount.entrySet();

        for (Map.Entry<String, Integer> entry:entrySet){
            if(entry.getValue() > 1){
                System.out.println("Duplicate found: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {

        String[] names = new String[]{"C#", "C++", "Java", "Perl", "Java", "Ruby", "Java", "C++"};

        GetDuplicateEntry(names);
    }
}
