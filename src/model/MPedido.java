/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
import javax.swing.table.AbstractTableModel;
import tipos.TItemPedido;

/**
 *
 * @author leo_m
 */
public class MPedido extends AbstractTableModel {

    private List<TItemPedido> pedidos = new ArrayList<>();
    private String[] colunas = {"Produto", "Quantidade", "Preço", "Valor"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return pedidos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return pedidos.get(rowIndex).getProduto().getNome();
            case 1:
                return pedidos.get(rowIndex).getQuantidade();
            case 2:
                return pedidos.get(rowIndex).getProduto().getPreco();
            case 3:
                return pedidos.get(rowIndex).getValor();
            case -1:
                return pedidos.get(rowIndex).getProduto();
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 1:
                pedidos.get(rowIndex).setQuantidade(Integer.parseInt((String) aValue));
                break;
            case 2:
                pedidos.get(rowIndex).getProduto().setPreco(Double.parseDouble((String) aValue));
                break;
            case 3:
                pedidos.get(rowIndex).setValor(Double.parseDouble((String) aValue));
                break;
        }
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }

    public void addRow(TItemPedido pedido) {
        this.pedidos.add(pedido);
        this.fireTableDataChanged();
    }

    public void removeRow(int row) {
        this.pedidos.remove(row);
        this.fireTableRowsDeleted(row, row);
    }
}
