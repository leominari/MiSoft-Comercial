/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;
import classes.Cidade;
import classes.Endereco;
import classes.Estado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leo_m
 */
public class MEndereco {

    public List<Estado> listaEstados() throws SQLException {
        List<Estado> estados = new ArrayList<>();
        Estado est = new Estado();
        String query = "SELECT * FROM estado;";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            est.setId(rs.getString("id"));
            est.setNome(rs.getString("nome"));
            est.setUF(rs.getString("uf"));
            estados.add(est);
        }
        return estados;
    }

    public List<Cidade> listaCidadePorEstado(String idEstado) throws SQLException {
        List<Cidade> cidades = new ArrayList<>();
        Cidade est = new Cidade();
        String query = "SELECT * FROM cidade WHERE estado="+ idEstado +";";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            est.setId(rs.getString("id"));
            est.setNome(rs.getString("nome"));
            cidades.add(est);
        }
        return cidades;
    }

}
