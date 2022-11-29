/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_2_2;

/**
 *
 * @author USER
 */
public class Products {
    private String vender;
    private String name;
    private String color;
    private int price;
    private int stock_balance;

 

    public Products(String vender, String name, String color, int price, int stock_balance) {
        this.vender = vender;
        this.name = name;
        this.color = color;
        this.price = price;
        this.stock_balance = stock_balance;
    }

    public String getVender() {
        return vender;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock_balance() {
        return stock_balance;
    }

    public void setStock_balance(int stock_balance) {
        this.stock_balance = stock_balance;
    }

    @Override
    public String toString() {
        return "Products{" +
                "vender=" + vender +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", stock_balance=" + stock_balance +
                '}';
    }
}
