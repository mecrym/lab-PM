package br.lpm.business;

public class Oficina {
    private String nome;
    private String endereco;

    private Veiculo veiculo;
    private Estado estado;

    private String dataPrevistaTerminoServico;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Veiculo[] getVeiculosEmManutencao() {
        return veiculo.MANUTENCAO;
    }


}
