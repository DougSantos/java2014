/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.Interface;

import autopecas.ClasseBasica.Fornecedor;
import autopecas.Exception.FornecedorExeception;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public interface InterfaceFornecedor {
    
    public void cadastrar(Fornecedor f) throws SQLException,Exception,FornecedorExeception;
    public void atualizar(Fornecedor f)throws  SQLException,Exception,FornecedorExeception;
    public void remover (Fornecedor f) throws  SQLException,Exception,FornecedorExeception;
    ArrayList <Fornecedor> Listar() throws  SQLException,Exception,FornecedorExeception;
    ArrayList <Fornecedor > Consultar(Integer codigoFornecedor)  throws SQLException,Exception,FornecedorExeception;
    
}
