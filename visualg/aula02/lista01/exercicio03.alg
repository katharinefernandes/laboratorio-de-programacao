algoritmo "Exerc�cio 03 - C�lculo de Energia"
// Autor: Katharine Fernandes
// Data: 08/28/2023

// Se��o de Declara��es 
var
salarioMinimo,valorResidencia,valorQuilowatts,valorDesconto:real
qntQuilowatts:inteiro

// Se��o de Comandos
inicio

// ENTRADAS
escreva("Digite o sal�rio m�nimo: ")
leia(salarioMinimo)
escreva("Digite a quantidade de quilowatts: ")
leia(qntQuilowatts)

// PROCESSAMENTO
valorQuilowatts <- (salarioMinimo/5)
valorResidencia <- valorQuilowatts  * qntQuilowatts
valorDesconto <- valorResidencia * 0.85


// SA�DA
escreval("Valor quilowatts: ", valorQuilowatts)
escreval("Valor resid�ncia: ", valorResidencia)
escreval("Valor da resid�ncia com desconto: ", valorDesconto)

fimalgoritmo
