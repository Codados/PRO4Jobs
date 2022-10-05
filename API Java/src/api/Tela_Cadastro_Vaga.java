/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadastro_vaga;

/**
 *
 * @author Fatec
 */
public class Tela_Cadastro_Vaga extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Cadastro_Vaga
     */
    public Tela_Cadastro_Vaga() {
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtSal = new javax.swing.JFormattedTextField();
        txtExp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(243, 84, 22));
        jButton1.setText("Cadastrar Vaga");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, 340, 30));

        jLabel2.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 84, 22));
        jLabel2.setText("Cadastrar Vaga");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, 60));

        txtNome.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtNome.setText("Titulo da Vaga");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 760, 40));

        txtDescricao.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtDescricao.setText("Descrição");
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 760, 140));

        txtCargo.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtCargo.setText("Cargo");
        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 360, 40));

        txtSal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtSal.setText("Pretensão Salarial");
        txtSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalActionPerformed(evt);
            }
        });
        getContentPane().add(txtSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 380, 40));

        txtExp.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtExp.setText("Experiência Profissional Necessária");
        getContentPane().add(txtExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 760, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro_vaga/meudeusmeusenhomeajudaporfavo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Nome, Descricao, Cargo, Expe_Prof;
        double Salario;
        
        Cadastro_Vaga obj_cadastro_vaga = new Cadastro_Vaga();
        
        Nome = txtNome.getText();
        Descricao = txtDescricao.getText();
        Cargo = txtCargo.getText();
        Expe_Prof = txtExp.getText();
        Salario = Double.parseDouble(txtSal.getText());
        
        obj_cadastro_vaga.setNome(Nome);
        obj_cadastro_vaga.setDescricao(Descricao);
        obj_cadastro_vaga.setCargo(Cargo);
        obj_cadastro_vaga.setExpe_prof(Expe_Prof);
        obj_cadastro_vaga.setSalario(Salario);
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void txtSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtSalActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDescricaoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cadastro_Vaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Vaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Vaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Vaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro_Vaga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtSal;
    // End of variables declaration//GEN-END:variables
}
