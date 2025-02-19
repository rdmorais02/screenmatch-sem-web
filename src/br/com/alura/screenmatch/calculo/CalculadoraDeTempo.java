package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;
  ;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuraçaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuraçaoEmMinutos();
//    }
    public void inclui(Titulo titulo){
        System.out.println("adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuraçaoEmMinutos();
    }
}
