algoritmo "Exerc�cio 05 - Lista 01 - Aula 03"
// Autor: Katharine Fernandes
// Data : 11/09/2023

// Se��o de Declara��es
var

valorProduto,valorPag:real
opcaoPag:inteiro

inicio
// Se��o de Comandos

escolha opcaoPag
caso 1
   valorPag <- valorProduto - (valorProduto * 0.1)
   escreval(opcaoPag, " - 1 (dinheiro/cheque) x ", valorPag)
caso 2
   valorPag <- valorProduto - (valorProduto * 0.05)
   escreval(opcaoPag, " - 1 (cr�dito) x ", valorPag)
caso 3
   valorPag <- valorProduto/2
   escreval(opcaoPag, " - 2 (sem juros) x ", valorPag)
caso 4
   valorPag <- (valorProduto + (valorProduto * 0.01))/3
   escreval(opcaoPag, " - 3 (com juros) x ", valorPag)
outrocaso
   escreval("Op��o de Pagamento Inv�lida")
fimescolha
fimalgoritmo
