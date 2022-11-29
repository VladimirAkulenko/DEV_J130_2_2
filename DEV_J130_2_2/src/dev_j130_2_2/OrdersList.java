/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_2_2;

import java.util.List;



/**
 *
 * @author USER
 */
public class OrdersList {
    private static final OrdersList orderInstance = new OrdersList();
    private final List<Orders> ordersList;

    private OrdersList() {
        ordersList = new Repository().getOrders();
    }

    public int getOrdersCount() {
        return ordersList.size();
    }

    public Orders getOrder(int index) {
        return ordersList.get(index);
    }

    public static OrdersList getOrderInstance() {
        return orderInstance;
    }

     public List<Orders> getOrdersList() {
        return ordersList;
    }    
}
