package com.practise.streamss;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sortingwithlambda {

    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(22,43,1,3,8,23,4,6);
//        li.stream().sorted().forEach(n-> System.out.println(n));

        //Reverse order
//        li.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.println(n));

        List<Employee> em=EmpDAO.getEmp();
//        em.stream().sorted(Comparator)
//        em.stream().sorted((e1,e2)->
//                (int)(e1.getSalary()-e2.getSalary())
//        ).forEach(n-> System.out.println(n));

        //using comparator comparing method
        em.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(n-> System.out.println(n));

        //method refrence
        em.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(n-> System.out.println(n));
    }
}
