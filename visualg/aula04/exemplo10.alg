algoritmo "Exemplo 09 - Aula 04"
// Autor: Katharine Fernandes
// Data : 07/10/2023

// Se��o de Declara��es
var

num,chute,tentativas:inteiro

// Se��o de Comandos
inicio

num<-5
repita
   escreva("Informe o chute:")
   leia(chute)
   se (chute > num) entao
      escreval("Chute alto!")
   fimse
   se (chute < num) entao
      escreval("Chute baixo!")
   fimse
   tentativas<-tentativas+1
ate (num = chute)

escreval("Voc� acertou!")
escreval("O n�mero �:", num)
escreval("Quantidade de tentativas:", tentativas)
fimalgoritmo
