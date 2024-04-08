algoritmo "Exercício 08 - Aula 03 - Lista 02"
// Autor: Katharine Fernandes
// Data : 18/09/2023

// Seção de Declarações
var

num1,num2,num3,aux:inteiro

// Seção de Comandos
inicio

escreva("Infrome o primeiro número:")
leia(num1)
escreva("Infrome o segundo número:")
leia(num2)
escreva("Infrome o segundo número:")
leia(num3)

se((num1=num2) ou (num1=num3) ou (num2=num3)) entao
   escreval("Números iguais")
senao
   se((num1>num2) e (num1>num3)) entao
      se(num2>num3) entao
         escreva(num1,",",num2,",",num3)
      senao
         escreva(num1,",",num3,",",num2)
      fimse
   fimse
   se((num2>num1) e (num2>num3)) entao
      se(num1>num3) entao
         escreva(num2,",",num1,",",num3)
      senao
         escreva(num2,",",num3,",",num1)
      fimse
   fimse
   se((num3>num1) e (num3>num3)) entao
      se(num1>num2) entao
         escreva(num3,",",num1,",",num2)
      senao
         escreva(num3,",",num2,",",num1)
      fimse
   fimse
fimse


fimalgoritmo
