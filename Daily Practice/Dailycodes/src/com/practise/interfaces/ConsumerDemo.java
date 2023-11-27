package com.java8.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> consumer=(t)->{
            System.out.println(t);
        };
//        consumer.accept("Dhruv");

        List<String> li=new ArrayList<>();
        Consumer<String> c=(name)->{
            li.add(name);
//            System.out.println(name);

        };



        c.accept("Dhruv");
        c.accept("Varun");
        c.accept("At");
         li.forEach(System.out::println);
//        for (String s:li
//             ) {
//            System.out.println(s);
//
//        }


        List<Integer> intergers= Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> con=(t)->{
            System.out.println(t);
        };

        intergers.forEach(con);


//        System.out.println("Hello world!");
    }
}