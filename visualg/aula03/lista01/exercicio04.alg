algoritmo "Exerc�cio 04 - Lista 01 - Aula 03"
// Autor: Katharine Fernandes
// Data : 11/09/2023

// Se��o de Declara��es
var

numDiarias:inteiro
nomeCliente:caractere
valorConta:real

// Se��o de Comandos
inicio

// ENTRADAS
escreva("Informe o nome do cliente:")
leia(nomeCliente)
escreva("Informe o n�mero de di�rias:")
leia(numDiarias)

// ESTRUTURA DE SELE��O

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
