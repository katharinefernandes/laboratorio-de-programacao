algoritmo "Exerc�cio 05 - Lista 01 - Aula 04"
// Autor: Katharine Fernandes
// Data : 09/10/2023

// Se��o de Declara��es
var

cont,num,numMaior,numMenor:inteiro

// Se��o de Comandos
inicio

para cont de 1 ate 10 faca
   leia(num)

   // verifica a primeira rodada da repeti��o
   se (cont=1) entao
      numMenor <- num
   fimse

   se (numMaior<num) entao
      numMaior<-num
   fimse
   se (numMenor>num) entao
      numMenor<-num
   fimse
fimpara

escreval("Maior n�mero:", numMaior)
escreval("Menor n�mero:", numMenor)

fimalgoritmo
