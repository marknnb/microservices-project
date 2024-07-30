/*
package com.mark.nnb.bookstore.orders.web.controller.rabbitmq.demo;


@Service
public class RabbitListener {

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "${orders.new-orders-queue}")
    public void handleNewOrder(MyPayload payload) {
        System.out.println("New order = " + payload.content());
    }

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "${orders.delivered-orders-queue}")
    public void handleDeliveredOrder(MyPayload payload) {
        System.out.println("Delivered order = " + payload.content());
    }
}
*/
