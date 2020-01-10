/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import classes.Endereco;


public class CCadastroCliente {

    public Endereco completaCep(String cep) {
        Endereco cliente = new Endereco();
        cliente.buscaCep(cep);
        return cliente;
    }
}
