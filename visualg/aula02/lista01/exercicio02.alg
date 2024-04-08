algoritmo "Exercicio 02 - "
// Autor: Katharine Fernandes
// Data: 08/28/2023

// Seção de Declarações 
var
nomeVendedor:caractere
COMISSAO, salarioFixo, totalVendas, salarioFinal:real

// Seção de Comandos
inicio

COMISSAO <- 0.18

// ENTRADAS
escreva("Digite o nome do vendedor: ")
leia(nomeVendedor)
escreva("Digite o salário fixo: ")
leia(salarioFixo)
escreva("Digite o total de ventas efetuadas: ")
leia(totalVendas)

// PROCESSAMENTO

salarioFinal <- salarioFixo + (totalVendas * COMISSAO)

// SAÍDA
escreval("Vendedor: ", nomeVendedor)
escreval("Salário Fixo: ", salarioFixo)
escreval("Salário Final: ", salarioFinal)

fimalgoritmo
