/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;

import tipos.TCadastroJuridica;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author leo_m
 */
public class MCadastroCliente {

    public boolean novoCadastro(TCadastroJuridica colaborador) throws SQLException {
        ConexaoMysql banco = new ConexaoMysql();
        String query = "INSERT INTO `colaborador`(`nome`, `razaosocial`, `documento`, `inscricaoestadual`, `telefone`, `email`, `observacoes`, `contribuinte`, `consumidorfinal`, `endereco`) VALUES ('"
                + colaborador.getNomeFantasia() + "','" + colaborador.getRazaoSocial() + "','" + colaborador.getCnpj()
                + "','" + colaborador.getInscricaoEstadual() + "','" + colaborador.getTelefone() + "','"
                + colaborador.getEmail() + "','" + colaborador.getObservacoes() + "','" + colaborador.getContribuinte() + "','"
                + colaborador.getConsumidorFinal() + "',(SELECT MAX(id) AS id FROM endereco));";
        System.out.println(query);
        System.out.println("foi krl");
        return banco.upQuery(query);

    }

    public boolean verificaCadastroExiste(String cnpj) throws SQLException {
        String query = "SELECT documento FROM colaborador WHERE documento='" + cnpj + "';";
        System.out.println(query);
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        if (rs.next()) {
            return false;
        } else {
            return true;
        }

    }

}
