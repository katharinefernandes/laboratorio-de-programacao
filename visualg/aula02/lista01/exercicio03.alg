algoritmo "Exercício 03 - Cálculo de Energia"
// Autor: Katharine Fernandes
// Data: 08/28/2023

// Seção de Declarações 
var
salarioMinimo,valorResidencia,valorQuilowatts,valorDesconto:real
qntQuilowatts:inteiro

// Seção de Comandos
inicio

// ENTRADAS
escreva("Digite o salário mínimo: ")
leia(salarioMinimo)
escreva("Digite a quantidade de quilowatts: ")
leia(qntQuilowatts)

// PROCESSAMENTO
valorQuilowatts <- (salarioMinimo/5)
valorResidencia <- valorQuilowatts  * qntQuilowatts
valorDesconto <- valorResidencia * 0.85


// SAÍDA
escreval("Valor quilowatts: ", valorQuilowatts)
escreval("Valor residência: ", valorResidencia)
escreval("Valor da residência com desconto: ", valorDesconto)

fimalgoritmo
