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
public class Produto {
    
    private Integer codigoProduto;
    private String nomeProduto;
    private float valor;

    
    public Produto (String nomeProduto,Integer codigoProduto,float valor){
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        
    }
    
    
    /**
     * @return the codigoProduto
     */
    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * @param codigoProduto the codigoProduto to set
     */
    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }


}
