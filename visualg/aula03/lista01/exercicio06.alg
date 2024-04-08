algoritmo "Exercício 06 - Aula 03 - Lista 02"
// Autor: Katharine Fernandes
// Data : 18/09/2023

// Seção de Declarações
var

salBruto,salLiq,inss:real

// Seção de Comandos
inicio

// ENTRADAS
escreva("Informe o seu salário bruto:")
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

escreval("Contribuição do INSS:", inss)
escreval("Salário Líquido:", salLiq)

fimalgoritmo
