/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

/**
 *
 * @author leo_m
 */
public class TCadastroJuridica extends TCadastro {
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String capitalSocial;
    private String idEndereco;
    private String contribuinte;

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
     * @return the idEndereco
     */
    public String getIdEndereco() {
        return idEndereco;
    }

    /**
     * @param idEndereco the idEndereco to set
     */
    public void setIdEndereco(String idEndereco) {
        this.idEndereco = idEndereco;
    }

    /**
     * @return the contribuinte
     */
    public String getContribuinte() {
        return contribuinte;
    }

    /**
     * @param contribuinte the contribuinte to set
     */
    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }
}
