package br.lpm.business;

public class Mecanico extends Motorista {
    private Oficina oficina;

    public Mecanico(String nome, Oficina oficina) {
        super(nome);  
        this.oficina = oficina;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    @Override
    public String toString() {
        return "Mecânico: " + getNome() + " (ID: " + getId() + "), Oficina: " + oficina.getNome();
    }
}
