algoritmo "Exercício 09 - Aula 03 - Lista 02"
// Autor: Katharine Fernandes
// Data : 18/09/2023

// Seção de Declarações
var

codProduto,codPais:inteiro
precoTotal,precoProduto,pesoGrama,pesoKg,valorImposto,precoGrama:real

// Seção de Comandos
inicio

// ENTRADAS
escreva("Informe o código do produto:")
leia(codProduto)
escreva("Informe o peso do produto em quilos:")
leia(pesoKg)
escreva("Informe o código do país:")
leia(codPais)

pesoGrama <- pesoKg * 1000
escreval("Peseo em gramas:", pesoGrama)

// PROCESSAMENTO

se (codProduto<=4) entao
   precoGrama <- 15
senao
   se (codProduto <= 7) entao
      precoGrama <- 25
   senao
      precoGrama <-  35
   fimse
fimse

precoProduto <- pesoGrama * precoGrama
escreval("Preço total do produto:", precoProduto)

se (codPais = 1) entao
   valorImposto <- precoPorduto
senao
   se (codPais = 2) entao
      valorImposto <- precoProduto * 0.15
   senao
      valorImposto <- precoProduto * 0.25
   fimse
fimse

escreval("Valor do imposto:", valorImposto)

precoTotal <- precoProduto + valorImposto
escreval("Valor total:", precoTotal)

fimalgoritmo
