package com.practise.streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,32,12,542,5,45,74,4);
       int tre=list.stream()
                .sorted()
                .filter(x->x%2==0)
                .map(x->x*3)
                .reduce(0,(c,e)->c+e);

//                .collect(Collectors.toList())
//                .forEach(x-> System.out.println(x));
    }
}
