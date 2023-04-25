package app;

import entidades.Filme;
import entidades.Usuario;

public class App {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("fulano da Silva", "fulano.silva@gmail.com", "senha123");

        Filme filme1 = new Filme("O Poderoso Chefão", "Francis Ford Coppola", "Marlon Brando, Al Pacino, James Caan", "Drama", "Don Vito Corleone é o chefe de uma família mafiosa que luta para manter seu poder em Nova York.", 1972, 18);

        Usuario usuario2 = new Usuario("Sicrano da Costa","sicrano.c@hotmail.com","sicranodasmeninas");

        Filme filme2= new Filme("Senhor dos Anéis","Peter Jackson","Elijah Wood, Viggo Mortensen, Sean Astin, Dominic Monaghan, Orlando Bloom, Ian McKellen, Sean Bean, Andy Serkis, John Rhys-Davies", "Fantasia","Em uma terra fantástica e única, um hobbit recebe de presente de seu tio um anel mágico e maligno que precisa ser destruído antes que caia nas mãos do mal. Para isso, o hobbit Frodo tem um caminho árduo pela frente, onde encontra perigo, medo e seres bizarros. Ao seu lado para o cumprimento desta jornada, ele aos poucos pode contar com outros hobbits, um elfo, um anão, dois humanos e um mago, totalizando nove seres que formam a Sociedade do Anel",2001,14);


    }
}
