package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.*;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void inclui(Titulo t)
    {
        tempoTotal += t.getDuracaoEmMinutos();
    }

}
