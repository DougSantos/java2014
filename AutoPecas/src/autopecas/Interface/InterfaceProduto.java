/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.Interface;

import autopecas.ClasseBasica.Produto;
import autopecas.Exception.ProdutoException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public interface InterfaceProduto {
    
    public void cadastrar(Produto p) throws SQLException,Exception,ProdutoException;
    public void atualizar(Produto p)throws SQLException,Exception,ProdutoException;
    public void remover (Produto p)throws SQLException,Exception,ProdutoException;
    ArrayList<Produto> Listar() throws SQLException,Exception,ProdutoException;
    ArrayList<Produto> Consultar(Integer codigoProduto) throws SQLException,Exception,ProdutoException;
    
}
