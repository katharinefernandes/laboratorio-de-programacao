algoritmo "Exercício 05 - Lista 01 - Aula 04"
// Autor: Katharine Fernandes
// Data : 09/10/2023

// Seção de Declarações
var

cont,num,numMaior,numMenor:inteiro

// Seção de Comandos
inicio

para cont de 1 ate 10 faca
   leia(num)

   // verifica a primeira rodada da repetição
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

escreval("Maior número:", numMaior)
escreval("Menor número:", numMenor)

fimalgoritmo
