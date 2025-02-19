package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

import java.io.Serial;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluindoMoPlano;
    private double somaDasAvaliaçoes;
    private int totalDeAvaliaçao;
    private int duraçaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não conseguir converter o ano " +
                    "porque tem mais de 04 carecteres. ");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duraçaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluindoMoPlano() {
        return incluindoMoPlano;
    }

    public int getDuraçaoEmMinutos() {
        return duraçaoEmMinutos;
    }

    public int getTotalDeAvaliaçao(){
        return totalDeAvaliaçao;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano do Lançamento " + anoDeLancamento);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluindoMoPlano(boolean incluindoMoPlano) {
        this.incluindoMoPlano = incluindoMoPlano;
    }

    public void setDuraçaoEmMinutos(int duraçaoEmMinutos) {
        this.duraçaoEmMinutos = duraçaoEmMinutos;
    }

    public void avalia(double nota){
        somaDasAvaliaçoes += nota;
        totalDeAvaliaçao++;
    }

    public double pegaMedia(){
        return somaDasAvaliaçoes / totalDeAvaliaçao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome='" + nome +
                ", anoDeLancamento = " + anoDeLancamento + "," +
                "duração = " + duraçaoEmMinutos + ")";
    }
}


