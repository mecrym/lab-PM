package main.resources;

import main.main.Main;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Main tabelaVerdade = new Main();
        tabelaVerdade.i = 10;
        tabelaVerdade.j = 11;

        if(tabelaVerdade.i < tabelaVerdade.j) {
            System.out.println("i < j");
        }
        if(tabelaVerdade.i <= tabelaVerdade.j) {
            System.out.println("i <= j");
        }
        if(tabelaVerdade.i != tabelaVerdade.j) {
            System.out.println("i != j");
        }
        if(tabelaVerdade.i == tabelaVerdade.j) {
            System.out.println("i == j");
        }
        if(tabelaVerdade.i >= tabelaVerdade.j) {
            System.out.println("i >= j");
        }
        if(tabelaVerdade.i > tabelaVerdade.j) {
            System.out.println("i > j");
        }

        tabelaVerdade.b1 = true;
        tabelaVerdade.b2 = false;

        if(tabelaVerdade.b1 & tabelaVerdade.b2) {
            System.out.println("This will not be executed");
        }
        if (!(tabelaVerdade.b1 & tabelaVerdade.b2)) {
            System.out.println("!(b1 && b2) is true");
        }
        if(tabelaVerdade.b1 | tabelaVerdade.b2) {
            System.out.println("b1 || b2 is true");
        }
        if(tabelaVerdade.b1 ^ tabelaVerdade.b2) {
            System.out.println("b1 ^ b2 is true");
        }

    }
}
