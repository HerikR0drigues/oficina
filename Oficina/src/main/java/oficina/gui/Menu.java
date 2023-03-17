/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oficina.gui;

import java.awt.Color;
import javax.swing.border.EmptyBorder;
import oficina.gui.cadastro.CadastroCliente;
import oficina.gui.cadastro.CadastroProduto;
import oficina.gui.consulta.ConsultaCliente;

/**
 *
 * @author Herik
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelConsulta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelOrdemServico = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelCadastrarProduto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(190, 190, 190));

        jPanelCadastro.setBackground(new java.awt.Color(160, 160, 160));
        jPanelCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCadastroMouseExited(evt);
            }
        });

        jLabel1.setText("Cadastrar Cliente");

        jPanelCadastro.setBorder(new EmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelConsulta.setBackground(new java.awt.Color(160, 160, 160));
        jPanelConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelConsultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelConsultaMouseExited(evt);
            }
        });

        jLabel2.setText("Consultar Cliente");

        jPanelConsulta.setBorder(new EmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanelConsultaLayout = new javax.swing.GroupLayout(jPanelConsulta);
        jPanelConsulta.setLayout(jPanelConsultaLayout);
        jPanelConsultaLayout.setHorizontalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelConsultaLayout.setVerticalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelOrdemServico.setBackground(new java.awt.Color(160, 160, 160));
        jPanelOrdemServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelOrdemServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOrdemServicoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelOrdemServicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelOrdemServicoMouseExited(evt);
            }
        });

        jLabel3.setText("Ordem de Serviço");

        javax.swing.GroupLayout jPanelOrdemServicoLayout = new javax.swing.GroupLayout(jPanelOrdemServico);
        jPanelOrdemServico.setLayout(jPanelOrdemServicoLayout);
        jPanelOrdemServicoLayout.setHorizontalGroup(
            jPanelOrdemServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdemServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOrdemServicoLayout.setVerticalGroup(
            jPanelOrdemServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdemServicoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanelCadastrarProduto.setBackground(new java.awt.Color(160, 160, 160));
        jPanelCadastrarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelCadastrarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCadastrarProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCadastrarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCadastrarProdutoMouseExited(evt);
            }
        });

        jLabel4.setText("Cadastrar Produto");

        javax.swing.GroupLayout jPanelCadastrarProdutoLayout = new javax.swing.GroupLayout(jPanelCadastrarProduto);
        jPanelCadastrarProduto.setLayout(jPanelCadastrarProdutoLayout);
        jPanelCadastrarProdutoLayout.setHorizontalGroup(
            jPanelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadastrarProdutoLayout.setVerticalGroup(
            jPanelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarProdutoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanelOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanelOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelCadastrarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroMouseEntered
        jPanelCadastro.setBackground(new Color(130,130,130));
    }//GEN-LAST:event_jPanelCadastroMouseEntered

    private void jPanelCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroMouseExited
       jPanelCadastro.setBackground(new Color(160,160,160));
    }//GEN-LAST:event_jPanelCadastroMouseExited

    private void jPanelCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroMouseClicked
        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jPanelCadastroMouseClicked

    private void jPanelConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsultaMouseEntered
        jPanelConsulta.setBackground(new Color(130,130,130));
    }//GEN-LAST:event_jPanelConsultaMouseEntered

    private void jPanelConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsultaMouseExited
        jPanelConsulta.setBackground(new Color(160,160,160));
    }//GEN-LAST:event_jPanelConsultaMouseExited

    private void jPanelConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsultaMouseClicked
        ConsultaCliente consultaCliente = new ConsultaCliente();
        consultaCliente.setVisible(true);
    }//GEN-LAST:event_jPanelConsultaMouseClicked

    private void jPanelOrdemServicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOrdemServicoMouseEntered
         jPanelOrdemServico.setBackground(new Color(130,130,130)); 
    }//GEN-LAST:event_jPanelOrdemServicoMouseEntered

    private void jPanelOrdemServicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOrdemServicoMouseExited
         jPanelOrdemServico.setBackground(new Color(160,160,160)); 
    }//GEN-LAST:event_jPanelOrdemServicoMouseExited

    private void jPanelOrdemServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOrdemServicoMouseClicked
        OrdemServico ordemServico = new OrdemServico();
        ordemServico.setVisible(true);
    }//GEN-LAST:event_jPanelOrdemServicoMouseClicked

    private void jPanelCadastrarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastrarProdutoMouseEntered
        jPanelCadastrarProduto.setBackground(new Color(130,130,130)); 
    }//GEN-LAST:event_jPanelCadastrarProdutoMouseEntered

    private void jPanelCadastrarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastrarProdutoMouseExited
        jPanelCadastrarProduto.setBackground(new Color(160,160,160)); 
    }//GEN-LAST:event_jPanelCadastrarProdutoMouseExited

    private void jPanelCadastrarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastrarProdutoMouseClicked
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.setVisible(true);
    }//GEN-LAST:event_jPanelCadastrarProdutoMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastrarProduto;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelOrdemServico;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
