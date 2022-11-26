/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lucas Emanoel
 */
public class Vaga {

    private String Nome;
    private String Descricao;
    private double Salario;
    private String Cargo;
    private String Expe_prof;
    private int id_vaga;
    private int quant_candidatos;
    private String status;
    
    
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

    /**
     * @return the id_vaga
     */
    public int getId_vaga() {
        return id_vaga;
    }

    /**
     * @param id_vaga the id_vaga to set
     */
    public void setId_vaga(int id_vaga) {
        this.id_vaga = id_vaga;
    }
    
    
    /**
     * @return the quant_candidatos
     */
    public int getQuant_candidatos() {
        return quant_candidatos;
    }

    /**
     * @param quant_candidatos the quant_candidatos to set
     */
    public void setQuant_candidatos(int quant_candidatos) {
        this.quant_candidatos = quant_candidatos;
    }

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

}
