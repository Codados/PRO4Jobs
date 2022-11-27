package DTO;

/**
 *
 * @author Lucas Emanoel
 */
public class Candidato_Vaga {

    private String status;
    private String motivo;
    private String nome_vaga;
    private String cpf;
    

    
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the nome_vaga
     */
    public String getNome_vaga() {
        return nome_vaga;
    }

    /**
     * @param nome_vaga the nome_vaga to set
     */
    public void setNome_vaga(String nome_vaga) {
        this.nome_vaga = nome_vaga;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
