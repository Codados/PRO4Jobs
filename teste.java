import javax.swing.JOptionPane;
public class teste extends javax.swing.JFrame {
   
    public teste() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cpf = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cpf.setForeground(new java.awt.Color(255, 51, 0));
        Cpf.setText("CPF:");
        getContentPane().add(Cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        Senha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 51, 0));
        Senha.setText("Senha:");
        getContentPane().add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        txtLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin.setText("Entrar");
        txtLogin.setAutoscrolls(true);
        txtLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLogin.setBorderPainted(false);
        txtLogin.setContentAreaFilled(false);
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 300, 30));

        txtSenha.setBorder(null);
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 200, -1));

        txtCpf.setBorder(null);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 300, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/001.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
     String cpf = c_cpf.getText();
     String senha = c_senha.getText();
        
        /*  if(txtCpf.getValue().equals("52583958515")&&txtSenha.getText().equals("1234")){
            JOptionPane.showMessageDialog(null,"Bem vindo!");
            
        }else{
            JOptionPane.showMessageDialog(null, "Reveja seus dados!");
       /*     
            
        
        }
    
    }//GEN-LAST:event_txtLoginActionPerformed

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
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JButton txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
