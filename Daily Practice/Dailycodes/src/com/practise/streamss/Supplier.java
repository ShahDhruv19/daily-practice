package com.practise.streamss;

import java.util.Arrays;
import java.util.List;

public class Supplier {
    public static void main(String[] args) {

        List<String> li= Arrays.asList();
//        li.stream().findAny().or(()-> "NOthing is there"
//        ;
        System.out.println(li.stream().findAny().orElseGet(()->"Nothing"));

//        li.stream().findAny().orElseGet(()->"Nothing found");
    }
}
