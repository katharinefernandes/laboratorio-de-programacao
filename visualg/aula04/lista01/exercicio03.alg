algoritmo "Exerc�cio 03 - Lista 01 - Aula 04"
// Autor: Katharine Fernandes
// Data : 09/10/2023

// Se��o de Declara��es
var

canal,pessoas,totPessoas:inteiro
pessoas4,pessoas5,pessoas7,pessoas12:inteiro
pctCanal4,pctCanal5,pctCanal7,pctCanal12:real

// Se��o de Comandos
inicio

escreva("Digite o n�mero do canal:")
leia(canal)


enquanto (canal<>0) faca

   enquanto (canal<>4) e (canal<>5) e (canal<>7) e (canal<>12) faca
      escreva("Digite o canal correto 4/5/7/12:")
      leia(canal)
   fimenquanto

   escreva("Digite o n�mero de pessoas:")
   leia(pessoas)

   se (canal = 4) entao
      pessoas4 <- pessoas4+pessoas
   senao
      se (canal = 5) entao
         pessoas5 <- pessoas5+pessoas
      senao
         se (canal = 7) entao
            pessoas7 <- pessoas7+pessoas
         senao
            se (canal = 12) entao
               pessoas12 <- pessoas12+pessoas
            fimse
         fimse
      fimse
   fimse

   totPessoas <- totPessoas + pessoas

   escreva("Digite o n�mero do canal:")
   leia(canal)

fimenquanto

pctCanal4 <- (pessoas4/totPessoas)*100
pctCanal5 <- (pessoas5/totPessoas)*100
pctCanal7 <- (pessoas7/totPessoas)*100
pctCanal12 <- (pessoas12/totPessoas)*100

escreval("Canal 4: ", pctCanal4:4:2, "%")
escreval("Canal 5: ", pctCanal5:4:2, "%")
escreval("Canal 7: ", pctCanal7:4:2, "%")
escreval("Canal 12: ", pctCanal12:4:2, "%")

fimalgoritmo
