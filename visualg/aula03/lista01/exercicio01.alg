algoritmo "Exerc�cio 01 - Lista 01 - Aula 03"
// Autor: Katharine Fernandes
// Data : 11/09/2023

// Se��o de Declara��es
var
imc,peso,altura:real

// Se��o de Comandos
inicio

// ENTRADAS
escreva("Informe sua altura:")
leia(altura)
escreva("Informe seu peso:")
leia(peso)

// PROCESSAMENTO
imc <- peso/(altura*altura)

se (imc < 18.5) entao
   escreval("Baixo Peso")
senao
   se (imc <= 24.9) entao
      escreval("Peso Normal")
   senao
      se (imc <= 29.9) entao
         escreval("Pr�-Obesidade")
      senao
         se (imc <= 34.9) entao
            escreval("Obesidade Grau I")
         senao
            se (imc <= 39.9) entao
               escreval("Obesidade Grau II")
            senao
               escreval("Obesidade Grau III")
            fimse
         fimse
      fimse
   fimse
fimse

// SA�DAS
escreval("O IMC � igual a: ", imc:4:2)

fimalgoritmo
