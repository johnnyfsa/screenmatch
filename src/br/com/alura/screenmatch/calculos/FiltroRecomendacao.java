package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel clas)
    {
        if(clas.getClassificacao()>=4)
        {
            System.out.println("Top");
        }
        else if (clas.getClassificacao()>=2)
        {
            System.out.println("Mid");
        }
        else
        {
            System.out.println("Bot");
        }
    }
}
