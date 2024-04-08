package matrizes;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		int[][] numeros = new int[3][3];

		// CARREGAR LINHAS
		for (int linha = 0; linha < 3; linha++) { // CONGELA

			// COLUNA - roda 3 vezes e depois sai
			// numeros[0][0]
			// numeros[0][1]
			// numeros[0][2]
			for (int coluna = 0; coluna < 3; coluna++) { // CORAÇÃO QUENTINHO
				System.out.print("Digite o elemento [" + linha + "," + coluna + "]: ");
				numeros[linha][coluna] = entrada.nextInt();
			}
		}

		System.out.println("");

		for (int linha = 0; linha < 3; linha++) { // CONGELA
			for (int coluna = 0; coluna < 3; coluna++) { // CORAÇÃO QUENTINHO
				System.out.print(numeros[linha][coluna] + "\t");
			}
			System.out.println("");
		}

		entrada.close();
	}

}
