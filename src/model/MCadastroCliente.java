/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;

import tipos.TCadastroJuridica;
import tipos.TCidade;
import tipos.TEstado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
                + colaborador.getConsumidorFinal() + "'," + colaborador.getIdEndereco() + ");";
        System.out.println(query);
        System.out.println("foi krl");
        return banco.upQuery(query);

    }

    public List<TEstado> listaEstados() throws SQLException {
        List<TEstado> estados = new ArrayList<>();
        String query = "SELECT * FROM estado;";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            estados.add(new TEstado(rs.getString("id"), rs.getString("nome"), rs.getString("uf")));
        }
        return estados;
    }

    public List<TCidade> listaCidadePorEstado(String idEstado) throws SQLException {
        List<TCidade> cidades = new ArrayList<>();
        String query = "SELECT * FROM cidade WHERE estado=" + idEstado + ";";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            cidades.add(new TCidade(rs.getString("id"), rs.getString("nome")));
        }
        return cidades;
    }

}
