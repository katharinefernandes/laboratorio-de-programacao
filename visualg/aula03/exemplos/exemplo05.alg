algoritmo "Exemplo 05 - Aula 03"
// Autor: Katharine Fernandes
// Data: 11/09/2023

// Se��o de Declara��es
var

salario,salarioBonus:real
tempoTrabalho:inteiro

// Se��o de Comandos
inicio

escreva("Informe o sal�rio atual:")
leia(salario)
escreva("Informe o tempo de trabalho em anos:")
leia(tempoTrabalho)

// PROCESSAMENTO

se (tempoTrabalho >= 5) entao
   salarioBonus <- salario * 0.2
senao
   salarioBonus <- salario * 0.1
fimse

// SAIDA
escreval("Sal�rio final com b�nus: R$", salarioBonus + salario)

fimalgoritmo
