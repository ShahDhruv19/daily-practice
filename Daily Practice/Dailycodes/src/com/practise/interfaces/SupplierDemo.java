package com.java8.interfaces;

import com.java8.otherclass.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = () -> {
            return LocalDateTime.now();
        };
        System.out.println(supplier.get());


//        Supplier<List<Product>> productSupplier = () -> {
//            List<Product> productList = new ArrayList<>();
//            productList.add(new Product(1, "Laptop", 25000));
//            return productList;
//
////            System.out.println(productList);
//        };
//        System.out.println(.get());
        System.out.println(getProducts().get());
    }


    private static Supplier<List<Product>> getProducts()
    {
        Supplier<List<Product>> productSupplier=()-> {

            List<Product> productList = new ArrayList<>();
            productList.add(new Product(1,"Book",230));
//            productList.add(1,"")
            return  productList;
        };
        return productSupplier;
    }



//    System.out.println("f");

//        System.out.println();
    }



