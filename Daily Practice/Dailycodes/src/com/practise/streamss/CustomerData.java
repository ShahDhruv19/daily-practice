package com.practise.streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerData {
    public static List<Customers> getAllCustomer()
    {
        return Stream.of(new Customers(1,"Dhruv","dhruv2@gmail.com", Arrays.asList("9832476598","21394093")),
                new Customers(2,"John","john@gmail.com",Arrays.asList("8923486592"))).collect(Collectors.toList());
    }
}
