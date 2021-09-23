
package br.edu.ifpb.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wendel
 */
public class Banco {
    
    private List<Cliente> clientes = new ArrayList<>();

    public Banco () {
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void adicionarCliente(Cliente cliente) {
        
        this.clientes.add(cliente);
        
    }
    
    public void removerCliente(Cliente cliente) {
        
        this.clientes.remove(cliente);
        
    }
    
    public List<Cliente> todosOsClientes () {
        
        return this.clientes;
        
    }
    
    
    public void atualizarCliente (Cliente cliente) {
        
        int index = -1;
        
        for ( Cliente c: clientes ) {
            
            if (c.getCPF().equals(cliente.getCPF())){
                index = clientes.indexOf(c);
            }
            
        }
        
        if ( index != -1 ) {
            this.clientes.set(index, cliente);
        }
        
    }
    
    
    
    
    
}
