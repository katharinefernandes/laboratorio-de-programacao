algoritmo "Exemplo 10 - Aula 03"
// Autor: Katharine Fernandes
// Data : 11/9/2023

// Seção de Declarações
var

precoProduto:real
codProduto:inteiro

// Seção de Comandos
inicio

// ENTRADAS
escreva("Informe o preço do produto:")
leia(precoProduto)
escreva("Informe o código do produto:")
leia(codProduto)

// SELECAO MULTIPLA ESCOLHA
escolha codProduto
caso 1
   escreval("Preço:", precoProduto, " - produto do Sul")
caso 2
   escreval("Preço:", precoProduto, " - produto do Norte")
caso 3
   escreval("Preço:", precoProduto, " - produto do Leste")
caso 4
   escreval("Preço:", precoProduto, " - produto do Oeste")
caso 7 ate 9
   escreval("Preço:", precoProduto, " - produto do Sudeste")
caso 10 ate 20
   escreval("Preço:", precoProduto, " - produto do Centro-Oeste")
caso 5, 6, 25 ate 30
   escreval("Preço:", precoProduto, " - produto do Nordeste")
outrocaso
   escreval("Preço:", precoProduto, " - Produto Importado")
fimescolha

fimalgoritmo
