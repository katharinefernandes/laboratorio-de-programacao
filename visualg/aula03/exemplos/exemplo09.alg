algoritmo "Exemplo 09 - Aula 03"
// Autor: Katharine Fernandes
// Data: 11/09/2023

// Se��o de Declara��es
var

salario,reajuste:real

// Se��o de Comandos
inicio

// ENTRADAS
escreva("Informe o valor do sal�rio:")
leia(salario)

// ESTRUTURA DE SELECAO ENCADEADA

se (salario<1500) entao
   reajuste<-salario*0.15
   escreval("Reajuste 15%:", reajuste)
senao
   // se (salario>=1500 e salario<=2200) entao
   se (salario<=2200) entao
      reajuste<-salario*0.1
      escreval("Reajuste 10%:", reajuste)
   senao
      reajuste<-salario*0.05
      escreval("Reajuste 5%:", reajuste)
   fimse
fimse

fimalgoritmo
