package com.nisum.beans;

public class Order {
    private Integer orderId;
    private String orderItem;

    public Order() {
    }

    public Order(Integer orderId, String orderItem) {
        this.orderId = orderId;
        this.orderItem = orderItem;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderItem='" + orderItem + '\'' +
                '}';
    }
}
