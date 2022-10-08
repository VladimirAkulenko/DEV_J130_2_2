/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_2_2;

import java.time.LocalDate;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author USER
 */
public class OrdersTableModel implements TableModel{
    private static final String [] COLUMN_HEADERS = new String[]{
            "Identifier",
            "Date creation",
            "Name customer",
            "Contact telephon",
            "Email",
            "Delivery address",
            "Order status",
            "Order shipment date"
    };

    @Override
    public int getRowCount() {
        return OrdersList.getOrderInstance().getOrdersCount();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_HEADERS.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_HEADERS[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex) {
            case 0:
                return Integer.class;
            case 1:
            case 7:
                return LocalDate.class;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return String.class;
        }
        throw new IllegalArgumentException("unknown columnIndex");
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Orders orders = OrdersList.getOrderInstance().getOrder(rowIndex);
        switch(columnIndex) {
            case 0: return orders.getIdentifier();
            case 1: return orders.getDate_creation();
            case 2: return orders.getName_customer();
            case 3: return orders.getContact_telephon();
            case 4: return orders.getEmail();
            case 5: return orders.getDelivery_address();
            case 6: return orders.getOrder_status();
            case 7: return orders.getOrder_shipment_date();
        }
        throw new IllegalArgumentException("unknown columnIndex");
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
