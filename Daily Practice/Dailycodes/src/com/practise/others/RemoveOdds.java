package com.practise.others;

import java.util.ArrayList;
import java.util.List;

public class RemoveOdds {
    public static void main(String[] args) {
//        List<String> list=new ArrayList<>();
        List<String> list=new ArrayList<>();
        list.add("Dhruv");
        list.add("Kishor");
        list.add("Abchds");
        list.add("Abc");
        list.add("W");
        list.removeIf((word)-> {
            return word.length() > 5;
        });

        System.out.println(list);
        }
    }

