/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ConexaoDAO;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author apqui
 */
public class RelatorioRH extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    /**
     * Creates new form RelatorioRH
     */
    public RelatorioRH() {
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

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnVagas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        gambi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Candidatos");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 260, 40));

        btnVagas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVagas.setForeground(new java.awt.Color(255, 255, 255));
        btnVagas.setText("Vagas");
        btnVagas.setBorderPainted(false);
        btnVagas.setContentAreaFilled(false);
        btnVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVagasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVagas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 240, 30));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 453, 120, 30));

        gambi.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        gambi.setForeground(new java.awt.Color(255, 51, 0));
        gambi.setText("Deseja ver apenas candidatos aprovados? Clique aqui!");
        gambi.setBorderPainted(false);
        gambi.setContentAreaFilled(false);
        gambi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gambiActionPerformed(evt);
            }
        });
        getContentPane().add(gambi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Fatec_2_Semestre_2022\\API\\teste05fé.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Create_Candidato_Csv();    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVagasActionPerformed
        // TODO add your handling code here:
        Create_Vaga_Csv();
    }//GEN-LAST:event_btnVagasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gambiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gambiActionPerformed
        // TODO add your handling code here:
        Create_Aprovados_Csv();
    }//GEN-LAST:event_gambiActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioRH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVagas;
    private javax.swing.JButton gambi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void Create_Candidato_Csv() {
        try {
            PrintWriter pw = new PrintWriter(new File("Candidato.csv"));

            StringBuilder sb = new StringBuilder();

            ConexaoDAO conexao = new ConexaoDAO();
            conn = conexao.conectaBD();

            String sql = "select * from candidato";

            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            String temp, temp2;
             sb.append("CPF;Nome Completo;Data de Nascimento;Email;Telefone;Endereco;Pretensao Salarial\n");
            while (rs.next()) {

                sb.append(rs.getString("cpf"));
                sb.append(";");
                sb.append(rs.getString("nome_completo"));
                sb.append(";");
                sb.append(rs.getString("data_nascimento"));
                sb.append(";");
                sb.append(rs.getString("email"));
                sb.append(";");
                temp = Integer.toString(rs.getInt("telefone"));
                sb.append(temp);
                sb.append(";");
                sb.append(rs.getString("endereco"));
                sb.append(";");
                temp2 = Double.toString(rs.getInt("pretencao_salarial"));
                sb.append(String.valueOf(rs.getDouble("pretencao_salarial")));
                sb.append("\n");

            }
            pw.write(sb.toString());
            pw.close();
            
            JOptionPane.showMessageDialog(null,"Foi criado o arquivo Candidatos.csv");

        } catch (Exception e) {

        }
    }
        private void Create_Vaga_Csv() {
        try {
            PrintWriter pw = new PrintWriter(new File("Vaga.csv"));

            StringBuilder sb = new StringBuilder();

            ConexaoDAO conexao = new ConexaoDAO();
            conn = conexao.conectaBD();

            String sql = "select * from vaga";

            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            String temp,temp2, temp3;
             sb.append("ID DA VAGA;NOME DA VAGA; DESCRICAO DA VAGA; PRETENCAO SALARIAL; CARGO; EXPERIENCIA PROFISSIONAL NECESSARIA; STATUS; QTD. DE CANDIDATOS\n");
            while (rs.next()) {
                temp = Integer.toString(rs.getInt("id_vaga"));
                sb.append(rs.getString("nome_vaga"));
                sb.append(";");
                sb.append(rs.getString("descricao_vaga"));
                sb.append(";");
                temp2 = Double.toString(rs.getInt("pretencao_salarial"));
                sb.append(";");
                sb.append(rs.getString("cargo"));
                sb.append(";");
                sb.append(rs.getString("experiencia_profissional_necessaria"));
                sb.append(";");
                sb.append(rs.getString("status"));
                temp = Integer.toString(rs.getInt("quantidade_candidatos"));
                sb.append("\n");

            }
            pw.write(sb.toString());
            pw.close();
            
            JOptionPane.showMessageDialog(null,"Foi criado o arquivo Vagas.csv");

        } catch (Exception e) {

        }
        

    }
        private void Create_Aprovados_Csv() {
        try {
            PrintWriter pw = new PrintWriter(new File("Relacao_Candidato_Vaga.csv"));

            StringBuilder sb = new StringBuilder();

            ConexaoDAO conexao = new ConexaoDAO();
            conn = conexao.conectaBD();

            String sql = "select * from candidato_vaga where status_vaga = 'APROVADO'";

            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            String temp2;
             sb.append("CPF CANDIDATO;ID DA VAGA;STATUS DA VAGA\n");
            while (rs.next()) {
                sb.append(rs.getString("fk_cpf"));
                temp2 = Integer.toString(rs.getInt("fk_id_vaga"));
                sb.append(rs.getString("status_vaga"));
                sb.append("\n");

            }
            pw.write(sb.toString());
            pw.close();
            
            JOptionPane.showMessageDialog(null,"Foi criado o arquivo Candidatos Aprovados.csv");

        } catch (Exception e) {

        }

    }

}
