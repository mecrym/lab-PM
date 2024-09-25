package br.lpm.business;

import java.time.LocalDate;

public class Rota {
    private String origem;
    private String destino;
    private LocalDate dataTransporte;
    private Veiculo veiculo;
    private Estado estado;


    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    
    public void getDataTransporte(LocalDate dataTransporte) {
        this.dataTransporte = dataTransporte;
    }
    
    public void setDataTransporte() {
        boolean transporte = true;
        if(dataTransporte.equals(LocalDate.now())) {
            transporte = true;
        } else {
            transporte = false;
        }

        if(transporte==true){
            
        }
    }   
}
