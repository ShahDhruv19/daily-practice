package com.practise.streamss;

import java.beans.DesignMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpDAO {
//     List<Employee> employees= Arrays.asList(new Employee(1,"IT","Dhruv",28000),new Employee(2,"Finance","Adarsh",28000));


    public static   List<Employee> getEmp()
    {

//        List<Employee> employees= Arrays.asList(new Employee(1,"IT","Dhruv",28000),new Employee(2,"Finance","Adarsh",28000));


        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(4,"Marketing","Mehul",80000));
        employees.add(new Employee(1,"IT","Dhruv",28000));
        employees.add(new Employee(2,"Finance","Adarsh",28000));
        employees.add(new Employee(5,"Sales","Nehal",90000));
        employees.add(new Employee(1,"Cloud","Aman",50000));


        return employees;
    }
}
