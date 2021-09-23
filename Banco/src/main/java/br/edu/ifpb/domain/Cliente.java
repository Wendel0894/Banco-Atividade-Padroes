
package br.edu.ifpb.domain;

/**
 *
 * @author wendel
 */
public class Cliente {
  
    private String nome;
    private String CPF;
    private String endereco;
    private Conta conta;

    public Cliente(String nome, String CPF, String endereco, Conta conta) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
}
