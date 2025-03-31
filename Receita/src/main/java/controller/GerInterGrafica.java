/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import viewer.DlgCadastro;
import viewer.DlgListadeCompra;
import viewer.DlgVerReceita;
import viewer.FrmLogin;
import viewer.FrmPrincipal;
import viewer.FrmRegistro;

/**
 *
 * @author Gabrielly Zeni Manthay
 */
public class GerInterGrafica {
    
    private FrmLogin janLogin = null;
    private FrmRegistro janRegistro = null;
    private FrmPrincipal janPrincipal = null;
    private DlgCadastro janCadastro = null;
    private DlgListadeCompra janListadeCompra = null;
    private DlgVerReceita janVerReceita = null;
    
    /*private GerDominio gerDominio;
    
    // ########  SINGLETON  #########
    private static final GerInterGrafica myInstance = new GerInterGrafica();
        
    private GerInterGrafica() {        
        try {
            gerDominio = new GerDominio();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao inicializar.", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public static GerInterGrafica getMyInstance() {
        return myInstance;
    }
    
    // ######### SINGLETON ###########
    */
    
    /*
    private <T> T abrirJanela(java.awt.Window parent, T janela, Class<T> classe) {
        if (janela == null) {
            try {
                if (JDialog.class.isAssignableFrom(classe)) {
                    janela = classe.getConstructor(Frame.class, boolean.class).newInstance((Frame) parent, true);
                } else if (JFrame.class.isAssignableFrom(classe)) {
                    janela = classe.getConstructor().newInstance();
                } else {
                    throw new IllegalArgumentException("Classe inválida: " + classe.getName());
                }
            } catch (NoSuchMethodException | SecurityException | InstantiationException | 
                     IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage());
            }
        }               
        if (janela instanceof Window) {
            ((Window) janela).setVisible(true);
        }
        return janela;
    }
    */
    
    // ABRIR JDIALOG
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent,true);                                
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage() );
            } 
        }               
        dlg.setVisible(true); 
        return dlg;
    }    

    //JFrame janLogin = abrirJanela(this, null, TelaLogin.class);
    public void abrirLogin() {
        janLogin = new FrmLogin();
        janLogin.setVisible(true);                
    }
    
    public void abrirRegistro() {
        janRegistro = new FrmRegistro();
        janRegistro.setVisible(true);                
    }
    
    public void abrirPrincipal() {
        janPrincipal = new FrmPrincipal();
        janPrincipal.setVisible(true);                
    }
    
    // JDialog janCadastro = abrirJanela(this, null, DlgCadastro.class);
    public void abrirCadastro() {
        janCadastro = (DlgCadastro) abrirJanela(janPrincipal, janCadastro,  DlgCadastro.class ); 
    }
    
    public void abrirListadeCompra() {
        janListadeCompra = (DlgListadeCompra) abrirJanela(janPrincipal, janListadeCompra,  DlgListadeCompra.class ); 
    }
    
    public void abrirVerReceita() {
        janVerReceita = (DlgVerReceita) abrirJanela(janPrincipal, janVerReceita,  DlgVerReceita.class ); 
    }
    
    public void sair() {
        System.exit(0);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        
        // TRADUÇÃO
        javax.swing.UIManager.put("OptionPane.yesButtonText", "Sim"); 
        javax.swing.UIManager.put("OptionPane.noButtonText", "Não");
        javax.swing.UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        
        
        /* Create and display the form */
        
        GerInterGrafica gerIG = GerInterGrafica.getMyInstance();
        gerIG.abrirLogin();  
    }
}
