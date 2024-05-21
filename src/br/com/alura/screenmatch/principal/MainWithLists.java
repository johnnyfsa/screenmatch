package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(1970,"O poderoso Chefão");
        meuFilme.avaliar(9);
        Serie lost = new Serie(2000,"Lost");
        Filme outroFilme = new Filme(2024,"Duna pt.2");
        outroFilme.avaliar(10);
        var filmeDoJohnny = new Filme(1999,"FightClub");
        filmeDoJohnny.avaliar(9.8);

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(meuFilme);
        listaDeTitulos.add(lost);
        listaDeTitulos.add(outroFilme);
        listaDeTitulos.add(filmeDoJohnny);

        for (Titulo item:listaDeTitulos)
        {
            System.out.println(item);
            if(item instanceof Filme)
            {
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Nome1");
        buscaPorArtista.add("Alex Turner");

        Collections.sort(buscaPorArtista);
        System.out.println("Lista Ordenada");
        System.out.println(buscaPorArtista);
        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);
        listaDeTitulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por Ano: ");
        System.out.println(listaDeTitulos);
    }
}
