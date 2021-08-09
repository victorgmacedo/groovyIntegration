package br.com.groovy.abstracts;

import br.com.groovy.interfaces.Process;

public abstract class AnotherClass implements Process {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
