package com.practise.streamss;

import java.util.List;
import java.util.stream.Collectors;

public class MainclassforMap {
    public static void main(String[] args) {
        List<Customers> customers=CustomerData.getAllCustomer();

        customers.stream()
                .map(customers1 -> customers1.getEmailID())
                .forEach(n-> System.out.println(n));

       List<List<String>> phn=customers.stream()
                                        .map(c->c.getPhoneNumber())
                                        .collect(Collectors.toList());
        System.out.println(phn);
       List<String> phnnumbers=customers.stream().
                                        flatMap(customers2 -> customers2.getPhoneNumber().stream())
                                        .collect(Collectors.toList());
        System.out.println(phnnumbers);
//       List<String> phnnumber=customers.stream().flatMap(c1->c1.getPhoneNumber()).collect(Collectors.toList());

    }

}
