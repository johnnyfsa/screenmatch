package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exceptions.YearConversionException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch
{
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual Título deseja buscar?");
        var title = in.nextLine();
        title.replace(" ","+");

        String address = "http://www.omdbapi.com/?t=" + title +"&apikey=f6243ad3";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb myOmdbTitle = gson.fromJson(json, TituloOmdb.class);
        System.out.println(myOmdbTitle);
        try {
            Titulo meuTitulo = new Titulo(myOmdbTitle);
            System.out.println(meuTitulo);
        }
        catch (YearConversionException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
