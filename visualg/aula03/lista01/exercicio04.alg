algoritmo "Exercício 04 - Lista 01 - Aula 03"
// Autor: Katharine Fernandes
// Data : 11/09/2023

// Seção de Declarações
var

numDiarias:inteiro
nomeCliente:caractere
valorConta:real

// Seção de Comandos
inicio

// ENTRADAS
escreva("Informe o nome do cliente:")
leia(nomeCliente)
escreva("Informe o número de diárias:")
leia(numDiarias)

// ESTRUTURA DE SELEÇÃO

se (numDiarias = 15) entao
   valorConta <- (80 * numDiarias)  + (numDiarias * 6)
senao
   se(numDiarias > 15) entao
      valorConta <- (80 * numDiarias) + (numDiarias * 5.5)
   senao
      valorConta <- (80 * numDiarias) + (numDiarias * 8)
   fimse
fimse

escreval("Cliente: ", nomeCliente, " - valor da conta: ", valorConta)
fimalgoritmo
