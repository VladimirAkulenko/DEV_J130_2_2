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
public class PositionsFrame extends JFrame{
    private PositionsTableModel positionsTableModel = new PositionsTableModel();
    private JTable positionstable = new JTable();

    public PositionsFrame (){
        setTitle("Таблица Позиции заказа");
        setBounds(300,150,600,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
    }

    private void init() {
        positionstable.setModel(positionsTableModel);
        positionstable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        positionstable.setIntercellSpacing(new Dimension(5, 5));
        add(positionstable.getTableHeader(), BorderLayout.NORTH);
        JScrollPane scrollPane = new JScrollPane(positionstable);
        scrollPane.setPreferredSize(new Dimension(600, 400));
        add(scrollPane, BorderLayout.CENTER);
    }
}
