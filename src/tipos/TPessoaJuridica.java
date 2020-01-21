/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MCliente;

/**
 *
 * @author leo_m
 */
public class TPessoaJuridica extends TColaborador {

    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String capitalSocial;
    private String contribuinte;

    public TPessoaJuridica(String id, String razaoSocial, String cnpj) {
        setId(id);
        setRazaoSocial(razaoSocial);
        setCnpj(cnpj);
    }

    public TPessoaJuridica() {

    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the capitalSocial
     */
    public String getCapitalSocial() {
        return capitalSocial;
    }

    /**
     * @param capitalSocial the capitalSocial to set
     */
    public void setCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    /**
     * @return the contribuinte
     */
    public String getContribuinte() {
        return contribuinte;
    }

    @Override
    public String toString() {
        return getRazaoSocial(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param contribuinte the contribuinte to set
     */
    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public void toStr() {
        System.out.println(getCnpj());

    }

    public List<TPessoaJuridica> getPessoasJuridicas() {
        try {
            return new MCliente().listaClientes();
        } catch (SQLException ex) {
            Logger.getLogger(TPessoaJuridica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
