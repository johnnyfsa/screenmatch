public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalDeVavaliacoes;
    int duracaoEmMinutos;

    void exibirFichaTécnica()
    {
        System.out.println(nome);
        System.out.println(anoDeLancamento);
    }

    void avaliar(double nota)
    {
        somaAvaliacoes+=nota;
        totalDeVavaliacoes++;
    }

    double calcularMedia()
    {
        return somaAvaliacoes/totalDeVavaliacoes;
    }

}
