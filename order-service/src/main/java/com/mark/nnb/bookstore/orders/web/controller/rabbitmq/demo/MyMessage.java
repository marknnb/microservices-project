package com.mark.nnb.bookstore.orders.web.controller.rabbitmq.demo;

public record MyMessage(String routingKey, MyPayload payload) {}
