/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.conexao;

import api.LoginRh;
import api.Rh;
import api.TelaCdastroRh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Emanoel
 */
public class RHdao {
    
    Connection conn;
    PreparedStatement pstm;
    
    
    public void cadastrarRh(Rh objrh){
        
        String sql = "insert into rh (cpf, nome_completo, email, perfil, senha) values (?,?,?,?,?)";

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(0, objrh.getCpf());
            pstm.setString(1,objrh.getNome_Completo());
            pstm.setString(2, objrh.getEmail());
            pstm.setString(3, objrh.getPerfil());
            pstm.setString(4, objrh.getSenha());
            
            pstm.execute();
            pstm.close();
 
            JOptionPane.showMessageDialog(null, "Cadastro Concluido");
            
            
            new LoginRh().setVisible(true);
            new TelaCdastroRh().setVisible(false);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CandidatoDAO" + erro);
        }

    }

    public ResultSet loginRh(Rh objrh) {

        
        conn = new Dao().conectaBD();
        

        try {
            
            String sql = "select * from rh where cpf = ? and senha = ?";
            PreparedStatement pstm2 = conn.prepareStatement(sql);
           
            pstm2.setString(1, objrh.getCpf());
            pstm2.setString(2, objrh.getSenha());
            
            ResultSet rs = pstm2.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RHdao" + erro);
            return null;
        }

    }
    
    public static void main(String[] args) {
     
        
    }

    
}
