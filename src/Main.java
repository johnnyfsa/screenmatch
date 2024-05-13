//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.exibirFichaTécnica();

        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);
        System.out.println(meuFilme.somaAvaliacoes);
        System.out.println(meuFilme.totalDeVavaliacoes);
        System.out.println(meuFilme.calcularMedia());
    }
}