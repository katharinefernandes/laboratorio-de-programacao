algoritmo "Exemplo 06 - Aula 04"
// Autor: Katharine Fernandes
// Data : 02/10/2023

// Se��o de Declara��es
var

x,r:inteiro
resp:caracter

// Se��o de Comandos
inicio

resp<-"SIM"
enquanto (resp="SIM") ou (resp="S") faca
   escreva("Informe o valor de x:")
   leia(x)
   r<-x*3
   escreval("Resultado:", r)
   escreval("Deseja continuar?")
   leia(resp)
fimenquanto

fimalgoritmo
