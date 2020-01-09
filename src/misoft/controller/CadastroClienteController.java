/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misoft.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author leo_m
 */
public class CadastroClienteController implements Initializable {

    @FXML
    private Label lbCep;
    private TextField tfCep;
    private Label lbLogradouro;
    private TextField tfLogradouro;
    private Label lbBairro;
    private TextField tfBairro;
    private Label lbEstado;
    private TextField tfEstado;
    private Label lbCidade;
    private TextField tfCidade;


    @FXML
    public void completaCep(ActionEvent event) {
        System.out.println(tfCep.getText());
        tfLogradouro = new TextField("saaaalve");
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbCep = new Label();
        tfCep = new TextField();
        lbLogradouro = new Label();
        tfLogradouro = new TextField();
        lbBairro = new Label();
        tfBairro = new TextField();
        lbEstado = new Label();
        tfEstado = new TextField();
        lbCidade = new Label();
        tfCidade = new TextField();
    }

}
