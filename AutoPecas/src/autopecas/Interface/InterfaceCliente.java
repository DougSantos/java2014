/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.Interface;

import autopecas.ClasseBasica.Cliente;
import autopecas.Exception.ClienteException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public interface InterfaceCliente {
    
    public void cadastrar() throws SQLException,Exception,ClienteException;
    public void atualizar() throws SQLException,Exception,ClienteException;
    public void remover ()throws SQLException,Exception,ClienteException;
    ArrayList<Cliente> Listar() throws SQLException,Exception,ClienteException;
    ArrayList<Cliente > Consultar(Integer cpf) throws SQLException,Exception,ClienteException;
}
