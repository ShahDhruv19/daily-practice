package com.practise.others;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FirstLetterOfWord {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Do","Home","Rise","Uganda","Very");
        StringBuilder res=new StringBuilder();
        Consumer<String> first=(word)->{
            res.append(word.charAt(0));
        };

        words.forEach(first);
        System.out.println(res.toString());

    }
}
