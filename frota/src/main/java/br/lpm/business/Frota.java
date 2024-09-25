package br.lpm.business;

import java.time.LocalDate;

public class Frota {
    private static final int MAX_VEICULOS = 1000;
    private static final int MAX_ROTAS = 10000;
    private static final int MAX_MOTORISTAS = 500;
    private static final int MAX_MECANICOS = 200;
    private static final int MAX_OFICINAS = 100;

    private Veiculo[] veiculos = new Veiculo[MAX_VEICULOS];
    private Rota[] rotas = new Rota[MAX_ROTAS];
    private Motorista[] motoristas = new Motorista[MAX_MOTORISTAS];
    private Mecanico[] mecanicos = new Mecanico[MAX_MECANICOS];
    private Oficina[] oficinas = new Oficina[MAX_OFICINAS];

    private int numVeiculos = 0;
    private int numRotas = 0;
    private int numMotoristas = 0;
    private int numMecanicos = 0;
    private int numOficinas = 0;

    // Métodos para adicionar veículos, motoristas, mecânicos e oficinas
    public void addVeiculo(Veiculo veiculo) {
        if (numVeiculos < MAX_VEICULOS) {
            veiculos[numVeiculos++] = veiculo;
        }
    }

    public void addMotorista(Motorista motorista) {
        if (numMotoristas < MAX_MOTORISTAS) {
            motoristas[numMotoristas++] = motorista;
        }
    }

    public void addMecanico(Mecanico mecanico) {
        if (numMecanicos < MAX_MECANICOS) {
            mecanicos[numMecanicos++] = mecanico;
        }
    }

    public void addOficina(Oficina oficina) {
        if (numOficinas < MAX_OFICINAS) {
            oficinas[numOficinas++] = oficina;
        }
    }
    public Veiculo[] getAllVeiculos() {
        return veiculos;
    }

    public Motorista[] getAllMotoristas() {
        return motoristas;
    }

    public Mecanico[] getAllMecanicos() {
        return mecanicos;
    }

    public Oficina[] getAllOficinas() {
        return oficinas;
    }

    public void newRota(Motorista motorista, Veiculo veiculo, String origem, String destino) {
        LocalDate today = LocalDate.now();
        if (veiculo.getEstado() == Estado.TRANSITO) {
            for (int i = 0; i < numRotas; i++) {
                if (rotas[i].getVeiculo().equals(veiculo) && rotas[i].getData().equals(today)) {
                    return;
                }
            }
            rotas[numRotas++] = new Rota(veiculo, motorista, origem, destino, today);
        }
    }

    @Override
    public String toString() {
        return "Frota: " + numVeiculos + " veículos, " + numMotoristas + " motoristas, " + numMecanicos + " mecânicos, " + numOficinas + " oficinas.";
    }
}
