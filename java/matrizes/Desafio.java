package matrizes;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] vetor1 = { 1, 1, 1, 1, 1 };
		int[] vetor2 = { 2, 2, 2, 2, 2 };

		int[] vetorFinal = new int[10];

		int indice = 0;

		for (int i = 0; i < vetorFinal.length; i++) {
			if (i % 2 == 0) {
				vetorFinal[i] = vetor1[indice];
			} else {
				vetorFinal[i] = vetor2[indice];
				indice++;
			}

			System.out.print(vetorFinal[i] + (i < 9 ? " - " : ""));
		}
		
		for (int i = 0; i < vetorFinal.length; i++) {
			i++;
			vetorFinal[i] = vetor1[i];
		}

		entrada.close();
	}

}
