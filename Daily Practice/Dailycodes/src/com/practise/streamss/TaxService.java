package com.practise.streamss;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {


    public static List<Employee> taxPayers()
    {
        List<Employee> li;
        EmpDAO ed=new EmpDAO();
//        ed.getEmp().stream().filter(e->e.getSalary()>50000).forEach(n-> System.out.println(n));
       li=ed.getEmp().stream().filter(e->e.getSalary()>3000).collect(Collectors.toList());
        return li;
//        EmpDAO.getEmp().stream()
    }

    public static void main(String[] args) {
//        TaxService t=new TaxService();
//        t.taxPayers();
//        System.out.println(taxPayers());
        taxPayers().stream().forEach(n-> System.out.println(n));
//        taxPayers();
    }
}
