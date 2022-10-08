package conexao.dto;

/**
 *
 * @author Fatec
 */
public class Vaga {
    private String Nome;
    private String Descricao;
    private double Salario;
    private String Cargo;
    private String Expe_prof;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getExpe_prof() {
        return Expe_prof;
    }

    public void setExpe_prof(String Expe_prof) {
        this.Expe_prof = Expe_prof;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
