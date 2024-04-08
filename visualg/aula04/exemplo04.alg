algoritmo "Exemplo 04 - Aula 04"
// Autor: Katharine Fernandes
// Data : 02/10/2023

// Seção de Declarações
var

sexo:caractere
idade,qtdMaiorIdade,qtdHomens,contador,somaIdade:inteiro

// Seção de Comandos
inicio

// para contador de 0 ate 9 passo 1 faca
para contador de 0 ate 9 faca

   escreva("Informe a idade:")
   leia(idade)
   escreva("Informe o sexo (M/F):")
   leia(sexo)

   se (idade>=18) entao
      qtdMaiorIdade<-qtdMaiorIdade+1
   fimse
   se (sexo="M") entao
      qtdHomens <- qtdHomens+1
   fimse

   somaIdade<-somaIdade+idade
fimpara

escreval(" ")
escreval("Vagas esgotadas!")
escreval(" ")
escreval("Media da idade:", somaIdade/10)
escreval("Quantidade de homens inscritos", qtdHomens)
escreval("Quantidade de maiores de idade:", qtdMaiorIdade)



fimalgoritmo
