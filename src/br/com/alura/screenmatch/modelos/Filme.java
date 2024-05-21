package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements  Classificavel{

    private String Diretor;

    public Filme(int anoDeLancamento, String nome) {
        super(anoDeLancamento, nome);
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) calcularMedia()/2;
    }

}
