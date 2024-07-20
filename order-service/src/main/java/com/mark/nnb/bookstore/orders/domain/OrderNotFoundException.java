package com.mark.nnb.bookstore.orders.domain;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException(String message) {
        super(message);
    }

    public static OrderNotFoundException forOrderNumber(String orderNumber){
        return new OrderNotFoundException("Order not found");
    }
}
