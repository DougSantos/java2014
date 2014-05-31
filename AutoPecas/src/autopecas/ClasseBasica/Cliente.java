/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.ClasseBasica;

/**
 *
 * @author NeGo
 */
public class Cliente {
    
    private String nome;
    private Integer cpf;
    private Integer modelo;
    private String veiculo;
    private String cor;

    
    // Criando Construtor
    //
    public Cliente (String nome,Integer cpf,Integer modelo,String veiculo,String cor){
        this.nome = nome;
        this.modelo = modelo;
        this.veiculo = veiculo;
        this.cpf = cpf;
        
    }
    
    
    ///
    
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public Integer getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    /**


    /**
     * @return the veiculo
     */
    public String getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the modelo
     */
    public Integer getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }



    
}
