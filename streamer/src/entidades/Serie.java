package entidades;

public class Serie extends Video {
    private int temporadas;

    public Serie(String titulo, String diretor, String[] elenco, String genero, String sinopse, int anoLancamento, int classificacaoIndicativa, int numTemporadas) {
        super(titulo, diretor, elenco, genero, sinopse, anoLancamento, classificacaoIndicativa);
        this.temporadas = temporadas;
    }

    public int getNumTemporadas() {
        return temporadas;
    }
}
