algoritmo "Exerc�cio 10 - Aula 03 - Lista 02"
// Autor: Katharine Fernandes
// Data : 18/09/2023

// Se��o de Declara��es
var

precoAtual,precoFinal:real
vendaMedia:inteiro

// Se��o de Comandos
inicio

// ENTRADAS
escreva("Informe o pre�o atual do produto:")
leia(precoAtual)
escreva("Informe a venda m�dia do produto:")
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

escreval("Pre�o final do produto com reajuste:", precoFinal)


fimalgoritmo
