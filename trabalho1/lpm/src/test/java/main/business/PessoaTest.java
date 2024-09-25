package test.java.main.business;

import org.junit.jupiter.api.Test;

import main.java.business.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void testSetNomeValido() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ana Maria");
        assertEquals("Ana Maria", pessoa.getNome());
    }

    @Test
    public void testSetNomeInvalido() {
        Pessoa pessoa = new Pessoa();
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setNome("Ana123");
        });
    }

    @Test
    public void testSetDataNascimentoValida() {
        Pessoa pessoa = new Pessoa();
        pessoa.setDataNascimento(LocalDate.of(1990, 5, 12));
        assertEquals(LocalDate.of(1990, 5, 12), pessoa.getDataNascimento());
    }

    @Test
    public void testSetDataNascimentoInvalida() {
        Pessoa pessoa = new Pessoa();
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setDataNascimento(LocalDate.now().plusDays(1));
        });
    }

    @Test
    public void testSetAlturaValida() {
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura(1.75f);
        assertEquals(1.75f, pessoa.getAltura());
    }

    @Test
    public void testSetAlturaInvalida() {
        Pessoa pessoa = new Pessoa();
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setAltura(2.61f);
        });
    }

    @Test
    public void testSetPesoValido() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(70.0f);
        assertEquals(70.0f, pessoa.getPeso());
    }

    @Test
    public void testSetPesoInvalido() {
        Pessoa pessoa = new Pessoa();
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setPeso(601.0f);
        });
    }

    @Test
    public void testSetRendaValida() {
        Pessoa pessoa = new Pessoa();
        pessoa.setRenda(3000.50f);
        assertEquals(3000.50f, pessoa.getRenda());
    }

    @Test
    public void testSetRendaInvalida() {
        Pessoa pessoa = new Pessoa();
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setRenda(-1.0f);
        });
    }

    @Test
    public void testSetNaturalidade() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNaturalidade("São Paulo");
        assertEquals("São Paulo", pessoa.getNaturalidade());
    }

    @Test
    public void testSetHobby() {
        Pessoa pessoa = new Pessoa();
        pessoa.setHobby(Hobby.ESPORTES);
        assertEquals(Hobby.ESPORTES, pessoa.getHobby());
    }

    @Test
    public void testSetEstadoCivil() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstadoCivil(EstadoCivil.SOLTEIRO);
        assertEquals(EstadoCivil.SOLTEIRO, pessoa.getEstadoCivil());
    }

    @Test
    public void testSetEscolaridade() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEscolaridade(Escolaridade.MEDIO);
        assertEquals(Escolaridade.MEDIO, pessoa.getEscolaridade());
    }

    @Test
    public void testSetFeliz() {
        Pessoa pessoa = new Pessoa();
        pessoa.setFeliz(true);
        assertTrue(pessoa.isFeliz());
    }

    @Test
    public void testSetMoradia() {
        Pessoa pessoa = new Pessoa();
        pessoa.setMoradia(Moradia.CASA_PROPRIA);
        assertEquals(Moradia.CASA_PROPRIA, pessoa.getMoradia());
    }
}

