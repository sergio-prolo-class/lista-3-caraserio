package ifsc.poo;


public class Catalogo {
            private List<Filmes> filmes; //Lista para armazenar os filmes

            public Catalogo() {
                this.Filmes = new ArrayList<>(); //Inicializa a lista
            }

            public void adicionarFilme(Filmes filme) {
                this.Filmes.add(filme);
            }

            public List<Produto> listarProdutos() {
                return this.produtos;
            }

            // Outros métodos (pesquisar, remover, etc.)
        }