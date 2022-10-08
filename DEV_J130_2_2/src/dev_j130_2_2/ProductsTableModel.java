/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_2_2;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author USER
 */
public class ProductsTableModel implements TableModel{
    private static final String [] COLUMN_HEADERS = new String[]{
            "Vender",
            "Name",
            "Color",
            "Price",
            "Stock Balance"
    };

    @Override
    public int getRowCount() {
        return ProductList.getProductInstance().getProductsCount();
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
            case 1:
            case 2:
                return String.class;
            case 3:
            case 4:
                return Integer.class;
        }
        throw new IllegalArgumentException("unknown columnIndex");
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Products product = ProductList.getProductInstance().getProduct(rowIndex);
        switch(columnIndex) {
            case 0: return product.getVender();
            case 1: return product.getName();
            case 2: return product.getColor();
            case 3: return product.getPrice();
            case 4: return product.getStock_balance();
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
