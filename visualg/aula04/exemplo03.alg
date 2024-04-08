algoritmo "Exemplo 03 - Aula 04"
// Autor: Katharine Fernandes
// Data : 02/10/2023

// Seção de Declarações
var

nome:caractere
quantidade,contador,qtdTotal:inteiro
preco,subTotal,totalGeral:real

// Seção de Comandos
inicio

para contador de 0 ate 1 passo 1 faca
   escreva("Informe o nome do produto:")
   leia(nome)
   escreva("Informe o preço do produto:")
   leia(preco)
   escreva("Informe a quantidade do produto:")
   leia(quantidade)

   qtdTotal<-qtdTotal+quantidade
   subTotal<-quantidade*preco
   escreval("Subtotal:", subTotal)
   totalGeral<-totalGeral+subTotal
fimpara

escreval(" ")
se totalGeral > 100 entao
   totalGeral <- totalGeral*0.9
   escreval("O valor a pagar é:", totalGeral)
senao
   escreval("O valor a pagar é:", totalGeral)
fimse

escreval("Quantidade de itens geral:", qtdTotal)


fimalgoritmo
