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

    public String getTitulo() {return titulo;}
        

    public String getGenero() {return genero;}
       

    public LocalDate getLancamento() {return lancamento;}
        

    public String toString() {
        return String.format("Filme{titulo='%s', genero='%s', lancamento=%s}", titulo, genero, lancamento);
    }
    public boolean equals(Object o) {
        return o instanceof Filme && titulo.equalsIgnoreCase(((Filme) o).titulo);//checar titulo
}
    public int hashCode() {
        return Objects.hash(titulo.toLowerCase());
    }
}

class Catalogo {
    private List<Filme> filmes;

    public Catalogo() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        if (!filmes.contains(filme)) {
            filmes.add(filme);
            System.out.println("Filme adicionado com sucesso!");
        } else {
            System.out.println("Já possui esse filme.");
        }
    }

    public void ordemTitulo() {filmes.sort(Comparator.comparing(Filme::getTitulo));}
    

    public void ordemGenero() {filmes.sort(Comparator.comparing(Filme::getGenero));}


    public void ordemLancamento() {filmes.sort(Comparator.comparing(Filme::getLancamento));}

    
    public void mostrarCatalogo() {filmes.forEach(System.out::println);}  
}

public class catalogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();

        catalogo.adicionarFilme(new Filme("Scarface", "Crime", LocalDate.of(1972, 3, 24)));
        catalogo.adicionarFilme(new Filme("O lar da crianças peculiares", "Fantasia", LocalDate.of(2001, 12, 19)));
        catalogo.adicionarFilme(new Filme("Sherlok", "Crime", LocalDate.of(1994, 10, 14)));
        catalogo.adicionarFilme(new Filme("A cabana", "Drama", LocalDate.of(1994, 7, 6)));

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 Ordem de filmes por título");
            System.out.println("2 Ordem de filmes por gênero");
            System.out.println("3 Ordem de filmes por data de lançamento");
            System.out.println("4 Adicionar filme");
            System.out.println("0 Fim");

            int opcao = scanner.nextInt();
                scanner.nextLine();
            switch (opcao) {
                case 1:
                    catalogo.ordemTitulo();
                    catalogo.mostrarCatalogo();
                    break;
                case 2:
                    catalogo.ordemGenero();
                    catalogo.mostrarCatalogo();
                    break;
                case 3:
                    catalogo.ordemLancamento();
                    catalogo.mostrarCatalogo();
                    break;
                case 4:
                    System.out.print("Digite o título do filme: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o gênero do filme: ");
                    String genero = scanner.nextLine();
                    System.out.print("Digite a data de lançamento (ano-mes-dia): ");
                    String dataStr = scanner.nextLine();
                    LocalDate data = LocalDate.parse(dataStr);
                    catalogo.adicionarFilme(new Filme(titulo, genero, data));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Tente novamente");
            }
        }
    }
}
