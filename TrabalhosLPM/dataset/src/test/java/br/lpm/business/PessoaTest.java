package br.lpm.business;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;  // Adicionado para o teste de data


public class PessoaTest {

    @Test
    public void testPessoaAttributes() {
        // Crie uma instância de Pessoa com valores de teste
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao Silva");
        pessoa.setDataNascimento(LocalDate.of(1990, 5, 20));  // Exemplo de uso da data
        pessoa.setGenero(Genero.MASCULINO);  // Enum Genero
        pessoa.setAltura(1.75f);
        pessoa.setPeso(70.0f);
        pessoa.setRenda(5000.0f);
        pessoa.setNaturalidade("Brasileiro");
        pessoa.setHobby(Hobby.ESPORTE);  // Enum Hobby
        pessoa.setEstadoCivil(EstadoCivil.SOLTEIRO);  // Enum EstadoCivil
        pessoa.setEscolaridade(Escolaridade.SUPERIOR);  // Enum Escolaridade
        pessoa.setFeliz(true);
        pessoa.setMoradia(Moradia.ALUGUEL);  // Enum Moradia

        // Verifique se os métodos get retornam os valores esperados
        assertEquals("Joao Silva", pessoa.getNome());
        assertEquals(LocalDate.of(1990, 5, 20), pessoa.getDataNascimento());
        assertEquals(Genero.MASCULINO, pessoa.getGenero());
        assertEquals(1.75f, pessoa.getAltura());
        assertEquals(70.0f, pessoa.getPeso());
        assertEquals(5000.0f, pessoa.getRenda());
        assertEquals("Brasileiro", pessoa.getNaturalidade());
        assertEquals(Hobby.ESPORTE, pessoa.getHobby());
        assertEquals(EstadoCivil.SOLTEIRO, pessoa.getEstadoCivil());
        assertEquals(Escolaridade.SUPERIOR, pessoa.getEscolaridade());
        assertTrue(pessoa.isFeliz());
        assertEquals(Moradia.ALUGUEL, pessoa.getMoradia());
    }
}
