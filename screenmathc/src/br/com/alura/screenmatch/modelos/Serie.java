package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int espisodioPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEspisodioPorTemporada() {
        return espisodioPorTemporada;
    }

    public void setEspisodioPorTemporada(int espisodioPorTemporada) {
        this.espisodioPorTemporada = espisodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuraçaoEmMinutos() {
        return temporadas * espisodioPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
