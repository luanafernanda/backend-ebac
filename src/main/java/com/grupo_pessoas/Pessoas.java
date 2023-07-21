package com.grupo_pessoas;

import com.grupo_pessoas.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoas {
    private List<Pessoa> fem = new ArrayList<>();
    private List<Pessoa> masc = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa) {
        if (pessoa.getSexo().equalsIgnoreCase("F")) {
            fem.add(pessoa);
        } else if (pessoa.getSexo().equalsIgnoreCase("M")) {
            masc.add(pessoa);
        } else {
            throw new IllegalArgumentException("Sexo inválido! Use 'F' para feminino ou 'M' para masculino.");
        }
    }

    public List<Pessoa> getFem() {
        return fem;
    }
}
