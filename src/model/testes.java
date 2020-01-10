/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;

/**
 *
 * @author leo_m
 */
public class testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexaoMysql con = new ConexaoMysql();
        con.getConexaoMySQL();
        System.out.println(con.statusConection());
    }

}
