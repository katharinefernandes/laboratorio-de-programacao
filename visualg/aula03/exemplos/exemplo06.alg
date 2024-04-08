algoritmo "Exemplo 06 - Aula 03 - Valor Carro"
// Autor: Katharine Fernandes
// Data: 11/09/2023

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

// STRUTURA DE SELECAO SIMPLES
se (pctImposto > 10) entao
   escreval("Valor de imposto muito alto!")
fimse

lucroDistrib <- (precoFabrica * pctLucro)/100
valImpostos <- (precoFabrica * pctImposto)/100
valFinal <- precoFabrica + lucroDistrib + valImpostos

// ESTRUTURA DE SELECAO COMPOSTA
se (valFinal>50000) entao
   escreval("Alto Investimento")
senao
   escreval("Investimento Proporcional")
fimse

// SAIDA
escreval("Lucro do distribuidos:", lucroDistrib)
escreval("Valor dos impostos:", valImpostos)
escreval("Valor final do carro:", valFinal)

fimalgoritmo
