algoritmo "Exercício 10 - Aula 03 - Lista 02"
// Autor: Katharine Fernandes
// Data : 18/09/2023

// Seção de Declarações
var

precoAtual,precoFinal:real
vendaMedia:inteiro

// Seção de Comandos
inicio

// ENTRADAS
escreva("Informe o preço atual do produto:")
leia(precoAtual)
escreva("Informe a venda média do produto:")
leia(vendaMedia)

// PROCESSAMENTO

se ((vendaMedia < 500) ou (precoAtual < 30)) entao
   precoFinal <- precoAtual * 1.1
senao
   se ((vendaMedia < 1200) ou (precoAtual < 80)) entao
      precoFinal <- precoAtual * 1.15
   senao
      se ((vendaMedia >= 1200) ou (precoAtual >= 80)) entao
       precoFinal <- precoAtual * 0.8
      fimse
   fimse
fimse

escreval("Preço final do produto com reajuste:", precoFinal)


fimalgoritmo
