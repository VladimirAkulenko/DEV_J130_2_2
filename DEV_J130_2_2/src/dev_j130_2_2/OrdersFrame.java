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
public class OrdersFrame extends JFrame{
    private OrdersTableModel ordersTableModel = new OrdersTableModel();
    private JTable orderstable = new JTable();

    public OrdersFrame (){
        setTitle("Таблица Заказы");
        setBounds(300,150,1200,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
    }

    private void init() {
        orderstable.setModel(ordersTableModel);
        orderstable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        orderstable.setIntercellSpacing(new Dimension(5, 5));
        add(orderstable.getTableHeader(), BorderLayout.NORTH);
        JScrollPane scrollPane = new JScrollPane(orderstable);
        scrollPane.setPreferredSize(new Dimension(1200, 500));
        add(scrollPane, BorderLayout.CENTER);
    }
}
