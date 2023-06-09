/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.pr.senaccadastros.gui;

import br.pr.senaccadastros.hibernate.HibernateUtil;
import org.hibernate.Hibernate;

/**
 *
 * @author welly
 */
public class MenuPrincipal extends javax.swing.JDialog {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        HibernateUtil.getSession();
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuEstados = new javax.swing.JMenu();
        jMenuItemEstadoInserir = new javax.swing.JMenuItem();
        jMenuItemEstadoPesquisar = new javax.swing.JMenuItem();
        jMenuCidades = new javax.swing.JMenu();
        jMenuItemCidadeInserir = new javax.swing.JMenuItem();
        jMenuItemCidadePesquisar = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenuCadastros.setText("Cadastros");

        jMenuEstados.setText("Estados");

        jMenuItemEstadoInserir.setText("Inserir");
        jMenuItemEstadoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstadoInserirActionPerformed(evt);
            }
        });
        jMenuEstados.add(jMenuItemEstadoInserir);

        jMenuItemEstadoPesquisar.setText("Pesquisar");
        jMenuItemEstadoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstadoPesquisarActionPerformed(evt);
            }
        });
        jMenuEstados.add(jMenuItemEstadoPesquisar);

        jMenuCadastros.add(jMenuEstados);

        jMenuCidades.setText("Cidades");

        jMenuItemCidadeInserir.setText("Inserir");
        jMenuItemCidadeInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadeInserirActionPerformed(evt);
            }
        });
        jMenuCidades.add(jMenuItemCidadeInserir);

        jMenuItemCidadePesquisar.setText("Pesquisar");
        jMenuItemCidadePesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadePesquisarActionPerformed(evt);
            }
        });
        jMenuCidades.add(jMenuItemCidadePesquisar);

        jMenuCadastros.add(jMenuCidades);

        jMenuBar1.add(jMenuCadastros);

        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed

        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        new AjudaSobre(null, true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemEstadoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstadoInserirActionPerformed
        new CadastroEstadoInserir(null, true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEstadoInserirActionPerformed

    private void jMenuItemEstadoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstadoPesquisarActionPerformed
        new CadastroEstadoPesquisar(null, true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEstadoPesquisarActionPerformed

    private void jMenuItemCidadeInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadeInserirActionPerformed
        new CadastroCidadeInserir(null, true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCidadeInserirActionPerformed

    private void jMenuItemCidadePesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadePesquisarActionPerformed
        new CadastroEstadoPesquisar(null, true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCidadePesquisarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal dialog = new MenuPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuCidades;
    private javax.swing.JMenu jMenuEstados;
    private javax.swing.JMenuItem jMenuItemCidadeInserir;
    private javax.swing.JMenuItem jMenuItemCidadePesquisar;
    private javax.swing.JMenuItem jMenuItemEstadoInserir;
    private javax.swing.JMenuItem jMenuItemEstadoPesquisar;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
