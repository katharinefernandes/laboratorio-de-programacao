algoritmo "Exercício 02 - Lista 01 - Aula 04"
// Autor: Katharine Fernandes
// Data : 09/10/2023

// Seção de Declarações
var

voto,totVotos:inteiro
totNulos,totBranco,totCandidato1,totCandidato2,totCandidato3,totCandidato4:inteiro
pctNulos,pctBranco:real

// Seção de Comandos
inicio

escreva("Digite o voto:")
leia(voto)

enquanto (voto <> 0) faca
   se (voto = 1) entao
      totCandidato1 <- totCandidato1+1
   senao
      se (voto = 2) entao
         totCandidato2 <- totCandidato2+1
      senao
         se (voto = 3) entao
            totCandidato3<-totCandidato3+1
         senao
            se (voto = 4) entao
               totCandidato4<-totCandidato4+1
            senao
               se (voto = 5) entao
                  totNulos <- totNulos+1
               senao
                  se (voto = 6) entao
                     totBranco <- totBranco+1
                  senao
                     escreval("Voto inválido!")
                     totVotos <- totVotos-1
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse

   escreva("Digite o voto:")
   leia(voto)

   totVotos <- totVotos+1
fimenquanto

escreval("Candidato 1:", totCandidato1)
escreval("Candidato 2:", totCandidato2)
escreval("Candidato 3:", totCandidato3)
escreval("Candidato 4:", totCandidato4)
escreval("Votos Nulos:", totNulos)
escreval("Votos em Branco:", totBranco)

pctNulos <- (totNulos/totVotos)*100
pctBranco <- (totBranco/totVotos)*100

escreval("Porcentagem de votos em branco: ", pctBranco:4:2, "%")
escreval("Porcentagem de votos nulos: ", pctNulos:4:2, "%")

fimalgoritmo
