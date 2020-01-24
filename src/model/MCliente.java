/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;

import tipos.TPessoaJuridica;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leo_m
 */
public class MCliente {

    public boolean novoCadastro(TPessoaJuridica colaborador) throws SQLException {
        ConexaoMysql banco = new ConexaoMysql();
        String query = "INSERT INTO `colaborador`(`nome`, `razaosocial`, `documento`, `inscricaoestadual`, `telefone`, `email`, `observacoes`, `contribuinte`, `consumidorfinal`, `endereco`) VALUES ('"
                + colaborador.getNomeFantasia() + "','" + colaborador.getRazaoSocial() + "','" + colaborador.getCnpj()
                + "','" + colaborador.getInscricaoEstadual() + "','" + colaborador.getTelefone() + "','"
                + colaborador.getEmail() + "','" + colaborador.getObservacoes() + "','" + colaborador.getContribuinte() + "','"
                + colaborador.getConsumidorFinal() + "',(SELECT MAX(id) AS id FROM endereco));";
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

    public List<TPessoaJuridica> listaClientes() throws SQLException {
        List<TPessoaJuridica> clientes = new ArrayList<>();
        String query = "SELECT id, razaosocial, documento FROM colaborador ORDER BY razaosocial;";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            clientes.add(new TPessoaJuridica(
                    rs.getString("id"),
                    rs.getString("razaosocial"),
                    rs.getString("documento")));
        }
        return clientes;
    }

}
