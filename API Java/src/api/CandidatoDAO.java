import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class CandidatoDAO {

    Connection conn;
    PreparedStatement pstm;
    
    public void LoginCandidato(Login_candidato objcandidato){
        String sql = "select * from candidato where cpf = ? and senha = ?";
        conn = new ConexaoDao.conectaBD();
        
        try {
            pstm = conn.PrepareStatement(sql); 
            pstm.setString(0, objcandidato.getCpf());
            pstm.setString(1,objcandidato.getSenha());
            pstm.execute();
            pstm.close();
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, "CandidatoDAO" + erro);
        }
        if (objcandidato.getCpf().equals("") && (objcandidato.getSenha()){
            
        } 
    }
    
        public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
}

    

