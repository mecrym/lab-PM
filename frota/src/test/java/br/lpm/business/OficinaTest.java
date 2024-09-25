package br.lpm.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OficinaTest {

    public static Oficina oficina = new Oficina("Shulambs", "Rua Shulambs, 0");

    @Test
    void testAddVeiculoToManutencao() {
        Veiculo veiculo = new Veiculo("Shulambs", 2024, "A32J4B", 19999);
        int numManutencoes = oficina.getNumManutencoes();
        oficina.addVeiculoToManutencao(veiculo);
        int expectedNumManutencoes = numManutencoes + 1;
        assertEquals(expectedNumManutencoes, oficina.getNumManutencoes(), "Adicionando novo veículo em manutenção.");
        assertEquals(Estado.MANUTENCAO, veiculo.getEstado(), "Estado do veículo deve estar em MANUTENCAO.");

        oficina.addVeiculoToManutencao(veiculo);
        assertEquals(expectedNumManutencoes, oficina.getNumManutencoes(), "Veículo já está em manutenção.");
    }

    @Test
    void testGetLastManutencaoFromVeiculo() {
        Veiculo veiculo = new Veiculo("Shulambs", 2024, "A32J4B", 19999);

        assertNull(oficina.getLastManutencaoFromVeiculo(veiculo), "Veículo ainda não possui manutenção.");

        oficina.addVeiculoToManutencao(veiculo);

        assertEquals(veiculo, oficina.getLastManutencaoFromVeiculo(veiculo).getVeiculo(),
                "Última manutenção do veículo está correta.");
    }

    @Test
    void testRemoveVeiculoFromManutencao() {
        Veiculo veiculo = new Veiculo("Shulambs", 2024, "A32J4B", 19999);

        oficina.addVeiculoToManutencao(veiculo);

        assertEquals(Estado.MANUTENCAO, veiculo.getEstado(), "O veículo deve estar em MANUTENCAO.");

        oficina.removeVeiculoFromManutencao(veiculo);

        assertEquals(Estado.TRANSITO, veiculo.getEstado(), "O veículo deve estar de volta ao estado TRANSITO.");
    }
}
