algoritmo "Exemplo 06 - Aula 04"
// Autor: Katharine Fernandes
// Data : 02/10/2023

// Seção de Declarações
var

x,r:inteiro
resp:caracter

// Seção de Comandos
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
