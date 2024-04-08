algoritmo "Exercicio 1 - Cálculo de Rendimento"
// Autor: Katharine Fernandes
// Data: 08/28/2023

// Seção de Declarações
var
deposito,juros,rendimento,total:real

// Seção de Comandos
inicio
// ENTRADAS
escreva("Digite o valor do depósito: ")
leia(deposito)
escreva("Digite o valor do juros: ")
leia(juros)

// PROCESSAMENTO
rendimento<- deposito * (juros/100)
total<-deposito+rendimento

// SAÍDA
escreval("Valor com rendimento: ", rendimento)
escreval("Valor final: ", total)


fimalgoritmo
