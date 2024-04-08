algoritmo "Exemplo 05 - Aula 03"
// Autor: Katharine Fernandes
// Data: 11/09/2023

// Seção de Declarações
var

salario,salarioBonus:real
tempoTrabalho:inteiro

// Seção de Comandos
inicio

escreva("Informe o salário atual:")
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
escreval("Salário final com bônus: R$", salarioBonus + salario)

fimalgoritmo
