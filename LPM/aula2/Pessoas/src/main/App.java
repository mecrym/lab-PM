import business.*; // importa todas as classes do pacote business
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
//import java.util.Scanner;
import java.util.Scanner;

public class App {
    public static Pessoa[] cadastro = new Pessoa[100];
    public static int qtdPessoas = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a linha após a leitura do número

            if (opcao == 1) {
                Pessoa pessoa = new Pessoa();

                System.out.print("Digite o nome: ");
                pessoa.setNome(scanner.nextLine());

                // Formatando e lendo a data de nascimento
                System.out.print("Digite a data de nascimento como dd/MM/aaaa: ");
                String dataStr = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                try {
                    pessoa.setDataNascimento(LocalDate.parse(dataStr, formatter));
                } catch (DateTimeParseException e) {
                    System.out.println("Data de nascimento inválida!");
                    continue; // Volta para o início do loop
                }

                System.out.println("Gênero, opções:  1. FEMININO, 2. MASCULINO, 3. NAO_BINARIO, 4. NAO_RESPONDER");
                pessoa.setGenero(Genero.values()[scanner.nextInt() - 1]);

                System.out.print("Digite a altura: ");
                pessoa.setAltura(scanner.nextFloat());


                System.out.print("Digite o peso: ");
                pessoa.setPeso(scanner.nextInt());

                System.out.print("Digite a renda: ");
                pessoa.setRenda(scanner.nextFloat());

                System.out.print("Digite a naturalidade: ");
                scanner.nextLine(); // Consumir a linha
                pessoa.setNaturalidade(scanner.nextLine());

                System.out.println("Hobby, opções: 1.ARTE, 2.ESPORTE, 3.CINEMA, 4.LIVRO, 5.MÚSICA, 6.CULINÁRIA, 7.GAME, 8.NENHUM");
                pessoa.setHobby(Hobby.values()[scanner.nextInt() - 1]);

                System.out.println("Estado Civil, opções: 1.SOLTEIRO, 2.CASADO, 3.VIUVO, 4.SEPARADO, 5.DIVORCIADO");
                pessoa.setEstadoCivil(EstadoCivil.values()[scanner.nextInt() - 1]);

                System.out.println("Escolaridade, opções: 1.NENHUMA, 2.FUNDAMENTAL, 3.MEDIO, 4.SUPERIOR, 5.POS_GRADUACAO");
                pessoa.setEscolaridade(Escolaridade.values()[scanner.nextInt() - 1]);

                System.out.print("Feliz? (true/false): ");
                pessoa.setFeliz(scanner.nextBoolean());
                scanner.nextLine();  // Consumir a linha

                System.out.println("Moradia, opções: 1.COM_FAMILIA, 2.ALUGUEL, 3.CASA_PROPRIA");
                pessoa.setMoradia(Moradia.values()[scanner.nextInt() - 1]);

                cadastro[qtdPessoas++] = pessoa; // Adiciona a pessoa ao vetor
                System.out.println("Pessoa cadastrada com sucesso!");

            } else if (opcao == 2) {
                System.out.println("Saindo...");
                break; // Sair do loop
            }

        } while (true);

        scanner.close();
    }
}
