import business.*; // importa todas as classes do pacote business
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class App {
    public static Pessoa[] cadastro = new Pessoa[100];
    public static int qtdPessoas = 0;

    public static void main(String[] args) {
        // Dados de entrada simulados
        String[] nomes = {"Ana Maria", "João Silva"};
        String[] datasNascimento = {"12/05/1990", "20/11/1985"};
        int[] generos = {1, 2}; // 1 para FEMININO, 2 para MASCULINO
        float[] alturas = {1.65f, 1.80f};
        float[] pesos = {60.0f, 85.0f};
        float[] rendas = {3000.50f, 4500.75f};
        String[] naturalidades = {"São Paulo", "Rio de Janeiro"};
        int[] hobbies = {1, 3}; // 1 para ARTE, 3 para CINEMA
        int[] estadosCivis = {1, 2}; // 1 para SOLTEiro, 2 para CASADO
        int[] escolaridades = {4, 5}; // 4 para SUPERIOR, 5 para POS_GRADUACAO
        boolean[] feliz = {true, false};
        int[] moradias = {1, 3}; // 1 para COM_FAMILIA, 3 para CASA_PROPRIA

        // Formatação da data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Simulação do cadastro das pessoas
        for (int i = 0; i < nomes.length; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nomes[i]);

            try {
                pessoa.setDataNascimento(LocalDate.parse(datasNascimento[i], formatter));
            } catch (DateTimeParseException e) {
                System.out.println("Data de nascimento inválida para " + nomes[i]);
                continue;
            }

            pessoa.setGenero(Genero.values()[generos[i] - 1]);
            pessoa.setAltura(alturas[i]);
            pessoa.setPeso(pesos[i]);
            pessoa.setRenda(rendas[i]);
            pessoa.setNaturalidade(naturalidades[i]);
            pessoa.setHobby(Hobby.values()[hobbies[i] - 1]);
            pessoa.setEstadoCivil(EstadoCivil.values()[estadosCivis[i] - 1]);
            pessoa.setEscolaridade(Escolaridade.values()[escolaridades[i] - 1]);
            pessoa.setFeliz(feliz[i]);
            pessoa.setMoradia(Moradia.values()[moradias[i] - 1]);

            cadastro[qtdPessoas++] = pessoa; // Adiciona a pessoa ao vetor
            System.out.println("Pessoa " + nomes[i] + " cadastrada com sucesso!");
        }

        // Removemos o menu e o loop do-while, portanto não há mais necessidade da interação
        System.out.println("Todas as pessoas foram cadastradas automaticamente.");
    }
}
