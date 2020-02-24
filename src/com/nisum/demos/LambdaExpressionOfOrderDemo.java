package com.nisum.demos;

import com.nisum.beans.Order;
import com.nisum.functionalinterfaces.CountOfOrder;
import com.nisum.functionalinterfaces.SingleParameter;
import com.nisum.functionalinterfaces.ZeroParameter;
import com.nisum.lambdaexpressions.LambdaExpressionsDemo;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionOfOrderDemo {

    public static void main(String[] args) {


        //For zero parameter lambda expressions
        LambdaExpressionsDemo ledb= new LambdaExpressionsDemo();
        ledb.ZeroParam(new ZeroParameter() {
            @Override
            public void zeroParam() {
                System.out.println( "Welcome to lambda in java 7");
            }
        });

        ledb.ZeroParam(
                ()->System.out.println("Welcome to lambda in java 8")
        );

        //For single parameter lambda expressions
        System.out.println(ledb.singleParameter("Hi nisum in java 7", new SingleParameter() {
            @Override
            public String singleParameter(String str) {
                return str;
            }
        }));

        System.out.println( ledb.singleParameter("Hi nisum in java 8",str -> {
            return str;
        }));

       // LambdaExpressionOfOrder leo= new LambdaExpressionOfOrder();
        List<Order> ordeerList = Arrays.asList(
                new Order(1,"Order one"),
                new Order(2,"Order two"),
                new Order(3,"Order three"),
                new Order(4,"Order four"),
                new Order(5,"Order five")
        );
        //In java 7 we are implementing interface methods by using an anonymous interface implementation
        ledb.countOfOrders(ordeerList, new CountOfOrder() {
            @Override
            public Integer count(List list) {
                return list.size();
            }
        });

        //In Java 8 you can count the list of orders by using a Java lambda expression
        ledb.countOfOrders(ordeerList, list->list.size());
      //  ledb.countOfOrders();

    }
}
