/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import view.VCadastroCategoria;
import view.VCadastroClienteJuridica;
import view.VCadastroPedido;
import view.VCadastroProduto;
import view.VMenu;

/**
 *
 * @author leo_m
 */
public class Janela {

    public boolean exigeCampo(JLabel lb, JTextField tf) {
        String text = lb.getText();
        boolean rLb;
        if (tf.getText() == null || tf.getText().trim().equals("")) {
            lb.setText(text + "*");
            lb.setForeground(Color.red);
            rLb = false;
        } else {
            lb.setText(text);
            lb.setForeground(Color.black);
            rLb = true;
        }
        return rLb;
    }

    public boolean exigeCampoFormatado(JLabel lb, JFormattedTextField ftf) {
        String text = lb.getText();
        boolean rLb;
        if (ftf.getText() == null || ftf.getText().trim().equals("")) {
            lb.setText(text + "*");
            lb.setForeground(Color.red);
            rLb = false;
        } else {
            lb.setText(text);
            lb.setForeground(Color.black);
            rLb = true;
        }
        return rLb;
    }

    public boolean exigeCampoComboBox(JLabel lb, JComboBox cb) {
        String text = lb.getText();
        boolean rLb;
        if (cb.getSelectedItem().toString() == null || cb.getSelectedItem().toString().trim().equals("")) {
            lb.setText(text + "*");
            lb.setForeground(Color.red);
            rLb = false;
        } else {
            lb.setText(text);
            lb.setForeground(Color.black);
            rLb = true;
        }
        return rLb;
    }

    public boolean exigeCampoCheckBox(JLabel lb, JTextField tf, JCheckBox ck) {
        String text = lb.getText();
        boolean rLb;
        if (ck.isEnabled()) {
            rLb = true;
        } else {
            if (tf.getText() == null || tf.getText().trim().equals("")) {
                lb.setText(text + "*");
                lb.setForeground(Color.red);
                rLb = false;
            } else {
                lb.setText(text);
                lb.setForeground(Color.black);
                rLb = true;
            }
        }
        return rLb;
    }

    public void btnBarra(VCadastroClienteJuridica vm) {
        vm.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        vm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                vm.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }

    public void btnBarra(VCadastroProduto vm) {
        vm.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        vm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                vm.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }

        public void btnBarra(VCadastroCategoria vm) {
        vm.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        vm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                vm.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }
    
    public void btnBarra(VMenu vm) {
        vm.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        vm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                vm.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }
    
        public void btnBarra(VCadastroPedido vm) {
        vm.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        vm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                vm.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }
}
