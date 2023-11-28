package com.practise.streamss;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
//        List<Integer>
        List<Integer> li= Arrays.asList(10,12,32,4);
//        li.stream().filter((n)->n>5).forEach(n-> System.out.println(n));
//        li.stream().sorted().forEach(n-> System.out.println(n));
        List<String> name=new ArrayList<>();
        name.add("Dhruv");
        name.add("Vikas");
        name.add("Darsh");
        name.add("Dijoy");
        name.add("Varun");
//        name.stream().filter((s)->s.startsWith("D")).forEach(s-> System.out.println(s));
//        name.stream().forEach((t)-> System.out.println(t));
//        name.stream().forEach((names)-> System.out.println(name));

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Dhuv");
        map.put(2,"Shah");
        map.put(3,"Varun");

        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(n-> System.out.println(n));
        map.entrySet().stream().filter(v->v.getValue().startsWith("D")).forEach(n-> System.out.println(n));
//        map.forEach((k,v)-> System.out.println(k+"  "+v));
//        map.entrySet().forEach(n-> System.out.println(n));


    }

}
