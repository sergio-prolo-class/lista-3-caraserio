package ifsc.poo;

import java.time.LocalDate;
import java.util.*;

class Filme {
    private String titulo;
    private String genero;
    private LocalDate lancamento;

    public Filme(String titulo, String genero, LocalDate lancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.lancamento = lancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    //metodo construtor do filme
    public String toString() {
        return String.format("Filme{titulo='%s', genero='%s', lancamento=%s}", titulo, genero, lancamento);
    }
}

class Catalogo {
    private List<Filme> filmes;

    public Catalogo() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void ordemTitulo() {
        filmes.sort(Comparator.comparing(Filme::getTitulo));
    }

    public void ordemGenero() {
        filmes.sort(Comparator.comparing(Filme::getGenero));
    }

    public void ordemLancamento() {
        filmes.sort(Comparator.comparing(Filme::getLancamento));
    }

    public void mostrarCatalogo() {
        filmes.forEach(System.out::println);
    }
}

public class catalogo {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        catalogo.adicionarFilme(new Filme("O Poderoso Chefão", "Crime", LocalDate.of(1972, 3, 24)));
        catalogo.adicionarFilme(new Filme("O Senhor dos Anéis: A Sociedade do Anel", "Fantasia", LocalDate.of(2001, 12, 19)));
        catalogo.adicionarFilme(new Filme("Pulp Fiction", "Crime", LocalDate.of(1994, 10, 14)));
        catalogo.adicionarFilme(new Filme("Forrest Gump", "Drama", LocalDate.of(1994, 7, 6)));

        System.out.println("Ordenados por título:");
        catalogo.ordemTitulo();
        catalogo.mostrarCatalogo();

        System.out.println("\nOrdenados por gênero:");
        catalogo.ordemGenero();
        catalogo.mostrarCatalogo();

        System.out.println("\nOrdenados por data de lançamento:");
        catalogo.ordemLancamento();
        catalogo.mostrarCatalogo();
    }
}
