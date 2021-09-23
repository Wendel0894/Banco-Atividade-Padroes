
package br.edu.ifpb.main;

import br.edu.ifpb.domain.Banco;
import br.edu.ifpb.domain.Cliente;
import br.edu.ifpb.domain.Conta;
import java.util.ArrayList;

/**
 *
 * @author wendel
 */
public class Main {
    
    public static void main(String[] args) {
        
        Banco banco = new Banco();
        
        Conta conta = new Conta("1", 2000);
        
        Cliente cliente = new Cliente("Wendel", "123.456.789-01", "Sousa PB", conta);
        
        banco.adicionarCliente(cliente);
        
        
        for ( Cliente c : banco.todosOsClientes() ) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("CPF: " + c.getCPF());
            System.out.println("Endereço: " + c.getEndereco());
            System.out.println("Numero da conta: " + c.getConta().getNumero());
            System.out.println("Saldo da conta: " + c.getConta().getSaldo());
        }
        
    }
    
}
