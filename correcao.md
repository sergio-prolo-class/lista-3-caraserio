# Correção

| Questão     | Legibilidade | P1 | P2 | Total |
|-------------|--------------|----|----|-------|
| Nota máxima | 15           | 35 | 50 | 100   |
| Nota        | 6            | 22 | 42 | 70    |

- errado implementar vocês fizeram múltiplas classes dentro de cada arquivo .java
- não usaram pacotes com nomes diferentes para cada domínio de aplicação
- readme vazio com apenas links para diagramas

## Diagramas

- P1:
  - membros com nomes invertidos. em UML, é nome : tipo
  - se o catálogo de filmes não pode incluir duplicatas, por que usar lista?
- P2:
  - não estou vendo uma coleção de solicitações em lugar algum

## P1

- duas classes, catalogo e Catalogo?
- felizmente, vocês sobrescrevem o método equals de filmes. mas fica a recomendação:
  - sempre que hover uma coleção sem repetições, usem Set. é muito, muito mais eficiente

### Requisitos Funcionais
- [x] Adicionar filmes
- [ ] Remover filmes
- [x] Listar filmes por ordem alfabética de título
- [x] Listar filmes por ordem alfabética de gênero
- [x] Listar filmes por ordem de lançamento
- [ ] Buscar filmes de um ano

## P2

- SRP ferido
  - a classe que se preocupa com conversar com o terminal é a mesma que implementa a lógica de negócio (atendimento)
  - deveriam ser responsabilidades separadas
- informação duplicada
  - Cliente tem atributo telefone
  - é armazenado em um mapa de telefone -> Cliente
  - o que acontece quando essas duas informações não coincidem?


### Requisitos Funcionais
- [x] Registrar dados de um cliente quando é sua primeira solicitação
- [x] Registrar novas solicitações vinculadas a um cliente
- [x] Listar os telefones dos clientes registrados
- [x] Imprimir o nome do próximo cliente
- [x] Atender o próximo cliente
- [x] Listar as idades dos clientes já atendidos
- [x] Listar os telefones dos clientes em espera