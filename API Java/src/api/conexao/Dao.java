/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author ALUNO
 */
public class Dao {
    public Connection conectaBD(){
        
        Connection conn = null;
        
        try{
            String url = "jdbc:mysql://localhost:127.0.0.1/pro4jobs?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null, "DAO" + erro);
        }
        
        
        
        return conn;
    }
    
    public static void main(String[] args) {
        
    }
    
}
