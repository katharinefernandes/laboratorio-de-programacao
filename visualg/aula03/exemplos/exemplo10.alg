algoritmo "Exemplo 10 - Aula 03"
// Autor: Katharine Fernandes
// Data : 11/9/2023

// Se��o de Declara��es
var

precoProduto:real
codProduto:inteiro

// Se��o de Comandos
inicio

// ENTRADAS
escreva("Informe o pre�o do produto:")
leia(precoProduto)
escreva("Informe o c�digo do produto:")
leia(codProduto)

// SELECAO MULTIPLA ESCOLHA
escolha codProduto
caso 1
   escreval("Pre�o:", precoProduto, " - produto do Sul")
caso 2
   escreval("Pre�o:", precoProduto, " - produto do Norte")
caso 3
   escreval("Pre�o:", precoProduto, " - produto do Leste")
caso 4
   escreval("Pre�o:", precoProduto, " - produto do Oeste")
caso 7 ate 9
   escreval("Pre�o:", precoProduto, " - produto do Sudeste")
caso 10 ate 20
   escreval("Pre�o:", precoProduto, " - produto do Centro-Oeste")
caso 5, 6, 25 ate 30
   escreval("Pre�o:", precoProduto, " - produto do Nordeste")
outrocaso
   escreval("Pre�o:", precoProduto, " - Produto Importado")
fimescolha

fimalgoritmo
