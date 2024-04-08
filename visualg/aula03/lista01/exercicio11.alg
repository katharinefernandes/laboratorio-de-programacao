algoritmo "Exercício 11 - Aula 03 - Lista 02"
// Autor: Katharine Fernandes
// Data : 25/09/2023

// Seção de Declarações
var

nomeCliente,classe,opcaoTarifa:caractere
qntDias:inteiro
valorFinal,tarifa,tarifaLivre,valorKm,quilometragem,valorDia,desconto:real

// Seção de Comandos
inicio

// ENTRADAS
escreva("Informe o nome do cliente:")
leia(nomeCliente)
escreva("Informe a Classe:")
leia(classe)
escreva("Informe a quantidade de dias:")
leia(qntDias)
escreva("Informe a opção de tarifa:")
leia(opcaoTarifa)

se (opcaoTarifa = "TC") entao
   escreva("Informe a quilometragem:")
   leia(quilometragem)
fimse

// PROCESSAMENTO

escolha classe
caso "A"
   se (opcaoTarifa = "TC") entao
      valorDia <- 39.9
      valorKm <- 0.46
   senao
      valorDia <- 99.9
   fimse
caso "F"
   se (opcaoTarifa = "TC") entao
      valorDia <- 95.9
      valorKm <- 0.9
   senao
      valorDia <- 178.9
   fimse
caso "H"
   se (opcaoTarifa = "TC") entao
      valorDia <- 157.9
      valorKm <- 1.5
   senao
      valorDia <- 294
   fimse
fimescolha

tarifa <- qntDias*valorDia+quilometragem*valorKm

se ((classe = "A") e (qntDias > 10)) entao
   desconto <- 0.05
senao
   se ((classe = "F") e (qntDias > 7)) entao
      desconto <- 0.08
   senao
      se (classe = "H") e (qntDias > 5)) entao
         desconto <- 0.1
      fimse
   fimse
fimse

valorFinal <- tarifa-(tarifa*desconto)

// SAIDAS

escreval("Cliente:", nomeCliente)
escreval("Quantidade de Dias:", qntDias)
escreval("Classe:", classe, " - ", opcaoTarifa)
escreval("Valor da locação:", tarifa)
escreval("Desconto:", desconto)
escreval("Valor Final:", valorFinal)

fimalgoritmo
