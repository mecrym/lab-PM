package br.lpm.business;

import java.time.LocalDate;


public class Dataset {
    private Pessoa[] pessoas;
    private int count;
    public static final int MAX_PESSOAS = 100;

    public Dataset() {
        pessoas = new Pessoa[MAX_PESSOAS];
        count = 0;
    }

    public void addPessoa(Pessoa pessoa) {
        if (count < MAX_PESSOAS) {
            pessoas[count] = pessoa;
            count++;
        } else {
            System.out.println("Dataset cheio! Não é possível adicionar mais pessoas.");
        }
    }

    public void removePessoa(Pessoa pessoa) {
        for (int i = 0; i < count; i++) {
            if (pessoas[i].equals(pessoa)) {
                shiftLeft(i);
                count--;
                break;
            }
        }
    }

    public void removePessoaByName(String nome) {
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
                shiftLeft(i);
                count--;
                break;
            }
        }
    }

    public Pessoa getPessoaByName(String nome) {
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
                return pessoas[i];
            }
        }
        return null;
    }

    public Pessoa[] getAll() {
        Pessoa[] result = new Pessoa[count];
        System.arraycopy(pessoas, 0, result, 0, count);
        return result;
    }

    public void removeAll() {
        for (int i = 0; i < count; i++) {
            pessoas[i] = null;
        }
        count = 0;
    }

    public void replacePessoa(Pessoa oldPessoa, Pessoa newPessoa) {
        for (int i = 0; i < count; i++) {
            if (pessoas[i].equals(oldPessoa)) {
                pessoas[i] = newPessoa;
                break;
            }
        }
    }

    public int size() {
        return count;
    }

    public float maxAltura() {
        float max = 0;
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getAltura() > max) {
                max = pessoas[i].getAltura();
            }
        }
        return max;
    }

    public float minAltura() {
        float min = Float.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getAltura() < min) {
                min = pessoas[i].getAltura();
            }
        }
        return min;
    }

    public float avgAltura() {
        float total = 0;
        for (int i = 0; i < count; i++) {
            total += pessoas[i].getAltura();
        }
        return count == 0 ? 0 : total / count;
    }

    public float maxPeso() {
        float max = 0;
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getPeso() > max) {
                max = pessoas[i].getPeso();
            }
        }
        return max;
    }

    public float minPeso() {
        float min = Float.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getPeso() < min) {
                min = pessoas[i].getPeso();
            }
        }
        return min;
    }

    public float avgPeso() {
        float total = 0;
        for (int i = 0; i < count; i++) {
            total += pessoas[i].getPeso();
        }
        return count == 0 ? 0 : total / count;
    }

    public float percentAdult() {
        int adultCount = 0;
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getDataNascimento().isBefore(LocalDate.now().minusYears(18))) {
                adultCount++;
            }
        }
        return count == 0 ? 0 : (float) adultCount / count * 100;
    }

    public float percentEstadoCivil(EstadoCivil estadoCivil) {
        int matchingCount = 0;
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getEstadoCivil() == estadoCivil) {
                matchingCount++;
            }
        }
        return count == 0 ? 0 : (float) matchingCount / count * 100;
    }

    public EstadoCivil modeEstadoCivil() {
        int[] counts = new int[EstadoCivil.values().length];
        for (int i = 0; i < count; i++) {
            counts[pessoas[i].getEstadoCivil().ordinal()]++;
        }
        int maxIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > counts[maxIndex]) {
                maxIndex = i;
            }
        }
        return EstadoCivil.values()[maxIndex];
    }

    public float percentEscolaridade(Escolaridade escolaridade) {
        int matchingCount = 0;
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getEscolaridade() == escolaridade) {
                matchingCount++;
            }
        }
        return count == 0 ? 0 : (float) matchingCount / count * 100;
    }

    public Escolaridade modeEscolaridade() {
        int[] counts = new int[Escolaridade.values().length];
        for (int i = 0; i < count; i++) {
            counts[pessoas[i].getEscolaridade().ordinal()]++;
        }
        int maxIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > counts[maxIndex]) {
                maxIndex = i;
            }
        }
        return Escolaridade.values()[maxIndex];
    }

    public float percentMoradia(Moradia moradia) {
        int matchingCount = 0;
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getMoradia() == moradia) {
                matchingCount++;
            }
        }
        return count == 0 ? 0 : (float) matchingCount / count * 100;
    }

    public Moradia modeMoradia() {
        int[] counts = new int[Moradia.values().length];
        for (int i = 0; i < count; i++) {
            counts[pessoas[i].getMoradia().ordinal()]++;
        }
        int maxIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > counts[maxIndex]) {
                maxIndex = i;
            }
        }
        return Moradia.values()[maxIndex];
    }

    public float percentFeliz() {
        int happyCount = 0;
        for (int i = 0; i < count; i++) {
            if (pessoas[i].isFeliz()) {
                happyCount++;
            }
        }
        return count == 0 ? 0 : (float) happyCount / count * 100;
    }

    private void shiftLeft(int index) {
        for (int i = index; i < count - 1; i++) {
            pessoas[i] = pessoas[i + 1];
        }
        pessoas[count - 1] = null;
    }
}
