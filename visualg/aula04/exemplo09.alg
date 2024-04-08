algoritmo "Exemplo 09 - Aula 04"
// Autor: Katharine Fernandes
// Data : 07/10/2023

// Seção de Declarações
var

x,r:inteiro
resp:caractere

// Seção de Comandos
inicio

// TESTE CONDICIONAL NO FIM (DO-WHILE)
repita
   escreva("Informe um valor:")
   leia(x)
   r<-x*3
   escreval("Resultado:", r)
   escrevaL("Deseja continuar? (S/N)")
   leia(resp)
ate(resp="N")

fimalgoritmo
