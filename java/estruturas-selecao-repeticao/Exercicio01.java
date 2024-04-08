package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

// Exercício 02 - Lista 01 - Aula 04
public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataPor = new DecimalFormat("#%");

		// variáveis de entrada
		int voto = 0;

		// variáveis de processamento
		// total votos
		int totVotos = 0;
		int totNulos = 0, totBranco = 0;
		// totalCandidatos
		int totCandidato1 = 0, totCandidato2 = 0, totCandidato3 = 0, totCandidato4 = 0;
		// percentual de votos
		double pctNulos = 0, pctBranco = 0;

		System.out.println("Informe o voto:");
		voto = entrada.nextInt();

		while (voto != 0) {
			if (voto == 1) {
				totCandidato1++;
			} else if (voto == 2) {
				totCandidato2++;
			} else if (voto == 3) {
				totCandidato3++;
			} else if (voto == 4) {
				totCandidato4++;
			} else if (voto == 5) {
				totNulos++;
			} else if (voto == 6) {
				totBranco++;
			} else {
				System.out.println("Voto inválido!");
				totVotos--;
			}
			totVotos++;

			System.out.println("Digite o voto:");
			voto = entrada.nextInt();
		}

		System.out.println("Cantidato 1: " + totCandidato1);
		System.out.println("Candidato 2: " + totCandidato2);
		System.out.println("Candidato 3: " + totCandidato3);
		System.out.println("Candidato 4: " + totCandidato4);
		System.out.println("Votos nulos: " + totNulos);
		System.out.println("Votos em branco: " + totBranco);

		pctBranco = (double) totBranco / totVotos;
		pctNulos = (double) totNulos / totVotos;

		System.out.println("Porcentagem de votos em branco:" + formataPor.format(pctBranco));
		System.out.println("Porcentagem de votos nulos:" + formataPor.format(pctNulos));

	}

}
