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
public class Fornecedor {
    private String nomeFornecedor;
    private Integer codigoFornecedor;
    private Produto produto;

    public Fornecedor(String nomeFornecedor, Integer codigoFornecedor, Produto produto){
        this.codigoFornecedor =codigoFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.produto=produto;
        
    }
    
    /**
     * @return the nomeFornecedor
     */
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * @param nomeFornecedor the nomeFornecedor to set
     */
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    /**
     * @return the codigoFornecedor
     */
    public Integer getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * @param codigoFornecedor the codigoFornecedor to set
     */
    public void setCodigoFornecedor(Integer codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
