package com.java8.interfaces;

import java.util.function.Function;

//function interface takes one input and has  a return value
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = (s) -> {
            return s.length();
        };
        System.out.println(function.apply("Dhurv"));


        Function<Integer, String> fun = (n) -> {
            if (n % 2 == 0)
                return "Even";
            else
                return "Odd";
        };

        System.out.println(fun.apply(121));


        Function<String, Integer> fun1 = (Name) -> {
            return Name.length();
        };
        Function<Integer, Integer> fun2 = (len) -> {
            return len * 2;
        };
        Integer i = fun1.andThen(fun2).apply("Dhruv");
        System.out.println(i);

//        System.out.println(function.apply("Dhruv"));
    }
}

