package br.lpm.main;

import br.lpm.business.Dataset;
import br.lpm.business.Pessoa;
import br.lpm.business.Genero;
import br.lpm.business.Hobby;
import br.lpm.business.EstadoCivil;
import br.lpm.business.Escolaridade;
import br.lpm.business.Moradia;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class Main {
    private static Dataset dataset = new Dataset();

    public static void main(String[] args) {
        // Inicializar o dataset com as pessoas criadas no código original
        inicializarDataset();

        // Impressão dos dados das pessoas cadastradas
        for (Pessoa pessoa : dataset.getAll()) {
            printPessoa(pessoa);
        }

        // Criação e exibição dos gráficos
        criarGraficos();
    }

    private static void inicializarDataset() {
        // Adiciona pessoas ao dataset conforme o exemplo fornecido
        dataset.addPessoa(criarPessoa("Ana Maria", LocalDate.of(1990, 5, 12), Genero.FEMININO, 1.65f, 60.0f, 3000.50f, "Sao Paulo", Hobby.ARTE, EstadoCivil.SOLTEIRO, Escolaridade.SUPERIOR, true, Moradia.COM_FAMILIA));
        dataset.addPessoa(criarPessoa("Joao Silva", LocalDate.of(1985, 11, 20), Genero.MASCULINO, 1.80f, 85.0f, 4500.75f, "Rio de Janeiro", Hobby.CINEMA, EstadoCivil.CASADO, Escolaridade.POS_GRADUACAO, false, Moradia.CASA_PROPRIA));
    }

    private static Pessoa criarPessoa(String nome, LocalDate dataNascimento, Genero genero, float altura, float peso, float renda, String naturalidade, Hobby hobby, EstadoCivil estadoCivil, Escolaridade escolaridade, boolean feliz, Moradia moradia) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setDataNascimento(dataNascimento);
        pessoa.setGenero(genero);
        pessoa.setAltura(altura);
        pessoa.setPeso(peso);
        pessoa.setRenda(renda);
        pessoa.setNaturalidade(naturalidade);
        pessoa.setHobby(hobby);
        pessoa.setEstadoCivil(estadoCivil);
        pessoa.setEscolaridade(escolaridade);
        pessoa.setFeliz(feliz);
        pessoa.setMoradia(moradia);
        return pessoa;
    }

    private static void criarGraficos() {
        // Criação do gráfico de barras (formação acadêmica)
        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
        for (Escolaridade escolaridade : Escolaridade.values()) {
            barDataset.addValue(dataset.percentEscolaridade(escolaridade), "Escolaridade", escolaridade.name());
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Distribuição de Escolaridade",
                "Escolaridade",
                "Percentual",
                barDataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel barChartPanel = new ChartPanel(barChart);
        barChartPanel.setPreferredSize(new Dimension(800, 600));

        JFrame barFrame = new JFrame();
        barFrame.setTitle("Gráfico de Barras");
        barFrame.setContentPane(barChartPanel);
        barFrame.pack();
        barFrame.setVisible(true);

        // Criação do gráfico de pizza (felicidade)
        DefaultPieDataset<String> pieDataset = new DefaultPieDataset<>();
        pieDataset.setValue("Feliz", dataset.percentFeliz());
        pieDataset.setValue("Não Feliz", 100 - dataset.percentFeliz());

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Distribuição de Felicidade",
                pieDataset,
                true, true, false);

        JFrame pieFrame = new JFrame();
        pieFrame.setTitle("Gráfico de Pizza");
        pieFrame.setContentPane(new ChartPanel(pieChart));
        pieFrame.pack();
        pieFrame.setVisible(true);
    }

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
