/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import api.Erro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import model.MCadastroCliente;
import model.MEndereco;
import tipos.TCadastroJuridica;
import tipos.TEndereco;

public class CCadastroCliente {

    private TEndereco endereco;
    private JTextField tfCapitalSocial;
    private JTextField tfContribuinte;
    private JTextField tfEmail;
    private JTextField tfInscricaoMunicipal;
    private JTextField tfNomeFantasia;
    private JTextField tfRazaoSocial;
    private JTextField tfTelefone;
    private JTextArea taObservacoes;
    private JFormattedTextField ftfInscricaoEstadual;
    private JFormattedTextField ftfCnpj;
    private JComboBox cbConsumidorFinal;


    public TCadastroJuridica completaCliente() {
        TCadastroJuridica colaborador = new TCadastroJuridica();
        colaborador.setRazaoSocial(tfRazaoSocial.getText());
        colaborador.setNomeFantasia(tfNomeFantasia.getText());
        colaborador.setCnpj(ftfCnpj.getText());
        colaborador.setInscricaoEstadual(ftfInscricaoEstadual.getText());
        colaborador.setContribuinte(tfContribuinte.getText());
        colaborador.setTelefone(tfTelefone.getText());
        colaborador.setContribuinte(tfContribuinte.getText());
        colaborador.setConsumidorFinal(getCbConsumidorFinal().getSelectedItem().toString());
        colaborador.setIdEndereco(getEndereco().getId());
        System.out.println(colaborador.getIdEndereco());
        colaborador.setEmail(tfEmail.getText());
        colaborador.setObservacoes(taObservacoes.getText());
        return colaborador;
    }

    public void cadastraCliente() {
        TCadastroJuridica colaborador = completaCliente();

        try {
            getEndereco().setId(new MEndereco().novoEndereco(endereco));
            if (getEndereco().getId().equals("-1")) {
                new Erro().erroCadastro();
            }
            if (new MCadastroCliente().novoCadastro(colaborador)) {

            }
        } catch (SQLException ex) {
            Logger.getLogger(CCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
     * @return the tfCapitalSocial
     */
    public JTextField getTfCapitalSocial() {
        return tfCapitalSocial;
    }

    /**
     * @param tfCapitalSocial the tfCapitalSocial to set
     */
    public void setTfCapitalSocial(JTextField tfCapitalSocial) {
        this.tfCapitalSocial = tfCapitalSocial;
    }

    /**
     * @return the tfContribuinte
     */
    public JTextField getTfContribuinte() {
        return tfContribuinte;
    }

    /**
     * @param tfContribuinte the tfContribuinte to set
     */
    public void setTfContribuinte(JTextField tfContribuinte) {
        this.tfContribuinte = tfContribuinte;
    }

    /**
     * @return the tfEmail
     */
    public JTextField getTfEmail() {
        return tfEmail;
    }

    /**
     * @param tfEmail the tfEmail to set
     */
    public void setTfEmail(JTextField tfEmail) {
        this.tfEmail = tfEmail;
    }

    /**
     * @return the tfInscricaoMunicipal
     */
    public JTextField getTfInscricaoMunicipal() {
        return tfInscricaoMunicipal;
    }

    /**
     * @param tfInscricaoMunicipal the tfInscricaoMunicipal to set
     */
    public void setTfInscricaoMunicipal(JTextField tfInscricaoMunicipal) {
        this.tfInscricaoMunicipal = tfInscricaoMunicipal;
    }

    /**
     * @return the tfNomeFantasia
     */
    public JTextField getTfNomeFantasia() {
        return tfNomeFantasia;
    }

    /**
     * @param tfNomeFantasia the tfNomeFantasia to set
     */
    public void setTfNomeFantasia(JTextField tfNomeFantasia) {
        this.tfNomeFantasia = tfNomeFantasia;
    }

    /**
     * @return the tfRazaoSocial
     */
    public JTextField getTfRazaoSocial() {
        return tfRazaoSocial;
    }

    /**
     * @param tfRazaoSocial the tfRazaoSocial to set
     */
    public void setTfRazaoSocial(JTextField tfRazaoSocial) {
        this.tfRazaoSocial = tfRazaoSocial;
    }

    /**
     * @return the tfTelefone
     */
    public JTextField getTfTelefone() {
        return tfTelefone;
    }

    /**
     * @param tfTelefone the tfTelefone to set
     */
    public void setTfTelefone(JTextField tfTelefone) {
        this.tfTelefone = tfTelefone;
    }

    /**
     * @return the taObservacoes
     */
    public JTextArea getTaObservacoes() {
        return taObservacoes;
    }

    /**
     * @param taObservacoes the taObservacoes to set
     */
    public void setTaObservacoes(JTextArea taObservacoes) {
        this.taObservacoes = taObservacoes;
    }

    /**
     * @return the ftfInscricaoEstadual
     */
    public JFormattedTextField getFtfInscricaoEstadual() {
        return ftfInscricaoEstadual;
    }

    /**
     * @param ftfInscricaoEstadual the ftfInscricaoEstadual to set
     */
    public void setFtfInscricaoEstadual(JFormattedTextField ftfInscricaoEstadual) {
        this.ftfInscricaoEstadual = ftfInscricaoEstadual;
    }

    /**
     * @return the ftfCnpj
     */
    public JFormattedTextField getFtfCnpj() {
        return ftfCnpj;
    }

    /**
     * @param ftfCnpj the ftfCnpj to set
     */
    public void setFtfCnpj(JFormattedTextField ftfCnpj) {
        this.ftfCnpj = ftfCnpj;
    }

    /**
     * @return the cbConsumidorFinal
     */
    public JComboBox getCbConsumidorFinal() {
        return cbConsumidorFinal;
    }

    /**
     * @param cbConsumidorFinal the cbConsumidorFinal to set
     */
    public void setCbConsumidorFinal(JComboBox cbConsumidorFinal) {
        this.cbConsumidorFinal = cbConsumidorFinal;
    }

}
