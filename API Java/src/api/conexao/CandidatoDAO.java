/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.conexao;

import api.conexao.DTO.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Emanoel
 */
public class CandidatoDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarCandidato(Candidato objcandidato) {

        String sql = "insert into candidato (CPF, Nome_Completo, Data_Nascimento, Email, Telefone, Endereco, Senha) values (?,?,?,?,?,?,?)";
        conn = new Dao().conectaBD();

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(0, objcandidato.getCPF());
            pstm.setString(1,objcandidato.getNome_Completo());
            pstm.setString(2, objcandidato.getData_Nascimento());
            pstm.setString(3, objcandidato.getEmail());
            pstm.setInt(4, objcandidato.getTelefone());
            pstm.setString(5, objcandidato.getEndereco());
            pstm.setString(6, objcandidato.getSenha());
            
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CandidatoDAO" + erro);
        }

    }
    
    public static void main(String[] args) {
     
        
    }

}
