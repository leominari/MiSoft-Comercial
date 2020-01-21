/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.org.apache.xml.internal.dtm.DTM;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leo_m
 */
public class MPedido {
//    private Object jTable1;
//
//    public void CarregarTabela() {
//        PrepareStatement PS;
//        ResultSet RS;
//        String SQL = "SELECT codigo,nome,telefone,email FROM Tabela where nome like '%" + txtPesquisa.getText() + "%'";
//        try {
//            PS = Conexao.getConexao().prepareStatement(SQL);
//            RS = PS.executeQuery();
//            int QuantidadeColunas = RS.getMetaData().getColumnCount();
//            DefaultTableModel DTM = (DefaultTableModel) jTable1.getModel();
//            DTM.setNumRows(0);
//            while (RS.next()) {
//                String Dados[] = new String[QuantidadeColunas];
//                for (int I = 1; I <= QuantidadeColunas; I++) {
//                    Dados[I - 1] = RS.getString(I);
//
//                }
//
//                DTM.addRow(Dados);
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Falha ao Carregar a Tabela!\n" + e.toString());
//        }
//    }
}
