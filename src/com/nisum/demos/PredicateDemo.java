package com.nisum.demos;

import com.nisum.beans.Order;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public boolean isPositiveOrderId(Order o){
        return o.getOrderId()>0;
    }

    public static void main(String[] args) {

        List<Order> list = Arrays.asList(
                new Order(1,"item one"),
                new Order(2,"item two"),
                new Order(5,"item five"),
                new Order(3,"item three"),
                new Order(4,"item four"),
                new Order(-1,"item six")
        );

        Predicate<Order> predicate = n -> n.getOrderId()<3;
        Predicate<Order>  predicate1 = n -> n.getOrderItem().equalsIgnoreCase("item one");
        Predicate<Order> predicate2 = n -> n.getOrderId()>1;

        System.out.println("only predicate...");
        list.stream().filter(predicate).forEach(System.out::println);
        System.out.println("predicate with add method...");
        list.stream().filter(predicate.and(predicate2));
        System.out.println("predicate with or method...");
        list.stream().filter(predicate.or(predicate1)).forEach(System.out::println);
        System.out.println("predicate with negate method...");
        list.stream().filter(predicate.negate()).forEach(System.out::println);


    }

}
