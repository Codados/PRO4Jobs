/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro_vaga;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Fatec
 */

public class Vagadao {

    Connection conn;
    PreparedStatement pstm;
        
        public void cadastrarvaga(Cadastro_Vaga obj_cadastro_vaga){
            
            String sql = "insert into vaga(nome_vaga, descricao_vaga, pretensao_salrial, cargo, experiencia_profissional_necessaria) values(?, ?, ?, ?, ?)";
            conn = new ConexaoDAO().conectaBD();
            
            try {
                
                pstm = conn.prepareStatement(sql);
                
                pstm.setString(1,obj_cadastro_vaga.getNome());
                pstm.setString(2,obj_cadastro_vaga.getDescricao());
                pstm.setDouble(3,obj_cadastro_vaga.getSalario());
                pstm.setString(4,obj_cadastro_vaga.getCargo());
                pstm.setString(5,obj_cadastro_vaga.getExpe_prof());
                
                pstm.execute();
                pstm.close();
                
                JOptionPane.showMessageDialog(null, "Os dados foram salvos");
                
                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Vagadao" + erro);
            
            }
        }
    
    
}
