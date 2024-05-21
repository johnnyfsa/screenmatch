package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exceptions.YearConversionException;
import com.google.gson.annotations.SerializedName;

public class Titulo  implements Comparable<Titulo>{

    private double somaAvaliacoes;
    private int totalDeVavaliacoes;
    private int duracaoEmMinutos;
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;

    public Titulo(int anoDeLancamento, String nome) {
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }

    public Titulo(TituloOmdb myOmdbTitle) {
        this.nome = myOmdbTitle.title();
        if(myOmdbTitle.year().length()>4)
        {
            throw new YearConversionException("Deu ruim na hora de converter o ano do título");
        }
        this.anoDeLancamento = Integer.valueOf(myOmdbTitle.year());
        var str = myOmdbTitle.runtime();
        str = str.substring(0,str.length()-4);
        this.duracaoEmMinutos = Integer.valueOf(str);
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public int getTotalDeVavaliacoes() {
        return totalDeVavaliacoes;
    }

    public void exibirFichaTécnica()
    {
        System.out.println(nome);
        System.out.println(anoDeLancamento);
    }

    public void avaliar(double nota)
    {
        somaAvaliacoes+=nota;
        totalDeVavaliacoes++;
    }

    public double calcularMedia()
    {
        return somaAvaliacoes/totalDeVavaliacoes;
    }

    @Override
    public String toString() {
        return this.getNome() + "(" + getAnoDeLancamento() + ")"
                + "Duration: " + getDuracaoEmMinutos();
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
