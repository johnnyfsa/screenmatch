package br.com.alura.screenmatch.modelos;

public class Titulo {
    private double somaAvaliacoes;
    private int totalDeVavaliacoes;
    private int duracaoEmMinutos;
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;

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
}
