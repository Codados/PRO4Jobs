package DAO;

import DTO.Candidato;
import DTO.Vaga;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Emanoel
 */
public class VagaDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    ArrayList<Vaga> lista = new ArrayList<>();
    
    
        public void alterarnumeroCandidato(Vaga objvaga){
            String sql = "update vaga set quantidade_candidatos = quantidade_candidatos + 1 where id_vaga = ?";
            conn = new ConexaoDAO().conectaBD();
            
            try{
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, objvaga.getId_vaga());
                pstm.execute();
                pstm.close();
                
                
                JOptionPane.showMessageDialog(null, "Você se candidatou para a vaga" + ":" + objvaga.getNome());
                 
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "alterarnumeroCandidato" + erro);
            }
        }   
    
         
        public void cadastrarvaga(Vaga obj_cadastro_vaga){
            
            String sql = "insert into vaga(nome_vaga, descricao_vaga, pretencao_salarial, cargo, experiencia_profissional_necessaria, quantidade_candidatos) values (?, ?, ?, ?, ?, 0)";
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
                
                JOptionPane.showMessageDialog(null, "Vaga Cadastrada");
                
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"VagaDAO: Cadastrar" + erro);
            
            }
        }
        
        public ArrayList<Vaga> PesquisarVagas(){
            
            String sql = "select * from vaga";
            conn = new ConexaoDAO().conectaBD();
            ResultSet rs;
            try{
                
                pstm = conn.prepareStatement(sql);
                rs = pstm.executeQuery();
                
                while (rs.next()){
                    Vaga objvaga = new Vaga();
                    objvaga.setId_vaga(rs.getInt("id_vaga"));
                    objvaga.setNome(rs.getString("nome_vaga"));
                    objvaga.setDescricao(rs.getString("descricao_vaga"));
                    objvaga.setSalario(rs.getDouble("pretencao_salarial"));
                    objvaga.setCargo(rs.getString("cargo"));
                    objvaga.setExpe_prof(rs.getString("experiencia_profissional_necessaria"));
                    lista.add(objvaga);
                }
                
            } catch(SQLException erro){
                JOptionPane.showMessageDialog(null,"VagaDAO: Pesquisar" + erro);
            }
            
            return lista;
        }
        
        public ResultSet Pesquisa(Vaga objvaga){
            String sql = "select * from vaga where nome_vaga = ?";
            conn = new ConexaoDAO().conectaBD();
            
            try{
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, objvaga.getNome());
                ResultSet rs = pstm.executeQuery();
                
                return rs;
                
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Pesquisa" + erro);
                return null;
            }
        }
        
        
        public ArrayList<Vaga> FiltrarVaga(String nome, String cargo){
            String sql = "Select * from vaga where nome_vaga like ? and cargo like ?";
            conn = new ConexaoDAO().conectaBD();
            
            try{
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, "%"+nome+"%");
                pstm.setString(2, "%"+cargo+"%");
                ResultSet rs = pstm.executeQuery();
                
                while(rs.next()){
                    Vaga objvaga = new Vaga();
                    objvaga.setId_vaga(rs.getInt("id_vaga"));
                    objvaga.setNome(rs.getString("nome_vaga"));
                    objvaga.setDescricao(rs.getString("descricao_vaga"));
                    objvaga.setSalario(rs.getDouble("pretencao_salarial"));
                    objvaga.setCargo(rs.getString("cargo"));
                    objvaga.setExpe_prof(rs.getString("experiencia_profissional_necessaria"));
                    lista.add(objvaga);
                }
                
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Filtro normal" + erro);
                return null;
            } return lista;
        }
        
         public ArrayList<Vaga> FiltrarVagapret (Double pret){
            String sql = "Select * from vaga where pretencao_salarial = ?;";
            conn = new ConexaoDAO().conectaBD();
            
            try{
                pstm = conn.prepareStatement(sql);
                pstm.setDouble(1,pret);
                ResultSet rs = pstm.executeQuery();
                
                while(rs.next()){
                    Vaga objvaga = new Vaga();
                    objvaga.setId_vaga(rs.getInt("id_vaga"));
                    objvaga.setNome(rs.getString("nome_vaga"));
                    objvaga.setDescricao(rs.getString("descricao_vaga"));
                    objvaga.setSalario(rs.getDouble("pretencao_salarial"));
                    objvaga.setCargo(rs.getString("cargo"));
                    objvaga.setExpe_prof(rs.getString("experiencia_profissional_necessaria"));
                    lista.add(objvaga);
                }
                
            } catch (SQLException erro){
                JOptionPane.showMessageDialog(null, "Filtro pretensao" + erro);
                return null;
            } return lista;
        }
        
        
        public void alterarVaga(Vaga objvaga){
            String sql = "update vaga set nome_vaga = ?, descricao_vaga = ?, pretencao_salarial = ?, cargo = ?, experiencia_profissional_necessaria = ? where id_vaga = ?";
            
            conn = new ConexaoDAO().conectaBD();
            try {
                
                pstm = conn.prepareStatement(sql);
                
                pstm.setString(1,objvaga.getNome());
                pstm.setString(2,objvaga.getDescricao());
                pstm.setDouble(3,objvaga.getSalario());
                pstm.setString(4,objvaga.getCargo());
                pstm.setString(5,objvaga.getExpe_prof());
                pstm.setInt(6, objvaga.getId_vaga());
                
                pstm.execute();
                pstm.close();
                
                JOptionPane.showMessageDialog(null, "Vaga alterada");
                
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"VagaDAO: Alterar" + erro);
            
            }}
        
        public void excluirVaga(Vaga objvagadto){
            String sql = "delete from vaga where id_vaga = ?";
            conn = new ConexaoDAO().conectaBD();
            
            try {
                
                pstm = conn.prepareStatement(sql);
                
                pstm.setInt(1, objvagadto.getId_vaga());
                
                pstm.execute();
                pstm.close();
                
                JOptionPane.showMessageDialog(null, "Vaga Excluida");
                
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"VagaDAO: Excluir" + erro);
            
            }
        
        
            
        }
        
    
            public static void main(String[] args) {
     
        
    }
    
    
}
