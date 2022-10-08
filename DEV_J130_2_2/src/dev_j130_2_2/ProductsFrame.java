/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_2_2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author USER
 */
public class ProductsFrame extends JFrame{
    private ProductsTableModel productsTableModel = new ProductsTableModel();
    private JTable productstable = new JTable();

    public ProductsFrame (){
        setTitle("Таблица Продукты");
        setBounds(300,150,800,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
    }

    private void init() {
        productstable.setModel(productsTableModel);
        productstable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        productstable.setIntercellSpacing(new Dimension(5, 5));
        add(productstable.getTableHeader(), BorderLayout.NORTH);
        JScrollPane scrollPane = new JScrollPane(productstable);
        scrollPane.setPreferredSize(new Dimension(800, 500));
        add(scrollPane, BorderLayout.CENTER);
    }
}
