algoritmo "Exerc�cio 13 - Lista 2"
// Autor: Katharine Fernandes
// Data : 04/09/2023

// Se��o de Declara��es 
var

diaNasc,mesNasc,anoNasc,diaHoje,mesHoje,anoHoje:inteiro
totalDiasVivido,totalDiasNasc,totalDiasHoje:real
totalMesVivido,totalMesNasc,totalMesHoje:real
totalAnoVivido,totalAnoNasc,totalAnoHoje:real

// Se��o de Comandos
inicio

// ENTRADAS
escreva("Informe o dia de nascimento:")
leia(diaNasc)
escreva("Informe o m�s de nascimento:")
leia(mesNasc)
escreva("Informe o ano de nascimento:")
leia(anoNasc)
escreva("Informe o dia de hoje:")
leia(diaHoje)
escreva("Informe o m�s de hoje:")
leia(mesHoje)
escreva("Informe o ano de hoje:")
leia(anoHoje)

// PROCESSAMENTO
// DIAS
totalDiasNasc <- diaNasc + (mesNasc * 30) + (anoNasc * 365)
totalDiasHoje <- diaHoje + (mesHoje * 30) + (anoHoje * 365)
totalDiasVivido <- totalDiasHoje - totalDiasNasc

// MESES
totalMesNasc <- (diaNasc/30) + mesNasc + (anoNasc*12)
totalMesHoje <- (diaHoje/30) + mesHoje + (anoHoje*12)
totalMesVivido <- totalMesHoje - totalMesNasc

// ANOS
totalAnoNasc <- (diaNasc/365) + (mesNasc/12) + anoNasc
totalAnoHoje <- (diaHoje/365) + (mesHoje/12) + anoHoje
totalAnoVivido <- totalAnoHoje - totalAnoNasc

// SA�DAS
escreval("Voc� viveu: ", totalDiasVivido:4:0, " dias")
escreval("Voc� viveu: ", totalMesVivido:4:0, " meses")
escreval("Voc� viveu: ", totalAnoVivido:4:0, " anos")

fimalgoritmo
