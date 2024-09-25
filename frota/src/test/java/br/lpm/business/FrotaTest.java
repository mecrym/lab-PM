package br.lpm.business;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FrotaTest {
    private Frota frota;
    private Oficina oficina;
    private Mecanico mecanico;
    private Motorista motorista;

    @BeforeEach
    public void setUp() {
        frota = new Frota();
        oficina = new Oficina("Oficina Central", "Rua Principal");
        mecanico = new Mecanico("João", oficina);
        motorista = new Motorista("Carlos");
    }

    @Test
    public void testAddMecanico() {
        frota.addMecanico(mecanico);
        assertEquals(1, getNonNullCount(frota.getAllMecanicos()));
    }

    @Test
    public void testMecanicoAssociadoOficina() {
        assertEquals("Oficina Central", mecanico.getOficina().getNome());
    }

    @Test
    public void testAddMotorista() {
        frota.addMotorista(motorista);
        assertEquals(1, getNonNullCount(frota.getAllMotoristas()));
    }

    private int getNonNullCount(Object[] array) {
        int count = 0;
        for (Object obj : array) {
            if (obj != null) {
                count++;
            }
        }
        return count;
    }
}
