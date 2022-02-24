/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abdel
 */
public class LineTableModel extends AbstractTableModel {

    String[] cols = {"Item Name", "Item Price", "count", "Item total"};
    ArrayList<InvoiceLine> data;

    public LineTableModel(ArrayList<InvoiceLine> data) {
        this.data = data;
    }
    @Override
    public int getRowCount() {
        return data.size();
    }
    @Override
    public int getColumnCount() {
        return cols.length;
    }
    @Override
    public Object getValueAt(int row, int col) {
        return "";
    }
    @Override
    public String getColumnName(int col) {
        System.out.println("col name ");
        return cols[col];
    }
}
