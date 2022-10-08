/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_2_2;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Orders {
    private Integer identifier;
    private LocalDate date_creation;
    private String name_customer;
    private String contact_telephon;
    private String email;
    private String delivery_address;
    private String order_status;
    private LocalDate order_shipment_date;

   public Orders(){
       
   } 

    public Orders(Integer identifier, LocalDate date_creation, String name_customer, String contact_telephon,
                  String email, String delivery_address, String order_status, LocalDate order_shipment_date) {
        this.identifier = identifier;
        this.date_creation = date_creation;
        this.name_customer = name_customer;
        this.contact_telephon = contact_telephon;
        this.email = email;
        this.delivery_address = delivery_address;
        this.order_status = order_status;
        this.order_shipment_date = order_shipment_date;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public LocalDate getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(LocalDate date_creation) {
        this.date_creation = date_creation;
    }

    public String getName_customer() {
        return name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public String getContact_telephon() {
        return contact_telephon;
    }

    public void setContact_telephon(String contact_telephon) {
        this.contact_telephon = contact_telephon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public LocalDate getOrder_shipment_date() {
        return order_shipment_date;
    }

    public void setOrder_shipment_date(LocalDate order_shipment_date) {
        this.order_shipment_date = order_shipment_date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "identifier=" + identifier +
                ", date_creation=" + date_creation +
                ", name_customer='" + name_customer + '\'' +
                ", contact_telephon='" + contact_telephon + '\'' +
                ", email='" + email + '\'' +
                ", delivery_address='" + delivery_address + '\'' +
                ", order_status='" + order_status + '\'' +
                ", order_shipment_date=" + order_shipment_date +
                '}';
    }
}
