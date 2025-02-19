package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class pricipal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuraçaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuraçaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        meuFilme.avalia(2);
        System.out.println("Total de avaliaçao; " + meuFilme.getTotalDeAvaliaçao());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("lost", 2000 );
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEspisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuraçaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuraçaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.getTotalVisualizacoes();
        filtro.filtra(episodio);

        var filmeDoRodrigo = new Filme("Pantera", 2022);
        filmeDoRodrigo.setDuraçaoEmMinutos(200);
        filmeDoRodrigo.avalia(10);

        ArrayList<Filme> listDeFilmes = new ArrayList<>();
        listDeFilmes.add(filmeDoRodrigo);
        listDeFilmes.add(meuFilme);
        listDeFilmes.add(outroFilme);
        System.out.println("Tamanho d lista" + listDeFilmes.size());
        System.out.println("Primeiro filme " + listDeFilmes.get(0).getNome());
        System.out.println(listDeFilmes);
        System.out.println("toString do filme " + listDeFilmes.get(0).toString());



    }
}
