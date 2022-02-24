/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abdel
 */
public class HeaderTableModel extends DefaultTableModel {

    private String[] colsNames = {"No.", "Customer Name", "Inv Date", "Total"};
    private ArrayList<InvoiceHeader> invoices;

    public HeaderTableModel(ArrayList<InvoiceHeader> invoices) {
        this.colsNames = colsNames;
        this.invoices = invoices;
    }

    @Override
    public int getColumnCount() {
        return colsNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return colsNames[column];
    }

    @Override
    public int getRowCount() {
        if (this.invoices == null) {
            invoices = new ArrayList<>();
        }
        return invoices.size();
    }

    @Override
    public Object getValueAt(int row, int column) {
        InvoiceHeader inv = invoices.get(row);
        switch (column) {
            case 0:
                return inv.getNum();
            case 1:
                return inv.getCustName();
            case 2:
                return inv.getDate();
        }
        return null;
    }
}
