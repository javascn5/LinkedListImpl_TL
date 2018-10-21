package com.sda.kolekcje;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
// Arraylist - implementacja tablicową
// linkedlist - implementacja wiązaną

        List<String> list = new LinkedList<>();
        list.add("Jan");
        list.add("Marcin");
        list.add("Karol");

        for(String l: list){
            System.out.println(l);
        }
    }
}
