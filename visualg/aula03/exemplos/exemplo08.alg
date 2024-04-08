algoritmo "Exemplo 08 - Aula 03"
// Autor: Katharine Fernandes
// Data : 11/09/2023

// Seção de Declarações
var

mediaAnual:real

// Seção de Comandos
inicio

escreva("Informe a média anual do aluno:")
leia(mediaAnual)

// SELECAO ENCADEADA
se (mediaAnual >= 9) entao
   escreval("Ótimo")
senao
   se (mediaAnual >= 8) entao
      escreval("Bom")
   senao
      se (mediaAnual >=6) entao
         escreval("Regular")
      senao
         escreval("Insuficiente")
      fimse
   fimse
fimse


fimalgoritmo
