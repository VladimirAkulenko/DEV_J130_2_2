/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_2_2;

/**
 *
 * @author USER
 */
public class Positions {
    private Integer orders_identifier;
    private String vender;
    private Integer price;
    private Integer amount;


    public Positions(Integer orders_identifier, String vender, Integer price, Integer amount) {
        this.orders_identifier = orders_identifier;
        this.vender = vender;
        this.price = price;
        this.amount = amount;
    }

    public Integer getOrders_identifier() {
        return orders_identifier;
    }

    public void setOrders_identifier(Integer orders_identifier) {
        this.orders_identifier = orders_identifier;
    }

    public String getVender() {
        return vender;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Positions{" +
                "orders_identifier=" + orders_identifier +
                ", vender='" + vender + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
