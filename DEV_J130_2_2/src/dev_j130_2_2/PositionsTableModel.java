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
public class PositionsTableModel implements TableModel{
    private static final String [] COLUMN_HEADERS = new String[]{
            "Orders identifier",
            "Vender",
            "Price",
            "Amount"
    };

    @Override
    public int getRowCount() {
        return PositionsList.getPositionsInstance().getPositionsCount();
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
            case 2:
            case 3:
                return Integer.class;
            case 1:
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
        Positions positions = PositionsList.getPositionsInstance().getPositions(rowIndex);
        switch(columnIndex) {
            case 0: return positions.getOrders_identifier();
            case 1: return positions.getVender();
            case 2: return positions.getPrice();
            case 3: return positions.getAmount();
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
