package com.practise.streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,11,23,43,2,64);
        List<Integer> finallist=list.stream()
                .filter(x->x>10)
               .collect(Collectors.toList());

        System.out.println(finallist);

    }
}
