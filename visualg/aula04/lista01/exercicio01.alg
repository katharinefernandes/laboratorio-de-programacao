algoritmo "Exercício 01 - Lista 01 - Aula 04"
// Autor: Katharine Fernandes
// Data : 09/10/2023

// Seção de Declarações
var

idade,cont:inteiro
qtdFaixa1,qtdFaixa2,qtdFaixa3,qtdFaixa4,qtdFaixa5:inteiro
pctPessFaixa1:real

// Seção de Comandos
inicio

cont<-0
// ENTRADAS

enquanto (cont<20) faca
   escreval(cont+1, "° Pessoa")
   escreva("Informe a idade:")
   leia(idade)

   se (idade<=15) entao
      qtdFaixa1 <- qtdFaixa1+1
   senao
      se (idade <= 30) entao
         qtdFaixa2 <- qtdFaixa2+1
      senao
         se (idade <= 45) entao
            qtdFaixa3 <- qtdFaixa3+1
         senao
            se (idade <= 60) entao
               qtdFaixa4 <- qtdFaixa4+1
            senao
               qtdFaixa5 <- qtdFaixa5+1
            fimse
         fimse
      fimse
   fimse

   cont <- cont + 1
fimenquanto

escreval("Número de pessoas 1° Faixa:", qtdFaixa1)
escreval("Número de pessoas 2° Faixa:", qtdFaixa2)
escreval("Número de pessoas 3° Faixa:", qtdFaixa3)
escreval("Número de pessoas 4° Faixa:", qtdFaixa4)
escreval("Número de pessoas 5° Faixa:", qtdFaixa5)

escreval("cont", cont)

pctPessFaixa1 <- (qtdFaixa1/cont)*100

escreval("Porcentagem da 1° Faixa:", pctPessFaixa1)


fimalgoritmo
