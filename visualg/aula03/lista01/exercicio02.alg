algoritmo "Exerc�cio 02 - Lista 01 - Aula 03"
// Autor: Katharine Fernandes
// Data : 11/09/2023

// Se��o de Declara��es
var

tipoInvest:caractere
valorInvest,valorRend:real

// Se��o de Comandos
inicio

// ENTRADAS
escreva("Informe o tipo de investimento:")
leia(tipoInvest)
escreva("Informe o valor do investimento:")
leia(valorInvest)

// PROCESSAMENTO - ESTRUTURA ENCADEADA

escolha tipoInvest
caso "P"
   valorRend <- valorInvest + (valorInvest * 0.03)
   // valorRend <- valorInvest * 1.03
caso "F"
   valorRend <- valorInvest + (valorInvest * 0.05)
caso "C"
   valorRend <- valorInvest + (valorInvest * 0.06)
caso "A"
   valorRend <- valorInvest + (valorInvest * 0.1)
outrocaso
   escreval("Op��o de Investimento Inv�lida!")
fimescolha

escreval("Valor corrigido ap�s o investimento:", valorRend:6:2)

fimalgoritmo
