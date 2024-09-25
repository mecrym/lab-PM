package main;

import java.time.LocalDate;

import main.java.business.*;

public class App {

    public static void main(String[] args) {
        // Simulando cadastro de algumas pessoas
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Ana Maria");
        pessoa1.setDataNascimento(LocalDate.of(1990, 5, 12));
        pessoa1.setGenero(Genero.FEMININO);
        pessoa1.setAltura(1.65f);
        pessoa1.setPeso(60.0f);
        pessoa1.setRenda(3000.50f);
        pessoa1.setNaturalidade("Sao Paulo");
        pessoa1.setHobby(Hobby.ARTE);
        pessoa1.setEstadoCivil(EstadoCivil.SOLTEIRO);
        pessoa1.setEscolaridade(Escolaridade.SUPERIOR);
        pessoa1.setFeliz(true);
        pessoa1.setMoradia(Moradia.COM_FAMILIA);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Joao Silva");
        pessoa2.setDataNascimento(LocalDate.of(1985, 11, 20));
        pessoa2.setGenero(Genero.MASCULINO);
        pessoa2.setAltura(1.80f);
        pessoa2.setPeso(85.0f);
        pessoa2.setRenda(4500.75f);
        pessoa2.setNaturalidade("Rio de Janeiro");
        pessoa2.setHobby(Hobby.CINEMA);
        pessoa2.setEstadoCivil(EstadoCivil.CASADO);
        pessoa2.setEscolaridade(Escolaridade.POS_GRADUACAO);
        pessoa2.setFeliz(false);
        pessoa2.setMoradia(Moradia.CASA_PROPRIA);

        // Impressão dos dados das pessoas cadastradas
        printPessoa(pessoa1);
        printPessoa(pessoa2);
    }

    // Método para imprimir dados de uma pessoa
    private static void printPessoa(Pessoa pessoa) {
        System.out.println("Dados da pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Gênero: " + pessoa.getGenero());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Renda: " + pessoa.getRenda());
        System.out.println("Naturalidade: " + pessoa.getNaturalidade());
        System.out.println("Hobby: " + pessoa.getHobby());
        System.out.println("Estado Civil: " + pessoa.getEstadoCivil());
        System.out.println("Escolaridade: " + pessoa.getEscolaridade());
        System.out.println("Feliz: " + pessoa.isFeliz());
        System.out.println("Moradia: " + pessoa.getMoradia());
        System.out.println();
    }
}
