package matrizes;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] produtos = new String[] { "Notebook", "Computadores", "Tablets", "Servidores" };
		int[][] qtdProdutos = new int[7][4];

		// melhor linha
		int melhorLinha = 0, vlrMelhorLinha = 0;
		// pior linha
		int piorLinha = 0, vlrPiorLinha = 0;

		for (int l = 0; l < 4; l++) {
			System.out.println("--- Produto - " + produtos[l] + " ---");
			for (int c = 0; c < 4; c++) {
				System.out.print("--- Informe a quantidade de produtos vendidos no " + (c + 1) + "° trimestre: ");
				qtdProdutos[l][c] = entrada.nextInt();

				// total trimestre
				qtdProdutos[4][c] += qtdProdutos[l][c];
			}
		}

		// total produtos
		for (int c = 0; c < 4; c++) {
			for (int l = 0; l < 4; l++) {
				qtdProdutos[5][l] += qtdProdutos[l][c];
			}
		}

		System.out.println("");
		for (int c = 0; c < 4; c++) {
			System.out.print("--- Informe a meta para o produto - " + produtos[c] + ": ");
			qtdProdutos[6][c] = entrada.nextInt();
		}

		System.out.println("");
		System.out.println("----------- TRIMESTRES QUE ATINGIRAM A META -----------");
		for (int c = 0; c < 4; c++) {
			if (!(qtdProdutos[5][c] < qtdProdutos[6][c])) {
				System.out.println((c + 1) + "° trimestre");
			}
		}

		System.out.println("");
		System.out.println("----------- SOMA DOS TRISMESTRES -----------");
		for (int c = 0; c < 4; c++) {
			System.out.println("--- Soma do " + (c + 1) + "° trimestre: " + qtdProdutos[4][c]);
		}

		System.out.println("");
		System.out.println("----------- SOMA DOS PRODUTOS -----------");
		for (int c = 0; c < 4; c++) {
			System.out.println("--- Soma do Produto - " + produtos[c] + ": " + qtdProdutos[5][c]);

			if (c == 0) {
				piorLinha = 0;
				vlrPiorLinha = qtdProdutos[5][c];
			} else {
				if (qtdProdutos[5][c] > vlrMelhorLinha) {
					melhorLinha = c;
					vlrMelhorLinha = qtdProdutos[5][c];
				} else {
					piorLinha = c;
					vlrPiorLinha = qtdProdutos[5][c];
				}
			}
		}

		System.out.println("");
		System.out.println("----------- MELHOR E PIOR LINHA -----------");
		System.out.println("--- Melhor Linha: " + produtos[melhorLinha]);
		System.out.println("--- Pior Linha: " + produtos[piorLinha]);

		entrada.close();
	}

}
