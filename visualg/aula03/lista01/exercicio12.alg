algoritmo "Exercício 12 - Aula 03 - Lista 02"
// Autor: Katharine Fernandes
// Data : 25/09/2023

// Seção de Declarações
var
salMinimo,horasTrabalhadas,horasExtras:real
salBruto,valorHora,salMensal,valorHoraExtra,irrf,salLiquido,gratificacao,salReceber,valImposto:real
numDependentes,totalDependentes:inteiro

// Seção de Comandos
inicio

// ENTRADAS
escreva("Informe o salário mínimo:")
leia(salMinimo)
escreva("Informe o número de horas trabalhadas:")
leia(horasTrabalhadas)
escreva("Informe o número de dependentes:")
leia(numDependentes)
escreva("Informe o número de horas extras:")
leia(horasExtras)

// PROCESSAMENTO

valorHora <- salMinimo/5
totalDependentes <- numDependentes*32
salMensal <- horasTrabalhadas*valorHora+totalDependentes
valorHoraExtra <- horasExtras*(valorHora*1.1)

salBruto <- salMensal+valorHoraExtra

se (salBruto < 1500) entao
   irrf <- 0
senao
   se (salBruto <= 2500) entao
      irrf <- 0.1
   senao
      irrf <- 0.2
   fimse
fimse

valImposto <- salBruto*irrf
salLiquido <- salBruto-valImposto


se (salLiquido > 1650) entao
   gratificacao <- 225
senao
   gratificacao <- 185
fimse

salReceber <- salLiquido + gratificacao

// SAIDAS
escreval("Valor hora:", valorHora)
escreval("Salário Mensal:", salMensal)
escreval("Valor total de dependentes:", totalDependentes)
escreval("Valor das horas extras:", valorHoraExtra)
escreval("Valor do salário bruto:", salBruto)
escreval("Valor do imposto:", valImposto)
escreval("Salário líquido:", salLiquido)
escreval("Valor da gratificação:", gratificacao)
escreval("Salário à receber:", salReceber)


fimalgoritmo
