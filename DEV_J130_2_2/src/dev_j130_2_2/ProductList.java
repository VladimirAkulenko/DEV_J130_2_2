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
public class ProductList {
    private static final ProductList productInstance = new ProductList();
    private final List<Products> productsList;

    public ProductList() {
        productsList = new Repository().getProducts();
    }

    public int getProductsCount() {
        return productsList.size();
    }

    public Products getProduct(int index) {
        return productsList.get(index);
    }

    public static ProductList getProductInstance() {
        return productInstance;
    }

    public List<Products> getProductList() {
        return productsList;
    }
}
