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

        String sql = "insert into candidato (cpf, nome_completo, data_nascimento, email, telefone, endereco, pretencao_salarial, senha) values (?,?,?,?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objcandidato.getCPF());
            pstm.setString(2,objcandidato.getNome_Completo());
            pstm.setString(3, objcandidato.getData_Nascimento());
            pstm.setString(4, objcandidato.getEmail());
            pstm.setLong(5, objcandidato.getTelefone());
            pstm.setString(6, objcandidato.getEndereco());
            pstm.setDouble(7, objcandidato.getSalario());
            pstm.setString(8, objcandidato.getSenha());
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Os dados foram salvos !");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CandidatoDAO" + erro);
        }

    }
        public void LoginCandidato(Candidato objcandidato){
        String sql = "select * from candidato where cpf = ? and senha = *";
        conn = new Dao.conectaBD();
        
        try {
            pstm = conn.PrepareStatement(sql); 
            pstm.setString(0, objcandidato.getCpf());
            pstm.setString(1,objcandidato.getSenha());
            pstm.execute();
            pstm.close();
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, "CandidatoDAO" + erro);
        }
        public void LoginCandidato(Candidato objcandidato){
        String sql = "select * from candidato where cpf = ? and senha = *";
        conn = new Dao.conectaBD();
        
        try {
            pstm = conn.PrepareStatement(sql); 
            pstm.setString(0, objcandidato.getCpf());
            pstm.setString(1,objcandidato.getSenha());
            pstm.execute();
            pstm.close();
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, "CandidatoDAO" + erro);
        }
        public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
}
