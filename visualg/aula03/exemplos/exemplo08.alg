algoritmo "Exemplo 08 - Aula 03"
// Autor: Katharine Fernandes
// Data : 11/09/2023

// Se��o de Declara��es
var

mediaAnual:real

// Se��o de Comandos
inicio

escreva("Informe a m�dia anual do aluno:")
leia(mediaAnual)

// SELECAO ENCADEADA
se (mediaAnual >= 9) entao
   escreval("�timo")
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
