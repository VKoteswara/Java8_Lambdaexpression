package com.nisum.demos;

import com.nisum.beans.Order;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        List<Order> list = Arrays.asList(
                new Order(1,"item one"),
                new Order(2,"item two"),
                new Order(5,"item five"),
                new Order(3,"item three"),
                new Order(4,"item four"),
                new Order(-1,"item six")
        );


        Consumer<Order> consumer = order -> System.out.println(order.getOrderId());
        Consumer<Order> consumer1 =consumer.andThen(order -> System.out.print(order.getOrderItem().toUpperCase()));
        printOrder(list,consumer);
        printOrder(list,consumer1);
    }

    static void printOrder(List<Order> list,Consumer<Order> consumer){
        for (Order o: list){
            consumer.accept(o);
        }
    }
}
