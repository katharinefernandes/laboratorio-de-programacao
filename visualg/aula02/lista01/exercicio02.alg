algoritmo "Exercicio 02 - "
// Autor: Katharine Fernandes
// Data: 08/28/2023

// Se��o de Declara��es 
var
nomeVendedor:caractere
COMISSAO, salarioFixo, totalVendas, salarioFinal:real

// Se��o de Comandos
inicio

COMISSAO <- 0.18

// ENTRADAS
escreva("Digite o nome do vendedor: ")
leia(nomeVendedor)
escreva("Digite o sal�rio fixo: ")
leia(salarioFixo)
escreva("Digite o total de ventas efetuadas: ")
leia(totalVendas)

// PROCESSAMENTO

salarioFinal <- salarioFixo + (totalVendas * COMISSAO)

// SA�DA
escreval("Vendedor: ", nomeVendedor)
escreval("Sal�rio Fixo: ", salarioFixo)
escreval("Sal�rio Final: ", salarioFinal)

fimalgoritmo
