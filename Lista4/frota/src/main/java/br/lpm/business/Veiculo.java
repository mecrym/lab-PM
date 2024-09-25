package br.lpm.business;

import java.time.LocalDate;

public class Veiculo {
    private String placa;
    private String modelo;
    private float quilometragem;
    private LocalDate ano;

    private Estado estado;
    private Rota rota;
    private Oficina oficina;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        if(quilometragem > 0) {
            this.quilometragem = quilometragem;
        }
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {

        boolean anoValido = true;

        if((ano.isBefore(LocalDate.now()))||(ano.isEqual(LocalDate.now()))) {
            anoValido = true;
        }
        this.ano = ano;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        
    }

}
