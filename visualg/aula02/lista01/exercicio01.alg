algoritmo "Exercicio 1 - C�lculo de Rendimento"
// Autor: Katharine Fernandes
// Data: 08/28/2023

// Se��o de Declara��es
var
deposito,juros,rendimento,total:real

// Se��o de Comandos
inicio
// ENTRADAS
escreva("Digite o valor do dep�sito: ")
leia(deposito)
escreva("Digite o valor do juros: ")
leia(juros)

// PROCESSAMENTO
rendimento<- deposito * (juros/100)
total<-deposito+rendimento

// SA�DA
escreval("Valor com rendimento: ", rendimento)
escreval("Valor final: ", total)


fimalgoritmo
