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
public class TColaborador {
    private String id;
    private String inscricaoEstadual;
    private String tipoContribuinte;
    private String consumidorFinal;
    private TEndereco endereco;
    private String observacoes;
    private String email;
    private String telefone;

    /**
     * @return the inscricaoEstadual
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     * @param inscricaoEstadual the inscricaoEstadual to set
     */
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    /**
     * @return the tipoContribuinte
     */
    public String getTipoContribuinte() {
        return tipoContribuinte;
    }

    /**
     * @param tipoContribuinte the tipoContribuinte to set
     */
    public void setTipoContribuinte(String tipoContribuinte) {
        this.tipoContribuinte = tipoContribuinte;
    }



    /**
     * @return the consumidorFinal
     */
    public String getConsumidorFinal() {
        return consumidorFinal;
    }

    /**
     * @param consumidorFinal the consumidorFinal to set
     */
    public void setConsumidorFinal(String consumidorFinal) {
        this.consumidorFinal = consumidorFinal;
    }

    /**
     * @return the endereco
     */
    public TEndereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(TEndereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}
