algoritmo "Exercício 06 - Lista 01 - Aula 04"
// Autor: Katharine Fernandes
// Data : 09/10/2023

// Seção de Declarações
var

preco,total:real

// Seção de Comandos
inicio

escreval("Digite o preço da etiqueta:")
leia(preco)

enquanto (preco<>0) faca

   total <- total+preco

   escreval("Digite o preço da etiqueta:")
   leia(preco)

fimenquanto

escreval("Valor total da compra:", total)

fimalgoritmo
