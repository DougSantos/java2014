/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.ClasseBasica;

import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public class Cliente {
    
    private String nome;
    private Integer cpf;
    private ArrayList<Veiculo> listVeiculo;

    
    // Criando Construtor
    //
    public Cliente (String nome,Integer cpf, ArrayList<Veiculo> listVeiculo){
        this.nome = nome;
        this.cpf = cpf;
        this.listVeiculo =listVeiculo;
        
    }
    
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
     * @return the listVeiculo
     */
    public ArrayList<Veiculo> getListVeiculo() {
        return listVeiculo;
    }

    /**
     * @param listVeiculo the listVeiculo to set
     */
    public void setListVeiculo(ArrayList<Veiculo> listVeiculo) {
        this.listVeiculo = listVeiculo;
    }




    
}
