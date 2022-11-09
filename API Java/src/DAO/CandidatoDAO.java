/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Candidato;
import DTO.Experiencia_Academica;
import DTO.Experiencia_Profissional;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lucas Emanoel
 */
public class CandidatoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public ResultSet LoginCandidato(Candidato objcandidato){
        String sql = "select * from candidato where cpf = ? and senha = MD5(?)";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcandidato.getCPF());
            pstm.setString(2,objcandidato.getSenha());
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "CandidatoDAO" + erro);
            return null;
        }
        
    }
    
   
     public void cadastrarCandidato(Candidato objcandidato) {

        String sql = "insert into candidato (cpf, nome_completo, data_nascimento, email, telefone, endereco, pretencao_salarial, senha) values (?,?,?,?,?,?,?,MD5(?))";
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

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CandidatoDAO" + erro);
        }

    }
    
    public void cadastrarexperiencias(Experiencia_Academica objexacd, Candidato objcandidato, Experiencia_Profissional objexprof){
        
        String sql = "insert into formacao_academica(descricao,fk_cpf) values (?,?)";
        
        String sql2 = "insert into experiencia_profissional(descricao,fk_cpf) values (?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objexacd.getDescricao());
            pstm.setString(2, objcandidato.getCPF());
            pstm.execute();
            pstm.close();
            
            pstm = conn.prepareStatement(sql2);
            
            pstm.setString(1, objexprof.getDescricao());
            pstm.setString(2,objcandidato.getCPF());
            pstm.execute();
            pstm.close();
            
            
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "CandidatoDAO" + erro);
            
        }
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}