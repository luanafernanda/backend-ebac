package com.grupo_pessoas_teste;

import com.grupo_pessoas.Pessoa;
import com.grupo_pessoas.Pessoas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PessoasTest {

    @Test
    public void testListaMulheres() {
        Pessoas pessoas = new Pessoas();

        pessoas.adicionarPessoa(new Pessoa("Ana", "F"));
        pessoas.adicionarPessoa(new Pessoa("Maria", "F"));
        pessoas.adicionarPessoa(new Pessoa("João", "M"));

        List<Pessoa> fem = pessoas.getFem();

        for (Pessoa pessoa : fem) {
            Assertions.assertEquals("F", pessoa.getSexo(), "Há uma pessoa do sexo masculino na lista fem!");
        }
    }
}
