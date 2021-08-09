package br.com.groovy

import br.com.groovy.abstracts.AnotherClass
import br.com.groovy.interfaces.Process

import static br.com.groovy.Util.*

class ProcessImpl extends AnotherClass implements Process{

    String process(String nome) {
        mostrarNomeOriginal(super.nome)
        mostrarAlgo()
        return new StringBuilder(nome).reverse()
    }

    private mostrarAlgo(){
        println "Algo"
    }

}