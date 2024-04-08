algoritmo "Exemplo 04 - Aula 03"
// Autor: Katharine Fernandes
// Data : 11/09/2023

// Seção de Declarações
var

dia1,mes1,ano1:inteiro
dia2,mes2,ano2:inteiro
data1,data2:inteiro

// Seção de Comandos
inicio

// ENTRADAS
escreva("Informe o primeiro dia:")
leia(dia1)
escreva("Informe o primeiro mes:")
leia(mes1)
escreva("Informe o primeiro ano:")
leia(ano1)

escreva("Informe o segundo dia:")
leia(dia2)
escreva("Informe o segundo mes:")
02leia(mes2)
escreva("Informe o segundo ano:")
leia(ano2)

// PROCESSAMENTO

data1 <- (ano1 * 365) + (mes1 * 30) + dia1
data2 <- (ano2 * 365) + (mes2 * 30) + dia2

// SELECAO COMPOSTA
//se (data1 > data2) entao
//   escreva("Data mais recente:", dia1,"/",mes1,"/",ano1)
//senao
//   escreval("Data mais recente:", dia2,"/",mes2,"/",ano2)
//fimse

// SELECAO ENCADEADA
se (data1 = data2) entao
   escreval("Datas iguais")
senao
   se (data1 > data2) entao
      escreva("Data mais recente:", dia1,"/",mes1,"/",ano1)
   senao
      escreval("Data mais recente:", dia2,"/",mes2,"/",ano2)
   fimse
fimse

// 1° data1 = data2
// 2° data1 > data2
// 3° data1 < data2

fimalgoritmo
