algoritmo "Exerc�cio 07 - Aula 03 - Lista 02"
// Autor: Katharine Fernandes
// Data : 18/09/2023

// Se��o de Declara��es
var
salBruto,salLiq,inss,irrf,deducao:real
// Se��o de Comandos
inicio

// ENTRADAS
escreva("Informe o seu sal�rio bruto:")
leia(salBruto)

// PROCESSAMENTO
se (salBruto<=1302) entao
   inss <- salBruto * 0.075
senao
   se (salBruto<=2571.29) entao
      inss <- salBruto * 0.09
   senao
      se (salBruto <= 3856.94) entao
         inss <- salBruto * 0.12
      senao
         se (salBruto <= 7507.49) entao
            inss <- salBruto * 0.14
         senao
            inss <- 877.22
         fimse
      fimse
   fimse
fimse

salLiq <- salBruto - inss
escreval("Valor do INSS:", inss:4:2)
escreval("Sal�rio L�quido:", salLiq:10:2)

// exercicio 07
se (salLiq<=1093.98) entao
   irrf <- salLiq
senao
   se (salLiq<=2826.65) entao
      irrf <- salLiq * 0.075 - 142.8
   senao
      se (salLiq<=3751.05) entao
         irrf <- salLiq * 0.15 - 354.80
      senao
         se (salLiq<=4664.68) entao
            irrf <- salLiq * 0.225 - 636.13
         senao
            irrf <- salLiq * 0.275 - 869.36
         fimse
      fimse
   fimse
fimse

salLiq <- salLiq - irrf

escreval("Valor do IRRF:", irrf4:4:2)
escreval("Sal�rio L�quido:", salLiq:10:2)

fimalgoritmo
