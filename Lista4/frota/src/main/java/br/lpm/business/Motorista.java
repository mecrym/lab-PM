package br.lpm.business;

public class Motorista {
    private int numero_de_identificacao;
    private String nome;
    private Veiculo veiculo;

    // Um motorista pode estar associado a vários veículos, mas não ao mesmo tempo.
    public int getNumero_de_identificacao() {
        return numero_de_identificacao;
    }
    
    public void setNumero_de_identificacao(int numero_de_identificacao) {
        this.numero_de_identificacao = numero_de_identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
