/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Candidato;
import DTO.Candidato_Vaga;
import DTO.Experiencia_Academica;
import DTO.Experiencia_Profissional;
import View.CadastroCandidato;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author Lucas Emanoel
 */
public class CandidatoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    ArrayList<Candidato_Vaga> lista = new ArrayList<>();
    
    public ArrayList<Candidato_Vaga> MostrarVagas(Candidato objcandidato){
        
        String sql = "select v.nome_vaga,cv.status_vaga,cv.motivo from vaga as v "
                + "inner join candidato_vaga as cv on v.id_vaga = cv.fk_id_vaga "
                + "inner join candidato as cand on cand.cpf = cv.fk_cpf where cpf = ?";
        
        conn = new ConexaoDAO().conectaBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcandidato.getCPF());
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()){
                Candidato_Vaga objcv = new Candidato_Vaga();
                objcv.setNome_vaga(rs.getString("nome_vaga"));
                objcv.setStatus(rs.getString("status_vaga"));
                objcv.setMotivo(rs.getString("motivo"));
                lista.add(objcv);
                
            }
           
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "CandidatoDAO: MostrarVagas" + e);
            return null;
        }
        return lista;
    }
    
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
    public boolean BotaArquivo(File f) throws IOException{
    String sql = "INSERT INTO candidato(arquivo) VALUES (?)";
    conn = new ConexaoDAO().conectaBD();
    
    try {
        pstm = conn.prepareStatement(sql);

        //converte o objeto file em array de bytes
        InputStream is = new FileInputStream( f );
        byte[] bytes = new byte[(int)f.length() ];
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length
               && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
            offset += numRead;
        }

        pstm.setBytes( 1, bytes);
        pstm.execute();
        pstm.close();
        return true;

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "CandidatoDAO" + erro);
    }catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "CandidatoDAO" + ex);
    }
    return false;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public ResultSet mostrarformacaoacademica(Candidato objcandidato){
        String sql = "select * from formacao_academica where fk_cpf = ?";
        conn = new ConexaoDAO().conectaBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcandidato.getCPF());
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "mostrarformacaoacademica" + e);
            return null;
        }
        
    }
    
        public ResultSet mostrarexperienciaprofissional(Candidato objcandidato){
        String sql = "select * from experiencia_profissional where fk_cpf = ?";
        conn = new ConexaoDAO().conectaBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcandidato.getCPF());
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "mostrarexperienciaprofissional" + e);
            return null;
        }
        
    }
    
}
