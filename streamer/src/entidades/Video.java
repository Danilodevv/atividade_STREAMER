package entidades;

public class Video {

        private String titulo;
        private String diretor;
        private String[] elenco;
        private String genero;
        private String sinopse;
        private int anoLancamento;
        private int classificacaoIndicativa;

        public Video(String titulo, String diretor, String[] elenco, String genero, String sinopse, int anoLancamento, int classificacaoIndicativa) {
            this.titulo = titulo;
            this.diretor = diretor;
            this.elenco = elenco;
            this.genero = genero;
            this.sinopse = sinopse;
            this.anoLancamento = anoLancamento;
            this.classificacaoIndicativa = classificacaoIndicativa;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getDiretor() {
            return diretor;
        }

        public String[] getElenco() {
            return elenco;
        }

        public String getGenero() {
            return genero;
        }

        public String getSinopse() {
            return sinopse;
        }

        public int getAnoLancamento() {
            return anoLancamento;
        }

        public int getClassificacaoIndicativa() {
            return classificacaoIndicativa;
        }
    }


