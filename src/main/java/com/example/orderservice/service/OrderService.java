package com.example.orderservice.service;

import java.util.List;
import java.util.Optional;

import com.example.orderservice.entity.Order;

public interface OrderService {
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    List<Order> getOrdersByCustomer(String customerName);
    List<Order> getOrdersByStatus(String status);
    Order saveOrder(Order order);
    Order updateOrder(Long id, Order order);
    void deleteOrder(Long id);
}
