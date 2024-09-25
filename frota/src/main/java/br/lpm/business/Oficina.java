package br.lpm.business;

import java.time.LocalDate;

public class Oficina {
    private static final int MAX_VEICULOS = 1000;
    private static final int MAX_MECANICOS = 100;

    private String nome;
    private String endereco;
    private Manutencao[] manutencoes = new Manutencao[MAX_VEICULOS];
    private Mecanico[] mecanicos = new Mecanico[MAX_MECANICOS];
    private int numManutencoes = 0;
    private int numMecanicos = 0;

    public Oficina(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void addMecanico(Mecanico mecanico) {
        if (numMecanicos < MAX_MECANICOS) {
            mecanicos[numMecanicos++] = mecanico;
        } else {
            System.out.println("Capacidade máxima de mecânicos atingida.");
        }
    }

    public Mecanico[] getAllMecanicos() {
        return mecanicos;
    }

    public int getNumMecanicos() {
        return numMecanicos;
    }

    public int getNumManutencoes() {
        return numManutencoes;
    }

    public Manutencao[] getAllManutencoes() {
        return manutencoes;
    }

    public Manutencao getLastManutencaoFromVeiculo(Veiculo veiculo) {
        if (numManutencoes == 0) {
            return null;
        } else {
            for (int i = numManutencoes - 1; i >= 0; i++) {
                if (manutencoes[i].getVeiculo().equals(veiculo)) {
                    return manutencoes[i];
                }
            }
            return null;
        }
    }

    public void addVeiculoToManutencao(Veiculo veiculo) {
        if (numManutencoes < MAX_VEICULOS) {
            if (veiculo.getEstado() == Estado.MANUTENCAO) {
                return;
            }
            veiculo.setEstado(Estado.MANUTENCAO);
            manutencoes[numManutencoes++] = new Manutencao(veiculo, LocalDate.now().plusDays(7));
        }
    }

    public void removeVeiculoFromManutencao(Veiculo veiculo) {
        for (int i = 0; i < numManutencoes; i++) {
            if (manutencoes[i].getVeiculo().equals(veiculo)) {
                veiculo.setEstado(Estado.TRANSITO);
                for (int j = i; j < numManutencoes - 1; j++) {
                    manutencoes[j] = manutencoes[j + 1];
                }
                manutencoes[--numManutencoes] = null;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Oficina: " + nome + ", Endereço: " + endereco + ", Mecânicos cadastrados: " + numMecanicos;
    }
}
