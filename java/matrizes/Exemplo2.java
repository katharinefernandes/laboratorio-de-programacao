package matrizes;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		int[][] numeros = new int[4][4];
		int somaLinha = 0;
		int somaMatriz = 0;
		int somaColuna = 0;

		// POPULA A MATRIZ
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Digite o valor da [Linha " + i + " - Coluna " + j + "]:");
				numeros[i][j] = entrada.nextInt();
			}
		}

		System.out.println("");

		// CALCULO MATRIZ
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				somaLinha += numeros[i][j];
				somaColuna += numeros[j][i];
				somaMatriz += numeros[i][j];
			}
			System.out.println("Soma da Linha " + i + ": " + somaLinha);
			System.out.println("Soma da Coluna " + i + ": " + somaColuna);
			System.out.println("");
			somaLinha = 0;
			somaColuna = 0;
		}


		System.out.println("\nSoma da matriz: " + somaMatriz);

		entrada.close();
	}

}
