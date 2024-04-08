algoritmo "Exemplo 09 - Aula 04"
// Autor: Katharine Fernandes
// Data : 07/10/2023

// Seção de Declarações
var

num,chute,tentativas:inteiro

// Seção de Comandos
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

escreval("Você acertou!")
escreval("O número é:", num)
escreval("Quantidade de tentativas:", tentativas)
fimalgoritmo
