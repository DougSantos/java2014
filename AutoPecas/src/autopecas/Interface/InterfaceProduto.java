/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.Interface;

import autopecas.ClasseBasica.Produto;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public interface InterfaceProduto {
    
    public void cadastrar(Produto p);
    public void atualizar(Produto p);
    public void remover (Produto p);
    ArrayList<Produto> Listar();
    ArrayList<Produto> Consultar();
    
}
