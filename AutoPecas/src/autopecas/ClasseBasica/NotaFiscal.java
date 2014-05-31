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
public class NotaFiscal {
 
    private Integer codigoNf;
    private Funcionario funcionario;
    private Produto produto;
    private Cliente cliente;

    /**
     * @return the codigoNf
     */
    public Integer getCodigoNf() {
        return codigoNf;
    }

    /**
     * @param codigoNf the codigoNf to set
     */
    public void setCodigoNf(Integer codigoNf) {
        this.codigoNf = codigoNf;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
