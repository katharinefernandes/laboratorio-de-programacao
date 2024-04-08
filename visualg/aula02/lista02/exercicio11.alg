algoritmo "Exercício 11 - Lista 2"
// Autor: Katharine Fernandes
// Data: 04/09/2023

// Seção de Declarações 
var
numAulas: inteiro
salBase,valorAula,horaAtividade,salMensal,dsr,SEMANA,ATIVIDADE:real

// Seção de Comandos
inicio

SEMANA <- 4.5
ATIVIDADE <- 0.05

// ENTRADAS
escreva("Informe o número de aulas semanais:")
leia(numAulas)
escreva("Informe o valor da hora aula:")
leia(valorAula)

// PROCESSAMENTO
// A)
salBase <- (numAulas * SEMANA) * valorAula
// B)
horaAtividade <- salBase * ATIVIDADE
// C)
dsr <- (salBase + horaAtividade)/6

salMensal <- salBase + horaAtividade + dsr

// SAÍDAS
escreval("Salário Base:", salBase)
escreval("Hora Atividade:", horaAtividade)
escreval("Descanso Semanal:", dsr)
escreval("Salário Mensal:", salMensal)
fimalgoritmo
