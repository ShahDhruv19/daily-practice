package com.practise.streamss;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortingByLambda {
    public static void main(String[] args) {
//        Map<Integer,String> map=new HashMap<>();
        Map<Integer,String> mapp=new HashMap<>();
        mapp.put(1,"Dhruv");
        mapp.put(2,"Nehal");
        mapp.put(3,"Shha");
        mapp.put(4,"Mehul");
//        mapp.entrySet().stream().sorted(v->v.getValue())
//        mapp.entrySet().stream().sorted().forEach(n-> System.out.println(n));
//            mapp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(n-> System.out.println(n));
//        System.out.println("==================");
//        mapp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(n-> System.out.println(n));
        System.out.println("ccccccccccccccccc");

        Map<Employee,Integer> employeeMap=new TreeMap<>(Comparator.comparing(Employee::getSalary));
        employeeMap.put(new Employee(1,"Development","Dhruv",28000),19);
        employeeMap.put(new Employee(2,"Sports","Varun",43000),25);
        employeeMap.put(new Employee(3,"IT","Aman",21333),13);
        employeeMap.put(new Employee(4,"Foreign","Neal",46000),5);

//        employeeMap.entrySet().stream().sorted((Employee e1,Employee e2)->(int)(e1.getSalary()-e2.getSalary())).forEach(n-> System.out.println(n));
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(n-> System.out.println(n));
//        employeeMap.entrySet().stream().sorted((e1,e2)->e1.getKey().getSalary()-e2.getKey().getSalary())
    }
}
