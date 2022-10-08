/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_2_2;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class MainFrame extends JFrame{
    JTextField tableName;
    JButton button;
    private static String url;
    private static JTextField databaseAddress;
    private ProductsFrame productsFrame;
    private OrdersFrame ordersFrame;
    private PositionsFrame positionsFrame;


    public static String getUrl() {
        return url;
    }

    public static JTextField getDatabaseAddress() {
        return databaseAddress;
    }

    public MainFrame (){
        setTitle("Таблицы базы данных");
        setBounds(300,150,600,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
    }

    private void init() {
        GridLayout gridLayout = new GridLayout(0, 1);
        getContentPane().setLayout(gridLayout);

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new BoxLayout(jPanel1,BoxLayout.X_AXIS));
        jPanel1.add(Box.createRigidArea(new Dimension(25,0)));
        JLabel labelAddress = new JLabel("Адресс базы данных:");
        jPanel1.add(labelAddress);
        jPanel1.add(Box.createRigidArea(new Dimension(5,0)));
        databaseAddress = new JTextField();
        databaseAddress.setMaximumSize(new Dimension(400,30));
        jPanel1.add(databaseAddress);
        jPanel1.add(Box.createRigidArea(new Dimension(15,0)));
        add(jPanel1);

        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BoxLayout(jPanel2,BoxLayout.X_AXIS));
        jPanel2.add(Box.createRigidArea(new Dimension(25,0)));
        JLabel labelName = new JLabel("Имя таблицы:");
        jPanel2.add(labelName);
        jPanel2.add(Box.createRigidArea(new Dimension(50,0)));
        tableName = new JTextField();
        tableName.setMaximumSize(new Dimension(200,30));
        jPanel2.add(tableName);
        jPanel2.add(Box.createRigidArea(new Dimension(15,0)));
        add(jPanel2);

        JPanel jPanel3 = new JPanel();
        button = new JButton("Вывод");
        jPanel3.add(button);
        add(jPanel3);
        
        JPanel jPanel4 = new JPanel();
        JLabel actionLabel = new JLabel("");
        jPanel4.add(actionLabel);
        add(jPanel4);
         
        button.addActionListener((ActionEvent e) -> {
            if(!databaseAddress.getText().equals("")){
                    url = databaseAddress.getText();
            switch(tableName.getText()){
                        case "products":
                            productsFrame = new ProductsFrame();
                            productsFrame.setVisible(true);
                            break;
                        case "orders":
                            ordersFrame = new OrdersFrame();
                            ordersFrame.setVisible(true);
                            break;
                        case "positions":
                            positionsFrame = new PositionsFrame();
                            positionsFrame.setVisible(true);
                            break;
                        default:
                            actionLabel.setText("Адресе базы данных или названии таблицы не верны");
                    }
            
            }
        });

    }
}
