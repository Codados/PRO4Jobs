/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;


import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author santo
 */
public class Rhdao {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarRh(Rh obj_cadastro_rh){
        
        String sql = "insert into rh(cpf, nome_completo, email, perfil, senha) values(?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().connectaBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, obj_cadastro_rh.getCpf());
            pstm.setString(2, obj_cadastro_rh.getNome_Completo());
            pstm.setString(3, obj_cadastro_rh.getEmail());
            pstm.setString(4, obj_cadastro_rh.getPerfil());
            pstm.setString(5, obj_cadastro_rh.getSenha());
            
        }catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Vagadao" + erro);
        }
    }
}
