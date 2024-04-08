algoritmo "Exercício 04 - Lista 01 - Aula 04"
// Autor: Katharine Fernandes
// Data : 09/10/2023

// Seção de Declarações
var

idade,cont:inteiro
qtdIdadeM50,qtdAlturaMenor15,qtdOlhoAzul,qtdRuivo,somaIdade:inteiro
peso,altura:real
mediaIdade,pctOlhosAzuis,pctRuivas:real
corOlhos,corCabelo:caractere

// Seção de Comandos
inicio

cont<-0

enquanto (cont<10) faca

   escreva("Informe a idade:")
   leia(idade)
   escreva("Informe o peso:")
   leia(peso)
   escreva("Informe a altura:")
   leia(altura)
   escreva("Informe a cor dos olhos:")
   leia(corOlhos)

   enquanto (corOlhos <> "A") e (corOlhos <> "P") e (corOlhos <> "V") e (corOlhos <> "C") faca
      escreva("Informe uma cor de olho válida A-Azul/P-Preto/V-Verde/C-Castanho:")
      leia(corOlhos)
   fimenquanto

   escreva("Informe a cor do cabelo:")
   leia(corCabelo)

   enquanto (corCabelo <> "P") e (corCabelo <> "C") e (corCabelo <> "L") e (corCabelo <> "R") faca
      escreva("Informe uma cor de cabelo válida P-Preto/C-Castanho/L-Louro/R-Ruivo:")
      leia(corCabelo)
   fimenquanto

   se (idade > 50) e (peso < 60) entao
      qtdIdadeM50<-qtdIdadeM50+1
   fimse
   se (altura < 1.5) entao
      qtdAlturaMenor15 <- qtdAlturaMenor15+1
      somaIdade <- somaIdade+idade
   fimse

   se (corOlhos = "A") entao
      qtdOlhoAzul <- qtdOlhoAzul+1
   senao
      se (corCabelo = "R") entao
         qtdRuivo <- qtdRuivo+1
      fimse
   fimse

   cont <- cont+1

fimenquanto

pctOlhosAzuis<-(qtdOlhoAzul/cont)*100

escreval(" ")
escreval("Qunatidade de pessoas com idade > 50 e peso < 60:", qtdIdadeM50)
se qtdAlturaMenor15 <> 0 entao
   escreval("Média das idades com altura < 1,50:", somaIdade/qtdAlturaMenor15)
senao
   escreval("Média das idades com altura < 1,50:", 0)
fimse
escreval("Porcentagem de pessoas com olhos azuis:",pctOlhosAzuis)
escreval("Quantidade de pessoas ruívas que não possuem olhos azuis:", qtdRuivo)


fimalgoritmo
