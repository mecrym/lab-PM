package br.lpm.main;

import br.lpm.business.*;

public class Main {

    public static void main(String[] args) {
        Frota frota = new Frota();

        Oficina oficina1 = new Oficina("Oficina Central", "Rua Principal, 123");
        Oficina oficina2 = new Oficina("Oficina Norte", "Avenida Norte, 456");

        frota.addOficina(oficina1);
        frota.addOficina(oficina2);

        Motorista motorista1 = new Motorista("Carlos");
        Motorista motorista2 = new Motorista("Maria");

        frota.addMotorista(motorista1);
        frota.addMotorista(motorista2);

        Mecanico mecanico1 = new Mecanico("João", oficina1);
        Mecanico mecanico2 = new Mecanico("Pedro", oficina2);

        frota.addMecanico(mecanico1);
        frota.addMecanico(mecanico2);

        Veiculo veiculo1 = new Veiculo("Caminhão", 2015, "ABC-1234", 10000);
        Veiculo veiculo2 = new Veiculo("Ônibus", 2018, "DEF-5678", 20000);

        frota.addVeiculo(veiculo1);
        frota.addVeiculo(veiculo2);

        frota.newRota(motorista1, veiculo1, "São Paulo", "Rio de Janeiro");

        System.out.println(frota.toString());

        System.out.println(oficina1.toString());
        System.out.println(oficina2.toString());

        for (Mecanico mecanico : frota.getAllMecanicos()) {
            if (mecanico != null) {
                System.out.println(mecanico);
            }
        }
    }
}
