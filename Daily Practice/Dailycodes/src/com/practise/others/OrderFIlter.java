package com.practise.others;

import java.util.ArrayList;
import java.util.List;

public class OrderFIlter {
    public static void main(String[] args) {
        List<Order> orders=new ArrayList<>();
        orders.add(new Order(1,100,"Accepted"));
        orders.add(new Order(2,300,"Pending"));
        orders.add(new Order(3,200,"Completed"));
        orders.stream()
                .filter(order ->
                    order.getPrice()>150 && ("Accepted".equalsIgnoreCase(order.getStatus()) || "Completed".equalsIgnoreCase(order.getStatus())))
                .forEach(System.out::println);





                }
    }

