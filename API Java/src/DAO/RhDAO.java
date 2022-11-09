
package DAO;

import DTO.Rh;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Emanoel
 */
public class RhDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarRh(Rh objrh){
        
        
        
        String sql = "insert into rh (cpf, nome_completo, email, perfil, senha) values (?,?,?,?,MD5(?))";
        
        conn = new ConexaoDAO().conectaBD();
        
        

        try {
           
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objrh.getCpf());
            pstm.setString(2,objrh.getNome_Completo());
            pstm.setString(3, objrh.getEmail());
            pstm.setString(4, objrh.getPerfil());
            pstm.setString(5, objrh.getSenha());
            pstm.execute();
            pstm.close();
 
            JOptionPane.showMessageDialog(null, "Cadastro Concluido");
            
            
            

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RHDAO" + erro);
        

    }
}

    public ResultSet loginRh(Rh objrh) {

        
        conn = new ConexaoDAO().conectaBD();
        

        try {
            
            String sql = "select * from rh where cpf = ? and senha = MD5(?)";
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
