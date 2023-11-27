package com.java8.interfaces;
//predicate accepts single input as an argument and returns a boolean value

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemoi {
    public static void main(String[] args) {
        Predicate<Integer> pre=(inte)->{
            return inte%2==0;

        };
        System.out.println(pre.test(12));


        List<Integer> list= Arrays.asList(10,11,12,23,4);
        Predicate<Integer> pred=(x)->{
            return x>5;
        };
        list.stream().filter(pred).collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println(p;
    }

//    @Override
//    public boolean test(Integer integer) {
//        if(integer%2==0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//
//    }
}
