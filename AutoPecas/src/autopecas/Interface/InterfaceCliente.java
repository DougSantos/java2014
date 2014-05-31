/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.Interface;

import autopecas.ClasseBasica.Cliente;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public interface InterfaceCliente {
    
    public void cadastrar();
    public void atualizar();
    public void remover ();
    ArrayList<Cliente> Listar();
    ArrayList<Cliente > Consultar();
}
