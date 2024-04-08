algoritmo "Exercício 05 - Valor Carro"
// Autor: Katharine Fernandes
// Data: 08/28/2023

// Seção de Declarações 
var
valFinal,precoFabrica,pctLucro,pctImposto,lucroDistrib, valImpostos:real

// Seção de Comandos
inicio

// ENTRADA
escreva("Digite o preço de fábrica: ")
leia(precoFabrica)
escreva("Digite o percentual de lucro: ")
leia(pctLucro)
escreva("Digite o percentural de imposto: ")
leia(pctImposto)

// PROCESSAMENTO

pctLucro <- pctLucro * 0.01
pctImposto <- pctImposto * 0.01

lucroDistrib <- precoFabrica * pctLucro
valImpostos <- precoFabrica * pctImposto
valFinal <- precoFabrica + lucroDistrib + valImpostos

// SAIDA
escreval("Lucro do distribuidos: ", lucroDistrib)
escreval("Valor dos impostos: ", valImpostos)
escreval("Valor final do carro: ", valFinal)

fimalgoritmo
