/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.Interface;

import autopecas.ClasseBasica.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public interface InterfaceFornecedor {
    
    public void cadastrar(Fornecedor f);
    public void atualizar(Fornecedor f);
    public void remover (Fornecedor f);
    ArrayList <Fornecedor> Listar();
    ArrayList <Fornecedor > Consultar();
    
}
