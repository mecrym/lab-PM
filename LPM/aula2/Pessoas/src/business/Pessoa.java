package business;

import java.time.LocalDate;

public class Pessoa {
  private String nome;
  private LocalDate dataNascimento;
  private Genero genero;
  private float altura;
  private float peso;
  private float renda;
  private String naturalidade;
  private Hobby hobby;
  private EstadoCivil estadoCivil;
  private Escolaridade escolaridade;
  private boolean feliz;
  private Moradia moradia;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    boolean nomeValido = true;

    for (int i = 0; i < nome.length(); i++) {
        char c = nome.charAt(i);
        
        if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ')) {
            nomeValido = false;
            break;
        }
    }

    if (nomeValido) {
        this.nome = nome;
    } else {
        throw new IllegalArgumentException("O nome deve conter apenas letras e espaços.");
    }
}

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    if (dataNascimento.isBefore(LocalDate.now())) {
      this.dataNascimento = dataNascimento;
    } else {
      System.out.println("Data de nascimento inválida");
    }
  }
  public Genero getGenero() {
    return genero;
  }

  public void setGenero(Genero genero) {
    this.genero = genero;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    if (altura > 0 && altura < 2.6) {
      this.altura = altura;
    } else {
      System.out.println("Altura inválida");
    }
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    if (peso > 0 && peso < 600) {
      this.peso = peso;
    } else {
      System.out.println("Peso inválido");
    }
  }

  public float getRenda() {
    return renda;
  }

  public void setRenda(float renda) {
    if (renda >= 0) {
      this.renda = renda;
    } else {
      System.out.println("Renda inválida");
    }
  }

  public String getNaturalidade() {
    return naturalidade;
  }

  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }

  public Hobby getHobby() {
    return hobby;
  }

  public void setHobby(Hobby hobby) {
    this.hobby = hobby;
  }

  public EstadoCivil getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(EstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public Escolaridade getEscolaridade() {
    return escolaridade;
  }

  public void setEscolaridade(Escolaridade escolaridade) {
    this.escolaridade = escolaridade;
  }

  public boolean isFeliz() {
    return feliz;
  }

  public void setFeliz(boolean feliz) {
    this.feliz = feliz;
  }

  public Moradia getMoradia() {
    return moradia;
  }

  public void setMoradia(Moradia moradia) {
    this.moradia = moradia;
  }

}
