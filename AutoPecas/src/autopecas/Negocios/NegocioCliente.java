/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.Negocios;

import autopecas.ClasseBasica.Cliente;
import autopecas.Dados.DadosCliente;
import autopecas.Exception.ClienteException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public class NegocioCliente {
    
    
    ArrayList<Cliente> listacliente;
    DadosCliente dados;

    
    public NegocioCliente (){
        listacliente = new ArrayList<>();
        dados = new DadosCliente();
    }


public void RegraCadrasto(Cliente c) throws Exception,SQLException,ClienteException{

        if(c.getCpf()== null){
            throw new Exception(" O campo nao pode estar Nula");
            
        }else if (c.getCpf() < 0){
            throw  new Exception(" O cpf não pode ser menor que zero");
        } 
        
        if (c.getNome() == null){
            
            throw new Exception(" O campo Nome Não pode estar Nula");
            
        }else if (c.getNome().trim().equals("")==true){
            
            throw new Exception(" O campo  nome não pode estar vazio");
            
        }
            
        }
    
    
}
