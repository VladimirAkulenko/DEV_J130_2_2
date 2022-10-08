/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_2_2;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class Repository {
    public List<Products> getProducts() {
        List<Products> productsList = new ArrayList<>();
        try(Connection connection = getConnection();
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM products")){
            while(rs.next()){
                String vender = rs.getString(1);
                String name = rs.getString(2);
                String color = rs.getString(3);
                Integer price = rs.getInt(4);
                Integer stockBalance = rs.getInt(5);
                Products products = new Products(vender, name, color, price, stockBalance);
                productsList.add(products);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return productsList;
    }

    public List<Orders> getOrders() {
        List<Orders> ordersList = new ArrayList<>();
        try(Connection connection = getConnection();
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM orders")){
            while(rs.next()){
                Integer identifier = rs.getInt(1);
                LocalDate dateCreation = (rs.getDate(2) != null? rs.getDate(2).toLocalDate(): null);
                String nameCustomer = rs.getString(3);
                String contactTelephon = rs.getString(4);
                String email = rs.getString(5);
                String deliveryAddress = rs.getString(6);
                String orderStatus = rs.getString(7);
                LocalDate orderShipmentDate = (rs.getDate(8) != null? rs.getDate(8).toLocalDate(): null);
                Orders orders = new Orders(identifier, dateCreation,nameCustomer, contactTelephon,email, deliveryAddress,orderStatus,orderShipmentDate);
                ordersList.add(orders);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return ordersList;
    }

    public List<Positions> getPositions() {
        List<Positions> positionsList = new ArrayList<>();
        try(Connection connection = getConnection();
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM positions")){
            while(rs.next()){
                Integer ordersIdentifier = rs.getInt(1);
                String vender = rs.getString(2);
                Integer price = rs.getInt(3);
                Integer amount = rs.getInt(4);
                Positions positions = new Positions(ordersIdentifier, vender, price, amount);
                positionsList.add(positions);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return positionsList;
    }

    private Connection getConnection() throws SQLException {
        String url = MainFrame.getUrl();
        String dbUser = "root";
        String dbPassword = "root";
        return DriverManager.getConnection(url, dbUser, dbPassword);
    }
}
